package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import defpackage.ma6;
import defpackage.q00;
import defpackage.rq7;
import defpackage.ssc;
import one.me.sdk.zoom.ZoomableDraweeView;

/* loaded from: classes2.dex */
public class LocalPhotoView extends ZoomableDraweeView {
    public static final /* synthetic */ int I0 = 0;
    public final GestureDetector G0;
    public rq7 H0;

    public LocalPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new q00(12, this));
        this.G0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        ma6 ma6Var = new ma6(getResources());
        ma6Var.l = ssc.o;
        ma6Var.b = 0;
        setHierarchy(ma6Var.a());
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // one.me.sdk.zoom.ZoomableDraweeView, defpackage.uq4, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.G0.onTouchEvent(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setListener(rq7 rq7Var) {
        this.H0 = rq7Var;
    }
}
