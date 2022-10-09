package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText alas1, tinggi1, hasil;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas1 = (EditText) findViewById(R.id.input_alas);
        tinggi1 = (EditText) findViewById(R.id.input_tinggi);
        hasil = (EditText) findViewById(R.id.output_luas);
        hitung = (Button) findViewById(R.id.btn_hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alas1.length() == 0 && tinggi1.length() == 0) {
                    Toast.makeText(getApplication(), "Masukkan Nilai Alas & Tinggi !!", Toast.LENGTH_LONG).show();
                } else if (tinggi1.length() == 0) {
                    Toast.makeText(getApplication(), "Masukkan Nilai Tinggi !!", Toast.LENGTH_LONG).show();
                } else if (alas1.length() == 0) {
                    Toast.makeText(getApplication(), "Masukkan Nilai Alas", Toast.LENGTH_LONG).show();
                }else {
                    String alas = alas1.getText().toString();
                    String tinggi =tinggi1.getText().toString();
                    Double alas1 = Double.parseDouble(alas);
                    Double tinggi1 = Double.parseDouble(tinggi);
                    Double hs = LuasSegitiga(alas1, tinggi1);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double alas1, double tinggi1){return alas1*tinggi1/2;
    }
}