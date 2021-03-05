package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException, NoSuchMethodException{
        IAthlete iAthlete = new IAthlete() {
            @Override
            public void training() {
                System.out.println("Practicing tactics to become the best in history");
            }
        };
        iAthlete.goal();
        iAthlete.training();

        final Footballer footballer = Footballer.class.getConstructor(int.class, double.class).newInstance(50, 51000000);
        Field footballerGoals = Footballer.class.getDeclaredField("goals");
        Field footballerSalary = Footballer.class.getDeclaredField("salary");
        System.out.println(footballerGoals + " " + footballerSalary);
        System.out.println("---------------");
        System.out.println(footballer.checkSalaryByEuros());
        System.out.println("---------------");
        System.out.println(footballer.checkSeasonQuality());
        System.out.println("---------------");
        System.out.println(footballer);

    }
}
