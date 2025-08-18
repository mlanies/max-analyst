package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q99 extends uj0 implements Handler.Callback {
    public final j99 A0;
    public j47 B0;
    public boolean C0;
    public boolean D0;
    public long E0;
    public long F0;
    public e99 G0;
    public final vu4 x0;
    public final n75 y0;
    public final Handler z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q99(n75 n75Var, Looper looper) {
        Handler handler;
        super(5);
        vu4 vu4Var = vu4.o;
        this.y0 = n75Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = maf.a;
            handler = new Handler(looper, this);
        }
        this.z0 = handler;
        this.x0 = vu4Var;
        this.A0 = new j99(1);
        this.F0 = -9223372036854775807L;
    }

    @Override // defpackage.uj0
    public final int A(oy5 oy5Var) {
        if (this.x0.r(oy5Var)) {
            return uj0.b(oy5Var.P0 == 0 ? 4 : 2, 0, 0);
        }
        return uj0.b(0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.e99 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            c99[] r1 = r6.a
            int r2 = r1.length
            if (r0 >= r2) goto L46
            r2 = r1[r0]
            oy5 r2 = r2.k()
            if (r2 == 0) goto L3e
            vu4 r3 = r5.x0
            boolean r4 = r3.r(r2)
            if (r4 == 0) goto L3e
            j47 r2 = r3.m(r2)
            r1 = r1[r0]
            byte[] r1 = r1.o()
            r1.getClass()
            j99 r3 = r5.A0
            r3.v()
            int r4 = r1.length
            r3.x(r4)
            java.nio.ByteBuffer r4 = r3.o
            r4.put(r1)
            r3.y()
            e99 r1 = r2.v(r3)
            if (r1 == 0) goto L43
            r5.C(r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q99.C(e99, java.util.ArrayList):void");
    }

    public final void D(e99 e99Var) {
        n75 n75Var = this.y0;
        t75 t75Var = n75Var.a;
        dd8 dd8VarA = t75Var.j1.a();
        int i = 0;
        while (true) {
            c99[] c99VarArr = e99Var.a;
            if (i >= c99VarArr.length) {
                break;
            }
            c99VarArr[i].p(dd8VarA);
            i++;
        }
        t75Var.j1 = new fd8(dd8VarA);
        fd8 fd8VarZ1 = t75Var.Z1();
        boolean zEquals = fd8VarZ1.equals(t75Var.V0);
        z23 z23Var = t75Var.x0;
        if (!zEquals) {
            t75Var.V0 = fd8VarZ1;
            z23Var.h(14, new q64(17, n75Var));
        }
        z23Var.h(28, new q64(19, e99Var));
        z23Var.e();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        D((e99) message.obj);
        return true;
    }

    @Override // defpackage.uj0
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // defpackage.uj0
    public final boolean k() {
        return this.D0;
    }

    @Override // defpackage.uj0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.uj0
    public final void m() {
        this.G0 = null;
        this.F0 = -9223372036854775807L;
        this.B0 = null;
    }

    @Override // defpackage.uj0
    public final void o(long j, boolean z) {
        this.G0 = null;
        this.F0 = -9223372036854775807L;
        this.C0 = false;
        this.D0 = false;
    }

    @Override // defpackage.uj0
    public final void s(oy5[] oy5VarArr, long j, long j2) {
        this.B0 = this.x0.m(oy5VarArr[0]);
    }

    @Override // defpackage.uj0
    public final void w(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.C0 && this.G0 == null) {
                j99 j99Var = this.A0;
                j99Var.v();
                imc imcVar = this.b;
                imcVar.N();
                int iV = v(imcVar, j99Var, 0);
                if (iV == -4) {
                    if (j99Var.f(4)) {
                        this.C0 = true;
                    } else {
                        j99Var.u0 = this.E0;
                        j99Var.y();
                        j47 j47Var = this.B0;
                        int i = maf.a;
                        e99 e99VarV = j47Var.v(j99Var);
                        if (e99VarV != null) {
                            ArrayList arrayList = new ArrayList(e99VarV.a.length);
                            C(e99VarV, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.G0 = new e99(arrayList);
                                this.F0 = j99Var.Y;
                            }
                        }
                    }
                } else if (iV == -5) {
                    oy5 oy5Var = (oy5) imcVar.c;
                    oy5Var.getClass();
                    this.E0 = oy5Var.A0;
                }
            }
            e99 e99Var = this.G0;
            if (e99Var == null || this.F0 > j) {
                z = false;
            } else {
                Handler handler = this.z0;
                if (handler != null) {
                    handler.obtainMessage(0, e99Var).sendToTarget();
                } else {
                    D(e99Var);
                }
                this.G0 = null;
                this.F0 = -9223372036854775807L;
                z = true;
            }
            if (this.C0 && this.G0 == null) {
                this.D0 = true;
            }
        }
    }
}
