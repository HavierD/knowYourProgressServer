package dev.havier.knowyourprogressbackendspring.repository;

import dev.havier.knowyourprogressbackendspring.entity.WordsList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordsListRepository extends JpaRepository<WordsList, String> {
}
