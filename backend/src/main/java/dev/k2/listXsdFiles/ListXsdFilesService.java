package dev.k2.listXsdFiles;

import dev.k2.commons.FileDescription;
import dev.k2.commons.MinioXsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListXsdFilesService {

    private final ListXsdFilesRepository repository;
    private final MinioXsdFileRepository minioXsdFileRepository;

    public List<FileDescription> getAllFiles(){
        return repository.findAll();
    }

    public byte[] getFileContentById(Long id) {
        String filename = repository
                .findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Record does not extst.")
                )
                .getGeneratedFilename();
        byte[] bytes = minioXsdFileRepository.getFile(filename);
        return bytes;
    }
}
