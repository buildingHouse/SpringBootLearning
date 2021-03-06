package com.thinkingcao.spring.webflux.result;


import com.thinkingcao.spring.webflux.constant.Constants;

import java.io.Serializable;

/**
 * 响应结果
 */
public class ApiResult implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2244221401956011209L;

    /**
     * 消息 200
     */
    private int code = Constants.CODE_500;

    /**
     * 信息
     */
    private String message;

    /**
     * 数据
     */
    private Object data;


    /**
     * Instantiates a new Api result.
     */
    public ApiResult() {
        super();
    }


    /**
     * Instantiates a new Api result.
     *
     * @param code    the code
     * @param message the message
     * @param data    the data
     */
    public ApiResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * Instantiates a new Api result.
     *
     * @param code    the code
     * @param message the message
     */
    public ApiResult(int code, String message) {
        this(code, message, null);
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 错误
     *
     * @param message the message
     * @return api result
     */
    public static ApiResult error(String message) {
        return new ApiResult(Constants.CODE_500, message, null);
    }

    /**
     * 错误
     *
     * @param code    the code
     * @param message the message
     * @return api result
     */
    public static ApiResult error(int code, String message) {
        return new ApiResult(code, message);
    }

    /**
     * 成功
     *
     * @param message the message
     * @return api result
     */
    public static ApiResult success(String message) {
        return new ApiResult(Constants.CODE_200, message);
    }

    /**
     * 成功
     *
     * @param data    the data
     * @param message the message
     * @return api result
     */
    public static ApiResult success(Object data, String message) {
        return new ApiResult(Constants.CODE_200, message, data);
    }

    /**
     * 成功
     *
     * @param data the data
     * @return api result
     */
    public ApiResult success(Object data) {

        return new ApiResult(Constants.CODE_200, null, data);
    }


}
