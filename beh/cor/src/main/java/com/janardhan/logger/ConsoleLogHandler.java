package com.janardhan.logger;

public class ConsoleLogHandler extends LogHandler {

    @Override
    public boolean handle(String message) {
        if (message.contains("console")) {
            System.out.println("Console Log: " + message);
            return true;
        } else if (nextHandler != null) {
            return nextHandler.handle(message);
        } else {
            return false;
        }
    }
}