package dev.havier.knowyourprogressbackendspring.controller;

import dev.havier.knowyourprogressbackendspring.entity.WordsList;
import dev.havier.knowyourprogressbackendspring.repository.WordsListRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/wordList")
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
public class WordsListController {

    private WordsListRepository wordsListRepository;

    WordsListController(WordsListRepository wordsListRepository) {
        this.wordsListRepository = wordsListRepository;
    }

    @GetMapping
    public ResponseEntity<List<WordsList>> list (){
        var list = wordsListRepository.findAll().subList(0,100);
        return ResponseEntity.ok().body(list);
    }

}
