package com.doodle.jp_helper.datatypes.JMDict.xrefs;

import java.util.ArrayList;

public class Antonym {

    private ArrayList<String> values;

    public Antonym(){

    }

    public ArrayList<String> getValues() {
        return values;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Antonym [values=" + values + "]";
    }

    


    

}
