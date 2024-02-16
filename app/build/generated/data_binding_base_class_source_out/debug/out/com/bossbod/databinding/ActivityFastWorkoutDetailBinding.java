// Generated by data binding compiler. Do not edit!
package com.bossbod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bossbod.FastWorkOutDetailActivity;
import com.bossbod.R;
import com.common.view.CBTextView;
import com.common.view.CMTextView;
import com.common.view.CTextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFastWorkoutDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final CircleImageView imgAdvance;

  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final CircleImageView imgBeginer;

  @NonNull
  public final CircleImageView imgIntermediate;

  @NonNull
  public final RelativeLayout llAdView;

  @NonNull
  public final LinearLayout llAdViewFacebook;

  @NonNull
  public final LinearLayout llAdvanced;

  @NonNull
  public final LinearLayout llBeginner;

  @NonNull
  public final LinearLayout llIntermediate;

  @NonNull
  public final LinearLayout llTopTitle;

  @NonNull
  public final CoordinatorLayout mainContent;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final ImageView titleImage;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final CTextView tvAdvancedMinutes;

  @NonNull
  public final CTextView tvDes;

  @NonNull
  public final CTextView tvIntermediateMin;

  @NonNull
  public final CTextView tvMinutes;

  @NonNull
  public final CMTextView tvName;

  @NonNull
  public final CBTextView tvTitle;

  @NonNull
  public final CBTextView tvTitleText;

  @Bindable
  protected FastWorkOutDetailActivity.ClickHandler mHandler;

  protected ActivityFastWorkoutDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, CollapsingToolbarLayout collapsingToolbar,
      CircleImageView imgAdvance, AppCompatImageView imgBack, CircleImageView imgBeginer,
      CircleImageView imgIntermediate, RelativeLayout llAdView, LinearLayout llAdViewFacebook,
      LinearLayout llAdvanced, LinearLayout llBeginner, LinearLayout llIntermediate,
      LinearLayout llTopTitle, CoordinatorLayout mainContent, NestedScrollView nestedScrollView,
      ImageView titleImage, Toolbar toolbar, CTextView tvAdvancedMinutes, CTextView tvDes,
      CTextView tvIntermediateMin, CTextView tvMinutes, CMTextView tvName, CBTextView tvTitle,
      CBTextView tvTitleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.imgAdvance = imgAdvance;
    this.imgBack = imgBack;
    this.imgBeginer = imgBeginer;
    this.imgIntermediate = imgIntermediate;
    this.llAdView = llAdView;
    this.llAdViewFacebook = llAdViewFacebook;
    this.llAdvanced = llAdvanced;
    this.llBeginner = llBeginner;
    this.llIntermediate = llIntermediate;
    this.llTopTitle = llTopTitle;
    this.mainContent = mainContent;
    this.nestedScrollView = nestedScrollView;
    this.titleImage = titleImage;
    this.toolbar = toolbar;
    this.tvAdvancedMinutes = tvAdvancedMinutes;
    this.tvDes = tvDes;
    this.tvIntermediateMin = tvIntermediateMin;
    this.tvMinutes = tvMinutes;
    this.tvName = tvName;
    this.tvTitle = tvTitle;
    this.tvTitleText = tvTitleText;
  }

  public abstract void setHandler(@Nullable FastWorkOutDetailActivity.ClickHandler handler);

  @Nullable
  public FastWorkOutDetailActivity.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static ActivityFastWorkoutDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_fast_workout_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFastWorkoutDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFastWorkoutDetailBinding>inflateInternal(inflater, R.layout.activity_fast_workout_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFastWorkoutDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_fast_workout_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFastWorkoutDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFastWorkoutDetailBinding>inflateInternal(inflater, R.layout.activity_fast_workout_detail, null, false, component);
  }

  public static ActivityFastWorkoutDetailBinding bind(@NonNull View view) {
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
  public static ActivityFastWorkoutDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityFastWorkoutDetailBinding)bind(component, view, R.layout.activity_fast_workout_detail);
  }
}
