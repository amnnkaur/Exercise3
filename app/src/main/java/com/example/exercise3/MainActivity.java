package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText txtString;
    public Button btnNext;
    public TextView txtNewString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtString = findViewById(R.id.txtString);
        btnNext = findViewById(R.id.btnNext);
        txtNewString = findViewById(R.id.txtNewString);

        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String enterString = txtString.getText().toString().trim();
        if(enterString.isEmpty())
        {
            txtString.setError("Enter Valid String");
        }
        else
        {
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(mIntent);
        }
    }
}
