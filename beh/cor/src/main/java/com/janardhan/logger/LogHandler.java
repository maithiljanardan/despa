package com.janardhan.logger;

public abstract class LogHandler {

    protected LogHandler nextHandler;

    public void setNext(LogHandler handler) {
        nextHandler = handler;
    }

    public abstract boolean handle(String message);
}
