package com.example.sendmessage.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.sendmessage.R;
import com.vansuita.materialabout.builder.AboutBuilder;
import com.vansuita.materialabout.views.AboutView;

public class AboutUsActivity extends AppCompatActivity {
    private static final String TAG = "SendMessageProject";
    //region Métodos del ciclo de vida
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AboutView view = AboutBuilder.with(this)
                .setPhoto(R.mipmap.profile_picture)
                .setCover(R.mipmap.profile_cover)
                .setName("Agustin Muñoz Jimenez")
                .setSubTitle("Me voy a dormir")
                .setBrief("Programador principiante con mucho sueño.")
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .addGitHubLink("AgustinMunozJimenez")
                .addFacebookLink("")
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .setShowAsCard(true)
                .build();

        setContentView(view);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "AboutUsActivity -> onDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //TODO implementar método de inicio
        Log.i(TAG, "AboutUsActivity -> onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "AboutUsActivity -> onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "AboutUsActivity -> onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        //TODO implementar método de fin
        Log.i(TAG, "AboutUsActivity -> onStop()");
    }
    //endregion
}