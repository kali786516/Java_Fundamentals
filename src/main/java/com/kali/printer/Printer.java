package com.kali.printer;

/**
 * Created by kalit_000 on 22/04/2016.
 */
public class Printer<T extends Icatridge> implements IMachiene {


    public String modelnumbers;
    private PaperTray papertray=new PaperTray();
    private boolean Ison;
    private T catridge;


    public void AddPaper(int numofpapers){
        System.out.println("Number of papaers added:-" +numofpapers);
        papertray.addpaprer(numofpapers);
    }

    public <u extends Icatridge> void printusingcatridge(u catridge,String message)
    {
        System.out.println(catridge.toString());
        System.out.println(message);
        System.out.println(catridge.toString());

    }

    public void Print(Integer copies) {

        System.out.println(catridge.getfullpercentage());

        String onStatus = "";
        if (Ison)
            onStatus = "isOn";
        else
            onStatus = "isoff";

        String TexttoPrint=modelnumbers;

        while (copies > 0 && !papertray.isEmpty()) {
            System.out.println(TexttoPrint);
            copies --;
            papertray.usepages();;
        }

        if (papertray.isEmpty()) {
            System.out.println("Load fucking paper");
        }
    }

    public String GetModelNumber(){
        return modelnumbers;
    }

   // @Override
    public void TurnOn(){
       Ison=true;
        System.out.println("Warming up machiene");

    }

    public Printer(boolean Ison,String modelnumbers,T catridge){
        this.Ison=Ison;
        this.modelnumbers=modelnumbers;
        this.catridge=catridge;
    }

    //@Override
    public void TurnOff(){
        Ison=false;
    }


}
