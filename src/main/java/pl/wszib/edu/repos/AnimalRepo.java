package pl.wszib.edu.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.wszib.edu.model.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public interface AnimalRepo extends CrudRepository<Animal, UUID> {

}
