package org.example.common;

import lombok.Data;

/**
 * @Description:
 * @ProjectName: maibao
 * @Author: archarhuang
 * @CreateDate: 2020/1/15
 */
@Data
public class CommonResult<T> {

    public static final int SUCCESS_CODE = 0;
    public static final String SUCCESS_MSG = "操作成功";


    public static final int ERROR_PARAM_CODE = 401;

    public static final int ERROR_CODE = -1;
    public static final String ERROR_MSG = "系统错误";

    private int ret;

    private String msg;

    private T data;


    public static <T> CommonResult SUCCESS(){
        CommonResult commonResult = new CommonResult();
        commonResult.setRet(SUCCESS_CODE);
        commonResult.setMsg(SUCCESS_MSG);
        return commonResult;
    }

    public static <T> CommonResult SUCCESS(T t){
        CommonResult commonResult = new CommonResult();
        commonResult.setRet(SUCCESS_CODE);
        commonResult.setMsg(SUCCESS_MSG);
        commonResult.setData(t);
        return commonResult;
    }

    public static <T> CommonResult FAIL(T t){
        CommonResult commonResult = new CommonResult();
        commonResult.setRet(ERROR_CODE);
        commonResult.setMsg(t.toString());
        commonResult.setData(null);
        return commonResult;
    }


    public static <T> CommonResult FAIL_PARAM_VALID(String msg){
        CommonResult commonResult = new CommonResult();
        commonResult.setRet(ERROR_PARAM_CODE);
        commonResult.setMsg(msg);
        return commonResult;
    }

    public static <T> CommonResult FAIL_SERVER_VALID(int ret,String msg){
        CommonResult commonResult = new CommonResult();
        commonResult.setRet(ret);
        commonResult.setMsg(msg);
        return commonResult;
    }



}
