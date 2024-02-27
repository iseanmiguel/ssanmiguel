package com.example.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import android.os.Bundle;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        RadioGroup answerQ1 = findViewById(R.id.answersQ1);
        Button submitQ1 = findViewById(R.id.submitQ1);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(Question1.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        submitQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButttonId = answerQ1.getCheckedRadioButtonId();
                if(selectedRadioButttonId != -1){
                    RadioButton selectedRB = findViewById(selectedRadioButttonId);
                    if(Integer.parseInt(selectedRB.getText().toString()) ==2008){
                        Toast.makeText(Question1.this, "Youve got the correct answer", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Question1.this, MainActivity.class);
                        intent.putExtra("name", "Aldwin"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(Question1.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(Question1.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(Question1.this, "No option selected", Toast.LENGTH_SHORT).show();
                }

            }fasasdsad
        });
    }
}