/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresscolis;

/**
 *
 * @author sohan
 */
public class ExpressColis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adresse adr1 = new Adresse("4 rue du Moulin", "31000", "Toulouse", "France");
        
        Adresse adr2 = new Adresse("Kopenicker Str. 14", "10997", "Berlin", "Allemagne");
        
        System.out.println(adr1);
        System.out.println(adr2);
    }
    
}
