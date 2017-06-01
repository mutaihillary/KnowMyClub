package com.example.android.knowmyclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radioCoachGroup;
    private RadioButton radioCoachButton;
    private CheckBox checkBoxCarling, checkBoxFA, checkBoxPremierLeague, checkBoxChampion, checkBoxWalcot, checkBoxSachez, checkBoxWilshere, checkBoxMessi;
    private Button buttonSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
        addListenerOncheckBoxCarling();
        addListenerOncheckBoxWalcot();

    }

    public void addListenerOnButton() {

        radioCoachGroup = (RadioGroup) findViewById(R.id.radioCoach);
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        checkBoxCarling = (CheckBox) findViewById(R.id.checkBoxCarling);

        checkBoxPremierLeague = (CheckBox) findViewById(R.id.checkBoxPremierLeague);
        checkBoxChampion = (CheckBox) findViewById(R.id.checkBoxChampion);
        checkBoxWalcot = (CheckBox) findViewById(R.id.checkBoxWalcot);checkBoxFA = (CheckBox) findViewById(R.id.checkBoxFA);
        checkBoxSachez = (CheckBox) findViewById(R.id.checkBoxSachez);
        checkBoxWilshere = (CheckBox) findViewById(R.id.checkBoxWilshere);
        checkBoxMessi = (CheckBox) findViewById(R.id.checkBoxMessi);
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);

        buttonSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioCoachGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioCoachButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(MainActivity.this,
                        radioCoachButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });
    }

    public void addListenerOncheckBoxCarling() {

        checkBoxCarling = (CheckBox) findViewById(R.id.checkBoxCarling);

        checkBoxCarling.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is checkBoxCarling checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Yes, In 2001,2004,2007,2014,2015)", Toast.LENGTH_LONG).show();
                }

                StringBuffer result = new StringBuffer();
                result.append("Carling Cup check : ").append(checkBoxCarling.isChecked());
                result.append("\nFA Cup check : ").append(checkBoxFA.isChecked());
                result.append("\nPremier League check :").append(checkBoxPremierLeague.isChecked());
                result.append("\nChampion League check :").append(checkBoxChampion.isChecked());

                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    public void addListenerOncheckBoxWalcot() {

        checkBoxWalcot = (CheckBox) findViewById(R.id.checkBoxWalcot);

        checkBoxWalcot.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //is checkBoxWalcot checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Yes, Walcot)", Toast.LENGTH_LONG).show();
                }

                StringBuffer result = new StringBuffer();
                result.append("Walcot check : ").append(checkBoxWalcot.isChecked());
                result.append("\nSachez check : ").append(checkBoxSachez.isChecked());
                result.append("\nWilshere check :").append(checkBoxWilshere.isChecked());
                result.append("\nMessi check :").append(checkBoxMessi.isChecked());

                Toast.makeText(MainActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}