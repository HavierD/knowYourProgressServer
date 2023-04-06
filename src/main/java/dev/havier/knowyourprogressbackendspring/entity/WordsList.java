package dev.havier.knowyourprogressbackendspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "words_list")
public class WordsList {

    @Id
    @Column(name = "word")
    private String word;

    @Column(name = "part_of_speech")
    private String partOfSpeech;

    @Column(name = "cefr_levels")
    private String cefrLevel;

    @Column(name = "repetition")
    private Integer repetition;

    @Column(name = "first_meet_time")
    private String firstMeetTime;

    @Column(name = "last_meet_time")
    private String lastMeetTime;

    @Column(name = "current_state")
    private String currentState;

    @Column(name = "formula_s")
    private String formulaS;


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getCefrLevel() {
        return cefrLevel;
    }

    public void setCefrLevel(String cefrLevel) {
        this.cefrLevel = cefrLevel;
    }

    public Integer getRepetition() {
        return repetition;
    }

    public void setRepetition(Integer repetition) {
        this.repetition = repetition;
    }

    public String getFirstMeetTime() {
        return firstMeetTime;
    }

    public void setFirstMeetTime(String firstMeetTime) {
        this.firstMeetTime = firstMeetTime;
    }

    public String getLastMeetTime() {
        return lastMeetTime;
    }

    public void setLastMeetTime(String lastMeetTime) {
        this.lastMeetTime = lastMeetTime;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getFormulaS() {
        return formulaS;
    }

    public void setFormulaS(String formulaS) {
        this.formulaS = formulaS;
    }
}
