package com.example.mycheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ca, cj, cp, cr, cn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ca = findViewById(R.id.checkandroid);
        ca.setOnClickListener(this);

        cj = findViewById(R.id.checkjava);
        cj.setOnClickListener(this);

        cp = findViewById(R.id.checkpython);
        cp.setOnClickListener(this);

        cr = findViewById(R.id.checkruby);
        cr.setOnClickListener(this);

        cn = findViewById(R.id.checknet);
        cn.setOnClickListener(this);


        ca.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.checkandroid:
                        if (ca.isChecked())
                            Toast.makeText(getApplicationContext(), "android", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.checkjava:
                        if (cj.isChecked())
                            Toast.makeText(getApplicationContext(), "java", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.checkpython:
                        if (cp.isChecked())
                            Toast.makeText(getApplicationContext(), "python", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.checkruby:
                        if (cr.isChecked())
                            Toast.makeText(getApplicationContext(), "ruby", Toast.LENGTH_SHORT).show();
                }

            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.checknet:
                        if (cn.isChecked())
                            Toast.makeText(getApplicationContext(), "dotnet", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
