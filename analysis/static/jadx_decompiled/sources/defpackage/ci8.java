package defpackage;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class ci8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii8 b;

    public /* synthetic */ ci8(ii8 ii8Var, int i) {
        this.a = i;
        this.b = ii8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ii8 ii8Var = this.b;
                gi8 gi8Var = ii8Var.u;
                if (gi8Var != null) {
                    ii8Var.s.r0(gi8Var);
                    return;
                }
                return;
            case 1:
                ii8 ii8Var2 = this.b;
                w4d w4dVar = ii8Var2.v;
                if (w4dVar != null) {
                    ((bj8) w4dVar.b).g(ii8Var2.k, false);
                    return;
                }
                return;
            case 2:
                ii8 ii8Var3 = this.b;
                synchronized (ii8Var3.a) {
                    try {
                        if (ii8Var3.x) {
                            return;
                        }
                        final qad qadVarK = ii8Var3.s.K();
                        if (!ii8Var3.c.hasMessages(1) && j47.f(qadVarK, ii8Var3.r.c)) {
                            m5d m5dVar = ii8Var3.g.e;
                            zw6 zw6VarY = m5dVar.y();
                            for (int i = 0; i < zw6VarY.size(); i++) {
                                final oh8 oh8Var = (oh8) zw6VarY.get(i);
                                final boolean zG = m5dVar.G(oh8Var, 16);
                                final boolean zG2 = m5dVar.G(oh8Var, 17);
                                ii8Var3.b(oh8Var, new hi8() { // from class: di8
                                    @Override // defpackage.hi8
                                    public final void a(nh8 nh8Var, int i2) {
                                        int i3 = oh8Var.c;
                                        nh8Var.k(i2, qadVarK, zG, zG2, i3);
                                    }
                                });
                            }
                            try {
                                ii8Var3.h.h.k(0, qadVarK, true, true, 0);
                            } catch (RemoteException e) {
                                z04.v("Exception in using media1 API", e);
                            }
                        }
                        ii8Var3.t();
                        return;
                    } finally {
                    }
                }
            default:
                this.b.t();
                return;
        }
    }
}
