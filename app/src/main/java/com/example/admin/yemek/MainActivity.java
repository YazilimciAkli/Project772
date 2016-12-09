package com.example.admin.yemek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button next;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=(Button)findViewById(R.id.next);
        Intent data=getIntent();
        String veri=data.getStringExtra("data2");
        tv=(TextView)findViewById(R.id.textView);
        tv.setText(veri);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),Yemek.class);
                intent.putExtra("data",(String) "sayfa 1'den veri gönderildi");
                startActivity(intent);
            }
        });
    }
}
