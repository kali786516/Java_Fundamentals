package com.kali.printer;

/**
 * Created by kalit_000 on 22/04/2016.
 */
public class PrinterApp {

    public static void  main(String[] Args)
    {
      System.out.println("First Java App");

      //Printer myprinter=new Printer(true,"786516");

        Printer<Colorcatridge> printer=new Printer<Colorcatridge>(true,"786",new Colorcatridge());

        printer.Print(1);
        printer.AddPaper(5);
        printer.TurnOn();

        Printer<BlackWhiteCatrige> bwcatridge=new Printer<BlackWhiteCatrige>(true,"786516",new BlackWhiteCatrige());

        bwcatridge.Print(2);
        bwcatridge.AddPaper(5);
        bwcatridge.TurnOff();
        bwcatridge.printusingcatridge(new BlackWhiteCatrige(),"Hi Mama");

       //myprinter.AddPaper(5);
       //myprinter.TurnOn();
       // myprinter.Print(2);





    }


}
