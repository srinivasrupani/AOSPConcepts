package com.example.smartron.myapplication;

import android.support.annotation.NonNull;
import android.util.Log;
import androidx.work.Worker;

/**
 * Created by Srinivas Rupani on 24/9/18.
 * Copyright (c) 2018 Smartron, All rights reserved.
 */

public class MyWorker extends Worker {
    private static final String TAG = "MyWorker";
    @NonNull
    @Override
    public Result doWork() {
        Log.d(TAG, "doWork called");

        return Result.SUCCESS;
    }

}