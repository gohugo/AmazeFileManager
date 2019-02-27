package com.amaze.filemanager.ui.views.preference.Animator;

import com.amaze.filemanager.ui.views.Indicator;

/**
 * A predicate used to start an animation when a test passes
 */
 public abstract class StartPredicate {
    protected float thresholdValue;

    StartPredicate(float thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    public boolean shouldStart(float currentValue) {
        return currentValue > thresholdValue;
    }

}



