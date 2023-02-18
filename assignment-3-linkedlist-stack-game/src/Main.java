/*Assignment 3
Alexander Papiro
CIS211-400
02-16-2023*/
//I wrote all the code submitted, and I have provided citations and references where appropriate.
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game.parseCSV();
        Game.assignPokemon();
        Game.runGame();
        Game.displayResults();
    }
}