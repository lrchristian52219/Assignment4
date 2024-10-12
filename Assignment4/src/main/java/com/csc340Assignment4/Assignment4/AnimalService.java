package com.csc340Assignment4.Assignment4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    /**
     * Fetch all Animals.
     */

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    /**
     * Fetch a unique Animal by its ID
     */

    public Animal getOneAnimal(int animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    /**
     * Fetch all Animals whose species matches the search term.
     */

    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.getAnimalsBySpecies(species);
    }

    /**
     * Fetch all Animals whose name contains the search keyword.
     */

    public List<Animal> getAnimalsByNameContains(String keyword) { return animalRepository.getAnimalsByNameContains(keyword); }

    /**
     * Add a new Animal to the database.
     */

    public void addNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    /**
     * Update an existing Animal.
     */

    public void updateAnimal(int animalId, Animal animal) {
        Animal existing = getOneAnimal(animalId);
        if (existing != null) {
            existing.setName(animal.getName());
            existing.setSpecies(animal.getSpecies());
            animalRepository.save(existing);
        }
    }

    /**
     * Delete a unique Animal by its ID.
     */

    public void deleteAnimalById(int animalId) {
        animalRepository.deleteById(animalId);
    }
}
