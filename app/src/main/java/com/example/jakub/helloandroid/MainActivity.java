package com.example.jakub.helloandroid;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebsite(View view) {
        switch (view.getId()){
            case (R.id.website):
                Intent webaddress = new Intent(Intent.ACTION_VIEW);
                webaddress.setData(Uri.parse("http://www.udacity.com"));
                startActivity(webaddress);
        }
    }
}