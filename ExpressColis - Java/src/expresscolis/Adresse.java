/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresscolis;

/**
 *
 * @author sohan
 */
public class Adresse {
    private String voie;
    private String codepostal;
    private String ville;
    private String pays;
    
    public Adresse (String voie, String codepostal, String ville, String pays) {
        
    }
    
    public boolean estEnFrance() {
        return this.pays.equals("France");
}
}


