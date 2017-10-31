package net.karthikraj.excercise.jokedisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokerFaceActivity extends AppCompatActivity {


    public static final String JOKE_KEY = "joke_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker_face);

        String jokeString = getIntent().getExtras().getString(JOKE_KEY, "Joker is busy now");
        TextView tvJokerVoice = (TextView) findViewById(R.id.tvJokerVoice);
        tvJokerVoice.setText(jokeString);
    }
}
