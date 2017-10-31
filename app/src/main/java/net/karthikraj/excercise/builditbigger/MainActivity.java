package net.karthikraj.excercise.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity implements EndPointsAsyncTask.JokePullTaskListener{

    private ProgressBar spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (ProgressBar)findViewById(R.id.progressBar);
    }


    public void tellJoke(View view) {
        Pair pair = new Pair<Context, String>(this, "");
        spinner.setVisibility(View.VISIBLE);
        new EndPointsAsyncTask(this).execute(pair);
    }

    @Override
    public void jokePullCompleted() {
        spinner.setVisibility(View.INVISIBLE);
    }
}
