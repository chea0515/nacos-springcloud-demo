package com.cc.nacos.api.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResult {

    private boolean status;
    private int code;
    private String message;
    /** 返回对象 */
    private Object data;

    public DataResult() {
    }

    public DataResult(boolean status, int code) {
        this.status = status;
        this.code = code;
    }

    public DataResult(boolean status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public DataResult(boolean status, int code, Object data) {
        this.status = status;
        this.code = code;
        this.data = data;
    }

    public DataResult(boolean status, int code, String message, Object data) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /** ----------- success ----------- */
    public static DataResult resultSuccess() {
        return new DataResult(true, 200);
    }

    public static DataResult resultSuccess(String message) {
        return new DataResult(true, 200, message);
    }

    public static DataResult resultSuccess(Object data) {
        return new DataResult(true, 200, data);
    }

    public static DataResult resultSuccess(String message, Object data) {
        return new DataResult(true, 200, message, data);
    }

    /** ----------- error ----------- */
    public static DataResult resultError() {
        return new DataResult(false, 500);
    }

    public static  DataResult resultError(String message) {
        return new DataResult(false, 500, message);
    }

    public static  DataResult resultError(Object data) {
        return new DataResult(false, 500, data);
    }

    public static  DataResult resultError(String message, Object data) {
        return new DataResult(false, 500, message, data);
    }
}
