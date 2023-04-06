package dev.havier.knowyourprogressbackendspring.repository;

import dev.havier.knowyourprogressbackendspring.entity.IgnoreDictionary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IgnoreAasBRepository extends JpaRepository<IgnoreDictionary, String> {

}
