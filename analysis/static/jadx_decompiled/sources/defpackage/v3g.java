package defpackage;

import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class v3g extends WebView {
    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
