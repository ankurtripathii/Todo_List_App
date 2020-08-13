package com.anksys.todolistapp.digitalbrain.Utility;

import android.content.res.Resources;

import com.anksys.todolistapp.digitalbrain.R;

/**
 * Created by Ankur Tripathi on 12/08/2020.
 */
public class PreferenceKeys {
    public final String night_mode_pref_key;

    public PreferenceKeys(Resources resources) {
        night_mode_pref_key = resources.getString(R.string.night_mode_pref_key);
    }
}
