package com.monitor.constant;

/**
 * 操作符
 *
 * Created by biezhi on 2017/1/4.
 */
public enum OperatorType {

    EQ("="), LT("<"), GT(">");

    private String opt;

    OperatorType(String opt){
        this.opt = opt;
    }

    public String getOpt() {
        return opt;
    }
}
