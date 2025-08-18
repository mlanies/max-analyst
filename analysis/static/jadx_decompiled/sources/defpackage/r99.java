package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r99 extends vj0 implements Handler.Callback {
    public final ob6 C0;
    public final o75 D0;
    public final Handler E0;
    public final k99 F0;
    public nd7 G0;
    public boolean H0;
    public boolean I0;
    public long J0;
    public f99 K0;
    public long L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r99(o75 o75Var, Looper looper) {
        Handler handler;
        super(5);
        ob6 ob6Var = ob6.X;
        this.D0 = o75Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = oaf.a;
            handler = new Handler(looper, this);
        }
        this.E0 = handler;
        this.C0 = ob6Var;
        this.F0 = new k99(1);
        this.L0 = -9223372036854775807L;
    }

    @Override // defpackage.vj0
    public final int D(qy5 qy5Var) {
        if (this.C0.n(qy5Var)) {
            return vj0.b(qy5Var.K == 0 ? 4 : 2, 0, 0, 0);
        }
        return vj0.b(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.f99 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            d99[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            qy5 r2 = r2.k()
            if (r2 == 0) goto L3e
            ob6 r3 = r5.C0
            boolean r4 = r3.n(r2)
            if (r4 == 0) goto L3e
            nd7 r2 = r3.c(r2)
            r1 = r1[r0]
            byte[] r1 = r1.o()
            r1.getClass()
            k99 r3 = r5.F0
            r3.v()
            int r4 = r1.length
            r3.x(r4)
            java.nio.ByteBuffer r4 = r3.X
            r4.put(r1)
            r3.y()
            f99 r1 = r2.m(r3)
            if (r1 == 0) goto L43
            r5.F(r1, r7)
            goto L43
        L3e:
            r1 = r1[r0]
            r7.add(r1)
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r99.F(f99, java.util.ArrayList):void");
    }

    public final long G(long j) {
        fm9.k(j != -9223372036854775807L);
        fm9.k(this.L0 != -9223372036854775807L);
        return j - this.L0;
    }

    public final void H(f99 f99Var) {
        o75 o75Var = this.D0;
        u75 u75Var = o75Var.a;
        ed8 ed8VarA = u75Var.q1.a();
        int i = 0;
        while (true) {
            d99[] d99VarArr = f99Var.a;
            if (i >= d99VarArr.length) {
                break;
            }
            d99VarArr[i].w(ed8VarA);
            i++;
        }
        u75Var.q1 = ed8VarA.a();
        gd8 gd8VarB2 = u75Var.b2();
        boolean zEquals = gd8VarB2.equals(u75Var.Y0);
        pm7 pm7Var = u75Var.x0;
        if (!zEquals) {
            u75Var.Y0 = gd8VarB2;
            pm7Var.c(14, new q64(18, o75Var));
        }
        pm7Var.c(28, new q64(20, f99Var));
        pm7Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        H((f99) message.obj);
        return true;
    }

    @Override // defpackage.vj0
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // defpackage.vj0
    public final boolean m() {
        return this.I0;
    }

    @Override // defpackage.vj0
    public final boolean o() {
        return true;
    }

    @Override // defpackage.vj0
    public final void p() {
        this.K0 = null;
        this.G0 = null;
        this.L0 = -9223372036854775807L;
    }

    @Override // defpackage.vj0
    public final void r(long j, boolean z) {
        this.K0 = null;
        this.H0 = false;
        this.I0 = false;
    }

    @Override // defpackage.vj0
    public final void x(qy5[] qy5VarArr, long j, long j2) {
        this.G0 = this.C0.c(qy5VarArr[0]);
        f99 f99Var = this.K0;
        if (f99Var != null) {
            long j3 = this.L0;
            long j4 = f99Var.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                f99Var = new f99(j5, f99Var.a);
            }
            this.K0 = f99Var;
        }
        this.L0 = j2;
    }

    @Override // defpackage.vj0
    public final void z(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.H0 && this.K0 == null) {
                k99 k99Var = this.F0;
                k99Var.v();
                y7g y7gVar = this.c;
                y7gVar.t();
                int iY = y(y7gVar, k99Var, 0);
                if (iY == -4) {
                    if (k99Var.f(4)) {
                        this.H0 = true;
                    } else if (k99Var.Z >= this.w0) {
                        k99Var.v0 = this.J0;
                        k99Var.y();
                        nd7 nd7Var = this.G0;
                        int i = oaf.a;
                        f99 f99VarM = nd7Var.m(k99Var);
                        if (f99VarM != null) {
                            ArrayList arrayList = new ArrayList(f99VarM.a.length);
                            F(f99VarM, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.K0 = new f99(G(k99Var.Z), (d99[]) arrayList.toArray(new d99[0]));
                            }
                        }
                    }
                } else if (iY == -5) {
                    qy5 qy5Var = (qy5) y7gVar.c;
                    qy5Var.getClass();
                    this.J0 = qy5Var.s;
                }
            }
            f99 f99Var = this.K0;
            if (f99Var == null || f99Var.b > G(j)) {
                z = false;
            } else {
                f99 f99Var2 = this.K0;
                Handler handler = this.E0;
                if (handler != null) {
                    handler.obtainMessage(1, f99Var2).sendToTarget();
                } else {
                    H(f99Var2);
                }
                this.K0 = null;
                z = true;
            }
            if (this.H0 && this.K0 == null) {
                this.I0 = true;
            }
        }
    }
}
