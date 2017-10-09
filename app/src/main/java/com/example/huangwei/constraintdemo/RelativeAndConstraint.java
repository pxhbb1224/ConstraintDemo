package com.example.huangwei.constraintdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * @author huangwei E-mail: huangwei@tigerbrokers.com
 * @version 创建时间： 2017/10/09/13:10
 */

public class RelativeAndConstraint extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.compare_relative_constraint);
    final TextView textGone = (TextView) findViewById(R.id.text_will_gone);
    findViewById(R.id.text_gone_right).setOnClickListener(new View.OnClickListener() {
      boolean flag = false;

      @Override
      public void onClick(View v) {
        textGone.setVisibility(flag ? View.VISIBLE : View.GONE);
      }
    });
  }
}
