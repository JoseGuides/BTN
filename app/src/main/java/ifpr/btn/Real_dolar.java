package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Real_dolar extends AppCompatActivity {

    Button btnConv;
    EditText etReal;
    TextView txtReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_dolar);


        btnConv = findViewById(R.id.btnConv);
        etReal = findViewById(R.id.etReal);
        txtReal= findViewById(R.id.txtReal);

        btnConv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String real = etReal.getText().toString();
                double d1 = Double.parseDouble(real);
                double r = d1 * 5.0436d;
                String result = String.valueOf(r);



                txtReal.setText(result);


            }
        });

    }
}