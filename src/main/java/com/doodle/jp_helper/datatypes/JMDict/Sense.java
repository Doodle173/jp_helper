package com.doodle.jp_helper.datatypes.JMDict;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import com.doodle.jp_helper.datatypes.JMDict.xrefs.Antonym;

public class Sense {

    private ArrayList<Antonym> antonyms;
    private ArrayList<String> appliesToKana, appliesToKanji;
    private ArrayList<String> dialect, field, misc, info, partOfSpeech;

    private ArrayList<LanguageSource> languageSource;

    private ArrayList<Gloss> gloss;

    public Sense() {

    }

    public ArrayList<Antonym> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(ArrayList<Antonym> antonyms) {
        this.antonyms = antonyms;
    }

    public ArrayList<String> getAppliesToKana() {
        return appliesToKana;
    }

    public void setAppliesToKana(ArrayList<String> appliesToKana) {
        this.appliesToKana = appliesToKana;
    }

    public ArrayList<String> getAppliesToKanji() {
        return appliesToKanji;
    }

    public void setAppliesToKanji(ArrayList<String> appliesToKanji) {
        this.appliesToKanji = appliesToKanji;
    }

    public ArrayList<String> getDialect() {
        return dialect;
    }

    public void setDialect(ArrayList<String> dialect) {
        this.dialect = dialect;
    }

    public ArrayList<String> getField() {
        return field;
    }

    public void setField(ArrayList<String> field) {
        this.field = field;
    }

    public ArrayList<String> getMisc() {
        return misc;
    }

    public void setMisc(ArrayList<String> misc) {
        this.misc = misc;
    }

    public ArrayList<String> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<String> info) {
        this.info = info;
    }

    public ArrayList<Gloss> getGloss() {
        return gloss;
    }

    public void setGloss(ArrayList<Gloss> gloss) {
        this.gloss = gloss;
    }

    public ArrayList<LanguageSource> getLanguageSources() {
        return languageSource;
    }

    public void setLanguageSources(ArrayList<LanguageSource> languageSources) {
        this.languageSource = languageSources;
    }

    public ArrayList<String> getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(ArrayList<String> partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public ArrayList<LanguageSource> getLanguageSource() {
        return languageSource;
    }

    public void setLanguageSource(ArrayList<LanguageSource> languageSource) {
        this.languageSource = languageSource;
    }

    @Override
    public String toString() {
        return "Sense [antonyms=" + antonyms + ", appliesToKana=" + appliesToKana + ", appliesToKanji=" + appliesToKanji
                + ", dialect=" + dialect + ", field=" + field + ", misc=" + misc + ", info=" + info + ", partOfSpeech="
                + partOfSpeech + ", languageSource=" + languageSource + ", gloss=" + gloss + "]";
    }



    
    



    
    

}
