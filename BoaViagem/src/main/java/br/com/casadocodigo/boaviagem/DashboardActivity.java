package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

    }

    public void selecionarOpcao( View view ){

        switch( view.getId() ){
            case R.id.nova_viagem:
                                    startActivity(new Intent(this, ViagemActivity.class));
                                    break;
            case R.id.novo_gasto:
                                    startActivity(new Intent(this, GastoActivity.class));
                                    break;
            case R.id.minhas_viagens:
                                    startActivity(new Intent(this, ViagemListActivity.class));
                                    break;
            default:                makeThis( view );
                                    break;
        }



    }

    private void makeThis(View view){
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
