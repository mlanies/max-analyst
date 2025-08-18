package defpackage;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class fxc extends hla implements in9 {
    public boolean b;

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        this.b = i2 <= 0 && z2;
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 0) {
            this.b = false;
        }
        return zOnTouchEvent;
    }
}
