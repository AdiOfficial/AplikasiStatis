package com.example.aplikasistatis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Question library = new Question();
    Button tbl1, tbl2, tbl3, tbl4;
    TextView prty, nilaiSkor;
    int nomor = 0;
    int skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbl1 = (Button)findViewById(R.id.btnChoise1);
        tbl2 = (Button)findViewById(R.id.btnChoise2);
        tbl3 = (Button)findViewById(R.id.btnChoise3);
        tbl4 = (Button)findViewById(R.id.btnChoise4);
        prty = (TextView)findViewById(R.id.txtPertanyaan);
        nilaiSkor = (TextView)findViewById(R.id.nilaiSkor);

        updatePertanyaan(nomor);
        updatePilihan(nomor);


        tbl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbl1.getText() == library.getAnswer((nomor))) {
                    Toast.makeText(MainActivity.this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                    nomor++;
                    skor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }

                }else {
                    Toast.makeText(MainActivity.this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                    nomor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }
            }
        });
        tbl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbl2.getText() == library.getAnswer((nomor))) {
                    Toast.makeText(MainActivity.this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                    nomor++;
                    skor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }else {
                    Toast.makeText(MainActivity.this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                    nomor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }
            }
        });
        tbl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbl3.getText() == library.getAnswer((nomor))) {
                    Toast.makeText(MainActivity.this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                    nomor++;
                    skor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }else {
                    Toast.makeText(MainActivity.this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                    nomor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }
            }
        });
        tbl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbl4.getText() == library.getAnswer((nomor))) {
                    Toast.makeText(MainActivity.this,"Jawaban Benar", Toast.LENGTH_SHORT).show();
                    nomor++;
                    skor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }else {
                    Toast.makeText(MainActivity.this,"Jawaban Salah", Toast.LENGTH_SHORT).show();
                    nomor++;
                    if (nomor == 4) {
                        nomor = 0;
                        skor = 0;
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                    else{
                        updatePertanyaan(nomor);
                        updatePilihan(nomor);
                        updateSkor(skor);
                    }
                }
            }
        });



    }

    private void updatePertanyaan(int order){
        prty.setText(library.getQuestion(order));
    }
    private void updatePilihan(int order) {
        tbl1.setText(library.getChoice1(order));
        tbl2.setText(library.getChoice2(order));
        tbl3.setText(library.getChoice3(order));
        tbl4.setText(library.getChoice4(order));
    }
    private void updateSkor(int nilai) {
        nilaiSkor.setText(String.valueOf(nilai));
    }

}
