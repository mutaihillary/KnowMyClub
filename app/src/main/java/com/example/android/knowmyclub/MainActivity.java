package com.example.android.knowmyclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupCoach;
    private RadioButton radioButtonWenger;
    private RadioButton radioButtonMourinho;
    private RadioButton radioButtonSir;
    private Button buttonSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        radioGroupCoach = (RadioGroup) findViewById(R.id.radioGroupCoach);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGroupCoach.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioGroupCoach = (RadioGroup) findViewById(selectedId);

                Toast.makeText(MainActivity.this,
                        radioGroupCoach.getText(), Toast.LENGTH_SHORT).show();

            }

        });

    }
}