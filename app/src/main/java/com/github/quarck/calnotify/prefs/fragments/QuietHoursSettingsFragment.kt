package com.github.quarck.calnotify.prefs.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceFragment
import com.github.quarck.calnotify.R
import com.github.quarck.calnotify.Settings
import com.github.quarck.calnotify.utils.vibratorService

class QuietHoursSettingsFragment: PreferenceFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.quiet_hours_preferences)
    }
}