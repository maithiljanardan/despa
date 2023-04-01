package com.janardhan.logger;

public class FileLogHandler extends LogHandler {

    @Override
    public boolean handle(String message) {
        if (message.contains("file")) {
            System.out.println("File Log: " + message);
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        } else {
            return false;
        }
    }
}