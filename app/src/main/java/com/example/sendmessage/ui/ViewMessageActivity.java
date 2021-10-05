package com.example.sendmessage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.sendmessage.data.model.Message;
import com.example.sendmessage.databinding.ActivityViewMessageBinding;

public class ViewMessageActivity extends AppCompatActivity {

    private ActivityViewMessageBinding binding;
    private static final String TAG = "SendMessageProject";

    //region Métodos del ciclo de vida
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //1.Recoger el intent enviado por SendMessageActivity.
        Intent sobre = getIntent();
        //2. Recoger el objeto Bundle con el mismo método que se ha introducido en el Intent.
        Bundle mensaje = sobre.getExtras();
        //3. Asignar cada cadena a sus componentes.
        Message tmp = (Message) mensaje.getSerializable("MODEL");
        binding.tvNombreDestinatario.setText(tmp.getUser());
        binding.tvMensajeVista.setText(tmp.getMessage());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ViewMessageActivity -> onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //TODO implementar método de inicio
        Log.i(TAG, "ViewMessageActivity -> onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ViewMessageActivity -> onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ViewMessageActivity -> onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //TODO implementar método de fin
        Log.i(TAG, "ViewMessageActivity -> onStop()");
    }
    //endregion
}
