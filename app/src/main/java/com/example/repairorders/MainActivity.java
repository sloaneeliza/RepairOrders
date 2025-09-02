package com.example.repairorders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    double numbers = 0.0;
    TextView totalTV;
    TextView subtotalTV;
    EditText orderET;
    EditText inspecET;
    EditText paintET;
    EditText partsET;
    EditText laborET;
    Button submitB; //Step 1: Create Button

    //Step 2: Create Button
    View.OnClickListener buttonListener = new View.OnClickListener() { //anonymous class
        @Override
        //onClick for "Submit" button
        public void onClick(View v) { //thing that reacts to the button itself
            Random gen = new Random();

            double number = gen.nextDouble();
            String v1 = "$" + number;
            subtotalTV.setText(v1);

            String orderTypeValue = orderET.getText().toString();
            String inspecTypeValue = inspecET.getText().toString();
            String paintTypeValue = paintET.getText().toString();
            String laborTypeValue = laborET.getText().toString();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //UI created here!
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        totalTV = findViewById(R.id.textView12); //first $0.0
        subtotalTV = findViewById(R.id.textView10);
        submitB = findViewById(R.id.submitButton);
        //Step 3: Register Listener to Button
        submitB.setOnClickListener(buttonListener); //registering listener to button


        orderET = findViewById(R.id.editText);
        inspecET = findViewById(R.id.editText2);
        paintET = findViewById(R.id.editText3);
        partsET = findViewById(R.id.editText4);
        laborET = findViewById(R.id.editText5);

        String value = totalTV.getText().toString();


    }
}