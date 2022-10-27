package dev.k2.uploadXsdFile;

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
    public ResponseEntity<FileUploadResponse> uploadXsdFile(@RequestPart("file") MultipartFile file) {
        try {
            String fileId = service.uploadXsdFile(file.getBytes(), file.getOriginalFilename());
            return ResponseEntity.ok(new FileUploadResponse(fileId));
        } catch (IOException e) {
            throw new RuntimeException("Couldn't get bytes from multipart file.", e);
        }
    }
}
