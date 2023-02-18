import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static List<Pokemon> pokemonList = new ArrayList<>();
    //Linked stacks to store player and computer's Pokemon
    private static Stack<Pokemon> player = new LinkedStack<>();
    private static Stack<Pokemon> computer = new LinkedStack<>();

    //Variables to store score
    private static int computerScore = 0;
    private static int playerScore = 0;

    public static void parseCSV() {
        String line = "";
        File pokemonInfoCSVfile = new File("assignment-3-linkedlist-stack-game/pokemon.csv");
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

    public static void assignPokemon() {
        Collections.shuffle(pokemonList);

        //Pushing shuffled Pokemon to player and computer
        for (int i = 0; i < 10; i++) {
            player.push(pokemonList.get(i));
        }
        for (int i = 10; i < 20; i++) {
            computer.push(pokemonList.get(i));
        }
    }

    public static void runGame() {
        //Loop through all 10 rounds
        for (int i = 1; i < 11; i++) {
            //Scanner object to read user input before proceeding to the next round
            Scanner scan = new Scanner(System.in);

            int playerAttackValue = player.peek().getAttack();
            int computerDefenceValue = computer.peek().getDefense();

            System.out.println("Round #: " + i);
            System.out.println("Player: " + player.pop());
            System.out.println("Computer: " + computer.pop());
            System.out.println("##### " + "fight! " + "######");

            if (playerAttackValue > computerDefenceValue) {
                System.out.println("Player wins this round.");
                playerScore++;
            } else if (playerAttackValue == computerDefenceValue) {
                System.out.println("It's a tie!");
            } else {
                System.out.println("Computer wins this round.");
                computerScore++;
            }
            System.out.println();
            scan.nextLine();
        }
    }

    public static void displayResults() {
        System.out.println("The battle has come to an end.");
        System.out.println("Player Score: " + playerScore);
        System.out.println("Computer Score: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("Player has won the game!");
        } else if (playerScore == computerScore) {
            System.out.println("This game has come to a draw!");
        } else {
            System.out.println("Computer has won the game!");
        }
    }
}
