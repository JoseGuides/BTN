package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Dolar_real extends AppCompatActivity {


    Button btnConvert;
    Button btnVol;
    EditText etDolar;
    TextView txtDolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar_real);


        btnConvert = findViewById(R.id.btnConvert);
        btnVol = findViewById(R.id.btnVol);
        etDolar = findViewById(R.id.etDolar);
        txtDolar = findViewById(R.id.txtDolar);

        btnVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Dolar_real.this, TelaB3.class);
                startActivity(it);
            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String real = etDolar.getText().toString();
                double d1 = Double.parseDouble(real);
                double r = d1 / 5.0436d;
                String result = String.valueOf(r);



                txtDolar.setText(result);

            }


        });
    }
}