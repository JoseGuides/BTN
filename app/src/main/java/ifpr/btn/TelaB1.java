package ifpr.btn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaB1 extends AppCompatActivity {
    Button btnV1;
    int valor1;
    int valor2;
    int result;
    int result3456;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);

        btnV1=findViewById(R.id.btnV1);
        btnV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaB1.this, Menu.class);

                startActivity(it);
            }
        });
    }
}