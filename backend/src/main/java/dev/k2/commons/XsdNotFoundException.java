package dev.k2.commons;

public class XsdNotFoundException extends RuntimeException
{
    public XsdNotFoundException(String message) {
        super(message);
    }

    public XsdNotFoundException(Throwable cause) {
        super(cause);
    }
}
