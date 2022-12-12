package dev.k2.validateXml;

import lombok.Data;

import java.util.List;

@Data
public class ValidationResponse {

    private Boolean valid;
    private List<String> errorMessages;

    public ValidationResponse(Boolean valid, List<String> errorMessages) {
        this.valid = valid;
        this.errorMessages = errorMessages;
    }

    public Boolean getValid() {
        return valid;
    }
}
