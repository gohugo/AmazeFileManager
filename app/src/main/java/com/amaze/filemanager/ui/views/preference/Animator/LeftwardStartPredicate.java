package com.amaze.filemanager.ui.views.preference.Animator;

/**
 * A predicate used to start an animation then a given value is less than a threshold
 */
public class LeftwardStartPredicate extends StartPredicate {

    public LeftwardStartPredicate(float thresholdValue) {
        super(thresholdValue);
    }

    public boolean shouldStart(float currentValue) {
        return currentValue < thresholdValue;
    }
}
