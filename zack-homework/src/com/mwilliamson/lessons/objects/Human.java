package com.mwilliamson.lessons.objects;

import java.io.File;

/**
 * Created by matt on 4/10/15.
 */
public class Human extends Animal implements DownloadListener
{
    public void talk(String sentence)
    {
        eat();
        beatHeart();
    }

    public void haveSex()
    {
        System.out.println("Human sex");
    }

    public void onDownloadFinished(File file)
    {

    }
}
