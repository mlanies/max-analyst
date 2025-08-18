package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class fi8 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ii8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi8(ii8 ii8Var, Looper looper) {
        super(looper);
        this.c = ii8Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = false;
        this.a = this.a && z;
        if (this.b && z2) {
            z3 = true;
        }
        this.b = z3;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        oh8 oh8Var;
        int i;
        zw6 zw6Var;
        int i2;
        k3b k3bVarR;
        nh8 nh8Var;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        ii8 ii8Var = this.c;
        m4b m4bVarN = ii8Var.r.n(ii8Var.s.c0(), ii8Var.s.K(), ii8Var.r.k);
        ii8Var.r = m4bVarN;
        boolean z = this.a;
        boolean z2 = this.b;
        sj8 sj8Var = ii8Var.g;
        m4b m4bVarG0 = sj8Var.G0(m4bVarN);
        m5d m5dVar = sj8Var.e;
        zw6 zw6VarY = m5dVar.y();
        int i3 = 0;
        while (i3 < zw6VarY.size()) {
            oh8 oh8Var2 = (oh8) zw6VarY.get(i3);
            try {
                cd6 cd6VarB = m5dVar.B(oh8Var2);
                if (cd6VarB != null) {
                    i2 = cd6VarB.i();
                } else {
                    if (!(sj8Var.e.E(oh8Var2) || ii8Var.h.e.E(oh8Var2))) {
                        break;
                    } else {
                        i2 = 0;
                    }
                }
                k3bVarR = j47.R(m5dVar.x(oh8Var2), ii8Var.s.s());
                nh8Var = oh8Var2.d;
                fm9.l(nh8Var);
                oh8Var = oh8Var2;
                i = i3;
                zw6Var = zw6VarY;
            } catch (DeadObjectException unused) {
                oh8Var = oh8Var2;
                i = i3;
                zw6Var = zw6VarY;
            } catch (RemoteException e) {
                e = e;
                oh8Var = oh8Var2;
                i = i3;
                zw6Var = zw6VarY;
            }
            try {
                nh8Var.e(i2, m4bVarG0, k3bVarR, z, z2, oh8Var2.c);
            } catch (DeadObjectException unused2) {
                sj8Var.e.L(oh8Var);
                i3 = i + 1;
                zw6VarY = zw6Var;
            } catch (RemoteException e2) {
                e = e2;
                z04.d0("Exception in " + oh8Var.toString(), e);
                i3 = i + 1;
                zw6VarY = zw6Var;
            }
            i3 = i + 1;
            zw6VarY = zw6Var;
        }
        this.a = true;
        this.b = true;
    }
}
