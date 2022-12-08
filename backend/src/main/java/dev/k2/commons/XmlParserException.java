package dev.k2.commons;

public class XmlParserException extends RuntimeException
{
    public XmlParserException(String message) {
        super(message);
    }

    public XmlParserException(Throwable cause) {
        super(cause);
    }
}