package br.com.gap.ApplicationViews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;

/**
 * Adapter de um ListView.
 * Aqui iremos tratar o layout de cada item da lista.
 */
public class ListaAdapter extends BaseAdapter {
    private LayoutInflater inflaterLayout;
    private Context contexto;
    private ArrayList<String> itensLista;

    /**
     * Construtor do Adapter. Nele colocamos o que será necessário para fazer o Adapter funcionar.
     * No caso, estamos requerindo o contexto da aplicação para inflarmos o layout e um ArrayList
     * de String que vamos usar para popular a lista.
     * Note que poderíamos usar qualquer tipo de lista de qualquer tipo de objeto para listarmos os itens.
     * Para isso, bastaria tratar da maneira mais correta.
     * @param context
     * @param listaItens
     */
    public ListaAdapter(Context context, ArrayList<String> listaItens){
        this.inflaterLayout = LayoutInflater.from(context);
        this.contexto = context;
        this.itensLista = listaItens;
    }

    @Override
    public int getCount() {
        return itensLista.size();
    }

    @Override
    public Object getItem(int position) {
        return itensLista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        String textoString = itensLista.get(position);

        if (convertView == null){
            convertView = inflaterLayout.inflate(
                    R.layout.item_lista, null);

            viewHolder = new ViewHolder();
            viewHolder.texto = (TextView)
                    convertView.findViewById(R.id.item_lista_texto);
            viewHolder.imagem = (ImageView)
                    convertView.findViewById(R.id.item_lista_imagem);
            viewHolder.botao = (Button)
                    convertView.findViewById(R.id.item_lista_botao);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }
		
        viewHolder.texto.setText(textoString);
		
        //Cálculo apenas para diferenciar as imagens.
        if(position%2 == 0){
            viewHolder.imagem.setImageResource(android.R.drawable.ic_menu_edit);
        }else{
            viewHolder.imagem.setImageResource(android.R.drawable.ic_menu_delete);
        }

        viewHolder.botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contexto, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    private static class ViewHolder{
        TextView texto;
        ImageView imagem;
        Button botao;
    }
}
