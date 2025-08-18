package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class bud {
    public static final /* synthetic */ bc7[] e = {new oi9(bud.class, "infiniteAnimationJob", "getInfiniteAnimationJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, bud.class, "stateAnimationJob", "getStateAnimationJob()Lkotlinx/coroutines/Job;")};
    public final sx3 a;
    public final je7 b = tu0.r(3, new xid(6));
    public final w4d c = mqd.D();
    public final w4d d = mqd.D();

    public bud(rg7 rg7Var) {
        this.a = rg7Var;
    }

    public static void a(l17 l17Var, int i) {
        if (l17Var == null) {
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(((ptd) l17Var).H0.getCurrentTextColor()), Integer.valueOf(i));
        valueAnimatorOfObject.setDuration(200L);
        valueAnimatorOfObject.addUpdateListener(new vtd(l17Var, 1));
        valueAnimatorOfObject.start();
    }

    public final void b() {
        bc7[] bc7VarArr = e;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.c;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
    }
}
