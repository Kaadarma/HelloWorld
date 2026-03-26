package com.example.helloworld;

import android.os.Bundle;
import android.view.View;       // Wajib untuk OnClickListener
import android.widget.Button;import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button myButton = findViewById(R.id.btnKlik);
        final TextView txtKeterangan = findViewById(R.id.txtKeterangan);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked) {
                    myButton.setText("Kembali");
                    txtKeterangan.setText("Nama: Putu Eka Darma Putra\nNIM: 2405551151\nKelas: Pemograman Mobile A");
                    isClicked = true;
                } else {
                    myButton.setText("Klik Saya");
                    txtKeterangan.setText("This My First Hello World in Android Studio");
                    isClicked = false;
                }
            }
        });
    }
}