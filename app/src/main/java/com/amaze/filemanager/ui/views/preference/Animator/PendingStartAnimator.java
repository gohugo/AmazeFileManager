package com.amaze.filemanager.ui.views.preference.Animator;

import android.animation.ValueAnimator;

import com.amaze.filemanager.ui.views.Indicator;

/**
 * A {@link ValueAnimator} that starts once a given predicate returns true.
 */
public class PendingStartAnimator extends ValueAnimator {
    protected boolean hasStarted;
    protected StartPredicate predicate;

    public PendingStartAnimator(StartPredicate predicate) {
        super();
        this.predicate = predicate;
        hasStarted = false;
    }

    public void startIfNecessary(float currentValue) {
        if (!hasStarted && predicate.shouldStart(currentValue)) {
            start();
            hasStarted = true;
        }
    }
}
