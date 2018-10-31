package com.mmj.www.newintetresponsebundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        EditText fetsavevalue = findViewById(R.id.fetsavevalue);
        text = fetsavevalue.getText().toString();
        Button fBtn = findViewById(R.id.fBtn);
        fBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("first",text);
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent,100);
    }
}
