package dev.k2.uploadXsdFile;

import dev.k2.commons.FileDescription;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/v1/upload")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UploadXsdFileController {

    private final UploadXsdFileService service;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<FileDescription> uploadXsdFile(@RequestPart("file") MultipartFile file) {
        try {
            return ResponseEntity.ok(service.uploadXsdFile(file.getBytes(), file.getOriginalFilename()));
        } catch (IOException e) {
            throw new RuntimeException("Couldn't get bytes from multipart file.", e);
        }
    }
}
