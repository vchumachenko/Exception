package org.nox;

import java.io.PrintStream;
import java.io.PrintWriter;

public class ArrayListFullException extends Exception{
    public ArrayListFullException() {

        super("Переполнение ArrayList. Нельзя добавлять больше 10 элементов.");
    }

    public ArrayListFullException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка: " + super.getMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}





