package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Localizador_B5 extends AppCompatActivity {

    Button btnV5;
    Button btnLoc;
    EditText etMara;
    TextView txtMaracuja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent it = new Intent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b5);

        btnV5=findViewById(R.id.btnV5);
        btnLoc=findViewById(R.id.btnLoc);
        txtMaracuja=findViewById(R.id.txtMaracuja);
        etMara=findViewById(R.id.etMara);


        btnLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String resultado=etMara.getText().toString();
                String fonte = txtMaracuja.getText().toString();
                resultado.replace(fonte, resultado);
                txtMaracuja.setText(resultado);

            }
        });

        btnV5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Localizador_B5.this, Menu.class);
                startActivity(it);
            }
        });
    }
}