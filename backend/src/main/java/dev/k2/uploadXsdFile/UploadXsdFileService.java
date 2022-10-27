package dev.k2.uploadXsdFile;

import dev.k2.commons.FileDescription;
import dev.k2.commons.XsdFileDescriptionRepository;
import dev.k2.commons.XsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UploadXsdFileService {

    private final XsdFileRepository xsdFileRepository;
    private final XsdFileDescriptionRepository xsdFileDescriptionRepository;

    public String uploadXsdFile(byte[] file, String filename) {
        String generatedFilename = UUID.randomUUID().toString() + ".xsd";
        FileDescription fileDescription = new FileDescription();
        fileDescription.setOriginalFilename(filename);
        fileDescription.setGeneratedFilename(generatedFilename);
        FileDescription created = xsdFileDescriptionRepository.save(fileDescription);
        xsdFileRepository.saveFile(file, generatedFilename);
        return generatedFilename;
    }
}
