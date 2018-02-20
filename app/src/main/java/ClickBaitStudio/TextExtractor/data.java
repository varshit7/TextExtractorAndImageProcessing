package ClickBaitStudio.TextExtractor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class data extends AppCompatActivity {
    TextView textView1;
    final static String MESSAGE_KEY="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        textView1=(TextView)findViewById(R.id.text_view1);
        String var1="varshith is pulka";
        textView1.setText(var1);
        Intent in=getIntent();
        String message=in.getStringExtra(MESSAGE_KEY);
        textView1.setText(message);

    }
    public void back(View view)
    {
        Intent na1=new Intent(this,MainActivity.class);
        startActivity(na1);
    }
}
