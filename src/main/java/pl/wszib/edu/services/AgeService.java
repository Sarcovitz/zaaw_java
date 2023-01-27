package pl.wszib.edu.services;

import java.util.concurrent.ThreadLocalRandom;

public class AgeService{

    public AgeService() {}

    public int randomizeAge()
    {
        return ThreadLocalRandom.current().nextInt(1, 50);
    }
}
