package maghasetyap.if3b.uts.utsagha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etNomorPendaftaran;
    EditText etNamaLengkap;
    Button btnDaftar;
    CheckBox cbKonfirmasi;
    Spinner sppendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_NomorPendaftaran);
        etNamaLengkap = findViewById(R.id.et_NamaLengkap);
        btnDaftar = findViewById(R.id.btn_daftar);
        cbKonfirmasi = findViewById(R.id.cb_Konfirmasi);
        sppendaftaran = findViewById(R.id.sp_Pendaftaran);

        btnDaftar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String Nomor =  etNomorPendaftaran.getText().toString();
                String Nama = etNamaLengkap.getText().toString();
                String Konfirmasi =  cbKonfirmasi.getText().toString();
                String Pendaftaran = String.copyValueOf(sppendaftaran.getSelectedItem());

                if (Nama.trim().equals(""))
                {
                    etNamaLengkap.setError("Harus Diisi!");
                }
                else if (Nomor.trim().equals(""))
                {
                    etNomorPendaftaran.setError("Harus Diisi!");
                }
                else if (!cbKonfirmasi.isChecked())
                {
                    Toast.makeText(MainActivity.this,"Harus Dicentang", Toast.LENGTH_SHORT).show();
                }
                else if (Pendaftaran.equalsIgnoreCase("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Harus Dipilih", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent daftar = new Intent(MainActivity.this,SecondActivity.class)
                    daftar.putExtra("xnama", Nama);
                    daftar.putExtra("xnomor", Nomor);
                    daftar.putExtra("xconfirm", Konfirmasi);
                    daftar.putExtra("xpendaftaran", Pendaftaran);
                }
            }
        });
    }}