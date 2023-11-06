package com.doodle.jp_helper.datatypes.JMDict;

import java.util.ArrayList;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Word {
    
    @SerializedName("id")
    private String id;

    @SerializedName("kanji")
    private ArrayList<Kanji> kanji;

    @SerializedName("kana")
    private ArrayList<Kana> kana;

    @SerializedName("sense")
    private ArrayList<Sense> sense;

    public Word(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Kanji> getKanji() {
        return kanji;
    }

    public void setKanji(ArrayList<Kanji> kanji) {
        this.kanji = kanji;
    }

    public ArrayList<Kana> getKana() {
        return kana;
    }

    public void setKana(ArrayList<Kana> kana) {
        this.kana = kana;
    }

    public ArrayList<Sense> getSense() {
        return sense;
    }

    public void setSense(ArrayList<Sense> sense) {
        this.sense = sense;
    }

    @Override
    public String toString() {
        return "Word [id=" + id + ", kanji=" + kanji + ", kana=" + kana + "]";
    }

    

}
