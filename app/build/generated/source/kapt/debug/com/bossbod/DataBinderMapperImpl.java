package com.bossbod;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.bossbod.databinding.ActivityAboutBindingImpl;
import com.bossbod.databinding.ActivityAccessAllFeatureBindingImpl;
import com.bossbod.databinding.ActivityBmiBindingImpl;
import com.bossbod.databinding.ActivityChooseHeightBindingImpl;
import com.bossbod.databinding.ActivityChooseTargetWeightBindingImpl;
import com.bossbod.databinding.ActivityChooseWeightBindingImpl;
import com.bossbod.databinding.ActivityChooseYourPlanBindingImpl;
import com.bossbod.databinding.ActivityCommonQuestionBindingImpl;
import com.bossbod.databinding.ActivityCompletedBindingImpl;
import com.bossbod.databinding.ActivityDaysPlanDetailBindingImpl;
import com.bossbod.databinding.ActivityEditPlanBindingImpl;
import com.bossbod.databinding.ActivityExerciseListBindingImpl;
import com.bossbod.databinding.ActivityFastWorkOutBindingImpl;
import com.bossbod.databinding.ActivityFastWorkoutDetailBindingImpl;
import com.bossbod.databinding.ActivityHistoryBindingImpl;
import com.bossbod.databinding.ActivityHomeBindingImpl;
import com.bossbod.databinding.ActivityHomeDetailBindingImpl;
import com.bossbod.databinding.ActivityMyProfileBindingImpl;
import com.bossbod.databinding.ActivityPerformExerciesBindingImpl;
import com.bossbod.databinding.ActivityRecentBindingImpl;
import com.bossbod.databinding.ActivityReminderBindingImpl;
import com.bossbod.databinding.ActivityRestBindingImpl;
import com.bossbod.databinding.ActivityRestDayBindingImpl;
import com.bossbod.databinding.ActivityTurnOnWaterBindingImpl;
import com.bossbod.databinding.ActivityVoiceOptionsBindingImpl;
import com.bossbod.databinding.ActivityWaterTrackerBindingImpl;
import com.bossbod.databinding.ActivityWellDoneBindingImpl;
import com.bossbod.databinding.ActivityWhatsYourGoalBindingImpl;
import com.bossbod.databinding.ActivityYourPlanBindingImpl;
import com.bossbod.databinding.BottomBarBindingImpl;
import com.bossbod.databinding.BottomSheetExDetailBindingImpl;
import com.bossbod.databinding.BottomSheetReplaceExBindingImpl;
import com.bossbod.databinding.BottomSheetRestartConfBindingImpl;
import com.bossbod.databinding.DialogDobBindingImpl;
import com.bossbod.databinding.DialogGenderDobBindingImpl;
import com.bossbod.databinding.DialogHeightBindingImpl;
import com.bossbod.databinding.DialogHeightWeightBindingImpl;
import com.bossbod.databinding.DialogQuiteWorkoutBindingImpl;
import com.bossbod.databinding.DialogSelectTtsEngineBindingImpl;
import com.bossbod.databinding.DialogSoundOptionBindingImpl;
import com.bossbod.databinding.DialogTestVoiceFailBindingImpl;
import com.bossbod.databinding.DialogUnloackTrainingBindingImpl;
import com.bossbod.databinding.DialogWeightBindingImpl;
import com.bossbod.databinding.DialogWeightWithDateBindingImpl;
import com.bossbod.databinding.FragmentAnimationBindingImpl;
import com.bossbod.databinding.FragmentMeBindingImpl;
import com.bossbod.databinding.FragmentPlanBindingImpl;
import com.bossbod.databinding.FragmentReportBindingImpl;
import com.bossbod.databinding.FragmentVideoBindingImpl;
import com.bossbod.databinding.ItemBodyFocusBindingImpl;
import com.bossbod.databinding.ItemCapturedImagesBindingImpl;
import com.bossbod.databinding.ItemChooseYourPlanBindingImpl;
import com.bossbod.databinding.ItemCommonQuestionChildBindingImpl;
import com.bossbod.databinding.ItemCommonQuestionParentBindingImpl;
import com.bossbod.databinding.ItemCommonQuestionTitleBindingImpl;
import com.bossbod.databinding.ItemDaysChildBindingImpl;
import com.bossbod.databinding.ItemDaysParentBindingImpl;
import com.bossbod.databinding.ItemEditPlanBindingImpl;
import com.bossbod.databinding.ItemHistoryChildBindingImpl;
import com.bossbod.databinding.ItemHistoryParentBindingImpl;
import com.bossbod.databinding.ItemHomeDetailBindingImpl;
import com.bossbod.databinding.ItemRandomWorkoutBindingImpl;
import com.bossbod.databinding.ItemRecentBindingImpl;
import com.bossbod.databinding.ItemReminderBindingImpl;
import com.bossbod.databinding.ItemReplaceWorkoutListBindingImpl;
import com.bossbod.databinding.ItemReportWeekDayBindingImpl;
import com.bossbod.databinding.ItemWhatsYourGoalBindingImpl;
import com.bossbod.databinding.ItemWorkoutListBindingImpl;
import com.bossbod.databinding.ItemWorkoutStatusIndicatorBindingImpl;
import com.bossbod.databinding.PopupLogoutBindingImpl;
import com.bossbod.databinding.TopbarBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUT = 1;

  private static final int LAYOUT_ACTIVITYACCESSALLFEATURE = 2;

  private static final int LAYOUT_ACTIVITYBMI = 3;

  private static final int LAYOUT_ACTIVITYCHOOSEHEIGHT = 4;

  private static final int LAYOUT_ACTIVITYCHOOSETARGETWEIGHT = 5;

  private static final int LAYOUT_ACTIVITYCHOOSEWEIGHT = 6;

  private static final int LAYOUT_ACTIVITYCHOOSEYOURPLAN = 7;

  private static final int LAYOUT_ACTIVITYCOMMONQUESTION = 8;

  private static final int LAYOUT_ACTIVITYCOMPLETED = 9;

  private static final int LAYOUT_ACTIVITYDAYSPLANDETAIL = 10;

  private static final int LAYOUT_ACTIVITYEDITPLAN = 11;

  private static final int LAYOUT_ACTIVITYEXERCISELIST = 12;

  private static final int LAYOUT_ACTIVITYFASTWORKOUT = 13;

  private static final int LAYOUT_ACTIVITYFASTWORKOUTDETAIL = 14;

  private static final int LAYOUT_ACTIVITYHISTORY = 15;

  private static final int LAYOUT_ACTIVITYHOME = 16;

  private static final int LAYOUT_ACTIVITYHOMEDETAIL = 17;

  private static final int LAYOUT_ACTIVITYMYPROFILE = 18;

  private static final int LAYOUT_ACTIVITYPERFORMEXERCIES = 19;

  private static final int LAYOUT_ACTIVITYRECENT = 20;

  private static final int LAYOUT_ACTIVITYREMINDER = 21;

  private static final int LAYOUT_ACTIVITYREST = 22;

  private static final int LAYOUT_ACTIVITYRESTDAY = 23;

  private static final int LAYOUT_ACTIVITYTURNONWATER = 24;

  private static final int LAYOUT_ACTIVITYVOICEOPTIONS = 25;

  private static final int LAYOUT_ACTIVITYWATERTRACKER = 26;

  private static final int LAYOUT_ACTIVITYWELLDONE = 27;

  private static final int LAYOUT_ACTIVITYWHATSYOURGOAL = 28;

  private static final int LAYOUT_ACTIVITYYOURPLAN = 29;

  private static final int LAYOUT_BOTTOMBAR = 30;

  private static final int LAYOUT_BOTTOMSHEETEXDETAIL = 31;

  private static final int LAYOUT_BOTTOMSHEETREPLACEEX = 32;

  private static final int LAYOUT_BOTTOMSHEETRESTARTCONF = 33;

  private static final int LAYOUT_DIALOGDOB = 34;

  private static final int LAYOUT_DIALOGGENDERDOB = 35;

  private static final int LAYOUT_DIALOGHEIGHT = 36;

  private static final int LAYOUT_DIALOGHEIGHTWEIGHT = 37;

  private static final int LAYOUT_DIALOGQUITEWORKOUT = 38;

  private static final int LAYOUT_DIALOGSELECTTTSENGINE = 39;

  private static final int LAYOUT_DIALOGSOUNDOPTION = 40;

  private static final int LAYOUT_DIALOGTESTVOICEFAIL = 41;

  private static final int LAYOUT_DIALOGUNLOACKTRAINING = 42;

  private static final int LAYOUT_DIALOGWEIGHT = 43;

  private static final int LAYOUT_DIALOGWEIGHTWITHDATE = 44;

  private static final int LAYOUT_FRAGMENTANIMATION = 45;

  private static final int LAYOUT_FRAGMENTME = 46;

  private static final int LAYOUT_FRAGMENTPLAN = 47;

  private static final int LAYOUT_FRAGMENTREPORT = 48;

  private static final int LAYOUT_FRAGMENTVIDEO = 49;

  private static final int LAYOUT_ITEMBODYFOCUS = 50;

  private static final int LAYOUT_ITEMCAPTUREDIMAGES = 51;

  private static final int LAYOUT_ITEMCHOOSEYOURPLAN = 52;

  private static final int LAYOUT_ITEMCOMMONQUESTIONCHILD = 53;

  private static final int LAYOUT_ITEMCOMMONQUESTIONPARENT = 54;

  private static final int LAYOUT_ITEMCOMMONQUESTIONTITLE = 55;

  private static final int LAYOUT_ITEMDAYSCHILD = 56;

  private static final int LAYOUT_ITEMDAYSPARENT = 57;

  private static final int LAYOUT_ITEMEDITPLAN = 58;

  private static final int LAYOUT_ITEMHISTORYCHILD = 59;

  private static final int LAYOUT_ITEMHISTORYPARENT = 60;

  private static final int LAYOUT_ITEMHOMEDETAIL = 61;

  private static final int LAYOUT_ITEMRANDOMWORKOUT = 62;

  private static final int LAYOUT_ITEMRECENT = 63;

  private static final int LAYOUT_ITEMREMINDER = 64;

  private static final int LAYOUT_ITEMREPLACEWORKOUTLIST = 65;

  private static final int LAYOUT_ITEMREPORTWEEKDAY = 66;

  private static final int LAYOUT_ITEMWHATSYOURGOAL = 67;

  private static final int LAYOUT_ITEMWORKOUTLIST = 68;

  private static final int LAYOUT_ITEMWORKOUTSTATUSINDICATOR = 69;

  private static final int LAYOUT_POPUPLOGOUT = 70;

  private static final int LAYOUT_TOPBAR = 71;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(71);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_about, LAYOUT_ACTIVITYABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_access_all_feature, LAYOUT_ACTIVITYACCESSALLFEATURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_bmi, LAYOUT_ACTIVITYBMI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_choose_height, LAYOUT_ACTIVITYCHOOSEHEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_choose_target_weight, LAYOUT_ACTIVITYCHOOSETARGETWEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_choose_weight, LAYOUT_ACTIVITYCHOOSEWEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_choose_your_plan, LAYOUT_ACTIVITYCHOOSEYOURPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_common_question, LAYOUT_ACTIVITYCOMMONQUESTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_completed, LAYOUT_ACTIVITYCOMPLETED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_days_plan_detail, LAYOUT_ACTIVITYDAYSPLANDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_edit_plan, LAYOUT_ACTIVITYEDITPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_exercise_list, LAYOUT_ACTIVITYEXERCISELIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_fast_work_out, LAYOUT_ACTIVITYFASTWORKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_fast_workout_detail, LAYOUT_ACTIVITYFASTWORKOUTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_history, LAYOUT_ACTIVITYHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_home_detail, LAYOUT_ACTIVITYHOMEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_my_profile, LAYOUT_ACTIVITYMYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_perform_exercies, LAYOUT_ACTIVITYPERFORMEXERCIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_recent, LAYOUT_ACTIVITYRECENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_reminder, LAYOUT_ACTIVITYREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_rest, LAYOUT_ACTIVITYREST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_rest_day, LAYOUT_ACTIVITYRESTDAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_turn_on_water, LAYOUT_ACTIVITYTURNONWATER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_voice_options, LAYOUT_ACTIVITYVOICEOPTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_water_tracker, LAYOUT_ACTIVITYWATERTRACKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_well_done, LAYOUT_ACTIVITYWELLDONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_whats_your_goal, LAYOUT_ACTIVITYWHATSYOURGOAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.activity_your_plan, LAYOUT_ACTIVITYYOURPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.bottom_bar, LAYOUT_BOTTOMBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.bottom_sheet_ex_detail, LAYOUT_BOTTOMSHEETEXDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.bottom_sheet_replace_ex, LAYOUT_BOTTOMSHEETREPLACEEX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.bottom_sheet_restart_conf, LAYOUT_BOTTOMSHEETRESTARTCONF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_dob, LAYOUT_DIALOGDOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_gender_dob, LAYOUT_DIALOGGENDERDOB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_height, LAYOUT_DIALOGHEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_height_weight, LAYOUT_DIALOGHEIGHTWEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_quite_workout, LAYOUT_DIALOGQUITEWORKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_select_tts_engine, LAYOUT_DIALOGSELECTTTSENGINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_sound_option, LAYOUT_DIALOGSOUNDOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_test_voice_fail, LAYOUT_DIALOGTESTVOICEFAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_unloack_training, LAYOUT_DIALOGUNLOACKTRAINING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_weight, LAYOUT_DIALOGWEIGHT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.dialog_weight_with_date, LAYOUT_DIALOGWEIGHTWITHDATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.fragment_animation, LAYOUT_FRAGMENTANIMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.fragment_me, LAYOUT_FRAGMENTME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.fragment_plan, LAYOUT_FRAGMENTPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.fragment_report, LAYOUT_FRAGMENTREPORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.fragment_video, LAYOUT_FRAGMENTVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_body_focus, LAYOUT_ITEMBODYFOCUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_captured_images, LAYOUT_ITEMCAPTUREDIMAGES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_choose_your_plan, LAYOUT_ITEMCHOOSEYOURPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_common_question_child, LAYOUT_ITEMCOMMONQUESTIONCHILD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_common_question_parent, LAYOUT_ITEMCOMMONQUESTIONPARENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_common_question_title, LAYOUT_ITEMCOMMONQUESTIONTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_days_child, LAYOUT_ITEMDAYSCHILD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_days_parent, LAYOUT_ITEMDAYSPARENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_edit_plan, LAYOUT_ITEMEDITPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_history_child, LAYOUT_ITEMHISTORYCHILD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_history_parent, LAYOUT_ITEMHISTORYPARENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_home_detail, LAYOUT_ITEMHOMEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_random_workout, LAYOUT_ITEMRANDOMWORKOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_recent, LAYOUT_ITEMRECENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_reminder, LAYOUT_ITEMREMINDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_replace_workout_list, LAYOUT_ITEMREPLACEWORKOUTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_report_week_day, LAYOUT_ITEMREPORTWEEKDAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_whats_your_goal, LAYOUT_ITEMWHATSYOURGOAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_workout_list, LAYOUT_ITEMWORKOUTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.item_workout_status_indicator, LAYOUT_ITEMWORKOUTSTATUSINDICATOR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.popup_logout, LAYOUT_POPUPLOGOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.bossbod.R.layout.topbar, LAYOUT_TOPBAR);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYABOUT: {
        if ("layout/activity_about_0".equals(tag)) {
          return new ActivityAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_about is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYACCESSALLFEATURE: {
        if ("layout/activity_access_all_feature_0".equals(tag)) {
          return new ActivityAccessAllFeatureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_access_all_feature is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYBMI: {
        if ("layout/activity_bmi_0".equals(tag)) {
          return new ActivityBmiBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_bmi is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHOOSEHEIGHT: {
        if ("layout/activity_choose_height_0".equals(tag)) {
          return new ActivityChooseHeightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_choose_height is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHOOSETARGETWEIGHT: {
        if ("layout/activity_choose_target_weight_0".equals(tag)) {
          return new ActivityChooseTargetWeightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_choose_target_weight is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHOOSEWEIGHT: {
        if ("layout/activity_choose_weight_0".equals(tag)) {
          return new ActivityChooseWeightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_choose_weight is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCHOOSEYOURPLAN: {
        if ("layout/activity_choose_your_plan_0".equals(tag)) {
          return new ActivityChooseYourPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_choose_your_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCOMMONQUESTION: {
        if ("layout/activity_common_question_0".equals(tag)) {
          return new ActivityCommonQuestionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_common_question is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYCOMPLETED: {
        if ("layout/activity_completed_0".equals(tag)) {
          return new ActivityCompletedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_completed is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYDAYSPLANDETAIL: {
        if ("layout/activity_days_plan_detail_0".equals(tag)) {
          return new ActivityDaysPlanDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_days_plan_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEDITPLAN: {
        if ("layout/activity_edit_plan_0".equals(tag)) {
          return new ActivityEditPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_edit_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEXERCISELIST: {
        if ("layout/activity_exercise_list_0".equals(tag)) {
          return new ActivityExerciseListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_exercise_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFASTWORKOUT: {
        if ("layout/activity_fast_work_out_0".equals(tag)) {
          return new ActivityFastWorkOutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_fast_work_out is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYFASTWORKOUTDETAIL: {
        if ("layout/activity_fast_workout_detail_0".equals(tag)) {
          return new ActivityFastWorkoutDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_fast_workout_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHISTORY: {
        if ("layout/activity_history_0".equals(tag)) {
          return new ActivityHistoryBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_history is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHOME: {
        if ("layout/activity_home_0".equals(tag)) {
          return new ActivityHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYHOMEDETAIL: {
        if ("layout/activity_home_detail_0".equals(tag)) {
          return new ActivityHomeDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_home_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMYPROFILE: {
        if ("layout/activity_my_profile_0".equals(tag)) {
          return new ActivityMyProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_my_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPERFORMEXERCIES: {
        if ("layout/activity_perform_exercies_0".equals(tag)) {
          return new ActivityPerformExerciesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_perform_exercies is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRECENT: {
        if ("layout/activity_recent_0".equals(tag)) {
          return new ActivityRecentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_recent is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREMINDER: {
        if ("layout/activity_reminder_0".equals(tag)) {
          return new ActivityReminderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_reminder is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREST: {
        if ("layout/activity_rest_0".equals(tag)) {
          return new ActivityRestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_rest is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYRESTDAY: {
        if ("layout/activity_rest_day_0".equals(tag)) {
          return new ActivityRestDayBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_rest_day is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYTURNONWATER: {
        if ("layout/activity_turn_on_water_0".equals(tag)) {
          return new ActivityTurnOnWaterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_turn_on_water is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYVOICEOPTIONS: {
        if ("layout/activity_voice_options_0".equals(tag)) {
          return new ActivityVoiceOptionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_voice_options is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWATERTRACKER: {
        if ("layout/activity_water_tracker_0".equals(tag)) {
          return new ActivityWaterTrackerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_water_tracker is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWELLDONE: {
        if ("layout/activity_well_done_0".equals(tag)) {
          return new ActivityWellDoneBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_well_done is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYWHATSYOURGOAL: {
        if ("layout/activity_whats_your_goal_0".equals(tag)) {
          return new ActivityWhatsYourGoalBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_whats_your_goal is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYYOURPLAN: {
        if ("layout/activity_your_plan_0".equals(tag)) {
          return new ActivityYourPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_your_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMBAR: {
        if ("layout/bottom_bar_0".equals(tag)) {
          return new BottomBarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_bar is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETEXDETAIL: {
        if ("layout/bottom_sheet_ex_detail_0".equals(tag)) {
          return new BottomSheetExDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_sheet_ex_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETREPLACEEX: {
        if ("layout/bottom_sheet_replace_ex_0".equals(tag)) {
          return new BottomSheetReplaceExBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_sheet_replace_ex is invalid. Received: " + tag);
      }
      case  LAYOUT_BOTTOMSHEETRESTARTCONF: {
        if ("layout/bottom_sheet_restart_conf_0".equals(tag)) {
          return new BottomSheetRestartConfBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for bottom_sheet_restart_conf is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGDOB: {
        if ("layout/dialog_dob_0".equals(tag)) {
          return new DialogDobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_dob is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGGENDERDOB: {
        if ("layout/dialog_gender_dob_0".equals(tag)) {
          return new DialogGenderDobBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_gender_dob is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGHEIGHT: {
        if ("layout/dialog_height_0".equals(tag)) {
          return new DialogHeightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_height is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGHEIGHTWEIGHT: {
        if ("layout/dialog_height_weight_0".equals(tag)) {
          return new DialogHeightWeightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_height_weight is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGQUITEWORKOUT: {
        if ("layout/dialog_quite_workout_0".equals(tag)) {
          return new DialogQuiteWorkoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_quite_workout is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGSELECTTTSENGINE: {
        if ("layout/dialog_select_tts_engine_0".equals(tag)) {
          return new DialogSelectTtsEngineBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_select_tts_engine is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGSOUNDOPTION: {
        if ("layout/dialog_sound_option_0".equals(tag)) {
          return new DialogSoundOptionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_sound_option is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGTESTVOICEFAIL: {
        if ("layout/dialog_test_voice_fail_0".equals(tag)) {
          return new DialogTestVoiceFailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_test_voice_fail is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGUNLOACKTRAINING: {
        if ("layout/dialog_unloack_training_0".equals(tag)) {
          return new DialogUnloackTrainingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_unloack_training is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGWEIGHT: {
        if ("layout/dialog_weight_0".equals(tag)) {
          return new DialogWeightBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_weight is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOGWEIGHTWITHDATE: {
        if ("layout/dialog_weight_with_date_0".equals(tag)) {
          return new DialogWeightWithDateBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog_weight_with_date is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTANIMATION: {
        if ("layout/fragment_animation_0".equals(tag)) {
          return new FragmentAnimationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_animation is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTME: {
        if ("layout/fragment_me_0".equals(tag)) {
          return new FragmentMeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_me is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPLAN: {
        if ("layout/fragment_plan_0".equals(tag)) {
          return new FragmentPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREPORT: {
        if ("layout/fragment_report_0".equals(tag)) {
          return new FragmentReportBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_report is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTVIDEO: {
        if ("layout/fragment_video_0".equals(tag)) {
          return new FragmentVideoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_video is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMBODYFOCUS: {
        if ("layout/item_body_focus_0".equals(tag)) {
          return new ItemBodyFocusBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_body_focus is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMCAPTUREDIMAGES: {
        if ("layout/item_captured_images_0".equals(tag)) {
          return new ItemCapturedImagesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_captured_images is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCHOOSEYOURPLAN: {
        if ("layout/item_choose_your_plan_0".equals(tag)) {
          return new ItemChooseYourPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_choose_your_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOMMONQUESTIONCHILD: {
        if ("layout/item_common_question_child_0".equals(tag)) {
          return new ItemCommonQuestionChildBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_common_question_child is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOMMONQUESTIONPARENT: {
        if ("layout/item_common_question_parent_0".equals(tag)) {
          return new ItemCommonQuestionParentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_common_question_parent is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOMMONQUESTIONTITLE: {
        if ("layout/item_common_question_title_0".equals(tag)) {
          return new ItemCommonQuestionTitleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_common_question_title is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDAYSCHILD: {
        if ("layout/item_days_child_0".equals(tag)) {
          return new ItemDaysChildBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_days_child is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMDAYSPARENT: {
        if ("layout/item_days_parent_0".equals(tag)) {
          return new ItemDaysParentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_days_parent is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMEDITPLAN: {
        if ("layout/item_edit_plan_0".equals(tag)) {
          return new ItemEditPlanBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_edit_plan is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHISTORYCHILD: {
        if ("layout/item_history_child_0".equals(tag)) {
          return new ItemHistoryChildBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_history_child is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHISTORYPARENT: {
        if ("layout/item_history_parent_0".equals(tag)) {
          return new ItemHistoryParentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_history_parent is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOMEDETAIL: {
        if ("layout/item_home_detail_0".equals(tag)) {
          return new ItemHomeDetailBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home_detail is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMRANDOMWORKOUT: {
        if ("layout/item_random_workout_0".equals(tag)) {
          return new ItemRandomWorkoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_random_workout is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMRECENT: {
        if ("layout/item_recent_0".equals(tag)) {
          return new ItemRecentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_recent is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREMINDER: {
        if ("layout/item_reminder_0".equals(tag)) {
          return new ItemReminderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_reminder is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPLACEWORKOUTLIST: {
        if ("layout/item_replace_workout_list_0".equals(tag)) {
          return new ItemReplaceWorkoutListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_replace_workout_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMREPORTWEEKDAY: {
        if ("layout/item_report_week_day_0".equals(tag)) {
          return new ItemReportWeekDayBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_report_week_day is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMWHATSYOURGOAL: {
        if ("layout/item_whats_your_goal_0".equals(tag)) {
          return new ItemWhatsYourGoalBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_whats_your_goal is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMWORKOUTLIST: {
        if ("layout/item_workout_list_0".equals(tag)) {
          return new ItemWorkoutListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_workout_list is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMWORKOUTSTATUSINDICATOR: {
        if ("layout/item_workout_status_indicator_0".equals(tag)) {
          return new ItemWorkoutStatusIndicatorBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_workout_status_indicator is invalid. Received: " + tag);
      }
      case  LAYOUT_POPUPLOGOUT: {
        if ("layout/popup_logout_0".equals(tag)) {
          return new PopupLogoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for popup_logout is invalid. Received: " + tag);
      }
      case  LAYOUT_TOPBAR: {
        if ("layout/topbar_0".equals(tag)) {
          return new TopbarBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for topbar is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(15);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "bottomClickListener");
      sKeys.put(2, "handler");
      sKeys.put(3, "isBackShow");
      sKeys.put(4, "isHomeShow");
      sKeys.put(5, "isInterNetAvailable");
      sKeys.put(6, "isInterNetAvailableShow");
      sKeys.put(7, "isLoading");
      sKeys.put(8, "isLogoutShow");
      sKeys.put(9, "isMoreShow");
      sKeys.put(10, "isReScanShow");
      sKeys.put(11, "isRefreshShow");
      sKeys.put(12, "isResetShow");
      sKeys.put(13, "isSyncingShow");
      sKeys.put(14, "topBarClickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(71);

    static {
      sKeys.put("layout/activity_about_0", com.bossbod.R.layout.activity_about);
      sKeys.put("layout/activity_access_all_feature_0", com.bossbod.R.layout.activity_access_all_feature);
      sKeys.put("layout/activity_bmi_0", com.bossbod.R.layout.activity_bmi);
      sKeys.put("layout/activity_choose_height_0", com.bossbod.R.layout.activity_choose_height);
      sKeys.put("layout/activity_choose_target_weight_0", com.bossbod.R.layout.activity_choose_target_weight);
      sKeys.put("layout/activity_choose_weight_0", com.bossbod.R.layout.activity_choose_weight);
      sKeys.put("layout/activity_choose_your_plan_0", com.bossbod.R.layout.activity_choose_your_plan);
      sKeys.put("layout/activity_common_question_0", com.bossbod.R.layout.activity_common_question);
      sKeys.put("layout/activity_completed_0", com.bossbod.R.layout.activity_completed);
      sKeys.put("layout/activity_days_plan_detail_0", com.bossbod.R.layout.activity_days_plan_detail);
      sKeys.put("layout/activity_edit_plan_0", com.bossbod.R.layout.activity_edit_plan);
      sKeys.put("layout/activity_exercise_list_0", com.bossbod.R.layout.activity_exercise_list);
      sKeys.put("layout/activity_fast_work_out_0", com.bossbod.R.layout.activity_fast_work_out);
      sKeys.put("layout/activity_fast_workout_detail_0", com.bossbod.R.layout.activity_fast_workout_detail);
      sKeys.put("layout/activity_history_0", com.bossbod.R.layout.activity_history);
      sKeys.put("layout/activity_home_0", com.bossbod.R.layout.activity_home);
      sKeys.put("layout/activity_home_detail_0", com.bossbod.R.layout.activity_home_detail);
      sKeys.put("layout/activity_my_profile_0", com.bossbod.R.layout.activity_my_profile);
      sKeys.put("layout/activity_perform_exercies_0", com.bossbod.R.layout.activity_perform_exercies);
      sKeys.put("layout/activity_recent_0", com.bossbod.R.layout.activity_recent);
      sKeys.put("layout/activity_reminder_0", com.bossbod.R.layout.activity_reminder);
      sKeys.put("layout/activity_rest_0", com.bossbod.R.layout.activity_rest);
      sKeys.put("layout/activity_rest_day_0", com.bossbod.R.layout.activity_rest_day);
      sKeys.put("layout/activity_turn_on_water_0", com.bossbod.R.layout.activity_turn_on_water);
      sKeys.put("layout/activity_voice_options_0", com.bossbod.R.layout.activity_voice_options);
      sKeys.put("layout/activity_water_tracker_0", com.bossbod.R.layout.activity_water_tracker);
      sKeys.put("layout/activity_well_done_0", com.bossbod.R.layout.activity_well_done);
      sKeys.put("layout/activity_whats_your_goal_0", com.bossbod.R.layout.activity_whats_your_goal);
      sKeys.put("layout/activity_your_plan_0", com.bossbod.R.layout.activity_your_plan);
      sKeys.put("layout/bottom_bar_0", com.bossbod.R.layout.bottom_bar);
      sKeys.put("layout/bottom_sheet_ex_detail_0", com.bossbod.R.layout.bottom_sheet_ex_detail);
      sKeys.put("layout/bottom_sheet_replace_ex_0", com.bossbod.R.layout.bottom_sheet_replace_ex);
      sKeys.put("layout/bottom_sheet_restart_conf_0", com.bossbod.R.layout.bottom_sheet_restart_conf);
      sKeys.put("layout/dialog_dob_0", com.bossbod.R.layout.dialog_dob);
      sKeys.put("layout/dialog_gender_dob_0", com.bossbod.R.layout.dialog_gender_dob);
      sKeys.put("layout/dialog_height_0", com.bossbod.R.layout.dialog_height);
      sKeys.put("layout/dialog_height_weight_0", com.bossbod.R.layout.dialog_height_weight);
      sKeys.put("layout/dialog_quite_workout_0", com.bossbod.R.layout.dialog_quite_workout);
      sKeys.put("layout/dialog_select_tts_engine_0", com.bossbod.R.layout.dialog_select_tts_engine);
      sKeys.put("layout/dialog_sound_option_0", com.bossbod.R.layout.dialog_sound_option);
      sKeys.put("layout/dialog_test_voice_fail_0", com.bossbod.R.layout.dialog_test_voice_fail);
      sKeys.put("layout/dialog_unloack_training_0", com.bossbod.R.layout.dialog_unloack_training);
      sKeys.put("layout/dialog_weight_0", com.bossbod.R.layout.dialog_weight);
      sKeys.put("layout/dialog_weight_with_date_0", com.bossbod.R.layout.dialog_weight_with_date);
      sKeys.put("layout/fragment_animation_0", com.bossbod.R.layout.fragment_animation);
      sKeys.put("layout/fragment_me_0", com.bossbod.R.layout.fragment_me);
      sKeys.put("layout/fragment_plan_0", com.bossbod.R.layout.fragment_plan);
      sKeys.put("layout/fragment_report_0", com.bossbod.R.layout.fragment_report);
      sKeys.put("layout/fragment_video_0", com.bossbod.R.layout.fragment_video);
      sKeys.put("layout/item_body_focus_0", com.bossbod.R.layout.item_body_focus);
      sKeys.put("layout/item_captured_images_0", com.bossbod.R.layout.item_captured_images);
      sKeys.put("layout/item_choose_your_plan_0", com.bossbod.R.layout.item_choose_your_plan);
      sKeys.put("layout/item_common_question_child_0", com.bossbod.R.layout.item_common_question_child);
      sKeys.put("layout/item_common_question_parent_0", com.bossbod.R.layout.item_common_question_parent);
      sKeys.put("layout/item_common_question_title_0", com.bossbod.R.layout.item_common_question_title);
      sKeys.put("layout/item_days_child_0", com.bossbod.R.layout.item_days_child);
      sKeys.put("layout/item_days_parent_0", com.bossbod.R.layout.item_days_parent);
      sKeys.put("layout/item_edit_plan_0", com.bossbod.R.layout.item_edit_plan);
      sKeys.put("layout/item_history_child_0", com.bossbod.R.layout.item_history_child);
      sKeys.put("layout/item_history_parent_0", com.bossbod.R.layout.item_history_parent);
      sKeys.put("layout/item_home_detail_0", com.bossbod.R.layout.item_home_detail);
      sKeys.put("layout/item_random_workout_0", com.bossbod.R.layout.item_random_workout);
      sKeys.put("layout/item_recent_0", com.bossbod.R.layout.item_recent);
      sKeys.put("layout/item_reminder_0", com.bossbod.R.layout.item_reminder);
      sKeys.put("layout/item_replace_workout_list_0", com.bossbod.R.layout.item_replace_workout_list);
      sKeys.put("layout/item_report_week_day_0", com.bossbod.R.layout.item_report_week_day);
      sKeys.put("layout/item_whats_your_goal_0", com.bossbod.R.layout.item_whats_your_goal);
      sKeys.put("layout/item_workout_list_0", com.bossbod.R.layout.item_workout_list);
      sKeys.put("layout/item_workout_status_indicator_0", com.bossbod.R.layout.item_workout_status_indicator);
      sKeys.put("layout/popup_logout_0", com.bossbod.R.layout.popup_logout);
      sKeys.put("layout/topbar_0", com.bossbod.R.layout.topbar);
    }
  }
}
