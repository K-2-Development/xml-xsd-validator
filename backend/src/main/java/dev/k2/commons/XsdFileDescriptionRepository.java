package dev.k2.commons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XsdFileDescriptionRepository extends JpaRepository<FileDescription, Long> {
}
