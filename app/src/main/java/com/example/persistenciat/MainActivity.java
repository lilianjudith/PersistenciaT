package com.example.persistenciat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


public class MainActivity extends AppCompatActivity {
    SharedPreferences preferencial;
    EditText objeto,clave,valor;
    Button btn_guardarPreferencial;
    SharedPreferences.Editor editor;
    String llave ="sesion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objeto = (EditText) findViewById(R.id.NombreObjetoPreferencial);
        clave= (EditText) findViewById(R.id.clave);
        valor = (EditText) findViewById(R.id.valor);
        btn_guardarPreferencial = (Button) findViewById(R.id.btn_guardarprerencia);

        btn_guardarPreferencial.setOnClickListener(view ->
                // Inicializamos el objeto share preference y la pasamos a string
                preferencial = getSharedPreferences(objeto.getText().toString(),Context.MODE_PRIVATE);
        editor = preferencial.edit();
        SharedPreferences.Editor editor = preferencial.edit();
        // creamos un objeto editor para trabajar con las preferencias
        editor.putString(clave.getText().toString(), valor.getText().toString());
        // introducimos una clave
        editor.commit();

        startActivity(new Intent(getApplicationContext(),ActivityPrincipal.class));





    }
    private boolean revisarsesion(){
        return this.preferences.getBoolean(llave,false);
    }

    private void guardarPreferencial(boolean checked){

        editor.putBoolean(llave,checked);
        editor.apply();
    }
}
    }
}