package DesignPattern.Creational.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sparraow sparraow = new Sparraow();
        sparraow.setName("sparrow");
        sparraow.setColor("blue");

        List<Bird> birds = Arrays.asList(
                new Bird(),
                sparraow);
        List<Bird> children = new ArrayList<>();
        for(Bird parent : birds)
        {
            children.add(parent.clone());
        }

        for(Bird child : children)
        {
            System.out.println("ITS A COPY");
        }
        System.out.println("Done");


    }
}
