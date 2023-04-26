package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class TelaB3 extends AppCompatActivity {

    Button btnV3;
    Button btnReal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_b3);

        btnV3=findViewById(R.id.btnV3);
        btnReal=findViewById(R.id.btnReal);

        btnReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaB3.this, Real_dolar.class);
                startActivity(it);
            }
        });
        btnV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaB3.this, Menu.class);
                startActivity(it);
            }
        });
    }
}