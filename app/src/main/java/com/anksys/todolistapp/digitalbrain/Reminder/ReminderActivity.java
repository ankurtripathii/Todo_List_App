package com.anksys.todolistapp.digitalbrain.Reminder;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.anksys.todolistapp.digitalbrain.AppDefault.AppDefaultActivity;
import com.anksys.todolistapp.digitalbrain.R;

public class ReminderActivity extends AppDefaultActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.reminder_layout;
    }

    @NonNull
    @Override
    protected ReminderFragment createInitialFragment() {
        return ReminderFragment.newInstance();
    }


}
