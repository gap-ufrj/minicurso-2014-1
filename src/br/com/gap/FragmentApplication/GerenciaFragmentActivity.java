package br.com.gap.FragmentApplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Como estamos fazendo uma aplicação com API>11,
 * não temos a necessidade de extender FragmentActivity.
 * Caso tenha interesse em implementar Fragment para dispositivos
 * com API < 11, visite: http://developer.android.com/training/basics/fragments/creating.html
 */
public class GerenciaFragmentActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
}
