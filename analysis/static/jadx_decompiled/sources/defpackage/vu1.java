package defpackage;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class vu1 implements mq1, wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu1 b;

    public /* synthetic */ vu1(xu1 xu1Var, int i) {
        this.a = i;
        this.b = xu1Var;
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        switch (this.a) {
            case 1:
                xs5 xs5Var = this.b.a.h;
                return st1.t(xs5Var.a.e, 5) != 5 ? dw6.c : f8.g(new fe4(xs5Var, true, 1));
            case 2:
                xu1 xu1Var = this.b;
                xu1Var.getClass();
                return f8.g(new vu1(xu1Var, 0));
            case 3:
                xs5 xs5Var2 = this.b.a.h;
                xs5Var2.getClass();
                return f8.g(new q64(28, xs5Var2));
            default:
                un0 un0Var = new un0(12);
                xu1 xu1Var2 = this.b;
                ScheduledExecutorService scheduledExecutorService = xu1Var2.c;
                long millis = TimeUnit.NANOSECONDS.toMillis(xu1.f);
                uu1 uu1Var = new uu1(un0Var);
                st1 st1Var = xu1Var2.a;
                st1Var.p(uu1Var);
                wt1 wt1Var = new wt1(st1Var, 4, uu1Var);
                oq1 oq1Var = uu1Var.b;
                oq1Var.b.d(wt1Var, st1Var.c);
                return f8.g(new vg4(oq1Var, scheduledExecutorService, millis));
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        xu1 xu1Var = this.b;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) xu1Var.e.b;
        boolean z = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(st1.t(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5)) {
                z = true;
            }
        }
        if (!z) {
            lq1Var.b(null);
            return "EnableTorchInternal";
        }
        xu1Var.a.r(true);
        lq1Var.b(null);
        return "EnableTorchInternal";
    }
}
