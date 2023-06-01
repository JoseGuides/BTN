package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TelaB6 extends AppCompatActivity {
    Button btnV6;

    Button btnGerar;

    TextView txtNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b6);

        btnV6=findViewById(R.id.btnV6);
        btnGerar=findViewById(R.id.btnGerar);
        txtNumeros=findViewById(R.id.txtNumeros);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                int n0;
                int n1;

                while(i != 5) {

                    int =
                    String num = String.valueOf(Math.random() * 1000); //string que gera os numeros aleatorios

                    txtNumeros.setText(num);

                    i++;
                };
            }
        });
        btnV6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaB6.this, Menu.class);
                startActivity(it);
            }
        });

    }
}