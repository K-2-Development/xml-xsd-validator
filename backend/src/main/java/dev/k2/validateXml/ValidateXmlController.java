package dev.k2.validateXml;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/validate")
@RequiredArgsConstructor
public class ValidateXmlController {

    private final ValidateXmlService validateXmlService;

    @Value("${minio.endpoint}")
    private String asd;

    @Value("${minio.endpoint}")
    String asd2;

    @PostMapping
    public ResponseEntity<ValidationResponse> validateXml(
            @RequestParam String schemaId,
            @RequestBody String xmlToValidate
    ) {

        System.out.println(asd);
        System.out.println(asd2);
        System.out.println(schemaId);
        return ResponseEntity.ok(new ValidationResponse());
//        ValidationResponse validationResponse = validateXmlService.validateXml(schemaId, xmlToValidate);
//        return validationResponse.getValid() ?
//                ResponseEntity.ok(validationResponse) :
//                ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(validationResponse);
    }
}
