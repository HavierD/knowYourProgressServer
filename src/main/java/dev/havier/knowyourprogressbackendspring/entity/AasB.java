package dev.havier.knowyourprogressbackendspring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "a_as_b")
public class AasB {

    @Id
    @Column (name = "before_word")
    private String beforeWord;

    @Column (name = "afterWord")
    private String afterWord;

    public String getBeforeWord() {
        return beforeWord;
    }

    public void setBeforeWord(String beforeWord) {
        this.beforeWord = beforeWord;
    }

    public String getAfterWord() {
        return afterWord;
    }

    public void setAfterWord(String afterWord) {
        this.afterWord = afterWord;
    }
}
