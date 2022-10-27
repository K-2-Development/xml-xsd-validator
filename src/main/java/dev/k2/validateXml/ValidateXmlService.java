package dev.k2.validateXml;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidateXmlService {

    private final XsdFileRepository xsdFileRepository;

    public ValidationResponse validateXml(String schemaId, String xmlToValidate)
    {
        String xsd = xsdFileRepository.xsdFile(schemaId);


        throw new RuntimeException("Not implemented yet.");
    }
}
