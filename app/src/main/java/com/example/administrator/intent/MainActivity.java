package com.example.administrator.intent;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText =(EditText)findViewById(R.id.edt_content);
                final String edt_content="http://"+editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(edt_content));
                Bundle bundle=new Bundle();
                bundle.putString("URL", edt_content);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}