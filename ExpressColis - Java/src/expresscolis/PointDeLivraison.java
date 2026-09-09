/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresscolis;

import java.util.ArrayList;

/**
 *
 * @author sohan
 */
public class PointDeLivraison {
    private String nom;
    private Adresse adresse;
    private ArrayList<Colis> colisdeposes;
    
    public PointDeLivraison (String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.colisdeposes = new ArrayList<>();
    }
    
    
    public void AjouterColis() {
        
    }
    
    public float calculRentabiliteTotale() {
        
    }
}
