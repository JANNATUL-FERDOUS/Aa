package com.example.mukta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mukta.myapplication.R.id.numberInput;

public class MainActivity extends AppCompatActivity {
      private Button convertButton;
      private TextView tx1,tx2,tx3,tx4,tx5,tx6,txter;
      private CheckBox cMm,cCm,cKm,cGr,cMl,cFa;
      private EditText ip;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertButton=(Button) findViewById(R.id.convertion);
          tx1=(TextView) findViewById(R.id.m_mmNum);
          tx2=(TextView) findViewById(R.id.m_cmNum);
          tx3=(TextView) findViewById(R.id.m_kmNum);
          tx4=(TextView) findViewById(R.id.kg_gmNum);
          tx5=(TextView) findViewById(R.id.l_mlNum);
          tx6=(TextView) findViewById(R.id.d_faNUM);
          cMm=(CheckBox) findViewById(R.id.m_mm);
          cCm=(CheckBox) findViewById(R.id.m_cm);
          cKm=(CheckBox) findViewById(R.id.m_km);
          cGr=(CheckBox) findViewById(R.id.kg_g);
          cMl=(CheckBox) findViewById(R.id.l_ml);
          cFa=(CheckBox) findViewById(R.id.d_fa);
          ip=(EditText) findViewById(numberInput);
          convertButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if (ip.getText().toString().equals("")) {
                      Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_SHORT).show();
                  }
                  else{
                      String s = ip.getText().toString();
                      double input = Double.valueOf(s);
                      double mm1 = input * 1000;
                      double cm1 = input * 100;
                      double km1 = input / 1000;
                      double gm1 = input * 1000;
                      double ml1 = input * 1000;
                      double fa1 = (1.8 * input) + 32;

                      if (cMm.isChecked()) {
                          tx1.setText(mm1 + "mm");
                      }
                      if (cMm.isChecked()==false) {
                          tx1.setText("");
                      }
                      if (cCm.isChecked()) {
                          tx2.setText(cm1 + "cm");
                      }
                      if (cCm.isChecked()==false) {
                          tx2.setText("");
                      }
                      if (cKm.isChecked()) {
                          tx3.setText(km1 + "km");
                      }
                      if (cKm.isChecked()==false) {
                          tx3.setText("");
                      }
                      if (cGr.isChecked()) {
                          tx4.setText(gm1 + "gm");
                      }
                      if (cGr.isChecked()==false) {
                          tx4.setText("");
                      }
                      if (cMl.isChecked()) {
                          tx5.setText(ml1 + "ml");
                      }
                      if (cMl.isChecked()==false) {
                          tx5.setText("");
                      }
                      if (cFa.isChecked()) {
                          tx6.setText(fa1 + "far");
                      }
                      if (cFa.isChecked()==false) {
                          tx6.setText("");
                      }


                  }

              }
          });








      }
}
