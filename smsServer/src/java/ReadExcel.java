import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.commons.codec.binary.StringUtils;

public class ReadExcel {

    private List<String> list = new ArrayList();


    public static List<String>  readExcel(String filePath) throws IOException, BiffException {
        List<String> list = new ArrayList();
        //创建输入流  
        InputStream stream = new FileInputStream(filePath);
        //获取Excel文件对象  
        Workbook rwb = Workbook.getWorkbook(stream);
        //获取文件的指定工作表 默认的第一个  
        Sheet sheet = rwb.getSheet(0);
        //行数(表头的目录不需要，从1开始)
        String strVal = null;
        StringBuffer stringBuffer = new StringBuffer();
        String phone = null;
        int k = 0;
        for (int i = 1; i < sheet.getRows(); i++) {
            //创建一个数组 用来存储每一列的值
            String[] str = new String[sheet.getColumns()];
            Cell cell = null;
            //获取第i行，第j列的值
             cell = sheet.getCell(3, i);
             phone = cell.getContents();
             if(null!=phone&&!"".equals(phone)){
                stringBuffer.append(cell.getContents()+",");
                k++;
             }
             if(k%500==0){
                 list.add(stringBuffer.toString());
                 stringBuffer = new StringBuffer();
                 k=0;
             }
            //列数
//            for (int j = 0; j < sheet.getColumns(); j++) {
//                //获取第i行，第j列的值
//                cell = sheet.getCell(j, i);
//                str[j] = cell.getContents();
//            }
            //把刚获取的列存入list
        }
        if (list.size()==0||k%500!=0){
            list.add(stringBuffer.toString());
        }
        String values = stringBuffer.toString();
        return list;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(499%500);
        List<String> strings = readExcel("D:\\resource\\workspace\\lvStudy\\smsServer\\src\\resource\\2017-12-11-19-51-16-contact-62.xls");
        System.out.println(strings.size());
    }
}