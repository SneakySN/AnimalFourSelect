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

        // 강아지 탭 설정
        TabHost.TabSpec spec = tabHost.newTabSpec("Dog");
        spec.setContent(R.id.dog);
        spec.setIndicator("강아지");
        tabHost.addTab(spec);

        // 고양이 탭 설정
        spec = tabHost.newTabSpec("Cat");
        spec.setContent(R.id.cat);
        spec.setIndicator("고양이");
        tabHost.addTab(spec);

        // 토끼 탭 설정
        spec = tabHost.newTabSpec("Rabbit");
        spec.setContent(R.id.rabbit);
        spec.setIndicator("토끼");
        tabHost.addTab(spec);

        // 끝 탭 설정 및 앱 종료 기능 추가
        spec = tabHost.newTabSpec("End");
        spec.setContent(R.id.end);
        spec.setIndicator("끝");
        tabHost.addTab(spec);

        // 끝 탭을 선택할 때 애플리케이션 종료
        tabHost.setOnTabChangedListener(tabId -> {
            if (tabId.equals("End")) {
                finish(); // 앱 종료
            }
        });
    }
}