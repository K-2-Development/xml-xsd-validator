package dev.k2.listXsdFiles;

import dev.k2.commons.FileDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface ListXsdFilesRepository extends JpaRepository<FileDescription, Long> {

    @Query("select fd from FileDescription fd order by fd.id desc")
    List<FileDescription> findAll();
}
