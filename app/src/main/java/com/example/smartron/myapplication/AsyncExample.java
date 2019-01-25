package com.example.smartron.myapplication;

import android.os.AsyncTask;

/**
 * Created by Srinivas Rupani on 20/11/18.
 * Copyright (c) 2018 Smartron, All rights reserved.
 */
public class AsyncExample extends AsyncTask<String, String, String>
{
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... arg0) {
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        this.cancel(true);
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onCancelled() {
        //Toast.makeText(getApplicationContext(), "asynctack cancelled.....", Toast.LENGTH_SHORT).show();
        //dialog.hide(); /*hide the progressbar dialog here...*/
        super.onCancelled();
    }

}

