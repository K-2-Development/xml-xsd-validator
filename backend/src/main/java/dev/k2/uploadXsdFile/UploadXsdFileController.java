package dev.k2.uploadXsdFile;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/upload")
@RequiredArgsConstructor
public class UploadXsdFileController {

    private final UploadXsdFileService service;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadXsdFile(@RequestPart MultipartFile file) {
        try {
            String fileId = service.uploadXsdFile(file.getBytes());
            return ResponseEntity.ok(fileId);
        } catch (IOException e) {
            throw new RuntimeException("Couldn't get bytes from multipart file.", e);
        }
    }
}
