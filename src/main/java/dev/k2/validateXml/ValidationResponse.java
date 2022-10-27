package dev.k2.validateXml;

import lombok.Data;

import java.util.List;

@Data
public class ValidationResponse {

    private Boolean valid;
    private List<String> errorMessages;

}
