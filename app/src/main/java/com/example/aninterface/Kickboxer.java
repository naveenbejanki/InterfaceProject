package com.example.aninterface;

public class Kickboxer extends Boxer {

    private int kickpower;

    public int getKickpower() {
        return kickpower;
    }

    public void setKickpower(int kickpower) {
        this.kickpower = kickpower;
    }


    public Kickboxer(String name, int punchpower, int punchspeed,int kickpower) {
        super(name, punchpower, punchspeed,);
    }



}
