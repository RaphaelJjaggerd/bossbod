package com.bossbod;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J\"\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0012\u0010/\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020%H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00064"}, d2 = {"Lcom/bossbod/ExercisesListActivity;", "Lcom/bossbod/BaseActivity;", "()V", "binding", "Lcom/bossbod/databinding/ActivityExerciseListBinding;", "getBinding", "()Lcom/bossbod/databinding/ActivityExerciseListBinding;", "setBinding", "(Lcom/bossbod/databinding/ActivityExerciseListBinding;)V", "dayId", "", "getDayId", "()Ljava/lang/String;", "setDayId", "(Ljava/lang/String;)V", "exerciseDetailDialog", "Lcom/bossbod/dialog/ExerciseDetailDialogFragment;", "getExerciseDetailDialog", "()Lcom/bossbod/dialog/ExerciseDetailDialogFragment;", "setExerciseDetailDialog", "(Lcom/bossbod/dialog/ExerciseDetailDialogFragment;)V", "from", "getFrom", "setFrom", "workoutListAdapter", "Lcom/bossbod/adapter/WorkoutListAdapter;", "getWorkoutListAdapter", "()Lcom/bossbod/adapter/WorkoutListAdapter;", "setWorkoutListAdapter", "(Lcom/bossbod/adapter/WorkoutListAdapter;)V", "workoutPlanData", "Lcom/bossbod/objects/HomePlanTableClass;", "getWorkoutPlanData", "()Lcom/bossbod/objects/HomePlanTableClass;", "setWorkoutPlanData", "(Lcom/bossbod/objects/HomePlanTableClass;)V", "fillData", "", "getExerciseData", "init", "initIntentParam", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "ClickHandler", "app_release"})
public final class ExercisesListActivity extends com.bossbod.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.bossbod.databinding.ActivityExerciseListBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.bossbod.adapter.WorkoutListAdapter workoutListAdapter;
    @org.jetbrains.annotations.Nullable
    private com.bossbod.objects.HomePlanTableClass workoutPlanData;
    @org.jetbrains.annotations.Nullable
    private com.bossbod.dialog.ExerciseDetailDialogFragment exerciseDetailDialog;
    @org.jetbrains.annotations.Nullable
    private java.lang.String dayId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String from;
    
    public ExercisesListActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.bossbod.databinding.ActivityExerciseListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.bossbod.databinding.ActivityExerciseListBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.bossbod.adapter.WorkoutListAdapter getWorkoutListAdapter() {
        return null;
    }
    
    public final void setWorkoutListAdapter(@org.jetbrains.annotations.Nullable
    com.bossbod.adapter.WorkoutListAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.bossbod.objects.HomePlanTableClass getWorkoutPlanData() {
        return null;
    }
    
    public final void setWorkoutPlanData(@org.jetbrains.annotations.Nullable
    com.bossbod.objects.HomePlanTableClass p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.bossbod.dialog.ExerciseDetailDialogFragment getExerciseDetailDialog() {
        return null;
    }
    
    public final void setExerciseDetailDialog(@org.jetbrains.annotations.Nullable
    com.bossbod.dialog.ExerciseDetailDialogFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDayId() {
        return null;
    }
    
    public final void setDayId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFrom() {
        return null;
    }
    
    public final void setFrom(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initIntentParam() {
    }
    
    private final void init() {
    }
    
    private final void getExerciseData() {
    }
    
    private final void fillData() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004\u00a8\u0006\f"}, d2 = {"Lcom/bossbod/ExercisesListActivity$ClickHandler;", "", "(Lcom/bossbod/ExercisesListActivity;)V", "onAboutClick", "", "onBackClick", "onCommonQuestionClick", "onContinueClick", "onEditClick", "onIntroductionClick", "onRestartClick", "onStartClick", "app_release"})
    public final class ClickHandler {
        
        public ClickHandler() {
            super();
        }
        
        public final void onStartClick() {
        }
        
        public final void onEditClick() {
        }
        
        public final void onRestartClick() {
        }
        
        public final void onContinueClick() {
        }
        
        public final void onCommonQuestionClick() {
        }
        
        public final void onIntroductionClick() {
        }
        
        public final void onBackClick() {
        }
        
        public final void onAboutClick() {
        }
    }
}