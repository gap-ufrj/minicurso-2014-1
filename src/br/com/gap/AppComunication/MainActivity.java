package br.com.gap.AppComunication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import org.apache.http.protocol.HTTP;

public class MainActivity extends Activity {
    /**
     * Aqui estamos definindo uma tag que serve para termos o controle
     * dos parâmetros a serem passados para a próxima tela.
     */
    public static String EXTRA_MESSAGE = "br.com.gap.appComunication.MainActivity";
    private EditText editText;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editText = (EditText) findViewById(R.id.primeira_activity_edit_text);
    }

    /**
     * Este método apenas trata da criacao do menu.
     * Assim como em uma Activity, aqui nós inflamos o menu para ele existir.
     * Lembrando que para podermos inflar este menu, precisamos criar um menu.xml dentro
     * de uma pasta menu no diretorio res.
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    /**
     * Este método trata da seleção de um item do menu.
     * Nele nos verificamos se o id do item selecionado é igual a
     * algum dos ids que criamos no menu.xml.
     * Após isso, alguma ação é tomada (que no caso é a mudanca de tela)
     * @param featureId
     * @param item
     * @return
     */
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_settings:
                /**
                 * Iniciamos uma nova Activity enviando um código para a mesma.
                 * Lembrando que os parâmetros da Intent são o contexto atual
                 * e a Activity a qual queremos fazer alguma coisa.
                 */
                String mensagem = editText.getText().toString();
                Intent proximaTela = new Intent(this.getApplicationContext(), SecondActivity.class);
                proximaTela.putExtra(this.EXTRA_MESSAGE, mensagem);
                startActivity(proximaTela);
                return true;
        }

        return false;
    }
}
