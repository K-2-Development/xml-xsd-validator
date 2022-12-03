package test.ValidateXmlService;

import dev.k2.validateXml.ValidateXmlService;
import dev.k2.validateXml.ValidationResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class ValidateXmlServiceTest {
    @Test
    void validFile()
    {
        ValidateXmlService validateXmlService = new ValidateXmlService(null);
        Path xmlPath = Paths.get("src/main/java/test/ValidateXmlService/sampleSchematValid.xsd.xml").toAbsolutePath();
        Path xsdPath = Paths.get("src/main/java/test/ValidateXmlService/sampleSchemat.xsd").toAbsolutePath();

        try
        {
            ValidationResponse response = validateXmlService.validateXml(
                    Files.readAllBytes(xsdPath),
                    Files.readString(xmlPath)
            );

            assert response.getValid() == true;
        }
        catch(IOException e){throw new RuntimeException(e);}
    }

    @Test
    void fileContentError()
    {
        ValidateXmlService validateXmlService = new ValidateXmlService(null);
        Path xmlPath = Paths.get("src/main/java/test/ValidateXmlService/sampleSchematVersionError.xsd.xml").toAbsolutePath();
        Path xsdPath = Paths.get("src/main/java/test/ValidateXmlService/sampleSchemat.xsd").toAbsolutePath();

        try
        {
            ValidationResponse response = validateXmlService.validateXml(
                    Files.readAllBytes(xsdPath),
                    Files.readString(xmlPath)
            );

            assert response.getValid() != true;
            assert response.getErrorMessages().get(0) == "Not Valid";
        }
        catch(IOException e){throw new RuntimeException(e);}
    }

    @Test
    void fileVersionError()
    {
        ValidateXmlService validateXmlService = new ValidateXmlService(null);
        Path xmlPath = Paths.get("src/main/java/test/ValidateXmlService/sampleSchematInvalidContent.xsd.xml").toAbsolutePath();
        Path xsdPath = Paths.get("src/main/java/test/ValidateXmlService/sampleSchemat.xsd").toAbsolutePath();

        try
        {
            ValidationResponse response = validateXmlService.validateXml(
                    Files.readAllBytes(xsdPath),
                    Files.readString(xmlPath)
            );

            assert response.getValid() != true;
            assert response.getErrorMessages().get(0) == "Not Valid";
        }
        catch(IOException e){throw new RuntimeException(e);}
    }
}