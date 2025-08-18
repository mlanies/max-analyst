package defpackage;

import android.view.MotionEvent;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class t4b extends SeekBar {
    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
