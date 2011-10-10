package com.enea.training.customview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.enea.training.customview.CustomSlider.CustomSliderPositionListener;

public class CustomViewActivity extends Activity {
  private TextView     mValues;
  private CustomSlider mSliderHorizontal;

  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    mValues = (TextView) findViewById(R.id.values);

    mSliderHorizontal = (CustomSlider) findViewById(R.id.slider_horizontal);
    mSliderHorizontal.setPositionListener(new CustomSliderPositionListener() {
      public void onPositionChange(final float newPosition) {
        displayValues();
      }
    });

    mSliderHorizontal.setMinMax(-100.0f, 100.0f);
    mSliderHorizontal.setPosition(30.0f);
    displayValues();
  }

  void displayValues() {
    final String str = String.format("Horizontal: %3.2f",
        mSliderHorizontal.getPosition());
    mValues.setText(str);
  }

  public void onReset(final View v) {
    float min = mSliderHorizontal.getMin();
    float max = mSliderHorizontal.getMax();
    float newPos = (max - min) / 2 + min;
    mSliderHorizontal.setPosition(newPos);
  }
}