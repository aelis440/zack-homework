package com.mwilliamson.lessons.objects;

/**
 * Created by matt on 4/10/15.
 */

public class Cat extends Animal implements Butcherable
{

    public void purr(int seconds)
    {
        eat();
    }

    @Override
    public void eat()
    {
        System.out.println("BBQ");
        //super.eat();
    }

    public void haveSex()
    {
        System.out.println("Here is some cab fare");
    }

    public void die()
    {

    }


}
