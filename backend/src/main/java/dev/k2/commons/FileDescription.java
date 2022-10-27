package dev.k2.commons;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class FileDescription {

    @Id
    @GeneratedValue
    private Long id;

    private String originalFilename;

    @Column(unique = true)
    private String generatedFilename;

}
