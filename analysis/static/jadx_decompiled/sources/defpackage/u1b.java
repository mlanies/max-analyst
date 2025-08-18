package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class u1b implements x1b {
    public float X;
    public w1b Y = w1b.e;
    public final View a;
    public final vg1 b;
    public final aa1 c;
    public float o;

    public u1b(View view, wd6 wd6Var, aa1 aa1Var) {
        this.a = view;
        this.b = wd6Var;
        this.c = aa1Var;
    }

    public final void a() {
        View view = this.a;
        float translationX = view.getTranslationX();
        float translationX2 = this.Y.a;
        if (translationX >= translationX2) {
            float translationX3 = view.getTranslationX();
            translationX2 = this.Y.b;
            if (translationX3 <= translationX2) {
                translationX2 = view.getTranslationX();
            }
        }
        float translationY = view.getTranslationY();
        float translationY2 = this.Y.c;
        if (translationY >= translationY2) {
            float translationY3 = view.getTranslationY();
            translationY2 = this.Y.d;
            if (translationY3 <= translationY2) {
                translationY2 = view.getTranslationY();
            }
        }
        if (translationX2 == view.getTranslationX() && translationY2 == view.getTranslationY()) {
            b();
        } else {
            view.animate().setDuration(200L).translationX(translationX2).translationY(translationY2).setListener(new mf(6, this)).start();
        }
    }

    public final void b() {
        View view = this.a;
        float x = view.getX();
        float y = view.getY();
        PointF pointF = ((ba1) this.c).b;
        pointF.x = x;
        pointF.y = y;
    }

    @Override // defpackage.x1b
    public final boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view = this.a;
        if (action == 0) {
            this.o = motionEvent.getRawX();
            this.X = motionEvent.getRawY();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            return motionEvent.getAction() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() < 100;
        }
        if (action2 != 2) {
            if (action2 != 3) {
                return true;
            }
            a();
            return true;
        }
        view.setTranslationX((motionEvent.getRawX() - this.o) + view.getTranslationX());
        view.setTranslationY((motionEvent.getRawY() - this.X) + view.getTranslationY());
        this.o = motionEvent.getRawX();
        this.X = motionEvent.getRawY();
        this.b.T(view.getX(), view.getY());
        return true;
    }

    @Override // defpackage.x1b
    public final void i(float f, float f2) {
        View view = this.a;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        a();
    }

    @Override // defpackage.x1b
    public final void j(float f, float f2, int i, int i2, j1b j1bVar) {
        this.Y = kq0.d(this.a.getContext(), f, f2, i, i2, j1bVar);
    }
}
