package com.gap.aula05;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class ListaActivity extends Activity {

    private ListView listView;
    ArrayAdapter<Aluno> adapter;
    ArrayList<Aluno> alunos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //AVISO: não esquecer permissão no AndroidManifest.xml
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);

        listView = (ListView) findViewById(R.id.listView);
        alunos = new ArrayList<Aluno>();
        adapter = new ArrayAdapter<Aluno>(this, android.R.layout.simple_list_item_1, alunos);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuInserir:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
