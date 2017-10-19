package com.example.huangwei.constraintdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.chain);
    //final TextView textGone = (TextView) findViewById(R.id.text_will_gone);
    //findViewById(R.id.text_gone_right).setOnClickListener(new View.OnClickListener() {
    //  boolean flag = false;
    //
    //  @Override
    //  public void onClick(View v) {
    //    textGone.setVisibility(flag ? View.VISIBLE : View.GONE);
    //    flag = !flag;
    //  }
    //});
    //Guideline guideline;
    //final TextView textGone1 = (TextView) findViewById(R.id.textView4);
    //findViewById(R.id.text_click_gone_constraint).setOnClickListener(new View.OnClickListener() {
    //  boolean flag = false;
    //
    //  @Override
    //  public void onClick(View v) {
    //    textGone1.setVisibility(flag ? View.VISIBLE : View.GONE);
    //    flag = !flag;
    //  }
    //});
  }
}
