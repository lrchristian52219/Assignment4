package com.csc340Assignment4.Assignment4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal getOneAnimal(int animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }

    public List<Animal> getAnimalsBySpecies(String species) {
        return animalRepository.getAnimalsBySpecies(species);
    }

    public List<Animal> getAnimalsByNameContains(String keyword) { return animalRepository.getAnimalsByNameContains(keyword); }

    public void addNewAnimal(Animal animal) {
        animalRepository.save(animal);
    }

    public void updateAnimal(int animalId, Animal animal) {
        Animal existing = getOneAnimal(animalId);
        if (existing != null) {
            existing.setName(animal.getName());
            existing.setSpecies(animal.getSpecies());
            animalRepository.save(existing);
        }
    }

    public void deleteAnimalById(int animalId) {
        animalRepository.deleteById(animalId);
    }
}
