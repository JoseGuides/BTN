package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class
Gerador_B6 extends AppCompatActivity {
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
                int n0 = 0;
                int n1 = 0;
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;


                while (i != 2) {
                    if (i == 0) {
                        int num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                        txtNumeros.setText(String.valueOf(num));
                        n0 = num;
                    }
                    if (i == 1) {
                        int num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                        n1 = num;
                        if (n0 == n1) {
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n1 = num;
                        }
                    }
                    if (i == 2){
                        int num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                        n2 = num;
                        if(n0 == n2){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n2 = num;
                        }
                        if(n1 == n2){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n2 = num;
                        }

                    }
                    if (i == 3){
                        int num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                        n3 = num;
                        if(n0 == n3){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n3 = num;
                        }
                        if(n1 == n3){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n3 = num;
                        }
                        if(n2 == n3){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n3 = num;
                        }

                    }
                    if (i == 4){
                        int num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                        n4 = num;
                        if(n0 == n4){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n4 = num;
                        }
                        if(n1 == n4){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n4 = num;
                        }
                        if(n2 == n4){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n4 = num;
                        }
                        if(n3 == n4){
                            num = (int) (Math.random() * 1000); //string que gera os numeros aleatorios
                            n4 = num;
                        }

                    }

                    i++;
                }
            }
        });

        btnV6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Gerador_B6.this, Menu.class);
                startActivity(it);
            }
        });

    }
}