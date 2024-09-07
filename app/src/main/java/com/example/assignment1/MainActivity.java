package com.example.assignment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button btnFootball,btnClear;
    private  Button btnCricket;
    private TextView tbEmpty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnFootball =(Button) findViewById(R.id.btn_football);
         btnCricket =(Button) findViewById(R.id.btn_cricket);
         btnClear =(Button)findViewById(R.id.btn_clear);
         tbEmpty =(TextView) findViewById(R.id.tv_empty);

        btnFootball.setOnClickListener(v ->{



          tbEmpty.setText("Registrations for football is open");
        });
        
btnCricket.setOnClickListener(v->{

    tbEmpty.setText("Registrations for cricket is open");
});

btnClear.setOnClickListener(v->{

    tbEmpty.setText("");
});
    }
}