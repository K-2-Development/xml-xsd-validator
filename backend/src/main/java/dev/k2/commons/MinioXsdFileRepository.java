package dev.k2.commons;

import org.springframework.stereotype.Repository;

@Repository
public class MinioXsdFileRepository implements XsdFileRepository{
    @Override
    public String saveFile(byte[] file) {
        return null;
    }

    @Override
    public String getFile(String fileId) {
        return null;
    }
}
