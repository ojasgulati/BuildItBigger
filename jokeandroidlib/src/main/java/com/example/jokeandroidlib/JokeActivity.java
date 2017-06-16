package com.example.jokeandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        TextView textView =(TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("JOKE_KEY");
        textView.setText(joke);
        //Toast.makeText(this, joke, Toast.LENGTH_LONG).show();
    }


}
