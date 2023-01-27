package pl.wszib.edu.services;

import org.springframework.stereotype.Service;
import pl.wszib.edu.repos.AnimalRepo;
import pl.wszib.edu.model.Animal;

@Service
public class AnimalService {

    private final AnimalRepo animalRepo;

    public AnimalService(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
    }

    public void addAnimal(Animal animal) {
        animalRepo.save(animal);
    }

    public void deleteAnimal(Animal animal) {
        animalRepo.delete(animal);
    }

    public int randomizeAge(String id) {
        Animal animal = getAnimal(id);
        AgeService moneyService = new AgeService();
        int newAge = moneyService.randomizeAge();
        animal.setAge(newAge);
        return newAge;
    }

    public void getAnimals()
    {
        for (Animal animal : animalRepo.findAll())
        {
            System.out.println(animal.getName() + " " + animal.getType() + " Age: " + animal.getAge() + " UUID = " + animal.getId());
        }
    }

    public Animal getAnimal(String uuid)
    {
        for(Animal temp : animalRepo.findAll()) if(uuid.equals(temp.getId().toString())) return temp;
        return null;
    }
}
