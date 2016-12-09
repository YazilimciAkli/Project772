package com.example.admin.yemek;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Yemek extends AppCompatActivity {
    Button previous;
    TextView tv2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yemek);
        Intent data=getIntent();
        String veri=data.getStringExtra("data");
        tv2=(TextView)findViewById(R.id.textView2);
        tv2.setText(veri);
        previous=(Button)findViewById(R.id.previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),MainActivity.class);
                intent.putExtra("data2",(String) "sayfa 2'den veri gönderildi");
                startActivity(intent);
            }
        });
    }
}
