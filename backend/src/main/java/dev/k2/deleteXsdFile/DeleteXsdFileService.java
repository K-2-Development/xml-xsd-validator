package dev.k2.deleteXsdFile;

import dev.k2.commons.XsdNotFoundException;
import dev.k2.commons.XsdFileDescriptionRepository;
import dev.k2.commons.XsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
@RequiredArgsConstructor
public class DeleteXsdFileService {

    private final XsdFileDescriptionRepository xsdFileDescriptionRepository;
    private final XsdFileRepository xsdFileRepository;

    public String deleteXsdFile(Long id) {
        String filename = xsdFileDescriptionRepository
                .findById(id)
                .orElseThrow(
                        () -> new XsdNotFoundException("record "+ id +" not found")
                )
                .getGeneratedFilename();
        xsdFileRepository.deleteFile(filename);
        xsdFileDescriptionRepository.deleteById(id);
        return filename;
    }
}

