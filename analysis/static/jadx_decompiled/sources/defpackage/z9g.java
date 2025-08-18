package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class z9g implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;
    public final /* synthetic */ gag c;

    public /* synthetic */ z9g(od odVar, sa0 sa0Var, int i) {
        this.a = i;
        this.b = odVar;
        this.c = sa0Var;
    }

    @Override // defpackage.mq1
    public final String q(final lq1 lq1Var) {
        switch (this.a) {
            case 0:
                final od odVar = this.b;
                odVar.getClass();
                final gag gagVar = this.c;
                final int i = 0;
                ((Executor) odVar.c).execute(new Runnable() { // from class: aag
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                odVar.f(lq1Var, gagVar);
                                break;
                            default:
                                odVar.f(lq1Var, gagVar);
                                break;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final od odVar2 = this.b;
                odVar2.getClass();
                final gag gagVar2 = this.c;
                final int i2 = 1;
                ((Executor) odVar2.c).execute(new Runnable() { // from class: aag
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                odVar2.f(lq1Var, gagVar2);
                                break;
                            default:
                                odVar2.f(lq1Var, gagVar2);
                                break;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}
