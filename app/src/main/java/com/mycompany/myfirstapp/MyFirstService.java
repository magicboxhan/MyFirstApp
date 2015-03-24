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
        for(int i=0;i<30;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("=== service loop #%d ===", i));
        }
    }
}
