package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class rof extends RecyclerView {
    public final /* synthetic */ ViewPager2 V1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rof(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.V1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.V1.H0.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.V1;
        accessibilityEvent.setFromIndex(viewPager2.o);
        accessibilityEvent.setToIndex(viewPager2.o);
        accessibilityEvent.setSource((ViewPager2) viewPager2.H0.X);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.V1.F0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.V1.F0 && super.onTouchEvent(motionEvent);
    }
}
