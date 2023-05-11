package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado_calculadora extends AppCompatActivity {



    TextView txtResult;
    Button button;
    Button btnEdit;


//
    Intent it = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResult=findViewById(R.id.txtResutl);
        button = findViewById(R.id.button);
        btnEdit = findViewById(R.id.btnEdit);

        Intent it = getIntent();
        String num1 = it.getStringExtra("num1");
        String num2 = it.getStringExtra("num2");
        String resultado = it.getStringExtra("result");



        txtResult.setText(resultado);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Resultado_calculadora.this, Menu.class);




                startActivity(it);
            }
        });


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Resultado_calculadora.this, Calculadora_B1.class);
                it.putExtra("num1", num1);
                it.putExtra("num2", num2);
                startActivity(it);
            }
        });
    }
}