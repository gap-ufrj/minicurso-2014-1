package br.com.gap.FragmentApplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Criado por renan em 25/05/14.
 */
public class DetalheFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layoutDetalhe = inflater.inflate(R.layout.detalhe_fragment, container, false);

        TextView nomeAluno = (TextView) layoutDetalhe.findViewById(R.id.detalhe_fragment_texto);

        nomeAluno.setText("Aqui vai aparecer o aluno clicado");

        return layoutDetalhe;
    }
}
