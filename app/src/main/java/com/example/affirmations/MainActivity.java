package com.example.affirmations;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmations.adapter.ItemAdapter;
import com.example.affirmations.data.Datasource;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Affirmation> myDataset = new Datasource().loadAffirmation();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new ItemAdapter(this, myDataset));
        recyclerView.setHasFixedSize(true);
    }
}