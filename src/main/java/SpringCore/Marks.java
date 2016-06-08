/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringCore;

/**
 *
 * @author Chanky-JVM
 */
public class Marks {
    
    private final int Bengali; 
    private final int English;

    public Marks(int Bengali, int English) {      
        this.Bengali = Bengali;
        this.English = English;
    }
//      public Marks(String Bengali, String English) {
//        this.Bengali = 50;
//        this.English = 50;
//    }
    
    public int getBengali() {
        return Bengali;
    }
    public int getEnglish() {
        return English;
    }

}
