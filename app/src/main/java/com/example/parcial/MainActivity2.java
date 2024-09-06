package com.example.parcial;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Inicialización de las vistas
        TextView tvName = findViewById(R.id.tvName);
        TextView tvQuestion1 = findViewById(R.id.tvQuestion1);
        TextView tvAnswer1 = findViewById(R.id.tvAnswer1);
        TextView tvQuestion2 = findViewById(R.id.tvQuestion2);
        TextView tvAnswer2 = findViewById(R.id.tvAnswer2);
        TextView tvQuestion3 = findViewById(R.id.tvQuestion3);
        TextView tvAnswer3 = findViewById(R.id.tvAnswer3);
        TextView tvQuestion4 = findViewById(R.id.tvQuestion4);
        TextView tvAnswer4 = findViewById(R.id.tvAnswer4);
        TextView tvQuestion5 = findViewById(R.id.tvQuestion5);
        TextView tvAnswer5 = findViewById(R.id.tvAnswer5);
        TextView tvQuestion6 = findViewById(R.id.tvQuestion6);
        TextView tvAnswer6 = findViewById(R.id.tvAnswer6);
        TextView tvQuestion7 = findViewById(R.id.tvQuestion7);
        TextView tvAnswer7 = findViewById(R.id.tvAnswer7);
        TextView tvQuestion8 = findViewById(R.id.tvQuestion8);
        TextView tvAnswer8 = findViewById(R.id.tvAnswer8);

        // Configuración de los textos para cada pregunta y respuesta
        tvName.setText("Juan Ballesteros");

        tvQuestion1.setText("1)");
        tvAnswer1.setText("C");

        tvQuestion2.setText("2)");
        tvAnswer2.setText("C");

        tvQuestion3.setText("3)");
        tvAnswer3.setText("C");

        tvQuestion4.setText("4)");
        tvAnswer4.setText("B");

        tvQuestion5.setText("5)");
        tvAnswer5.setText("C");

        tvQuestion6.setText("6)");
        tvAnswer6.setText("A");

        tvQuestion7.setText("7)");
        tvAnswer7.setText("C");

        tvQuestion8.setText("8)");
        tvAnswer8.setText("B");
    }
}
