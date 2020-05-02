package cn.test.demo.web.model.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class Response2OpenApi<T> implements Serializable {
    private static final long serialVersionUID = -1L;
    private boolean success;
    private String errorCode;
    private String errorMsg;
    private T result;
}