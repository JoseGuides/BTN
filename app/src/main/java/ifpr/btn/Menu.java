package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btn01;
    Button btn02;
    Button btn03;
    Button btn04;
    Button btn05;
    Button btn06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        btn06=findViewById(R.id.btn06);
        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Gerador_B6.class);
                startActivity(it);
            }
        });

        btn05=findViewById(R.id.btn05);
        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Localizador_B5.class);
                startActivity(it);
            }
        });

        btn04=findViewById(R.id.btn04);
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Imc_B4.class);
                startActivity(it);
            }
        });

        btn03 = findViewById(R.id.btn03);
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Conversao_B3.class);

                startActivity(it);
            }
        });

        btn02=findViewById(R.id.btn02);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Memoria_B2.class);

                startActivity(it);
            }
        });

        btn01=findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Menu.this, Calculadora_B1.class);

                startActivity(it);
            }
        });
    }
}