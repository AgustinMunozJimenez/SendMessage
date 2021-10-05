package com.example.sendmessage.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sendmessage.R;
import com.example.sendmessage.data.model.Message;
import com.example.sendmessage.databinding.ActivitySendmessageBinding;


/**
 * Pide al usuario el nombre del destinatario y un mensaje a enviar.
 *
 * @author Agustin Muñoz
 * @version 1.0
 */

public class SendMessageActivity extends AppCompatActivity {

    private static final String TAG = "SendMessageProject";
    private ActivitySendmessageBinding binding;

    //region Métodos del ciclo de vida
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySendmessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        //Código para dotar de funcionabilidad al botón Enviar.
       /* binding.btSend.setOnClickListener(view -> {
             sendMessage();
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "SendMessageActivity -> onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //TODO implementar método de inicio
        Log.i(TAG, "SendMessageActivity -> onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessageActivity -> onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessageActivity -> onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //TODO implementar método de fin
        Log.i(TAG, "SendMessageActivity -> onStop()");
    }
    //endregion

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.actionABoutUs) {
            goToAboutUs();
        }

        return super.onOptionsItemSelected(item);
    }

    private void goToAboutUs() {
        Intent mensajero = new Intent(this, AboutUsActivity.class);
        startActivity(mensajero);
    }

    /**
     * Este método es el que utilizamos para programar el evento onClick de nuestro botón.
     *
     * @param view
     */
    public void getOnclick(View view) {
        switch (view.getId()) {
            case R.id.btSend:
                sendMessage();
                break;
        }
    }


    /**
     * Este método genera un intent que contiene un bundle con el objeto Message.
     */
    private void sendMessage() {
        //1. Crear un contenedor Bundle para el mensaje.
        Bundle mensaje = new Bundle();
        Message objetoMensaje = new Message(binding.editTextTextPersonName.getText().toString(),
                binding.mtMensaje.getText().toString());
        mensaje.putSerializable("MODEL", objetoMensaje);
        //mensaje.putString("user", String.valueOf(binding.editTextTextPersonName.getText()));
        //mensaje.putString("mensaje", String.valueOf(binding.mtMensaje.getText()));
        //2. Crear un mensajero para enviar el mensaje.
        Intent mensajero = new Intent(this, ViewMessageActivity.class);
        mensajero.putExtras(mensaje);
        startActivity(mensajero);
    }
}
