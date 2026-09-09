/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresscolis;

/**
 *
 * @author sohan
 */
public class Colis {
    int poidsengrammes;
    String nomdestinataire;
    Adresse adresseclient;
    PointDeLivraison pointdelivraison;
    
    public Colis (int poidsengrammes, String nomdestinataire, Adresse adresseclient, PointDeLivraison pointdelivraison){
        this.poidsengrammes = poidsengrammes;
        this.nomdestinataire = nomdestinataire;
        this.adresseclient = adresseclient;
        this.pointdelivraison = pointdelivraison;
    }
    
    public float calculerPrix () {
    
    }
}
