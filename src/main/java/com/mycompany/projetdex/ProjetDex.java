/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetdex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class ProjetDex {
    private static ArrayList<Version> versions = new ArrayList<Version>();
    private static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    private static ArrayList<String> listype = new ArrayList<String>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Version EmeraudeRouge = new Version("Emeraude Rouge");
        Version RubisRugby = new Version("Rubis Rugby");
        Version SaphirSonic = new Version("Saphir Sonic");
        Version PlatineBleu = new Version("Platine Bleu");
        Version GigaChen = new Version("Giga Chen");
        Version NewDiamond = new Version("NewDiamond");
        
        // Ajout des starters pour Emeraude Rouge
        Pokemon salameche = new Pokemon("Salamèche", 4, "Feu");
        Pokemon machoc = new Pokemon("Machoc", 66, "Combat");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electrique");
        salameche.ajouterPokemonSuperieur("Reptincel");
        salameche.ajouterPokemonSuperieur("Dracaufeu");
        machoc.ajouterPokemonSuperieur("Machopeur");
        machoc.ajouterPokemonSuperieur("Mackogneur");
        pikachu.ajouterPokemonSuperieur("Raichu");
        EmeraudeRouge.addPokemon(salameche);
        EmeraudeRouge.addPokemon(machoc);
        EmeraudeRouge.addPokemon(pikachu);
        pokemons.add(salameche);
        pokemons.add(machoc);
        pokemons.add(pikachu);

        // Ajout des starters pour Rubis Rugby
        Pokemon carapuce = new Pokemon("Carapuce", 7, "Eau");
        Pokemon gobou = new Pokemon("Gobou", 258, "Eau");
        Pokemon abo = new Pokemon("Abo", 23, "Poison");
        carapuce.ajouterPokemonSuperieur("Carabaffe");
        carapuce.ajouterPokemonSuperieur("Tortank");
        gobou.ajouterPokemonSuperieur("Flobio");
        gobou.ajouterPokemonSuperieur("Laggron");
        abo.ajouterPokemonSuperieur("Arbok");
        RubisRugby.addPokemon(carapuce);
        RubisRugby.addPokemon(gobou);
        RubisRugby.addPokemon(abo);
        pokemons.add(carapuce);
        pokemons.add(gobou);
        pokemons.add(abo);

        // Ajout des starters pour Saphir Sonic
        Pokemon stalgamin = new Pokemon("Stalgamin", 361, "Glace");
        Pokemon tarsal = new Pokemon("Tarsal", 280, "Psy");
        Pokemon goupix = new Pokemon("Goupix", 37, "Feu");
        stalgamin.ajouterPokemonSuperieur("Oniglali");
        tarsal.ajouterPokemonSuperieur("Kirlia");
        tarsal.ajouterPokemonSuperieur("Gardevoir");
        goupix.ajouterPokemonSuperieur("Feunard");
        SaphirSonic.addPokemon(stalgamin);
        SaphirSonic.addPokemon(tarsal);
        SaphirSonic.addPokemon(goupix);
        pokemons.add(stalgamin);
        pokemons.add(tarsal);
        pokemons.add(goupix);

        // Ajout des starters pour Platine Bleu
        Pokemon ptitard = new Pokemon("Ptitard", 60, "Eau");
        Pokemon stari = new Pokemon("Stari", 120, "Eau");
        Pokemon bulbizarre = new Pokemon("Bulbizarre", 1, "Plante", "Poison");
        ptitard.ajouterPokemonSuperieur("Tetarte");
        ptitard.ajouterPokemonSuperieur("Tartard");
        stari.ajouterPokemonSuperieur("Staross");
        bulbizarre.ajouterPokemonSuperieur("Herbizarre");
        bulbizarre.ajouterPokemonSuperieur("Empiflor");
        PlatineBleu.addPokemon(ptitard);
        PlatineBleu.addPokemon(stari);
        PlatineBleu.addPokemon(bulbizarre);
        pokemons.add(ptitard);
        pokemons.add(stari);
        pokemons.add(bulbizarre);

        // Ajout des starters pour Giga Chen
        Pokemon racaillou = new Pokemon("Racaillou", 74, "Roche");
        Pokemon fantominus = new Pokemon("Fantominus", 92, "Spectre", "Poison");
        Pokemon abra = new Pokemon("Abra", 63, "Psy");
        racaillou.ajouterPokemonSuperieur("Gravalanch");
        racaillou.ajouterPokemonSuperieur("Grolem");
        fantominus.ajouterPokemonSuperieur("Spectrum");
        fantominus.ajouterPokemonSuperieur("Ectoplasma");
        abra.ajouterPokemonSuperieur("Kadabra");
        abra.ajouterPokemonSuperieur("Alakazam");
        GigaChen.addPokemon(racaillou);
        GigaChen.addPokemon(fantominus);
        GigaChen.addPokemon(abra);
        pokemons.add(racaillou);
        pokemons.add(fantominus);
        pokemons.add(abra);
        ArrayList<String> listeTypes = new ArrayList<String>();
        
        while (true) {
            listeTypes = remplirListeTypes(pokemons);
            
            System.out.println("Menu :");
            System.out.println("1. Créer un Pokemon et l'ajouter au starter d'une version");
            System.out.println("2. Afficher le nom des Pokémons starter d'une version");
            System.out.println("3. Afficher tous les Pokémons d'un type");
            System.out.println("4. Afficher le nombre total de Pokémons");
            System.out.println("5. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // consomme le retour chariot
            switch (choix) {
                case 1:
                    // ajouterPokemon();
                    Scanner input = new Scanner(System.in);
                    System.out.println("Le nom du Pokemon");
                    String nomP = input.next();
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Le numéro Pokedex du Pokemon");
                    int numeroP = Integer.parseInt(input1.next());
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Le type1 du Pokemon");
                    String typeP1 = input2.next();
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Le type2 du Pokemon");
                    String typeP2 = input3.next();
                    Pokemon p = new Pokemon(nomP,numeroP,typeP1,typeP2);
                    System.out.println("\nVous avez créer " + nomP 
                            + "\n numeroPokedex : " + numeroP 
                            + "\n Premier Type : " + typeP1 
                            + "\n Second Type : " + typeP2);
                    Scanner input7 = new Scanner(System.in);
                    pokemons.add(p);
                    System.out.println("Quelle starter voulez-vous ajouter le pokemon :\nVotre choix :"
                            + "\n1-EmeraudeRouge"
                            + "\n2-RubisRugby "
                            + "\n3-SaphirSonic"
                            + "\n4-PlatineBleu"
                            + "\n5-GigaChen" 
                            + "\n6-NewDiamond");
                    int choix8 = Integer.parseInt(input7.next());
                    if(choix8==1){
                        if(EmeraudeRouge.sizeVersion() >= 3){
                           System.out.println("Un starter ne peut pas être composé de plus de 3 pokémons");
                        }
                        else {
                           EmeraudeRouge.addPokemon(p);
                           System.out.println("C'est fait !");
                        }
                    }
                    else if(choix8==2){
                        if(RubisRugby.sizeVersion() >= 3){
                           System.out.println("Un starter ne peut pas être composé de plus de 3 pokémons");
                        }
                        else {
                           RubisRugby.addPokemon(p);
                           System.out.println("C'est fait !");
                        }
                    }
                    else if(choix8==3){
                        if(SaphirSonic.sizeVersion() >= 3){
                           System.out.println("Un starter ne peut pas être composé de plus de 3 pokémons");
                        }
                        else {
                           SaphirSonic.addPokemon(p);
                           System.out.println("C'est fait !");
                        }
                    }
                    else if(choix8==4){
                        if(PlatineBleu.sizeVersion() >= 3){
                           System.out.println("Un starter ne peut pas être composé de plus de 3 pokémons");
                        }
                        else {
                           PlatineBleu.addPokemon(p);
                           System.out.println("C'est fait !");
                        }
                    }
                    else if(choix8==5){
                        if(GigaChen.sizeVersion() >= 3){
                           System.out.println("Un starter ne peut pas être composé de plus de 3 pokémons");
                        }
                        else {
                           GigaChen.addPokemon(p);
                           System.out.println("C'est fait !");
                        }
                    }
                    else if(choix8==6){
                        if(NewDiamond.sizeVersion() >= 3){
                           System.out.println("Un starter ne peut pas être composé de plus de 3 pokémons");
                        }
                        else {
                           NewDiamond.addPokemon(p);
                           System.out.println("C'est fait !");
                        }
                    }
                    break;
                case 2:
                    // afficherStarters();
                    Scanner input6 = new Scanner(System.in);
                    System.out.println("Quelle starter voulez-vous voir :"
                            + "\nVotre choix :"
                            + "\n1-EmeraudeRouge "
                            + "\n2-RubisRugby "
                            + "\n3-SaphirSonic"
                            + "\n4-PlatineBleu"
                            + "\n5-GigaChen" 
                            + "\n6-NewDiamond");
                    int choix7 = Integer.parseInt(input6.next());
                    if(choix7==1){
                        System.out.println(EmeraudeRouge);
                    }
                    if(choix7==2){
                        System.out.println(RubisRugby);
                    }
                    if(choix7==3){
                        System.out.println(SaphirSonic);
                    }
                    if(choix7==4){
                        System.out.println(PlatineBleu);
                    }
                    if(choix7==5){
                        System.out.println(GigaChen);
                    }
                    if(choix7==6){
                        System.out.println(NewDiamond);
                    }
                    break;
                case 3:
                    // afficherParType();
                    System.out.println(remplirListeTypes(pokemons));
                    Scanner input9 = new Scanner(System.in);
                    System.out.println("Quel type voulez-vous afficher : "
                            + "\n1-Feu"
                            + "\n2-Combat"
                            + "\n3-Electrique"
                            + "\n4-Eau"
                            + "\n5-Poison"
                            + "\n6-Glace"
                            + "\n7-Psy"
                            + "\n8-Plante"
                            + "\n9-Roche"
                            + "\n10-Spectre");
                    int choix10 = Integer.parseInt(input9.next());
                    if(choix10 == 1){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Feu")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 2){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Combat")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 3){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Electrique")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 4){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Eau")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 5){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Poison")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 6){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Glace")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 7){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Psy")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 8){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Plante")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 9){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Roche")){
                              System.out.println(poke);
                          }
                      }
                    }
                    else if(choix10 == 10){
                      for(Pokemon poke : pokemons){
                          if(poke.getType1().contains("Spectre")){
                              System.out.println(poke);
                          }
                      }
                    }
                    break;
                case 4:
                    // afficherNbPokemon();
                    System.out.println("Le nombre totale de pokemon est " + Pokemon.afficheNbPokemon());
                    int a = Pokemon.afficheNbPokemon()/3;
                    if(a != Version.getNbVersions()){
                        System.out.println("Tous les starters ne sont pas complets");
                    }
                    else {
                        System.out.println("Tous les starters sont complets");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide !");
            }
            
            System.out.println(); // saut de ligne
        }

    }
    
    public static ArrayList<String> remplirListeTypes(ArrayList<Pokemon> p)
    {
        
        for(Pokemon tempokemon : p)
        {
            if(listype.contains(tempokemon.getType1()) == false)
            {
                listype.add(tempokemon.getType1());
            }
            if(listype.contains(tempokemon.getType2()) == false)
            {
                listype.add(tempokemon.getType2());
            }
            listype.remove("null");
        }
        
        return listype;
    }
}
