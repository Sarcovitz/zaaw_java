package pl.wszib.edu.controllers;


import org.springframework.web.bind.annotation.*;
import pl.wszib.edu.repos.AnimalRepo;
import pl.wszib.edu.model.Animal;
import pl.wszib.edu.services.AnimalService;


@RestController
public class AnimalController
{
    AnimalRepo animalRepo;
    AnimalService animalService;

    public AnimalController(AnimalRepo animalRepo)
    {
        this.animalRepo = animalRepo;
        this.animalService = new AnimalService(animalRepo);
    }

    @PostMapping(value = "/animal")
    public String addAnimal(@RequestBody Animal animal)
    {
        animalService.addAnimal(animal);
        System.out.println(animal.getName()+" "+animal.getType()+" "+animal.getAge());
        return "Animal added : " + animal.getName() + " " + animal.getType() + " " + animal.getAge() + " " + animal.getId();
    }

    @DeleteMapping(value = "/animal")
    public String deleteAnimal(@RequestBody Animal animal)
    {
        animalService.deleteAnimal(animal);
        return "Animal deleted : " + animal.getName() + " " + animal.getType();
    }

    @PutMapping(value = "/animal/age")
    public String randomizeAge(@RequestParam(value = "id", required = false) String id)
    {
        int result = animalService.randomizeAge(id);
        return "Age changed to: " + result;
    }

    @GetMapping(value = "/animals")
    public void getAnimals()
    {
        animalService.getAnimals();
    }
}
