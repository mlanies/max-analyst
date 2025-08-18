package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class fp6 extends mne {
    public final /* synthetic */ cc1 e;
    public final /* synthetic */ boolean f = false;
    public final /* synthetic */ ded g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp6(String str, cc1 cc1Var, ded dedVar) {
        super(str, true);
        this.e = cc1Var;
        this.g = dedVar;
    }

    @Override // defpackage.mne
    public final long a() {
        int i;
        long jA;
        rp6[] rp6VarArr;
        cc1 cc1Var = this.e;
        boolean z = this.f;
        ded dedVar = this.g;
        mec mecVar = new mec();
        synchronized (((kp6) cc1Var.c).J0) {
            synchronized (((kp6) cc1Var.c)) {
                try {
                    ded dedVar2 = ((kp6) cc1Var.c).D0;
                    if (!z) {
                        ded dedVar3 = new ded();
                        for (int i2 = 0; i2 < 10; i2++) {
                            if (((1 << i2) & dedVar2.a) != 0) {
                                dedVar3.b(i2, dedVar2.b[i2]);
                            }
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & dedVar.a) != 0) {
                                dedVar3.b(i3, dedVar.b[i3]);
                            }
                        }
                        dedVar = dedVar3;
                    }
                    mecVar.a = dedVar;
                    jA = dedVar.a() - dedVar2.a();
                    if (jA == 0 || ((kp6) cc1Var.c).c.isEmpty()) {
                        rp6VarArr = null;
                    } else {
                        Object[] array = ((kp6) cc1Var.c).c.values().toArray(new rp6[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        rp6VarArr = (rp6[]) array;
                    }
                    kp6 kp6Var = (kp6) cc1Var.c;
                    kp6Var.D0 = (ded) mecVar.a;
                    kp6Var.v0.c(new dp6(((kp6) cc1Var.c).o + " onSettings", cc1Var, mecVar), 0L);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ((kp6) cc1Var.c).J0.a((ded) mecVar.a);
            } catch (IOException e) {
                ((kp6) cc1Var.c).a(2, 2, e);
            }
        }
        rp6[] rp6VarArr2 = rp6VarArr;
        if (rp6VarArr2 == null) {
            return -1L;
        }
        for (rp6 rp6Var : rp6VarArr2) {
            synchronized (rp6Var) {
                rp6Var.d += jA;
                if (jA > 0) {
                    rp6Var.notifyAll();
                }
            }
        }
        return -1L;
    }
}
