package test;

import org.junit.jupiter.api.Test;
import university.controller.JsonManager;
import university.controller.UniversityCreator;
import university.model.University;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityTest {

    @Test
    public void testJsonSerialization() {

        University oldUniversity = UniversityCreator.createFullUniversity();

        JsonManager.writeToFile(oldUniversity, "university.json");

        University newUniversity = JsonManager.readFromFile("university.json");

        assertEquals(oldUniversity, newUniversity);
    }
}
