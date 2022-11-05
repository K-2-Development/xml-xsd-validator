package dev.k2.commons;

public interface XsdFileRepository {

    String saveFile(byte[] file, String fileName);

    byte[] getFile(String fileId);

    boolean deleteFile(String fileName);
}
