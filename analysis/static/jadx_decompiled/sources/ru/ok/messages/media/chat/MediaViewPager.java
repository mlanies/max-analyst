package ru.ok.messages.media.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.c54;

/* loaded from: classes2.dex */
public class MediaViewPager extends ViewPager {
    public float n1;

    public MediaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.n1 = motionEvent.getX();
        } else if (motionEvent.getAction() == 2 && !c54.K(this) && this.n1 < motionEvent.getX() && getCurrentItem() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
