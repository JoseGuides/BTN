package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Teste_memoria extends AppCompatActivity {

    Button btnConf;
    EditText etTesteabc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_memoria);



        btnConf = findViewById(R.id.btnConf);
        etTesteabc = findViewById(R.id.etTesteabc);

        Intent it = getIntent();
        String abc = it.getStringExtra("abc");


        btnConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cba = etTesteabc.getText().toString();


                if (abc.equalsIgnoreCase(cba)){

                    Intent it = new Intent(Teste_memoria.this, Acerto.class);
                    startActivity(it);

                }else {
                    Intent it = new Intent(Teste_memoria.this, TelaB2.class);
                    startActivity(it);
                }


                //startActivity(it);
            }
        });

    }
}