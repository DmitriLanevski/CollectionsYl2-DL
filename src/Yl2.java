import sun.util.PreHashedMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by lanev_000 on 8.04.2016.
 */
public class Yl2 {
    public static void main(String[] args) throws Exception{
        File file = new File("C:/Users/lanev_000/IdeaProjects/CollectionsYl2-DL/src/Names.txt");

        Map<String,String> namesMap = new HashMap<>();

        try(Scanner sc = new Scanner(file, "UTF-8")) {
            while (sc.hasNextLine()){
                String[] names = sc.nextLine().split(" ");
                namesMap.put(names[1],names[0]);
            }
        }

        String userInput = " ";

        try(BufferedReader bufIn = new BufferedReader(new InputStreamReader(System.in))){
            while (!userInput.equals("Close")){
                System.out.println("Insert name of  a guest: ");
                userInput = bufIn.readLine();
                String key = userInput;
                String initialPerson = "";
                while (namesMap.containsKey(key)){
                    initialPerson = namesMap.get(key);
                    key = initialPerson;
                }
                if (!userInput.equals("Close")){
                    System.out.println("Initial person was: " + initialPerson + ".");K
                }
            }
        }
    }
}
