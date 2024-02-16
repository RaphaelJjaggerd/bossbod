// Generated by data binding compiler. Do not edit!
package com.bossbod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bossbod.R;
import com.bossbod.interfaces.TopBarClickListener;
import com.common.view.CMTextView;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TopbarBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imgBack;

  @NonNull
  public final AppCompatImageView imgInternet;

  @NonNull
  public final AppCompatImageView imgMenu;

  @NonNull
  public final AppCompatImageView imgSearch;

  @NonNull
  public final AppCompatImageView imgSync;

  @NonNull
  public final LinearLayout toolbar;

  @NonNull
  public final CMTextView tvReset;

  @NonNull
  public final CMTextView tvTitleText;

  @Bindable
  protected Boolean mIsBackShow;

  @Bindable
  protected Boolean mIsRefreshShow;

  @Bindable
  protected Boolean mIsLogoutShow;

  @Bindable
  protected Boolean mIsInterNetAvailable;

  @Bindable
  protected Boolean mIsInterNetAvailableShow;

  @Bindable
  protected Boolean mIsHomeShow;

  @Bindable
  protected Boolean mIsReScanShow;

  @Bindable
  protected Boolean mIsMoreShow;

  @Bindable
  protected Boolean mIsResetShow;

  @Bindable
  protected TopBarClickListener mTopBarClickListener;

  @Bindable
  protected Boolean mIsSyncingShow;

  protected TopbarBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imgBack, AppCompatImageView imgInternet, AppCompatImageView imgMenu,
      AppCompatImageView imgSearch, AppCompatImageView imgSync, LinearLayout toolbar,
      CMTextView tvReset, CMTextView tvTitleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgBack = imgBack;
    this.imgInternet = imgInternet;
    this.imgMenu = imgMenu;
    this.imgSearch = imgSearch;
    this.imgSync = imgSync;
    this.toolbar = toolbar;
    this.tvReset = tvReset;
    this.tvTitleText = tvTitleText;
  }

  public abstract void setIsBackShow(@Nullable Boolean isBackShow);

  @Nullable
  public Boolean getIsBackShow() {
    return mIsBackShow;
  }

  public abstract void setIsRefreshShow(@Nullable Boolean isRefreshShow);

  @Nullable
  public Boolean getIsRefreshShow() {
    return mIsRefreshShow;
  }

  public abstract void setIsLogoutShow(@Nullable Boolean isLogoutShow);

  @Nullable
  public Boolean getIsLogoutShow() {
    return mIsLogoutShow;
  }

  public abstract void setIsInterNetAvailable(@Nullable Boolean isInterNetAvailable);

  @Nullable
  public Boolean getIsInterNetAvailable() {
    return mIsInterNetAvailable;
  }

  public abstract void setIsInterNetAvailableShow(@Nullable Boolean isInterNetAvailableShow);

  @Nullable
  public Boolean getIsInterNetAvailableShow() {
    return mIsInterNetAvailableShow;
  }

  public abstract void setIsHomeShow(@Nullable Boolean isHomeShow);

  @Nullable
  public Boolean getIsHomeShow() {
    return mIsHomeShow;
  }

  public abstract void setIsReScanShow(@Nullable Boolean isReScanShow);

  @Nullable
  public Boolean getIsReScanShow() {
    return mIsReScanShow;
  }

  public abstract void setIsMoreShow(@Nullable Boolean isMoreShow);

  @Nullable
  public Boolean getIsMoreShow() {
    return mIsMoreShow;
  }

  public abstract void setIsResetShow(@Nullable Boolean isResetShow);

  @Nullable
  public Boolean getIsResetShow() {
    return mIsResetShow;
  }

  public abstract void setTopBarClickListener(@Nullable TopBarClickListener topBarClickListener);

  @Nullable
  public TopBarClickListener getTopBarClickListener() {
    return mTopBarClickListener;
  }

  public abstract void setIsSyncingShow(@Nullable Boolean isSyncingShow);

  @Nullable
  public Boolean getIsSyncingShow() {
    return mIsSyncingShow;
  }

  @NonNull
  public static TopbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.topbar, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TopbarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TopbarBinding>inflateInternal(inflater, R.layout.topbar, root, attachToRoot, component);
  }

  @NonNull
  public static TopbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.topbar, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TopbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TopbarBinding>inflateInternal(inflater, R.layout.topbar, null, false, component);
  }

  public static TopbarBinding bind(@NonNull View view) {
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
  public static TopbarBinding bind(@NonNull View view, @Nullable Object component) {
    return (TopbarBinding)bind(component, view, R.layout.topbar);
  }
}
