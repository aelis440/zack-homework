package com.mwilliamson.lessons;

import com.mwilliamson.lessons.objects.*;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Human();
        animals[3] = new Human();
        animals[4] = new Leopard();

        Butcherable[] butcherables = new Butcherable[2];
        butcherables[0] = new Cat();
        butcherables[1] = new Leopard();

        butcherables[1].die();

        for (Animal animal : animals)
        {
            animal.haveSex();
        }

        Human human = new Human();
        downloadFile(new DownloadListener() {
            @Override
            public void onDownloadFinished(File file) {
                //do something with that file
            }
        });
    }

    public static void downloadFile(DownloadListener listener)
    {
        // download a file
        File downloadedFile = new File("");
        listener.onDownloadFinished(downloadedFile);
    }
}
