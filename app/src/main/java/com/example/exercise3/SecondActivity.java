package com.example.exercise3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    public TextView txtNext;
    public Button btnUpperCase;
    public Button btnLowerCase;
    public Button btnWords;
    public Button btnLength;
    public Button btnReverse;
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ActionBar aBar = getSupportActionBar();
        aBar.setTitle("String Operations");

        txtNext = findViewById(R.id.txtNext);
        btnLength = findViewById(R.id.btnLength);
        btnLowerCase = findViewById(R.id.btnLowerCase);
        btnUpperCase = findViewById(R.id.btnUpperCase);
        btnWords = findViewById(R.id.btnWords);

        Intent intent = getIntent();
        if (intent.hasExtra("EnterString")) {
            String enterString = intent.getStringExtra("EnterString");
            txtNext.setText(enterString);
        }




    }

    public void upperCaseButton(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        builder.setMessage("Are you sure to send data back?");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String alteredName = name.toUpperCase();
                Intent alteredCasedHome = new Intent(SecondActivity.this,MainActivity.class);
                alteredCasedHome.putExtra("alteredCase", alteredName);
                startActivity(alteredCasedHome);
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        AlertDialog homeAlert = builder.create();
        homeAlert.show();

    }
    public void lowerCaseButton(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        builder.setMessage("Are you sure to send data back?");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String alteredName = name.toLowerCase();
                Intent alteredCasedHome = new Intent(SecondActivity.this,MainActivity.class);
                alteredCasedHome.putExtra("alteredCase", alteredName);
                startActivity(alteredCasedHome);
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        AlertDialog homeAlert = builder.create();
        homeAlert.show();


    }
    public void noOfWordsButton(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        builder.setMessage("Are you sure to send data back?");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] alteredName = name.split("\\s+");
                int length = alteredName.length;
                Intent alteredCasedHome = new Intent(SecondActivity.this,MainActivity.class);
                alteredCasedHome.putExtra("alteredCase", String.valueOf(length));
                startActivity(alteredCasedHome);
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        AlertDialog homeAlert = builder.create();
        homeAlert.show();


    }
    public void lengthButton(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result");
        builder.setMessage("Are you sure to send data back?");
        builder.setCancelable(false);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                int length = name.length();
                Intent alteredCasedHome = new Intent(SecondActivity.this,MainActivity.class);
                alteredCasedHome.putExtra("alteredCase", String.valueOf(length));
                startActivity(alteredCasedHome);
                dialog.dismiss();
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });
        AlertDialog homeAlert = builder.create();
        homeAlert.show();


    }


    @Override
    public void onClick(View v) {

    }
}
