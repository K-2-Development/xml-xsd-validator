package dev.k2.commons;

public interface XsdFileRepository {

    String saveFile(byte[] file);

    String getFile(String fileId);
}
