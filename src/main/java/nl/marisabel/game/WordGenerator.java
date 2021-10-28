package nl.marisabel.game.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class WordGenerator {
    Logger LOGGER = Logger.getLogger(WordGenerator.class.getName());

    // TODO make it work with class path

    public Object selectRandomWord() throws IOException {
       String file = "D:\\JAVA\\SpringProjects\\5Letters Spring App\\src\\main\\resources\\words.dic";
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(file)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordline = line.split("\\s+");
                for (String word : wordline) {
                    words.add(word);
                }
            }
        }
        Random rand = new Random();
        String word = words.get(rand.nextInt(words.size()));
        Object w = word;
        LOGGER.info(":::::::::: Generated word: "+ w +" ::::::::::");
        return w;
    }


}
