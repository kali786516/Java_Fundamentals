package com.kali.printer;

/**
 * Created by kalit_000 on 22/04/2016.
 */
public class PaperTray {

    int pages=0;

    public void addpaprer(int count){
        pages +=count;
    }

     public void usepages(){
         pages --;
     }

    public boolean isEmpty(){
        return pages > 0;
    }




}
