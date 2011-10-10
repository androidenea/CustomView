package com.enea.training.customview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class CustomSlider extends View {

  private final Drawable               mIndicator;
  private final Drawable               mBackground;

  public CustomSlider(final Context context) {
    this(context, null, 0);
  }

  public CustomSlider(final Context context, final AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public CustomSlider(final Context context, final AttributeSet attrs,
      final int defStyle) {
    super(context, attrs, defStyle);

    final Resources res = context.getResources();
    mIndicator = res.getDrawable(R.drawable.indicator_horizontal);
    mBackground = res.getDrawable(R.drawable.background_horizontal);
  }
}
