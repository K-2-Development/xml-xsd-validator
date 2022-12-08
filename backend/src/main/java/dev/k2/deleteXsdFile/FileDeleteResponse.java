package dev.k2.deleteXsdFile;

        import lombok.AllArgsConstructor;
        import lombok.Data;

@Data
@AllArgsConstructor
public class FileDeleteResponse {
    private Long fileId;
    private boolean successful;
    private String message;
}