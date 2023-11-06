package com.doodle.jp_helper.datatypes.JMDict;

import java.util.ArrayList;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Kanji {

    private boolean common;
    private String text;

    @SerializedName("tags")
    private ArrayList<String> tags;

    public Kanji(){

    }

    public boolean isCommon() {
        return common;
    }

    public void setCommon(boolean common) {
        this.common = common;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Kanji [common=" + common + ", text=" + text + ", tags=" + tags + "]";
    }

    

    
}
