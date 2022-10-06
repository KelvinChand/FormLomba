package com.mdp.formlombaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmActivity extends AppCompatActivity {

    private TextView tvnama,tvjk,tvnowa,tvalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        tvalamat = findViewById(R.id.et_alamat);
        tvjk = findViewById(R.id.rg_jk);
        tvnama = findViewById(R.id.et_nama);
        tvnowa = findViewById(R.id.et_no_whatsapp);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("varNama"));
        tvjk.setText(intent.getStringExtra("varJK"));
        tvnowa.setText(intent.getStringExtra("varNowa"));
        tvalamat.setText(intent.getStringExtra("varAlamat"));
    }
}