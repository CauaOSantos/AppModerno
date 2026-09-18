package com.example.appmoderno; // Ajuste se o nome do seu pacote for diferente

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] movies = {
            R.drawable.vingadores,
            R.drawable.odisseia,
            R.drawable.jogos_vorazes
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerMovies);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        );

        MovieAdapter adapter = new MovieAdapter(this, movies);
        recyclerView.setAdapter(adapter);
    }
}