package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView txt1, txt2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        txt1=findViewById(R.id.textView2);
        txt2=findViewById(R.id.textView);
        editText=findViewById(R.id.editTextTextPersonName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hi Click Listener Worked!", Toast.LENGTH_SHORT).show();
                String s= editText.getText().toString();
                int kg=Integer.parseInt(s);
                double  pound= 2.205*kg;
                txt2.setText("The corresponding value in Pounds is: " + pound);
            }
        });

    }
}