package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.J0.o) - clockFaceView.R0;
        if (height != clockFaceView.H0) {
            clockFaceView.H0 = height;
            clockFaceView.w();
            int i = clockFaceView.H0;
            ClockHandView clockHandView = clockFaceView.J0;
            clockHandView.z0 = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
