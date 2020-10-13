package com.markerhub.Common.lang;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result implements Serializable {

    private int code;           //200 正常，非200 表示异常数据
    private String msg;
    private Object data;

    //数据正常调用
    public static Result succ(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    //数据异常
    public static Result fail(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    //简易封装
    public static Result succ(Object data){
        return succ(200,"操作成功",data);
    }
    public static Result fail(String msg,Object data){
        return fail(400,msg,data);
    }
    public static Result fail(String msg){
        return fail(400,msg,null);
    }
}
