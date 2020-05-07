package com.example.aninterface;

public class Boxer implements Fighter {

    private String name;
    private int punchpower;
    private int punchspeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPunchpower() {
        return punchpower;
    }

    public void setPunchpower(int punchpower) {
        this.punchpower = punchpower;
    }

    public int getPunchspeed() {
        return punchspeed;
    }

    public void setPunchspeed(int punchspeed) {
        this.punchspeed = punchspeed;
    }

    public Boxer(String name, int punchpower, int punchspeed) {
        this.name = name;
        this.punchpower = punchpower;
        this.punchspeed = punchspeed;
    }

    @Override
    public String throwpunch() {
        return "throwpunch";
    }

    @Override
    public String throwsuper() {
        return "superpower";
    }

    @Override
    public String throwjab() {
        return "throwjab";
    }
}
