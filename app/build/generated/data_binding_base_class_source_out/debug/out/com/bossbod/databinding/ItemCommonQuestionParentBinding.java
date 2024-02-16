// Generated by data binding compiler. Do not edit!
package com.bossbod.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.bossbod.R;
import com.common.view.CBTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCommonQuestionParentBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llContainer;

  @NonNull
  public final CBTextView tvTitle;

  protected ItemCommonQuestionParentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout llContainer, CBTextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llContainer = llContainer;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static ItemCommonQuestionParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_common_question_parent, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCommonQuestionParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCommonQuestionParentBinding>inflateInternal(inflater, R.layout.item_common_question_parent, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCommonQuestionParentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_common_question_parent, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCommonQuestionParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCommonQuestionParentBinding>inflateInternal(inflater, R.layout.item_common_question_parent, null, false, component);
  }

  public static ItemCommonQuestionParentBinding bind(@NonNull View view) {
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
  public static ItemCommonQuestionParentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemCommonQuestionParentBinding)bind(component, view, R.layout.item_common_question_parent);
  }
}
