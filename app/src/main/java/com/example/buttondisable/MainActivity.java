package com.example.buttondisable;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

public int liczba=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void Disable(View V ){
        Button Przycisk=findViewById(R.id.button);
        Przycisk.setEnabled(false);
        TextView Licznik=findViewById(R.id.textView);
        liczba=liczba+1;
        Licznik.setText("liczba:"+liczba);
    }
    public void Enable(View X){
        Button Przycisk=findViewById(R.id.button);
        Przycisk.setEnabled(true);

    }

}
