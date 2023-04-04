/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Version {
    private String nom;
    private ArrayList<Pokemon> listeStarter;
    private static int nbVersions;

    public Version(String nom) {
        this.nom = nom;
        this.listeStarter = new ArrayList<Pokemon>();
        this.nbVersions+=1;
    }

    public static int getNbVersions() {
        return nbVersions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Version :");
        sb.append("\nNom : ").append(nom);
        sb.append("\nListeStarter : ").append(listeStarter);
        return sb.toString();
    }
    public void addPokemon(Pokemon p){
        this.listeStarter.add(p);
    }
    
    public int sizeVersion(){
        return this.listeStarter.size();
    }
    
}
