package university.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import university.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // ---------- WRITE ----------
    public static void writeToFile(University university, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ---------- READ ----------
    public static University readFromFile(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ---------- STRING JSON ----------
    public static String toJson(University u) {
        return gson.toJson(u);
    }

    public static University fromJson(String json) {
        return gson.fromJson(json, University.class);
    }
}
