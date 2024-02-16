// Generated by data binding compiler. Do not edit!
package com.bossbod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bossbod.R;
import com.bossbod.RestActivity;
import com.common.view.CBButtonView;
import com.common.view.CBTextView;
import com.common.view.CMTextView;
import com.common.view.CTextView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRestBinding extends ViewDataBinding {
  @NonNull
  public final CBTextView btnContinue;

  @NonNull
  public final CBButtonView btnSkip;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final ConstraintLayout llReadyToGo;

  @NonNull
  public final CircularProgressBar progressBarReadyToGo;

  @NonNull
  public final ProgressBar progressBarTop;

  @NonNull
  public final RecyclerView rcyWorkoutStatus;

  @NonNull
  public final CBTextView tvCountDownReadyToGO;

  @NonNull
  public final CMTextView tvName;

  @NonNull
  public final CTextView tvTime;

  @NonNull
  public final CTextView tvTotalEx;

  @NonNull
  public final ViewFlipper viewFlipper;

  @Bindable
  protected RestActivity.ClickHandler mHandler;

  protected ActivityRestBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CBTextView btnContinue, CBButtonView btnSkip, RelativeLayout llAdView,
      LinearLayout llAdViewFacebook, ConstraintLayout llReadyToGo,
      CircularProgressBar progressBarReadyToGo, ProgressBar progressBarTop,
      RecyclerView rcyWorkoutStatus, CBTextView tvCountDownReadyToGO, CMTextView tvName,
      CTextView tvTime, CTextView tvTotalEx, ViewFlipper viewFlipper) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnContinue = btnContinue;
    this.btnSkip = btnSkip;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.llReadyToGo = llReadyToGo;
    this.progressBarReadyToGo = progressBarReadyToGo;
    this.progressBarTop = progressBarTop;
    this.rcyWorkoutStatus = rcyWorkoutStatus;
    this.tvCountDownReadyToGO = tvCountDownReadyToGO;
    this.tvName = tvName;
    this.tvTime = tvTime;
    this.tvTotalEx = tvTotalEx;
    this.viewFlipper = viewFlipper;
  }

  public abstract void setHandler(@Nullable RestActivity.ClickHandler handler);

  @Nullable
  public RestActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityRestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rest, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRestBinding>inflateInternal(inflater, R.layout.activity_rest, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rest, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRestBinding>inflateInternal(inflater, R.layout.activity_rest, null, false, component);
  }

  public static ActivityRestBinding bind(@NonNull View view) {
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
  public static ActivityRestBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRestBinding)bind(component, view, R.layout.activity_rest);
  }
}
