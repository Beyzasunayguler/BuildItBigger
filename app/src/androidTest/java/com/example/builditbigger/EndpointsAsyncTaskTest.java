package com.example.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertNotNull;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask.TaskCompleteListener;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void asyncTaskTest() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new TaskCompleteListener() {
            @Override
            public void onTaskComplete(String result) {

            }
        });
        endpointsAsyncTask.execute(mainActivityActivityTestRule.getActivity());
        String joke = endpointsAsyncTask.get();
        assertNotNull(joke);
    }
}

