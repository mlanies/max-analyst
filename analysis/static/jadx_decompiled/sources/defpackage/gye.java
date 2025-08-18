package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class gye extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, cna {
    public final GestureDetector X;
    public final rvd c;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final float o = 25.0f;
    public volatile float Y = 3.1415927f;

    public gye(Context context, rvd rvdVar) {
        this.c = rvdVar;
        this.X = new GestureDetector(context, this);
    }

    @Override // defpackage.cna
    public final void a(float[] fArr, float f) {
        this.Y = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.a.x) / this.o;
        float y = motionEvent2.getY();
        PointF pointF = this.a;
        float f3 = (y - pointF.y) / this.o;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.Y;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        rvd rvdVar = this.c;
        PointF pointF3 = this.b;
        synchronized (rvdVar) {
            float f5 = pointF3.y;
            rvdVar.Z = f5;
            Matrix.setRotateM(rvdVar.X, 0, -f5, (float) Math.cos(rvdVar.s0), (float) Math.sin(rvdVar.s0), 0.0f);
            Matrix.setRotateM(rvdVar.Y, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.v0.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.X.onTouchEvent(motionEvent);
    }
}
