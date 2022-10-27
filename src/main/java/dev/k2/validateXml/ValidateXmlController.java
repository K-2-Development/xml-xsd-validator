package dev.k2.validateXml;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/validate")
@RequiredArgsConstructor
public class ValidateXmlController {

    private final ValidateXmlService validateXmlService;

    @PostMapping
    public ResponseEntity<ValidationResponse> validateXml(
            @RequestParam String schemaId,
            @RequestBody String xmlToValidate
    ) {
        ValidationResponse validationResponse = validateXmlService.validateXml(schemaId, xmlToValidate);
        return validationResponse.getValid() ?
                ResponseEntity.ok(validationResponse) :
                ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(validationResponse);
    }
}
