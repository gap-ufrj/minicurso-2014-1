package br.com.gap.ApplicationViews;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MyActivity extends Activity {
    /**
     * Nesta aplicação vamos apresentar algumas Views e como fazer
     * uma ListView personalizada.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Apenas criando uma simples lista
        ArrayList<String> itensLista = new ArrayList<String>();
        for(int i=0; i<=100; i++){
            itensLista.add("Item "+i);
        }

        /**
         * Procurando a ListView que adicionamos no layout e
         * setando o adapter para ela.
         */
        ListView lista = (ListView) findViewById(R.id.listView);
        ListaAdapter adapter = new ListaAdapter(this, itensLista);
        lista.setAdapter(adapter);
    }
}
