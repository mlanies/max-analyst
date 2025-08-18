package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class cb5 implements nb5 {
    public static final /* synthetic */ bc7[] i;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public xg1 g;
    public final je7 f = tu0.r(3, new za5(this, 0));
    public final w4d h = mqd.D();

    static {
        oi9 oi9Var = new oi9(cb5.class, "pipStateJob", "getPipStateJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9Var};
    }

    public cb5(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var3;
        this.b = je7Var4;
        this.c = je7Var;
        this.d = je7Var2;
        this.e = je7Var5;
    }

    public final xg1 a(Context context, znc zncVar) {
        xg1 xg1Var = new xg1(context);
        xg1Var.setPipTheme(qp4.u0.p(xg1Var).c);
        xg1Var.setPipMode(ug1.c);
        xg1Var.setApplicationPipDepended(new qz7(this, 18, xg1Var));
        xg1Var.setListener(new ab5(zncVar));
        xg1Var.setVideoLayoutUpdatesControllerProvider(new za5(this, 1));
        return xg1Var;
    }

    public final t1b b() {
        return (t1b) this.f.getValue();
    }

    public final void c(long j) {
        hm9.n("FakePipController", "try to hide local pip");
        xg1 xg1Var = this.g;
        if (xg1Var == null) {
            return;
        }
        if (!ft.l(xg1Var)) {
            hm9.n("FakePipController", "local pip in hidden progress");
            return;
        }
        tg1 tg1Var = (tg1) this.a.getValue();
        String str = ((wr1) ((kr1) this.e.getValue())).k().c;
        w1e w1eVar = (w1e) tg1Var;
        q0e q0eVar = w1eVar.a;
        if (q0eVar.getValue() == v1e.b) {
            w1eVar.a(str, false);
        }
        q0eVar.m(null, v1e.a);
        ft.f(xg1Var, false, j, new ga(this, 13, xg1Var));
    }

    public final void d(Activity activity, znc zncVar) {
        Context context;
        hm9.n("FakePipController", "start preparing local pip");
        try {
            if (this.g != null) {
                hm9.n("FakePipController", "local pip already prepared");
                return;
            }
            xg1 xg1VarA = a(activity, zncVar);
            this.g = xg1VarA;
            xg1VarA.setAlpha(0.0f);
            xg1VarA.d((qma) b().X.a.getValue());
            xg1 xg1Var = this.g;
            WindowManager windowManagerZ = (xg1Var == null || (context = xg1Var.getContext()) == null) ? null : nd7.z(context);
            if (windowManagerZ != null) {
                WindowManager.LayoutParams windowsViewLayoutParams = xg1VarA.getWindowsViewLayoutParams();
                ba1 ba1Var = (ba1) ((aa1) this.b.getValue());
                ba1Var.getClass();
                PointF pointF = ba1Var.b;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                windowsViewLayoutParams.x = (int) pointF2.x;
                windowsViewLayoutParams.y = (int) pointF2.y;
                windowManagerZ.addView(xg1VarA, windowsViewLayoutParams);
            }
            b().c = xg1VarA;
            this.h.o1(this, i[0], j47.T((jr1) this.c.getValue(), ((w9a) ((kke) this.d.getValue())).c(), null, new bb5(this, null), 2));
        } catch (IllegalArgumentException e) {
            hm9.p("FakePipController", "can't prepare local pip", e);
        }
    }
}
