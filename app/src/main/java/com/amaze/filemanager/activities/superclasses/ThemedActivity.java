package com.amaze.filemanager.activities.superclasses;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.amaze.filemanager.R;
import com.amaze.filemanager.fragments.preference_fragments.PreferencesConstants;
import com.amaze.filemanager.ui.colors.ColorPreferenceHelper;
import com.amaze.filemanager.ui.colors.UserColorPreferences;
import com.amaze.filemanager.ui.dialogs.ColorPickerDialog;
import com.amaze.filemanager.ui.dialogs.GeneralDialogCreation;
import com.amaze.filemanager.utils.theme.AppTheme;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by arpitkh996 on 03-03-2016.
 */
public class ThemedActivity extends PreferenceActivity {

    private HashMap<String, HashMap<AppTheme, Integer>> themes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // checking if theme should be set light/dark or automatic
        int colorPickerPref = getPrefs().getInt(PreferencesConstants.PREFERENCE_COLOR_CONFIG, ColorPickerDialog.NO_DATA);
        if (colorPickerPref == ColorPickerDialog.RANDOM_INDEX) {
            getColorPreference().saveColorPreferences(getPrefs(), ColorPreferenceHelper.randomize(this));
        }
        SetThemeMap();

        setTheme();
    }


    public UserColorPreferences getCurrentColorPreference() {
        return getColorPreference().getCurrentUserColorPreferences(this, getPrefs());
    }

    public @ColorInt
    int getAccent() {
        return getColorPreference().getCurrentUserColorPreferences(this, getPrefs()).accent;
    }
    private void SetThemeMap() {

        themes = new HashMap<>();

        HashMap<AppTheme, Integer> red = new HashMap<>();
        HashMap<AppTheme, Integer> pink = new HashMap<>();
        HashMap<AppTheme, Integer> purple = new HashMap<>();
        HashMap<AppTheme, Integer> deep_purple = new HashMap<>();
        HashMap<AppTheme, Integer> indigo = new HashMap<>();
        HashMap<AppTheme, Integer> blue = new HashMap<>();
        HashMap<AppTheme, Integer> light_blue = new HashMap<>();
        HashMap<AppTheme, Integer> cyan = new HashMap<>();
        HashMap<AppTheme, Integer> teal = new HashMap<>();
        HashMap<AppTheme, Integer> green = new HashMap<>();
        HashMap<AppTheme, Integer> light_green = new HashMap<>();
        HashMap<AppTheme, Integer> amber = new HashMap<>();
        HashMap<AppTheme, Integer> orange = new HashMap<>();
        HashMap<AppTheme, Integer> deep_orange = new HashMap<>();
        HashMap<AppTheme, Integer> brown = new HashMap<>();
        HashMap<AppTheme, Integer> black = new HashMap<>();
        HashMap<AppTheme, Integer> blue_grey = new HashMap<>();
        HashMap<AppTheme, Integer> super_su = new HashMap<>();


        red.put(AppTheme.LIGHT, R.style.pref_accent_light_red);
        red.put(AppTheme.BLACK, R.style.pref_accent_black_red);
        red.put(AppTheme.DARK, R.style.pref_accent_dark_red);

        pink.put(AppTheme.LIGHT, R.style.pref_accent_light_pink);
        pink.put(AppTheme.BLACK, R.style.pref_accent_black_pink);
        pink.put(AppTheme.DARK, R.style.pref_accent_dark_pink);

        purple.put(AppTheme.LIGHT, R.style.pref_accent_light_purple);
        purple.put(AppTheme.BLACK, R.style.pref_accent_black_purple);
        purple.put(AppTheme.DARK, R.style.pref_accent_dark_purple);

        deep_purple.put(AppTheme.LIGHT, R.style.pref_accent_light_deep_purple);
        deep_purple.put(AppTheme.BLACK, R.style.pref_accent_black_deep_purple);
        deep_purple.put(AppTheme.DARK, R.style.pref_accent_dark_deep_purple);

        indigo.put(AppTheme.LIGHT, R.style.pref_accent_light_indigo);
        indigo.put(AppTheme.BLACK, R.style.pref_accent_black_indigo);
        indigo.put(AppTheme.DARK, R.style.pref_accent_dark_indigo);

        blue.put(AppTheme.LIGHT, R.style.pref_accent_light_blue);
        blue.put(AppTheme.BLACK, R.style.pref_accent_black_blue);
        blue.put(AppTheme.DARK, R.style.pref_accent_dark_blue);

        light_blue.put(AppTheme.LIGHT, R.style.pref_accent_light_light_blue);
        light_blue.put(AppTheme.BLACK, R.style.pref_accent_black_light_blue);
        light_blue.put(AppTheme.DARK, R.style.pref_accent_dark_light_blue);


        cyan.put(AppTheme.LIGHT, R.style.pref_accent_light_cyan);
        cyan.put(AppTheme.BLACK, R.style.pref_accent_black_cyan);
        cyan.put(AppTheme.DARK, R.style.pref_accent_dark_cyan);


        teal.put(AppTheme.LIGHT, R.style.pref_accent_light_teal);
        teal.put(AppTheme.BLACK, R.style.pref_accent_black_teal);
        teal.put(AppTheme.DARK, R.style.pref_accent_dark_teal);


        green.put(AppTheme.LIGHT, R.style.pref_accent_light_green);
        green.put(AppTheme.BLACK, R.style.pref_accent_black_green);
        green.put(AppTheme.DARK, R.style.pref_accent_dark_green);


        light_green.put(AppTheme.LIGHT, R.style.pref_accent_light_light_green);
        light_green.put(AppTheme.BLACK, R.style.pref_accent_black_light_green);
        light_green.put(AppTheme.DARK, R.style.pref_accent_dark_light_green);


        amber.put(AppTheme.LIGHT, R.style.pref_accent_light_amber);
        amber.put(AppTheme.BLACK, R.style.pref_accent_black_amber);
        amber.put(AppTheme.DARK, R.style.pref_accent_dark_amber);


        orange.put(AppTheme.LIGHT, R.style.pref_accent_light_orange);
        orange.put(AppTheme.BLACK, R.style.pref_accent_black_orange);
        orange.put(AppTheme.DARK, R.style.pref_accent_dark_orange);


        deep_orange.put(AppTheme.LIGHT, R.style.pref_accent_light_deep_orange);
        deep_orange.put(AppTheme.BLACK, R.style.pref_accent_black_deep_orange);
        deep_orange.put(AppTheme.DARK, R.style.pref_accent_dark_deep_orange);


        brown.put(AppTheme.LIGHT, R.style.pref_accent_light_brown);
        brown.put(AppTheme.BLACK, R.style.pref_accent_black_brown);
        brown.put(AppTheme.DARK, R.style.pref_accent_dark_brown);


        black.put(AppTheme.LIGHT, R.style.pref_accent_light_black);
        black.put(AppTheme.BLACK, R.style.pref_accent_black_black);
        black.put(AppTheme.DARK, R.style.pref_accent_dark_black);


        blue_grey.put(AppTheme.LIGHT, R.style.pref_accent_light_blue_grey);
        blue_grey.put(AppTheme.BLACK, R.style.pref_accent_black_blue_grey);
        blue_grey.put(AppTheme.DARK, R.style.pref_accent_dark_blue_grey);


        super_su.put(AppTheme.LIGHT, R.style.pref_accent_light_super_su);
        super_su.put(AppTheme.BLACK, R.style.pref_accent_black_super_su);
        super_su.put(AppTheme.DARK, R.style.pref_accent_dark_super_su);


        themes.put("#F44336", red);
        themes.put("#E91E63", pink);
        themes.put("#9C27B0", purple);
        themes.put("#673AB7", deep_purple);
        themes.put("#3F51B5", indigo);
        themes.put("#2196F3", blue);
        themes.put("#03A9F4", light_blue);
        themes.put("#00BCD4", cyan);
        themes.put("#009688", teal);
        themes.put("#4CAF50", green);
        themes.put("#8BC34A", light_green);
        themes.put("#FFC107", amber);
        themes.put("#FF9800", orange);
        themes.put("#FF5722", deep_orange);
        themes.put("#795548", brown);
        themes.put("#212121", black);
        themes.put("#607D8B", blue_grey);
        themes.put("#004D40", super_su);

    }



    private void setTheme() {
        AppTheme theme = getAppTheme().getSimpleTheme();
        if (Build.VERSION.SDK_INT >= 21) {

            String stringRepresentation = String.format("#%06X", (0xFFFFFF & getAccent()));
            setTheme(themes.get(stringRepresentation).get(theme));

        } else {
            if (theme.equals(AppTheme.LIGHT)) {
                setTheme(R.style.appCompatLight);
            } else if (theme.equals(AppTheme.BLACK)) {
                setTheme(R.style.appCompatBlack);
            } else {
                setTheme(R.style.appCompatDark);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        setTheme();
    }

}