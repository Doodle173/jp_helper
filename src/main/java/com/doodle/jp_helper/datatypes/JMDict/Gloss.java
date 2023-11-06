package com.doodle.jp_helper.datatypes.JMDict;

import com.google.gson.annotations.SerializedName;

public class Gloss {

    @SerializedName("lang")
    private String lang;


    @SerializedName("gender")
    private String gender;


    @SerializedName("type")
    private String type;


    @SerializedName("text")
    private String text;

    public Gloss(){
        
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Gloss [lang=" + lang + ", gender=" + gender + ", type=" + type + ", text=" + text + "]";
    }

    

    

}
