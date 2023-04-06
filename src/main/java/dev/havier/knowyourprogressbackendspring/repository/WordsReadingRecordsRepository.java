package dev.havier.knowyourprogressbackendspring.repository;

import dev.havier.knowyourprogressbackendspring.entity.WordsReadingRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordsReadingRecordsRepository  extends JpaRepository<WordsReadingRecords, String> {
}
