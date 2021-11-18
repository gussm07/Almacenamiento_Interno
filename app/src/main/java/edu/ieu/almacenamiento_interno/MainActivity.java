package edu.ieu.almacenamiento_interno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etContenido;
    private Button btnGuardar;
    private Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etContenido = findViewById(R.id.etContenido);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnAbrir = findViewById(R.id.btnAbrir);

        btnGuardar.setOnClickListener(v -> {
            guardar();
        });

        btnAbrir.setOnClickListener(v -> {
            abrir();
        });
    }

    private void abrir() {
    }

    private void guardar() {
    }
}