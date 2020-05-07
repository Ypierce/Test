package com.pierce;

public class TestDemo {

    @Myannotation(value = "Hello")
    private String valueFirst;

    @Myannotation()
    private String valueSecond;

    public TestDemo(){}

    public String getValueFirst() {
        return valueFirst;
    }

    public void setValueFirst(String valueFirst) {
        this.valueFirst = valueFirst;
    }

    public String getValueSecond() {
        return valueSecond;
    }

    public void setValueSecond(String valueSecond) {
        this.valueSecond = valueSecond;
    }
}
