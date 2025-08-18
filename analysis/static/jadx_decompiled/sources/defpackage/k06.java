package defpackage;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class k06 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public j06 X;
    public j06 Y;
    public boolean Z;
    public final float a;
    public final int b;
    public final int c;
    public final View o;
    public int s0;
    public final int[] t0 = new int[2];

    public k06(View view) {
        this.o = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        j06 j06Var = this.Y;
        View view = this.o;
        if (j06Var != null) {
            view.removeCallbacks(j06Var);
        }
        j06 j06Var2 = this.X;
        if (j06Var2 != null) {
            view.removeCallbacks(j06Var2);
        }
    }

    public abstract und b();

    public abstract boolean c();

    public boolean d() {
        und undVarB = b();
        if (undVarB == null || !undVarB.a()) {
            return true;
        }
        undVarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k06.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Z = false;
        this.s0 = -1;
        j06 j06Var = this.X;
        if (j06Var != null) {
            this.o.removeCallbacks(j06Var);
        }
    }
}
