package com.drileida.hungerNet.response;

public class DataResponseBody {
    private StatusCode status = StatusCode.ERROR;
    private Object data;
    private String message = "";
    private Long requestStarted = 0L;
    private Long requestFinished = 0L;
    private Long requestTime = 0L;

    public DataResponseBody() {
    }

    public DataResponseBody(Object data) {
        this.data = data;
    }

    public DataResponseBody(Object data, String message) {
        this.data = data;
        this.message = message;
    }

    public StatusCode getStatus() {
        return status;
    }

    public DataResponseBody setStatus(StatusCode status) {
        this.status = status;
        return this;
    }

    public Object getData() {
        return data;
    }

    public DataResponseBody setData(Object data) {
        this.data = data;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public DataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }

    public DataResponseBody ok(){
        this.status = StatusCode.OK;
        return this;
    }
    public DataResponseBody error(){
        this.status = StatusCode.ERROR;
        return this;
    }

    public Long getRequestStarted() {
        return requestStarted;
    }

    public void setRequestStarted(Long requestStarted) {
        this.requestStarted = requestStarted;
    }

    public Long getRequestFinished() {
        return requestFinished;
    }

    public void setRequestFinished(Long requestFinished) {
        this.requestFinished = requestFinished;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }
}

