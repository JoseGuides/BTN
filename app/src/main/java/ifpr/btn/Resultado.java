package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {



    TextView txtResult;
    Button button;


//
    Intent it = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResult=findViewById(R.id.txtResutl);

        Intent it = getIntent();
        //String num1 = it.getStringExtra("num1");
        //String num2 = it.getStringExtra("num2");
        String resultado = it.getStringExtra("result");

        txtResult.setText(resultado);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Resultado.this, TelaB1.class);




                startActivity(it);
            }
        });

    }
}