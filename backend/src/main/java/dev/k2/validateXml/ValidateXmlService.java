package dev.k2.validateXml;

import dev.k2.commons.XsdFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ValidateXmlService {

    private final XsdFileRepository xsdFileRepository;

    public ValidationResponse validateXml(String schemaId, String xmlToValidate) {
     return validateXml(xsdFileRepository.getFile(schemaId), xmlToValidate);
    }

    public ValidationResponse validateXml(byte[] xsd, String xmlToValidate) {

        Source xmlSteam = new StreamSource(new StringReader(xmlToValidate));
        Source xsdSteam = new StreamSource(new ByteArrayInputStream(xsd));

        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = factory.newSchema(xsdSteam);
            Validator validator = schema.newValidator();
            validator.validate(xmlSteam);
            return new ValidationResponse(true, new ArrayList<>());
        } catch (SAXException e) {
            List<String> errorArray = new ArrayList<>();
            errorArray.add("Not Valid");
            errorArray.add(e.toString());

            return new ValidationResponse(false, errorArray);
        } catch (IOException e) {
            List<String> errorArray = new ArrayList<>();
            errorArray.add("IO Exception");
            errorArray.add(e.toString());

            return new ValidationResponse(false, errorArray);
        } catch (Exception e) {
            List<String> errorArray = new ArrayList<>();
            errorArray.add("Unusual Exception");
            errorArray.add(e.toString());

            return new ValidationResponse(false, errorArray);
        }
    }
}
