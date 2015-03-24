package com.mycompany.myfirstapp;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by hanqing on 2015/3/24.
 */
public class MyFirstService extends IntentService {

    public MyFirstService() {
        super("MyFirstService");
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {
//        Gets data from the incoming Intent
//        String dataString = workIntent.getDataString();
//        Do work here, based on the contents of dataString
        System.out.println("=== service started ===");
    }
}
