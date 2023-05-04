package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class TelaB4 extends AppCompatActivity {

    Button btnV4;
    Button btnCalc;
    EditText etAltura;
    EditText etPeso;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b4);

        btnV4=findViewById(R.id.btnV4);
        btnCalc=findViewById(R.id.btnCalc);
        etAltura=findViewById(R.id.etAltura);
        etPeso=findViewById(R.id.etPeso);
        txtResult=findViewById(R.id.txtResult);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String alt = etAltura.getText().toString();
                double d1 = Double.parseDouble(alt);
                String peso = etPeso.getText().toString();
                double d2 = Double.parseDouble(peso);
                double r = d2 / (d1 * d1);



                DecimalFormat df = new DecimalFormat("0.00");




               txtResult.setText(df.format(r));
            }
        });
        btnV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaB4.this, Menu.class);
                startActivity(it);
            }
        });
    }
}