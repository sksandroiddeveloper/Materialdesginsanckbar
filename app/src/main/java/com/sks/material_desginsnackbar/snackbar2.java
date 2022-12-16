package com.sks.material_desginsnackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.sks.material_desginsnackbar.databinding.Activity2Binding;

public class snackbar2 extends AppCompatActivity {
Activity2Binding ml2;
TextView text1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ml2=Activity2Binding.inflate(getLayoutInflater());
        setContentView(ml2.getRoot());
       // text1.findViewById(R.id.textView);
         ml2.textView.setText("shantanu");
    ml2.button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Snackbar snackbar = Snackbar.make(view,"I Love",Snackbar.LENGTH_LONG);
            snackbar.setDuration(1000);
            snackbar.setAnchorView(text1);
            snackbar.setAction("Okay", new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        snackbar.show();
        }
    });
    }

}
