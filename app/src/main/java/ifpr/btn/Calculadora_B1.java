package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculadora_B1 extends AppCompatActivity {
    Button btnV1;
    Button btnSoma;
    Button btnSubtra;
    Button btnDiv;
    Button btnMul;
    EditText etnum1;
    EditText etnum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);


        etnum1 = findViewById(R.id.etNum1);
        etnum2 = findViewById(R.id.etNum2);

        btnV1 = findViewById(R.id.btnV1);
        btnSoma = findViewById(R.id.btnSoma);
        btnSubtra = findViewById(R.id.btnSubtra);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);


        Intent it = getIntent();

        String num1 = it.getStringExtra("num1");
        String num2 = it.getStringExtra("num2");

        etnum1.setText(num1);
        etnum2.setText(num2);


        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(Calculadora_B1.this, Resultado_calculadora.class);

                it.putExtra("num1", etnum1.getText().toString());
                it.putExtra("num2", etnum2.getText().toString());

                String num1 = etnum1.getText().toString();
                String num2 = etnum2.getText().toString();

                double d1 = Double.parseDouble(num1);
                double d2 = Double.parseDouble(num2);
                double r = d1 + d2;

                String result = String.valueOf(r);
                it.putExtra("result", result);

                startActivity(it);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(Calculadora_B1.this, Resultado_calculadora.class);

                it.putExtra("num1", etnum1.getText().toString());
                it.putExtra("num2", etnum2.getText().toString());

                String num1 = etnum1.getText().toString();
                String num2 = etnum2.getText().toString();

                double d1 = Double.parseDouble(num1);
                double d2 = Double.parseDouble(num2);
                double r = d1 / d2;

                String result = String.valueOf(r);
                it.putExtra("result", result);

                startActivity(it);

            }
        });

        btnSubtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(Calculadora_B1.this, Resultado_calculadora.class);

                it.putExtra("num1", etnum1.getText().toString());
                it.putExtra("num2", etnum2.getText().toString());

                String num1 = etnum1.getText().toString();
                String num2 = etnum2.getText().toString();

                double d1 = Double.parseDouble(num1);
                double d2 = Double.parseDouble(num2);
                double r = d1 - d2;

                String result = String.valueOf(r);
                it.putExtra("result", result);

                startActivity(it);

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(Calculadora_B1.this, Resultado_calculadora.class);

                it.putExtra("num1", etnum1.getText().toString());
                it.putExtra("num2", etnum2.getText().toString());

                String num1 = etnum1.getText().toString();
                String num2 = etnum2.getText().toString();

                double d1 = Double.parseDouble(num1);
                double d2 = Double.parseDouble(num2);
                double r = d1 * d2;

                String result = String.valueOf(r);
                it.putExtra("result", result);

                startActivity(it);

            }
        });
        btnV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Calculadora_B1.this, Menu.class);


                startActivity(it);
            }
        });
    }
}