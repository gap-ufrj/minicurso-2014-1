package br.com.gap.FragmentApplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Criado por renan em 25/05/14.
 */
public class ListaFragement extends Fragment {

    private ArrayList<String> listaAlunos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layoutLista = inflater.inflate(R.layout.lista_fragment, container, false);

        ListView viewListaAlunos = (ListView) layoutLista.findViewById(R.id.lista_framgent_listView);

        this.populaListaAlunos(10);

        viewListaAlunos.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_expandable_list_item_1, this.listaAlunos));


        return layoutLista;
    }

    private void populaListaAlunos(int quantidadeAlunos){
        listaAlunos = new ArrayList<String>();

        for(int i = 0; i<quantidadeAlunos; i++){
            listaAlunos.add("Aluno "+ i+1);
        }
    }


}
