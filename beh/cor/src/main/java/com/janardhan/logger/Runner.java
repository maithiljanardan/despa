package com.janardhan.logger;

public class Runner {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.addHandler(new ConsoleLogHandler());
        logger.addHandler(new FileLogHandler());
        logger.addHandler(new DatabaseLogHandler());

        logger.log("This is a log message for console");
        logger.log("This is a log message for file");
        logger.log("This is a log message for database");

    }
}
