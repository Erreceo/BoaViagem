package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

    }

    public void selecionarOpcao( View view ){

        TextView textView = ( TextView ) view;
        String opcao = "Opção: ";
        if( textView.getText() != null ){
            opcao = opcao + textView.getText().toString();
        }else{
            opcao = opcao + "não encontrada";
        }
        Toast.makeText(this, opcao, Toast.LENGTH_SHORT).show();

    }
    
}