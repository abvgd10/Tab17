package com.company;

import static com.company.Shark.attack;
import static com.company.Turtle.swim;
import static com.company.Eagle.fly;

public class Main {

    public static void main(String[] args) {

        Animal[] animal = {new Shark(),new Turtle(),new Eagle()};

        for (int i = 0; i < 3; i++) {
            System.out.println(animal[i] instanceof Animal);
            System.out.println(animal[i].getClass());
            if (i==0){
                attack();
            }else if (i==1){
                swim();
            }else {
                fly();
            }
            System.out.println();
        }

    }
}
