package com.sks.material_desginsnackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Color;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;
import com.sks.material_desginsnackbar.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding ml1;
    CoordinatorLayout codri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //codri.findViewById(R.id.coodrina);

        ml1 = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ml1.getRoot());
         ml1.snackbar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Snackbar snackbar = Snackbar.make(ml1.coodrina,"Hello Shantanu Button ", Snackbar.LENGTH_LONG);
          //  snackbar.setActionTextColor(Color.black);


            snackbar.setAction("OKAY", new View.OnClickListener() { //
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),snackbar2.class);
                startActivity(i);
            }
        });
            snackbar.setAnchorView(ml1.coodrina);
            snackbar.setActionTextColor(getResources().getColor(R.color.teal_200));
            snackbar.show();

        }
    });
    }

}