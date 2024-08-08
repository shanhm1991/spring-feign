/*
 * Copyright (c) 2017～2099 Cowave All Rights Reserved.
 *
 * For licensing information, please contact: https://www.cowave.com.
 *
 * This code is proprietary and confidential.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 */
package org.springframework.feign.codec;

/**
 * @author shanhuiming
 */
public enum ResponseCode implements HttpCode {

    /**
     * 200
     */
    SUCCESS("200", "Success"),

    /**
     * 202
     */
    ACCEPTED("202", "Accepted"),

    /**
     * 400
     */
    BAD_REQUEST("400", "Bad Request"),

    /**
     * 401
     */
    UNAUTHORIZED("401", "Unauthorized"),

    /**
     * 403
     */
    FORBIDDEN("403", "Forbidden"),

    /**
     * 429
     */
    TOO_MANY_REQUESTS("429", "Too Many Requests"),

    /**
     * 498
     */
    TOKEN_INVALID_OR_EXPIRED("498", "Token changed or expired"),

    /**
     * 500
     */
    INTERNAL_SERVER_ERROR("500", "Internal Server Error"),

    /**
     * 597
     */
    SYS_ERROR("597", "Business Error");

    private final String code;

    private final String msg;

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
