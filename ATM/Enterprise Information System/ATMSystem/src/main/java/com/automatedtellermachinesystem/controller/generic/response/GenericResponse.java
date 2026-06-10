package com.automatedtellermachinesystem.controller.generic.response;

/**
 * This class provides a base response for error and successful responses.
 */
public class GenericResponse<T> {

    private boolean success;
    private Object status;
    private String message;
    private T data;

    public GenericResponse(boolean success, String message, Object status) {
        this.success = success;
        this.status = status;
        this.message = message;
    }

    public GenericResponse(boolean success, Object status, T data) {
        this.success = success;
        this.status = status;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
