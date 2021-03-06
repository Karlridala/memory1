package com.example.opilane.memory;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    Button alusta;
    EditText nimi1, nimi2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    ImageView uno, dos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink)
        uno.startAnimation(animation1);
        dos.startAnimation(animation1);

        nimi1 = findViewById(R.id.mängija1);
        nimi2 = findViewById(R.id.mängija2);
        alusta = findViewById(R.id.mängi);
        sharedPreferences = getSharedPreferences(  "nimed", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        alusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
public void alusta(){
    String m1 = nimi1.getText().toString();
    String m2 = nimi2.getText().toString();
    editor.putString("nimi1",m1);
    editor.putString("nimi2",m2);
    editor.commit();
    finish();

}
