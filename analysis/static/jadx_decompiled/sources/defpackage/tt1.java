package defpackage;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class tt1 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu1 b;

    public /* synthetic */ tt1(fu1 fu1Var, int i) {
        this.a = i;
        this.b = fu1Var;
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        int i = this.a;
        fu1 fu1Var = this.b;
        fu1Var.getClass();
        switch (i) {
            case 0:
                try {
                    fu1Var.c.execute(new wt1(fu1Var, 1, lq1Var));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    lq1Var.d(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                try {
                    ArrayList arrayList = new ArrayList(fu1Var.a.m().b().c);
                    arrayList.add((nw1) fu1Var.I0.Y);
                    arrayList.add(new xt1(fu1Var, lq1Var));
                    dx1 dx1Var = fu1Var.b;
                    dx1Var.a.Z(fu1Var.t0.a, fu1Var.c, xfg.g(arrayList));
                    return "configAndCloseTask";
                } catch (CameraAccessExceptionCompat | SecurityException e) {
                    e.getMessage();
                    fu1Var.toString();
                    lq1Var.d(e);
                    return "configAndCloseTask";
                }
        }
    }
}
