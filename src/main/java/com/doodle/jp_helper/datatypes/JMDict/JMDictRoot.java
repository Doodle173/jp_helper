package com.doodle.jp_helper.datatypes.JMDict;

import com.google.gson.annotations.SerializedName;
import java.util.*;
public class JMDictRoot {

    @SerializedName("version")
    private String version;

    @SerializedName("dictDate")
    private String date;

    @SerializedName("dictRevisions")
    private ArrayList<String> revisions;

    @SerializedName("tags")
    private Map<String, String> tags;

    @SerializedName("words")
    private ArrayList<Word> words;
    

    public JMDictRoot(){
       this.words = new ArrayList<>();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getRevisions() {
        return revisions;
    }

    public void setRevisions(ArrayList<String> revisions) {
        this.revisions = revisions;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }
    

    
}
