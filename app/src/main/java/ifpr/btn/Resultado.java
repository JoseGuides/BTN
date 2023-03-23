package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {



    TextView txtResult;


    Intent it = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResult=findViewById(R.id.txtResutl);

        Intent it = getIntent();
        String num1 = it.getStringExtra("num1");
        String num2 = it.getStringExtra("num2");

        double result = double.parseDouble(num1);


        txtResult.setText(num1+num2);

    }
}