package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Conversao_B3 extends AppCompatActivity {

    Button btnV3;
    Button btnDolar;
    Button btnReal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b3);

        btnV3=findViewById(R.id.btnV3);
        btnReal=findViewById(R.id.btnReal);
        btnDolar = findViewById(R.id.btnDolar);

        btnDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Conversao_B3.this, Dolar_real_conversao.class);

                startActivity(it);
            }
        });

        btnReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Conversao_B3.this, Real_dolar_conversao.class);
                startActivity(it);
            }
        });
        btnV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Conversao_B3.this, Menu.class);
                startActivity(it);
            }
        });
    }
}