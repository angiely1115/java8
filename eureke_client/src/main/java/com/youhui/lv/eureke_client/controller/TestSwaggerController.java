package com.youhui.lv.eureke_client.controller;

import com.huinong.truffle.component.base.component.version.anno.ApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "swagger测试")
@RestController
@RequestMapping("swagger/{version}")
public class TestSwaggerController{

//    @ApiOperation(author = "凌重华", /** 接口负责人 */
//            status = Status.UN_COMPLETE, /** 接口完成状态 */
//            value = "用户信息查询", /** 方法描述 */
//            consumes = "application/x-www-form-urlencoded", /** 接收content type类型，多个用逗号分隔 */
//            produces = "application/x-www-form-urlencoded", /** 响应content type类型，多个用逗号分隔 */
//            notes = "用户信息查询") /** 方法描述显示内容 */

    @ApiVersion(1)
    @RequestMapping("home")
    @ApiOperation(author = "吕荣砖",value = "第一个swagger接口",status = ApiOperation.Status.COMPLETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE,notes = "xxxxxx",response = String.class,httpMethod = "GET"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户ID",required = true,paramType = "query",dataType = "Long"),
            @ApiImplicitParam(name="username",value = "用户名",required = false,dataType = "String",paramType = "head",access="xnmxxxx")
    })
    public String swaggerHome(){
       return "hello swagger";
    }


    @ApiVersion(2)
    @RequestMapping("home2")
    @ApiOperation(author = "吕荣砖",value = "新版本个swagger接口",status = ApiOperation.Status.COMPLETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE,notes = "新版本个swagger接口",response = String.class,httpMethod = "GET"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户ID",required = true,paramType = "query",dataType = "Long"),
            @ApiImplicitParam(name="username",value = "用户名",required = false,dataType = "String",paramType = "head",access="xnmxxxx")
    })
    public String swaggerHome2(){
        return "hello swagger new";
    }
}
