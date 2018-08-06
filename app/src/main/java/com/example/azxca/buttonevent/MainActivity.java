package com.example.azxca.buttonevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int count = 0;
    private Button button1;
    private Button button2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        textView=(TextView)findViewById(R.id.textView);
        button1=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        textView.setText("0");
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.button:
                count++;
                textView.setText(count+"");
                break;
            case R.id.button2:
                count--;
                textView.setText(count+"");
                break;
        }
    }

}
