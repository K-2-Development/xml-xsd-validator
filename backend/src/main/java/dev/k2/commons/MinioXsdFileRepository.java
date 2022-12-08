package dev.k2.commons;

import io.minio.*;
import io.minio.errors.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Repository
@RequiredArgsConstructor
@Primary
public class MinioXsdFileRepository implements XsdFileRepository{

    private final MinioClient minioClient;

    @Value("${minio.bucket}")
    private String bucketName;

    @Override
    public String saveFile(byte[] file, String fileName) {
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(file)){

            ObjectWriteResponse response = minioClient.putObject(
                    PutObjectArgs.builder()
                            .bucket(bucketName)
                            .object(fileName)
                            .stream(inputStream, file.length, -1)
                            .build()
            );

            return response.etag();

        } catch (InvalidKeyException e) {
            throw new XsdNotFoundException(e);

        } catch (MinioException | NoSuchAlgorithmException | IOException e) {
            throw new MinioRepositoryInternalException(e);
        }
    }

    @Override
    public byte[] getFile(String fileName) {

        GetObjectResponse getObjectResponse = null;
        try {
            getObjectResponse = minioClient.getObject(
                    GetObjectArgs.builder()
                            .bucket(bucketName)
                            .object(fileName)
                            .build());

            return getObjectResponse.readAllBytes();
        } catch (InvalidKeyException e) {
            throw new XsdNotFoundException(e);

        } catch (io.minio.errors.XmlParserException e) {
            throw new XmlParserException(e);

        } catch (MinioException | NoSuchAlgorithmException | IOException e) {
            throw new MinioRepositoryInternalException(e);
        }


    }

    @Override
    public void deleteFile(String fileName) {

        try {
            minioClient.removeObject(
                    RemoveObjectArgs.builder()
                            .bucket(bucketName)
                            .object(fileName)
                            .build()
            );

        } catch (InvalidKeyException e) {
            throw new XsdNotFoundException(e);

        } catch (io.minio.errors.XmlParserException e) {
            throw new XmlParserException(e);

        } catch (MinioException | NoSuchAlgorithmException | IOException e) {
            throw new MinioRepositoryInternalException(e);
        }
    }
}
