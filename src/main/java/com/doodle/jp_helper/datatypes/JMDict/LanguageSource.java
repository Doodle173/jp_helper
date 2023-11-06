package com.doodle.jp_helper.datatypes.JMDict;

public class LanguageSource {
    
    private boolean full, wasei;
    private Language3Letter languageCode;
    private String text;

    public LanguageSource(){

    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isWasei() {
        return wasei;
    }

    public void setWasei(boolean wasei) {
        this.wasei = wasei;
    }

    public Language3Letter getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Language3Letter languageCode) {
        this.languageCode = languageCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "LanguageSource [full=" + full + ", wasei=" + wasei + ", languageCode=" + languageCode + ", text=" + text
                + "]";
    }

    

}
