package com.arao.ramnel.araoramnellab4;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button back;
    private Button next;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFECYCLE","-On Create was called");

        back = findViewById(R.id.button1);
        next = findViewById(R.id.button2);
        constraintLayout = findViewById(R.id.conlay);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed BACK", Toast.LENGTH_LONG).show();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(constraintLayout, "Pressed NEXT", Snackbar.LENGTH_LONG);

                snackbar.show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE","-On Start was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE","-On Resume was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE","-On Pause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE","-On Stop was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE","-On Destroy was called");
    }
}

