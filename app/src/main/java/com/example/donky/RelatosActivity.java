package com.example.donky;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.donky.dto.ListViewItemDTO;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class RelatosActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(new Intent(RelatosActivity.this, MainActivity.class));
                    return true;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(RelatosActivity.this, ConversarActivity.class));
                    return true;
                case R.id.navigation_notifications:
                    startActivity(new Intent(RelatosActivity.this, ConversasRecentesActivity.class));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_relatos);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setSelectedItemId(R.id.navigation_home);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RelatosActivity.this, EscreverRelatosActivity.class));
            }
        });

        ListView lvCards = (ListView) findViewById(R.id.list_cards);
        CardsAdapter adapter = new CardsAdapter(this);

        lvCards.setAdapter(adapter);
        adapter.addAll(new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 1", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 2", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 3", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 4", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 5", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 6", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 7", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 8", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 9", R.string.lorem));
    }
}
