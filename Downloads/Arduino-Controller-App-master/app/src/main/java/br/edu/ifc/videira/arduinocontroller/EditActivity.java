package br.edu.ifc.videira.arduinocontroller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EditActivity extends Activity {

   private Button btsave;
    EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        btsave = findViewById(R.id.buttonsave);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
        ed5 = findViewById(R.id.ed5);
        ed6 = findViewById(R.id.ed6);
        ed7 = findViewById(R.id.ed7);
        ed8 = findViewById(R.id.ed8);
        ed9 = findViewById(R.id.ed9);

        btsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditViewHolder.btn1 = ed1.getText().toString();
                EditViewHolder.btn2 = ed2.getText().toString();
                EditViewHolder.btn3 = ed3.getText().toString();
                EditViewHolder.btn4 = ed4.getText().toString();
                EditViewHolder.btn5 = ed5.getText().toString();
                EditViewHolder.btn6 = ed6.getText().toString();
                EditViewHolder.btn7 = ed7.getText().toString();
                EditViewHolder.btn8 = ed8.getText().toString();
                EditViewHolder.btn9 = ed9.getText().toString();

                Intent intent2 = new Intent(getApplicationContext(), ControllerActivity.class);
                startActivity(intent2);
                finish();
            }
        });

    }

}
