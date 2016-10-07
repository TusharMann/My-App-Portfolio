package com.example.tushar.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Popular_Movies,Stock_Hawk,Build_it_Bigger,Make_Your_App_Material,Go_Ubiquitous,Capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Popular_Movies=(Button)findViewById(R.id.Popular_Movies);
        Stock_Hawk=(Button)findViewById(R.id.Stock_Hawk);
        Build_it_Bigger=(Button)findViewById(R.id.Build_It_Bigger);
        Make_Your_App_Material=(Button)findViewById(R.id.Make_Your_App_Material);
        Go_Ubiquitous=(Button)findViewById(R.id.Go_Ubiquitous);
        Capstone=(Button)findViewById(R.id.Capstone);

        Popular_Movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch Popular Movies App",Toast.LENGTH_LONG).show();
            }
        });

        Stock_Hawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch Stock Hawk App",Toast.LENGTH_LONG).show();
            }
        });

        Build_it_Bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger App",Toast.LENGTH_LONG).show();
            }
        });

        Make_Your_App_Material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch Make Your App Material App",Toast.LENGTH_LONG).show();
            }
        });

        Go_Ubiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch Go Ubiquitous App",Toast.LENGTH_LONG).show();
            }
        });

        Capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This button will launch Capstone App",Toast.LENGTH_LONG).show();
            }
        });

    }
}
