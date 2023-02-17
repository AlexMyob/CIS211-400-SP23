/*Assignment 1
Alexander Papiro
CIS211-400
1-23-2023*/
//I wrote all the code submitted, and I have provided citations and references where appropriate.
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pokemon> pokemonList = new ArrayList<>();

    public static void main(String[] args) {
        parseCSV();
        menu();
    }
    public static void parseCSV() {
        String line = "";
        File pokemonInfoCSVfile = new File("parsingCSV/pokemon.csv");
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(pokemonInfoCSVfile));
            csvReader.readLine();

            while ((line = csvReader.readLine()) != null) {
                //Store line from CSV and create an array of strings with each section of that line
                String[] pokemonInfoSplit = line.split(",");

                int pokemonIndexNumber = Integer.parseInt(pokemonInfoSplit[0]);
                String pokemonName = (pokemonInfoSplit[1]);
                String pokemonTypeOne = (pokemonInfoSplit[2]);
                String pokemonTypeTwo = (pokemonInfoSplit[3]);
                int pokemonTotal = Integer.parseInt((pokemonInfoSplit[4]));
                int pokemonHp = Integer.parseInt((pokemonInfoSplit[5]));
                int pokemonAttack = Integer.parseInt((pokemonInfoSplit[6]));
                int pokemonDefense = Integer.parseInt((pokemonInfoSplit[7]));
                int pokemonAttackSpeed = Integer.parseInt((pokemonInfoSplit[8]));
                int pokemonDefenceSpeed = Integer.parseInt((pokemonInfoSplit[9]));
                int pokemonSpeed = Integer.parseInt((pokemonInfoSplit[10]));
                int pokemonGeneration = Integer.parseInt((pokemonInfoSplit[11]));
                boolean pokemonIsLegendary = Boolean.parseBoolean((pokemonInfoSplit[12]));

                Pokemon pokemon = new Pokemon(pokemonIndexNumber, pokemonName, pokemonTypeOne, pokemonTypeTwo, pokemonTotal, pokemonHp, pokemonAttack, pokemonDefense,
                        pokemonAttackSpeed, pokemonDefenceSpeed, pokemonSpeed, pokemonGeneration, pokemonIsLegendary);

                pokemonList.add(pokemon);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FIle not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void listAllPokemon() {
        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println(pokemonList.get(i));
        }
    }
    public static String pokemonSearch(String name) {
        String result = null;
        for (int i = 0; i < pokemonList.size(); i++) {
            if (pokemonList.get(i).getName().contains(name)) {
                result = pokemonList.get(i).toString();
            }
            else {
                 continue;
            }
        }
        if (result == null) {
            result = "This pokemon could not be located within the provided CSV";
        }
        return result;
    }
    public static void menu() {
        Scanner scannerOne = new Scanner(System.in);
        int selection = 0;
        boolean isValid = false;
        do {
            System.out.println("########## " + "POKEDEX MENU " + "##########");
            System.out.println("1. Show all pokemon in pokedex \n" + "2. Search for Pokemon information by name \n" + "3. Exit Program");
            selection = scannerOne.nextInt();
            switch (selection) {
                case 1:
                    listAllPokemon();
                    break;
                case 2:
                    Scanner scannerTwo = new Scanner(System.in);
                    System.out.println("Please enter a pokemon name:");
                    String query = scannerTwo.nextLine();
                    System.out.println(pokemonSearch(query));
                    break;
                case 3:
                    System.exit(0);
            }
        }while(isValid != true);
    }
}


