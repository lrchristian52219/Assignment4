package com.csc340Assignment4.Assignment4;
import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalID;

    @Column(nullable = false)
    private String name;

    private String scientificName;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String habitat;

    private String description;

    public Animal(int animalID, String name, String scientificName, String species, String habitat, String description) {
        this.animalID = animalID;
        this.name = name;
        this.scientificName = scientificName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }


    public Animal() {
    }

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() { return scientificName; }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSpecies() { return species; }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() { return habitat; }

    public void getHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }
}

