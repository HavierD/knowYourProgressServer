package dev.havier.knowyourprogressbackendspring.controller;

import dev.havier.knowyourprogressbackendspring.entity.WordsReadingRecords;
import dev.havier.knowyourprogressbackendspring.repository.WordsListRepository;
import dev.havier.knowyourprogressbackendspring.repository.WordsReadingRecordsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/record")
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
public class WordsReadingRecordsController {

    private WordsReadingRecordsRepository wordsReadingRecordsRepository;

    WordsReadingRecordsController(WordsReadingRecordsRepository wordsReadingRecordsRepository) {
        this.wordsReadingRecordsRepository = wordsReadingRecordsRepository;
    }

    @GetMapping
    public ResponseEntity<List<WordsReadingRecords>> list (){
        var list = wordsReadingRecordsRepository.findAll().subList(0, 100);
        return ResponseEntity.ok().body(list);
    }
}
