package com.lsniderlabs;

import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<String[]> parameters = new ArrayList<>();
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] string = line.split(" ");
            parameters.add(string);


        }
        printNumbers(parameters);


    }


    private static void printNumbers(ArrayList<String[]> list){

        for(int i = 0;i<list.size();i++){
            String[] numbers = list.get(i);
            int dividerX = Integer.parseInt(numbers[0]);
            int dividerY = Integer.parseInt(numbers[1]);
            int limit = Integer.parseInt(numbers[2]);

            ArrayList<Integer> gameNumbers = new ArrayList<>();
            for (int n =1;n<=limit;n++){
                gameNumbers.add(n);
            }
            String gameOutput = "";
            for (int y = 0; y < gameNumbers.size(); y++){

                boolean isFizzBuzz = false;
                String fizzBuzz = "";
                if (gameNumbers.get(y) % dividerX == 0){
                    fizzBuzz = fizzBuzz.concat("F");
                    isFizzBuzz = true;
                }
                if (gameNumbers.get(y) % dividerY == 0){
                    fizzBuzz = fizzBuzz.concat("B");
                    isFizzBuzz = true;
                }

                if (isFizzBuzz) {
                    gameOutput = gameOutput.concat(" "+fizzBuzz);
                }else {
                    gameOutput = gameOutput.concat(" "+gameNumbers.get(y).toString());
                }
            }
            System.out.println(gameOutput);


        }


    }
}
