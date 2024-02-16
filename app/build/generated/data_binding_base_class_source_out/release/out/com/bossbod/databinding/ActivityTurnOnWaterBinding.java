// Generated by data binding compiler. Do not edit!
package com.bossbod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bossbod.R;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityTurnOnWaterBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView appCompatImageView2;

  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final LinearLayout llAdContainer;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final LinearLayout llTurnOnWaterTracker;

  @Bindable
  protected Boolean mIsLoading;

  protected ActivityTurnOnWaterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView appCompatImageView2, AppCompatImageView imgBack,
      LinearLayout llAdContainer, RelativeLayout llAdView, LinearLayout llAdViewFacebook,
      LinearLayout llTurnOnWaterTracker) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatImageView2 = appCompatImageView2;
    this.imgBack = imgBack;
    this.llAdContainer = llAdContainer;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.llTurnOnWaterTracker = llTurnOnWaterTracker;
  }

  public abstract void setIsLoading(@Nullable Boolean isLoading);

  @Nullable
  public Boolean getIsLoading() {
    return mIsLoading;
  }

  @NonNull
  public static ActivityTurnOnWaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_turn_on_water, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTurnOnWaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityTurnOnWaterBinding>inflateInternal(inflater, R.layout.activity_turn_on_water, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityTurnOnWaterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_turn_on_water, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityTurnOnWaterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityTurnOnWaterBinding>inflateInternal(inflater, R.layout.activity_turn_on_water, null, false, component);
  }

  public static ActivityTurnOnWaterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityTurnOnWaterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityTurnOnWaterBinding)bind(component, view, R.layout.activity_turn_on_water);
  }
}
