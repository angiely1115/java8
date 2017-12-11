import com.wxapi.WxApiCall.WxApiCall;
import com.wxapi.model.RequestModel;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Demo {

	public static void main(String[] args) throws IOException, BiffException {
		RequestModel model = new RequestModel();
		model.setGwUrl("https://way.jd.com/BABO/batchSms");
		model.setAppkey("cc65725eced91dd2d0f820717d4283de");
		List<String> strings = ReadExcel.readExcel("D:\\resource\\workspace\\lvStudy\\smsServer\\src\\resource\\2017" +
				"-12-11-19-51-16-contact-62.xls");
		String valueStr = null;
		for (int i=0;i<strings.size();i++){
			Map queryMap = new HashMap();
			valueStr = strings.get(i);
			valueStr = valueStr.substring(0,valueStr.length()-1);
			queryMap.put("mobile","18811879608"); //访问参数
			System.out.println(valueStr);
			String string = "[众里寻券]2017年双12红包火爆开启,千万红包等你来抢!￥fm0f08T0NuF￥复制这条信息,打开[手机淘宝]即可领取,退订回N";
			queryMap.put("msg",string); //访问参数
			model.setQueryParams(queryMap);
			WxApiCall call = new WxApiCall();
			call.setModel(model);
			System.out.println(call.request());
			System.out.println(string.length());
		}

	}
}