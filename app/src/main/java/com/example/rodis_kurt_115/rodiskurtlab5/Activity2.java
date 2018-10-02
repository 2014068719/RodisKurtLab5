package com.example.rodis_kurt_115.rodiskurtlab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process(View v) {

        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnAct1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMap2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 14.593070, 120.971298"));
            chooser = Intent.createChooser(i, "create another map app");
            startActivity(i);
        }

    }
}
