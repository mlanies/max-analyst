package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class yu1 implements mq1, wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ yu1(zu1 zu1Var, int i) {
        this.a = i;
        this.b = zu1Var;
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        switch (this.a) {
            case 1:
                zu1 zu1Var = this.b;
                if (!zu1Var.f) {
                    return dw6.c;
                }
                xs5 xs5Var = zu1Var.a.h;
                xs5Var.getClass();
                return f8.g(new q64(28, xs5Var));
            default:
                un0 un0Var = new un0(13);
                zu1 zu1Var2 = this.b;
                ScheduledExecutorService scheduledExecutorService = zu1Var2.e;
                long millis = TimeUnit.NANOSECONDS.toMillis(zu1.g);
                uu1 uu1Var = new uu1(un0Var);
                st1 st1Var = zu1Var2.a;
                st1Var.p(uu1Var);
                wt1 wt1Var = new wt1(st1Var, 4, uu1Var);
                oq1 oq1Var = uu1Var.b;
                oq1Var.b.d(wt1Var, st1Var.c);
                return f8.g(new vg4(oq1Var, scheduledExecutorService, millis));
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        this.b.a.j.a(lq1Var, true);
        return "TorchOn";
    }
}
