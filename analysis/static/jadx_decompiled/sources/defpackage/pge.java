package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class pge extends FrameLayout implements wge {
    public final /* synthetic */ xge a;

    public pge(Context context) {
        super(context);
        this.a = new xge();
    }

    @Override // defpackage.wge
    public final void a() {
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // defpackage.wge
    public k56 getOnRequestInterceptTouchEvent() {
        return this.a.b;
    }

    @Override // defpackage.wge
    public m56 getOnTouch() {
        return this.a.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m56 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onInterceptTouchEvent(motionEvent)).booleanValue();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m56 onTouch = this.a.getOnTouch();
        return (onTouch != null ? ((Boolean) onTouch.invoke(motionEvent)).booleanValue() : false) || Boolean.valueOf(super.onTouchEvent(motionEvent)).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }

    @Override // defpackage.wge
    public void setOnRequestInterceptTouchEvent(k56 k56Var) {
        this.a.b = k56Var;
    }

    @Override // defpackage.wge
    public void setOnTouch(m56 m56Var) {
        this.a.a = m56Var;
    }
}
