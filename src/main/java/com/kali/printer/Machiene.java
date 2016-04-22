package com.kali.printer;

/**
 * Created by kalit_000 on 22/04/2016.
 */
public class Machiene {

    protected boolean Ison;

    public Machiene(boolean Ison){
        this.Ison=Ison;
    }

    public void TurnOn(){
        Ison=true;
        System.out.println("Printer is TurnOn");


    }

    public boolean TurnOff()
    {
        Ison=false;
        System.out.println("Printer is turnoff");
        return Ison;
    }


}
