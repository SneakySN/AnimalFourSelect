package com.example.animalfourselect;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("Dog");
        spec.setContent(R.id.dog);
        spec.setIndicator("강아지");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Cat");
        spec.setContent(R.id.cat);
        spec.setIndicator("고양이");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("Rabbit");
        spec.setContent(R.id.rabbit);
        spec.setIndicator("토끼");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("End");
        spec.setContent(R.id.end);
        spec.setIndicator("끝");
        tabHost.addTab(spec);

        tabHost.setOnTabChangedListener(tabId -> {
            if (tabId.equals("End")) {
                finish();
            }
        });
    }
}