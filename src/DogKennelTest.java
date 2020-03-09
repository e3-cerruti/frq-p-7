import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DogKennelTest {

    private DogKennel kennel;
    private Dog lassie;
    private Dog rinTinTin;
    private Dog benji;

    @org.junit.jupiter.api.Test
    void addADog() {
        assertTrue(kennel.dogs.contains(lassie));
        assertTrue(kennel.dogs.contains(rinTinTin));
        assertTrue(kennel.dogs.contains(benji));
    }

    @org.junit.jupiter.api.Test
    void find() {
        assertTrue(kennel.find(lassie.getName()));
        assertFalse(kennel.find("Astro"));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        assertTrue(kennel.remove(rinTinTin.getName()));
        assertFalse(kennel.remove("Astro"));

        assertTrue(kennel.dogs.contains(lassie));
        assertFalse(kennel.dogs.contains(rinTinTin));
        assertTrue(kennel.dogs.contains(benji));
    }

    @org.junit.jupiter.api.Test
    void findChampions() {
        ArrayList<Dog> champions = kennel.findChampions(10);
        assertEquals(2, champions.size());
        assertFalse(champions.contains(benji));
    }
    
    @BeforeEach
    void setUp() {
        kennel = new DogKennel();
        lassie = new Dog("Lassie", 43.5, 10);
        rinTinTin = new Dog("Rin Tin Tin", 37.8, 45);
        benji = new Dog("Benji", 13.2, 0);
        kennel.addADog(lassie);
        kennel.addADog(rinTinTin);
        kennel.addADog(benji);
    }
}