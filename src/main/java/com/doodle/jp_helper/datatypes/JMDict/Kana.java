package com.doodle.jp_helper.datatypes.JMDict;

import java.util.ArrayList;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Kana {
    private ArrayList<String> appliesToKanji;
    private boolean common;
    private String text;

    // @SerializedName("tags")
    // private Map<String, String> tags;

    @SerializedName("tags")
    private ArrayList<String> tags;

    public Kana(){

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

    public ArrayList<String> getAppliesToKanji() {
        return appliesToKanji;
    }



    public void setAppliesToKanji(ArrayList<String> appliesToKanji) {
        this.appliesToKanji = appliesToKanji;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Kana [appliesToKanji=" + appliesToKanji + ", common=" + common + ", text=" + text + ", tags=" + tags
                + "]";
    }


    

}
