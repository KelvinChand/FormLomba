package com.mdp.formlombaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText etnama,etnowa,etalamat,etpassword,etpin;
    private RadioGroup rgjk;
    private RadioButton rbjk;
    private Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnama = findViewById(R.id.et_nama);
        etnowa = findViewById(R.id.et_no_whatsapp);
        etalamat = findViewById(R.id.et_alamat);
        etpassword = findViewById(R.id.et_password);
        etpin = findViewById(R.id.et_pin);
        rgjk = findViewById(R.id.rg_jk);
        btndaftar = findViewById(R.id.btn_daftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = etnama.getText().toString();
                String nowa = etnowa.getText().toString();
                String alamat = etalamat.getText().toString();
                String pass = etpassword.getText().toString();
                String pin = etpin.getText().toString();

                int jk = rgjk.getCheckedRadioButtonId();
                rbjk = findViewById(jk);

                String jeniskelamin = rbjk.getText().toString();

                if(nama.trim().equals(""))
                {
                    etnama.setError("Nama tidak boleh kosong");
                }
                else if(nowa.trim().equals(""))
                {
                    etnowa.setError("No Whatsapp tidak boleh kosong");
                }
                else if(alamat.trim().equals(""))
                {
                    etalamat.setError("Alamat tidak boleh kosong");
                }
                else if(pass.trim().equals(""))
                {
                    etpassword.setError("Password tidak boleh kosong");
                }
                else if(pin.trim().equals(""))
                {
                    etpin.setError("PIN tidak boleh kosong");
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, ConfirmActivity.class);
                    intent.putExtra("varNama" , nama);
                    intent.putExtra("varNowa" , nowa);
                    intent.putExtra("varAlamat" , alamat);
                    intent.putExtra("varJK" , jk);
                    startActivity(intent);
                }
            }
        });


    }
}