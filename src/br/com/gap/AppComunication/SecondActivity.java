package br.com.gap.AppComunication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Activity responsável pela a segunda tela da aplicação.
 * Nesta tela teremos um botão que será responsável por enviar um email.
 */
public class SecondActivity extends Activity {

    private static int REQUEST_CODE = 1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);

        Button sendEmail = (Button)findViewById(R.id.segunda_activity_enviar_email);
        Button selecionaContato = (Button)findViewById(R.id.segunda_activity_selecionar_contato);
        TextView texto = (TextView) findViewById(R.id.segunda_activity_texto);

        /**
         * Aqui estamos pegando a Intent vinda da outra Activity.
         * Para pegar todos os extras, precisamos da tag que criamos na MainActivity.
         * Criamos um Toast apenas para informar que conseguimos pegar o parâmetro.
         */
        Intent intentEnviada = getIntent();
        String valorTextoIntent = intentEnviada.getStringExtra(MainActivity.EXTRA_MESSAGE);
        texto.setText(valorTextoIntent);

        /**
         * Aqui criamos um listener para o botão.
         * Assim, quando o botão for clicado, podemos definir uma ação.
         */
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviaEmail("contato@gapmob.com.br", "Email teste", "Este email é apenas um teste de envio de email");
            }
        });

        selecionaContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selecionaContato();
            }
        });
    }

    /**
     * Método responsável pelo envio do email.
     * Nele criamos uma Intent que necessita de um código específico para iniciar a aplicação de email.
     * Lembrando que para cada tipo de intenção há um codigo (em String) diferente.
     * @param destinatario para quem queremos enviar o email
     * @param asssunto qual o assunto do email
     * @param mensagem qual a mensagem do email
     */
    private void enviaEmail(String destinatario, String asssunto, String mensagem){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");//Código para cliente de email
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{destinatario}); // recipients
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, asssunto);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensagem);
        /**
         * O EXTRA_STREAM é um anexo que desejamos enviar.
         * Para colocar um anexo, dizemos a localização do arquivo no celular.
         * */
        //emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));
        startActivity(emailIntent);
    }

    /**
     * Método responsável por chamar uma agenda para selecionar um contato.
     * A Intent envia uma requisição que deve retornar o código informado caso tudo tenha dado certo.
     */
    private void selecionaContato() {
        Intent contatoIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
        /** Mostra ao usuário somente contatos com telefone. */
        contatoIntent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
        startActivityForResult(contatoIntent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            /** Aqui estamos testando se conseguimos chamar uma Activity com sucesso */
            Log.i("AppComunication", "Intent bem sucedida");
            if(resultCode == RESULT_OK){
                /** Aqui estamos testando se a Activity executou tudo corretamente. */
                Log.i("AppComunication", "Contato selecionado");
            }
            else{
                Log.i("AppComunication", "Contato não selecionado");
            }
        }
        else{
            Log.i("AppComunication", "Intent mal sucedida");
        }

    }
}