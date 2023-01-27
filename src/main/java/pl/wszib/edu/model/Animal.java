package pl.wszib.edu.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Entity
@Builder
@AllArgsConstructor
public class Animal
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String type;
    private int age;

    public Animal() { }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Animal(String name, String type, int age)
    {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
