package com.cobo.wallet.demos.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    /** 传递给前端的VO */
    private T t;

    /** 带给前端的业务信息 */
    private String msg;

    /** 操作是否成功 */
    private boolean success;

    /**
     * 成功
     *
     * @param msg 业务信息
     */
    public void success(String msg) {
        this.msg = msg;
        this.success = true;
    }

    public void success(String msg, T t) {
        success(msg);
        this.t = t;
    }

    /**
     * 失败
     *
     * @param msg 业务信息
     */
    public void fail(String msg) {
        this.msg = msg;
        this.success = false;
    }
}
