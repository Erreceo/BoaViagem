package br.com.casadocodigo.boaviagem;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class GastoListActivity extends ListActivity implements AdapterView.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gasto_list);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listarGastos()));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.gasto_list, menu);
        return true;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView = (TextView) view;
        Toast.makeText(this, "Gasto selecionado: "+textView.getText(),Toast.LENGTH_SHORT).show();
    }

    private List<String> listarGastos(){
        return Arrays.asList("Sanduíche R$ 19,90", "Táxi Aeroporto - Hotel R$ 34,00", "Revista R$ 12,00");
    }
}
