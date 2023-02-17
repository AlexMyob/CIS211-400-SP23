import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

/*        Component cpu = new Component("13700k", 450.0);

        Component gpu = new Component();
        gpu.setName("RTX4090");
        gpu.setPrice(1499.0);
        partslist.add(cpu);
        partslist.add(gpu);*/

        ArrayList<Component> partslist = new ArrayList<>();

        File componentInfoCSVfile = new File("week1review/data.csv");
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(componentInfoCSVfile);

            while (fileScanner.hasNextLine()) {

                //Store line from CSV and create an array of strings with each section of that line
                String componentInfoLine = fileScanner.nextLine();
                String[] componentInfoSplit = componentInfoLine.split(",");

                String partName = componentInfoSplit[0];
                double partPrice = Double.parseDouble(componentInfoSplit[1]);
                Component component = new Component(partName, partPrice);
                partslist.add(component);
                System.out.println(component.getName());
            }

            for (int i = 0; i < partslist.size(); i++) {
                System.out.println(partslist.get(i));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("FIle not found!");
        }
    }
}