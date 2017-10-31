package net.karthikraj.excercise.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

/**
 * Created by karthik on 31/10/17.
 */

public class AsyncTaskResultTest extends AndroidTestCase implements EndPointsAsyncTask.JokePullTaskListener{

    private static final String TAG = AsyncTaskResultTest.class.getSimpleName();
    private static final String LOG_TEXT = "testJokeResult";

    public void testJokeResult() {

        Log.v(TAG, LOG_TEXT + " is started");
        String testResult = "";
        Pair pair = new Pair<>(getContext(), "");
        EndPointsAsyncTask endPointsAsyncTask = new EndPointsAsyncTask(this);
        endPointsAsyncTask.execute(pair);
        Log.v(TAG, LOG_TEXT + " AsyncTask Excute called");
        try {
            Log.v(TAG, LOG_TEXT + " Before Async task get call & testResult = " + testResult);
            testResult = endPointsAsyncTask.get();
            Log.v(TAG, LOG_TEXT + " After Async task get call & testResult = " + testResult);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.v(TAG, LOG_TEXT + " InterruptedException: " + e.getLocalizedMessage());
        } catch (ExecutionException e) {
            e.printStackTrace();
            Log.v(TAG, LOG_TEXT + " ExecutionException: " + e.getLocalizedMessage());
        }

        //testResult = null;
        //testResult = "";
        assertNotNull(testResult);
        assertTrue(testResult.length() > 0);
    }

    @Override
    public void jokePullCompleted() {
        Log.v(TAG, "Joke pull API call has been completed. Noe it's time to to validate and display. This method will make the progressbar invisible in the MainActivity");
    }
}
