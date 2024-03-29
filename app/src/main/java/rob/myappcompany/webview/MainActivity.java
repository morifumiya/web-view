package rob.myappcompany.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);

        // WebViewのセッティングでJavaScriptを使用可能にする
        webView.getSettings().setJavaScriptEnabled(true);
        // クライアントのWebViewを使う（これしないとWebViewじゃなくてブラウザで開かられる）
        webView.setWebViewClient(new WebViewClient());

//        webView.loadUrl("https://www.google.com");

        webView.loadData("<html><body><h1>Hello</h1></body></html>", "text/html", "UTF-8");
    }
}
