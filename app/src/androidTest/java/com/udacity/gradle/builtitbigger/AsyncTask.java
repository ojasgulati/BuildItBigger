package com.udacity.gradle.builtitbigger;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(AndroidJUnit4.class)
public class AsyncTask {

    public void testJokeDownload() {

        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            String joke = task.get(30, TimeUnit.SECONDS);

            assertThat(joke, notNullValue());
            assertTrue(joke.length() > 0);

        } catch (Exception e) {
            fail("Operation timed out");
        }
    }

}

