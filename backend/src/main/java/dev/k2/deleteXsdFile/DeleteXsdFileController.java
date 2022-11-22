package dev.k2.deleteXsdFile;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("api/v1/delete")
@RequiredArgsConstructor
@CrossOrigin("*")
public class DeleteXsdFileController {

    private final DeleteXsdFileService service;

    @DeleteMapping("{fileId}")
    public ResponseEntity<FileDeleteResponse> deleteXsdFile(@PathVariable("fileId") Long fileId) {
        try {
            String fileName = service.deleteXsdFile(fileId);
            return ResponseEntity.ok(new FileDeleteResponse(fileId, true, fileName + " deleted"));
        }
        catch (FileNotFoundException e) {
            return ResponseEntity.ok(new FileDeleteResponse(fileId, true, e.toString()));
        }
    }
}