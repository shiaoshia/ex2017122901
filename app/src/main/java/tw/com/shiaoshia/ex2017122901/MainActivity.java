package tw.com.shiaoshia.ex2017122901;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LOG","This is onCreate");
    }

    public void click01(View v){
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,"這是一個分享文字");
        startActivity(it);
    }

    public void click02(View v){
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("image/jpeg");
        Uri uri = Uri.parse("android.resource://"+getApplicationContext().getPackageName()+
            "/"+R.drawable.pic);
        it.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(it);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LOG","This is onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LOG","This is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LOG","This is onDestroy");
    }
}
