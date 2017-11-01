package com.example.mansi.my_demical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class cal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
    }
    public void DoAdd(View view)
    {
        EditText et1=(EditText) findViewById(R.id.et1);
        EditText et2=(EditText) findViewById(R.id.et2);
        int a=Integer.parseInt(et1.getText().toString());
        float b=Integer.parseInt(et2.getText().toString());
        TextView tv1=(TextView) findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(a+b));
      //  float res=a+b;
    }
    public void DoSub(View view) {
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        int a = Integer.parseInt(et1.getText().toString());
        float b = Integer.parseInt(et2.getText().toString());
        TextView tv1 = (TextView) findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(a - b));
        //float res=a-b;
    }
    public void DoMul(View view) {
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        int a = Integer.parseInt(et1.getText().toString());
        float b = Integer.parseInt(et2.getText().toString());
        TextView tv1 = (TextView) findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(a * b));
        //float res = a * b;
    }
    public void DoDiv(View view) {
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        int a = Integer.parseInt(et1.getText().toString());
        float b = Integer.parseInt(et2.getText().toString());
        TextView tv1 = (TextView) findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(a / b));
        //float res = a / b;
    }
    public void DoMod(View view) {
        EditText et1 = (EditText) findViewById(R.id.et1);
        EditText et2 = (EditText) findViewById(R.id.et2);
        int a = Integer.parseInt(et1.getText().toString());
        float b = Integer.parseInt(et2.getText().toString());
        TextView tv1 = (TextView) findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(a%b));
        //float res = a % b;
    }
    public void Sin(View view){
        EditText et3=(EditText)findViewById(R.id.et3);
        double a=Integer.parseInt(et3.getText().toString());
        //double res=java.lang.Math.sin(a);
        TextView tv1=(TextView)findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(java.lang.Math.sin(a)));
    }
    public void log(View view){
        EditText et1=(EditText)findViewById(R.id.et1);
        double a=Integer.parseInt(et1.getText().toString());
        double res=java.lang.Math.log(a);
        TextView tv1=(TextView)findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(java.lang.Math.log(a)));
    }
    public void fact(View view) {
        EditText et1 = (EditText) findViewById(R.id.et1);
        double a = Integer.parseInt(et1.getText().toString());
        double res = 1;
        for (double i = a; i > 0; i--) {
            res *= a;
        }
        TextView tv1=(TextView)findViewById(R.id.tvResult);
        tv1.setText(String.valueOf(res));
    }

    public void onsendmsg(View v){
        TextView messageView=(TextView) findViewById(R.id.tvResult);
        String messageText=messageView.getText().toString();
        Intent intent=new Intent(this,Result.class);
        intent.putExtra(Result.res,messageText);
        startActivity(intent);

    }

}
