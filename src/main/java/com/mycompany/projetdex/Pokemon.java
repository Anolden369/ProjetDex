/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class Pokemon {
    private String nom;
    private int numeroPokedex;
    private String type1;
    private String type2;
    private ArrayList<String> pokemonsSuperieurs;
    private static int nbPokemon;

    public Pokemon(String nom, int numeroPokedex, String type1, String type2) {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.type1 = type1;
        this.type2 = type2;
        this.pokemonsSuperieurs = new ArrayList<String>();
        this.nbPokemon+=1;
    }
    
    public static int afficheNbPokemon(){
        return nbPokemon;
    }
    
    public String afficherParType(String type){
        return type;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n------------------Pokemon------------------ ");
        sb.append("\nNom : ").append(nom);
        sb.append("\nNumeroPokedex : ").append(numeroPokedex);
        sb.append("\nType1 : ").append(type1);
        sb.append("\nType2 : ").append(type2);
        sb.append("\nPokemonsSuperieurs : ").append(pokemonsSuperieurs);
        return sb.toString();
    }
    
    public Pokemon(String nom, int numeroPokedex, String type1) {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.type1 = type1;
        this.type2 = "null";
        this.pokemonsSuperieurs = new ArrayList<String>();
        this.nbPokemon+=1;
    }
    
    public void ajouterPokemonSuperieur(String s)
    {
        this.pokemonsSuperieurs.add(s);
    }
    
}
