package com.gorbe.model.nothing_model;

public class Quote {

    private String type;
    private QuoteValue value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public QuoteValue getValue() {
        return value;
    }

    public void setValue(QuoteValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (type.equals("success")){
            return value.getQuote();
        }else{
            return "Not now!";
        }
    }
}
