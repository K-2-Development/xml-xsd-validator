package dev.k2.uploadXsdFile;

import dev.k2.commons.XsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UploadXsdFileService {

    private final XsdFileRepository xsdFileRepository;

    public String uploadXsdFile(byte[] file) {
        return xsdFileRepository.saveFile(file);
    }
}
