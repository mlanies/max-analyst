package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.a4;
import defpackage.f4;
import defpackage.ivb;
import defpackage.k4;
import defpackage.l4;

/* loaded from: classes.dex */
public final class c extends a4 {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // defpackage.a4
    public final void d(View view, l4 l4Var) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(ivb.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.N0.get(iIntValue - 1));
        }
        l4Var.i(k4.a(view.isSelected(), 0, 1, iIntValue, 1));
        accessibilityNodeInfo.setClickable(true);
        l4Var.b(f4.e);
    }

    @Override // defpackage.a4
    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.K0);
        float fCenterX = clockFaceView.K0.centerX();
        float fCenterY = clockFaceView.K0.centerY();
        clockFaceView.J0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.J0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
