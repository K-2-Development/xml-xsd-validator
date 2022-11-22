package dev.k2.deleteXsdFile;

import dev.k2.commons.FileDescription;
import dev.k2.commons.XsdFileDescriptionRepository;
import dev.k2.commons.XsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeleteXsdFileService {

    JpaRepository<FileDescription, Long> repository;
    private final XsdFileRepository xsdFileRepository;

    public String deleteXsdFile(String filename) {
        xsdFileRepository.deleteFile(filename);
        return filename;
    }

    public String deleteXsdFile(Long id) throws FileNotFoundException {
        String filename = repository
                .findById(id)
                .orElseThrow(
                        () -> new FileNotFoundException("record "+ id +" not found")
                )
                .getGeneratedFilename();
        return deleteXsdFile(filename);
    }
}

