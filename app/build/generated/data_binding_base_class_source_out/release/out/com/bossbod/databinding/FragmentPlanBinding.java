// Generated by data binding compiler. Do not edit!
package com.bossbod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bossbod.R;
import com.bossbod.fragments.PlanFragment;
import com.common.view.CBButtonView;
import com.common.view.CBTextView;
import com.common.view.CMTextView;
import com.common.view.CTextView;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentPlanBinding extends ViewDataBinding {
  @NonNull
  public final CBButtonView btnDay;

  @NonNull
  public final CBButtonView btnDrink;

  @NonNull
  public final CBButtonView btnStartWaterTracker;

  @NonNull
  public final CircularProgressBar circularProgressBar;

  @NonNull
  public final FrameLayout flWaterProgress;

  @NonNull
  public final AppCompatImageView imgChange;

  @NonNull
  public final AppCompatImageView imgMainGoalPlan;

  @NonNull
  public final AppCompatImageView imgRecentView;

  @NonNull
  public final CircleImageView imgRecentWorkout;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout llAfterWaterTrackerOn;

  @NonNull
  public final LinearLayout llRecent;

  @NonNull
  public final ProgressBar pbDay;

  @NonNull
  public final RecyclerView rvBodyFocus;

  @NonNull
  public final CTextView tvDaysLeft;

  @NonNull
  public final CBTextView tvPlanName;

  @NonNull
  public final CMTextView tvRecentTime;

  @NonNull
  public final CMTextView tvRecentWorkOutName;

  @NonNull
  public final CTextView tvTime;

  @NonNull
  public final CMTextView tvViewAll;

  @NonNull
  public final CBTextView tvWaterDrinked;

  @NonNull
  public final CTextView tvWaterTrackerDes;

  @Bindable
  protected PlanFragment.ClickHandler mHandler;

  protected FragmentPlanBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CBButtonView btnDay, CBButtonView btnDrink, CBButtonView btnStartWaterTracker,
      CircularProgressBar circularProgressBar, FrameLayout flWaterProgress,
      AppCompatImageView imgChange, AppCompatImageView imgMainGoalPlan,
      AppCompatImageView imgRecentView, CircleImageView imgRecentWorkout, LinearLayout linearLayout,
      LinearLayout llAfterWaterTrackerOn, LinearLayout llRecent, ProgressBar pbDay,
      RecyclerView rvBodyFocus, CTextView tvDaysLeft, CBTextView tvPlanName,
      CMTextView tvRecentTime, CMTextView tvRecentWorkOutName, CTextView tvTime,
      CMTextView tvViewAll, CBTextView tvWaterDrinked, CTextView tvWaterTrackerDes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDay = btnDay;
    this.btnDrink = btnDrink;
    this.btnStartWaterTracker = btnStartWaterTracker;
    this.circularProgressBar = circularProgressBar;
    this.flWaterProgress = flWaterProgress;
    this.imgChange = imgChange;
    this.imgMainGoalPlan = imgMainGoalPlan;
    this.imgRecentView = imgRecentView;
    this.imgRecentWorkout = imgRecentWorkout;
    this.linearLayout = linearLayout;
    this.llAfterWaterTrackerOn = llAfterWaterTrackerOn;
    this.llRecent = llRecent;
    this.pbDay = pbDay;
    this.rvBodyFocus = rvBodyFocus;
    this.tvDaysLeft = tvDaysLeft;
    this.tvPlanName = tvPlanName;
    this.tvRecentTime = tvRecentTime;
    this.tvRecentWorkOutName = tvRecentWorkOutName;
    this.tvTime = tvTime;
    this.tvViewAll = tvViewAll;
    this.tvWaterDrinked = tvWaterDrinked;
    this.tvWaterTrackerDes = tvWaterTrackerDes;
  }

  public abstract void setHandler(@Nullable PlanFragment.ClickHandler handler);

  @Nullable
  public PlanFragment.ClickHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_plan, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPlanBinding>inflateInternal(inflater, R.layout.fragment_plan, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPlanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_plan, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPlanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPlanBinding>inflateInternal(inflater, R.layout.fragment_plan, null, false, component);
  }

  public static FragmentPlanBinding bind(@NonNull View view) {
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
  public static FragmentPlanBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPlanBinding)bind(component, view, R.layout.fragment_plan);
  }
}