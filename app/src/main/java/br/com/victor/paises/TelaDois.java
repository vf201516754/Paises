package br.com.victor.paises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TelaDois extends AppCompatActivity {

    ListView minhaLista;
    private String[] listaAfrica = { "África", "Angola", "Argélia", "Benim", "Botsuana",
            "Burquina", "Burúndi", "Cabo", "Camarões", "Chade",
            "Comores", "Congo", "Costa do Marfim",
            "Egito", "Eritreia", "Etiópia", "Gabão", "Gâmbia" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaDois);

    }

    public void exibirListaPais () {
        minhaLista = (ListView) findViewById(R.id.listaPaises);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<String>(
                getApplicationContext(), //onde ele vai ser disparado
                android.R.layout.simple_list_item_1, // layout da lista (template de lista)
                android.R.id.text1, // texto que esta dentro do layout escolhido (é um componente desse layour)
                listaAfrica // a lista de nomes, o array qye vc criou acima
        );

        minhaLista.setAdapter(meuAdaptador); // associa a lista do contentMain com o objeto meuAdaptador

    }
}
