package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class md8 implements Runnable {
    public final /* synthetic */ Bundle X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ue b;
    public final /* synthetic */ a98 c;
    public final /* synthetic */ String o;

    public /* synthetic */ md8(ue ueVar, a98 a98Var, String str, Bundle bundle) {
        this.b = ueVar;
        this.c = a98Var;
        this.o = str;
        this.X = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        y9d y9dVar;
        switch (this.a) {
            case 0:
                ue ueVar = this.b;
                ((ld8) ueVar.d).getClass();
                ((a84) ueVar.g).execute(new md8(ueVar, this.c, this.o, this.X));
                break;
            default:
                this.b.getClass();
                a98 a98Var = this.c;
                a98Var.K();
                z88 z88Var = a98Var.c;
                m5f it = (!z88Var.isConnected() ? z9d.b : z88Var.Q0()).a.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = this.o;
                    if (zHasNext) {
                        y9dVar = (y9d) it.next();
                        if (y9dVar.a != 0 || !y9dVar.b.equals(str)) {
                        }
                    } else {
                        y9dVar = null;
                    }
                }
                if (y9dVar != null) {
                    a98Var.K();
                    z9d z9dVarQ0 = !z88Var.isConnected() ? z9d.b : z88Var.Q0();
                    z9dVarQ0.getClass();
                    if (z9dVarQ0.a.contains(y9dVar)) {
                        y9d y9dVar2 = new y9d(str, this.X);
                        Bundle bundle = Bundle.EMPTY;
                        a98Var.K();
                        bm7 bm7VarS0 = z88Var.isConnected() ? z88Var.S0(y9dVar2, bundle) : fm9.F(new sad(-100));
                        cy4 cy4Var = new cy4();
                        cy4Var.a = str;
                        bm7VarS0.d(new h76(bm7VarS0, 0, cy4Var), nk4.a);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ md8(ue ueVar, qh8 qh8Var, String str, Bundle bundle, a98 a98Var) {
        this.b = ueVar;
        this.o = str;
        this.X = bundle;
        this.c = a98Var;
    }
}
