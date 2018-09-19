package com.example.zhousheng.buttonandtexttype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            int count=10;
                public void onClick (View v) {
                    Toast.makeText(MainActivity.this, "你点击了按钮", Toast.LENGTH_SHORT).show();
            TextView name = findViewById(R.id.text1);
                    TextView name1 = findViewById(R.id.text2);
                    if(name.getText().equals("my first android application"))
                        name.setText("finish！");
                    else
                        name.setText("my first android application");
                }
        });
    }
}
