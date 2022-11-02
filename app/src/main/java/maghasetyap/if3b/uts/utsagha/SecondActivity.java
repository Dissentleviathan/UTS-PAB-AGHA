package maghasetyap.if3b.uts.utsagha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama;
    TextView tvNomor;
    TextView tvpendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvnama = findViewById(R.id.tv_namalengkap);
        Intent terima = getIntent();
        String terimanama = terima.getStringExtra("xnama");
        tvnama.setText(terimanama);

        tvNomor = findViewById(R.id.tv_Pendaftaran);
        Intent baru = getIntent();
        String terimaNomor = terima.getStringExtra("xnomor");
        tvNomor.setText(terimaNomor);

        tvpendaftaran = findViewById(R.id.tv_tv);
        Intent lagi = getIntent();
        String terimaKode = terima.getStringExtra("xpendaftaran");
        tvpendaftaran.setText(terimaKode);
    }
}