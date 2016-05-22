package com.example.chris.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityHello extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "MESSAGE";
    public final static String EXTRA_CHAPTER = "CHAPTER";
    public final static String EXTRA_VERSE = "VERSE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = ((EditText)findViewById(R.id.edit_message)).getText().toString();
        String chapter = ((EditText)findViewById(R.id.edit_chapter)).getText().toString();
        String verse = ((EditText)findViewById(R.id.edit_verse)).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_MESSAGE, message);
        bundle.putString(EXTRA_CHAPTER, chapter);
        bundle.putString(EXTRA_VERSE, verse);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
