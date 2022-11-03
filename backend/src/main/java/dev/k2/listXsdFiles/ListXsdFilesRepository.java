package dev.k2.listXsdFiles;

import dev.k2.commons.FileDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface ListXsdFilesRepository extends JpaRepository<FileDescription, Long> {
}
