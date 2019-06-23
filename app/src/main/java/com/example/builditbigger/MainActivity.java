package com.example.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jokesandroid.JokeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tellJoke(View view){
     //   new EndpointsAsyncTask().execute(this);
        Intent intent = new Intent(this,  JokeActivity.class);
        startActivity(intent);
    }
}
