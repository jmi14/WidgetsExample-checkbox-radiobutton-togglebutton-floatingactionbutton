package com.example.intagpc.widgetsexample;

import android.Manifest;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxMatric, checkBoxInter, checkBoxBachelor;
    private RadioButton radioButtonMale, radioButtonFemale;
    private ToggleButton toggleButtonAlarm;
    private FloatingActionButton floatingActionButtonMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        checkBoxCallListeners();
        radioButtonCallListeners();
        toggleButtonAlarmListener();
    }

    public void initWidgets() {
        checkBoxMatric = (CheckBox) findViewById(R.id.checkboxMatric);
        checkBoxBachelor = (CheckBox) findViewById(R.id.checkboxBachelor);
        checkBoxInter = (CheckBox) findViewById(R.id.checkboxInter);
        radioButtonFemale = (RadioButton) findViewById(R.id.radioFemale);
        radioButtonMale = (RadioButton) findViewById(R.id.radioMale);
        toggleButtonAlarm = (ToggleButton) findViewById(R.id.toggleButtonAlarm);
        floatingActionButtonMessage = (FloatingActionButton)findViewById(R.id.fabMessage);
    }

    public void checkBoxCallListeners() {

        checkBoxMatric.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(MainActivity.this, "Matric checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Matric unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBoxInter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(MainActivity.this, "Inter checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Inter unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkBoxBachelor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "Bachelor checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, " Bachelor unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void radioButtonCallListeners() {

        radioButtonMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void toggleButtonAlarmListener() {

        toggleButtonAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButtonAlarm.isChecked()) {
                    Toast.makeText(MainActivity.this, "Alarm On", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Alarm Off", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

}
