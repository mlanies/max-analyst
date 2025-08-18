package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class zt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bkb b;

    public /* synthetic */ zt1(bkb bkbVar, int i) {
        this.a = i;
        this.b = bkbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bkb bkbVar = this.b;
                if (!((AtomicBoolean) bkbVar.b).getAndSet(true)) {
                    ((fu1) ((imc) bkbVar.c).c).c.execute(new zt1(bkbVar, 1));
                    break;
                }
                break;
            default:
                bkb bkbVar2 = this.b;
                if (((fu1) ((imc) bkbVar2.c).c).S0 == 8) {
                    ((fu1) ((imc) bkbVar2.c).c).toString();
                    ((fu1) ((imc) bkbVar2.c).c).F(7);
                    ((fu1) ((imc) bkbVar2.c).c).s0.b();
                    break;
                } else {
                    fu1 fu1Var = (fu1) ((imc) bkbVar2.c).c;
                    int i = fu1Var.S0;
                    fu1Var.toString();
                    break;
                }
        }
    }
}
