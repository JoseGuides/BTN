package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaB1 extends AppCompatActivity {
    Button btnV1;
    Button btnSoma;
    EditText etnum1;
    EditText etnum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);


        etnum1=findViewById(R.id.etNum1);
        etnum2=findViewById(R.id.etNum2);

        btnV1=findViewById(R.id.btnV1);
        btnSoma=findViewById(R.id.btnSoma);

        btnSoma.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {

                                           Intent it = new Intent(TelaB1.this, Resultado.class);
                                           it.putExtra("num1", etnum1.getText().toString());
                                           it.putExtra("num2", etnum2.getText().toString());


                                           startActivity(it);

                                       }
                                   });
                btnV1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent it = new Intent(TelaB1.this, Menu.class);


                        startActivity(it);
                    }
                });
    }
}