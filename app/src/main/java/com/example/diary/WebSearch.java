package com.example.diary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSearch extends AppCompatActivity {
        WebView web;

        @SuppressLint("SetJavaScriptEnabled")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_web_search);

            web =findViewById(R.id.webView);
            WebSettings webSetting =web.getSettings();
            webSetting.setJavaScriptEnabled(true);
            web.setWebViewClient(new  Callback());
            web.loadUrl("google.com");
        }

        private class Callback extends WebViewClient {
            @Override
            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                return false;
            }
        }


    }
