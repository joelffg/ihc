package com.example.donky;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.donky.dto.ListViewItemDTO;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class EscreverConversaActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    startActivity(new Intent(EscreverConversaActivity.this, MainActivity.class));
                    return true;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(EscreverConversaActivity.this, ConversarActivity.class));
                    return true;
                case R.id.navigation_notifications:
                    startActivity(new Intent(EscreverConversaActivity.this, ConversasRecentesActivity.class));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_escrever_conversa);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setSelectedItemId(R.id.navigation_notifications);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ListView lvConversas = (ListView) findViewById(R.id.list_conversas);
        CardsAdapter adapterConversas = new CardsAdapter(this);

        lvConversas.setAdapter(adapterConversas);
        adapterConversas.addAll(new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 1", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 2", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 2", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 1", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 1", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 2", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 1", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 2", R.string.lorem),
                new CardModel(R.drawable.ic_tag_faces_black_24dp, "Usuário 1", R.string.lorem));

        final TextView textView = findViewById(R.id.editText);

        Button fab = findViewById(R.id.button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
