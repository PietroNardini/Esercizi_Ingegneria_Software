package com.example.Esercizi.ingsw.esercizio32;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;
    private static final String LOG_FILE = "src\\main\\java\\com\\example\\Esercizi\\ingsw\\esercizio32\\log.txt";
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(formatter);
            writer.write("[" + timestamp + "] " + message + "\n");
        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del log: " + e.getMessage());
        }
    }
}

