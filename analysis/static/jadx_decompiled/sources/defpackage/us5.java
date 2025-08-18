package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final /* synthetic */ class us5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs5 b;
    public final /* synthetic */ long c;

    public /* synthetic */ us5(int i, long j, xs5 xs5Var) {
        this.a = i;
        this.b = xs5Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xs5 xs5Var = this.b;
                xs5Var.getClass();
                xs5Var.b.execute(new us5(3, this.c, xs5Var));
                break;
            case 1:
                xs5 xs5Var2 = this.b;
                xs5Var2.getClass();
                xs5Var2.b.execute(new us5(2, this.c, xs5Var2));
                break;
            case 2:
                xs5 xs5Var3 = this.b;
                if (this.c == xs5Var3.k) {
                    xs5Var3.b();
                    break;
                }
                break;
            default:
                xs5 xs5Var4 = this.b;
                if (this.c == xs5Var4.k) {
                    xs5Var4.m = false;
                    ScheduledFuture scheduledFuture = xs5Var4.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        xs5Var4.j = null;
                    }
                    lq1 lq1Var = xs5Var4.t;
                    if (lq1Var != null) {
                        lq1Var.b(new ys5(false));
                        xs5Var4.t = null;
                        break;
                    }
                }
                break;
        }
    }
}
