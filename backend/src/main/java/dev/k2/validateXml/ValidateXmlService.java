package dev.k2.validateXml;

import dev.k2.commons.XsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidateXmlService {

    private final XsdFileRepository xsdFileRepository;

    public ValidationResponse validateXml(String schemaId, String xmlToValidate)
    {
        String xsd = xsdFileRepository.getFile(schemaId);


        throw new RuntimeException("Not implemented yet.");
    }
}
