package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Memoria_B2 extends AppCompatActivity {

    Button btnV2;

    Button btnCome;
    TextView txtabc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b2);

        txtabc = findViewById(R.id.txtabc);
        btnCome = findViewById(R.id.btnCome);
        btnV2 = findViewById(R.id.btnV2);

        btnCome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Memoria_B2.this, Teste_memoria.class);
                it.putExtra("abc", txtabc.getText().toString());

                startActivity(it);
            }
        });
        btnV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Memoria_B2.this, Menu.class);

                startActivity(it);
            }
        });
    }
}