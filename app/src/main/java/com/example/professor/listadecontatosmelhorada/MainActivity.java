package com.example.professor.listadecontatosmelhorada;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaContatos = (ListView) findViewById(R.id.listaContatos);

        listaContatos.setAdapter(new ListaContatosItem(this,
                new String[] { "Teste de título", "Teste de texto" },
                new int [] {R.drawable.image1, R.drawable.image2}));
    }
}
