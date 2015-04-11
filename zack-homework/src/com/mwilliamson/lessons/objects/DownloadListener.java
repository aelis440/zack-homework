package com.mwilliamson.lessons.objects;

import java.io.File;

/**
 * Created by matt on 4/10/15.
 */
public interface DownloadListener
{
    public void onDownloadFinished(File file);
}
