package com.mwilliamson.lessons.objects;

/**
 * Created by matt on 4/10/15.
 */
public abstract class Animal
{
    int hunger = 10;
    int numLimbs;
    int heartRate;

    public void breathe()
    {
    }

    public void eat()
    {
        hunger = hunger - 1;
        System.out.println("Yum, my hunger is " + hunger);
    }

    public void sleep()
    {

    }

    protected void beatHeart()
    {

    }

    private void doSomething()
    {

    }

    public abstract void haveSex();
}
