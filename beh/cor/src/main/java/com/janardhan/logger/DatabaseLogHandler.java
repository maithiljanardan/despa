package com.janardhan.logger;

public class DatabaseLogHandler extends LogHandler {

    @Override
    public boolean handle(String message) {
        if (message.contains("database")) {
            System.out.println("Database Log: " + message);
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        } else {
            return false;
        }
    }
}