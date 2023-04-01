package com.janardhan.logger;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private final List<LogHandler> handlers;

    public Logger() {
        handlers = new ArrayList<>();
    }

    public void addHandler(LogHandler handler) {
        handlers.add(handler);
    }

    public void log(String message) {
        for (LogHandler handler : handlers) {
            if (handler.handle(message)) {
                break;
            }
        }
    }
}
