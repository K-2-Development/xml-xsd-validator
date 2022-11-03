package dev.k2.listXsdFiles;


import dev.k2.commons.FileDescription;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/files")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ListXsdFilesController {

    private final ListXsdFilesService service;

    @GetMapping
    public List<FileDescription> getAllFiles(){
        return service.getAllFiles();
    }

    @GetMapping("{id}")
    public byte[] downloadFile(@PathVariable("id") Long id){
        byte[] fileBytes = service.getFileContentById(id);
        return fileBytes;
    }
}
