package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.builditbigger.R;
import com.example.jokesandroid.JokeActivity;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask.TaskCompleteListener;

public class MainActivity extends AppCompatActivity implements TaskCompleteListener {
    private static final String JOKE_INTENT_EXTRA_CONSTANT = "joke";
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.loading_bar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        spinner.setVisibility(View.VISIBLE);
        new EndpointsAsyncTask(this).execute(this);

    }

    @Override
    public void onTaskComplete(String result) {
        Intent intent = new Intent(MainActivity.this, JokeActivity.class);
        intent.putExtra(JOKE_INTENT_EXTRA_CONSTANT, result);
        startActivity(intent);
        spinner.setVisibility(View.GONE);

    }
}
