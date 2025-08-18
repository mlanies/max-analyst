package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class oj8 implements nh8 {
    public final kr6 a;

    public oj8(kr6 kr6Var) {
        this.a = kr6Var;
    }

    @Override // defpackage.nh8
    public final void b(int i) {
        this.a.b(i);
    }

    @Override // defpackage.nh8
    public final void e(int i, m4b m4bVar, k3b k3bVar, boolean z, boolean z2, int i2) {
        Bundle bundleT;
        fm9.k(i2 != 0);
        boolean z3 = z || !k3bVar.a(17);
        boolean z4 = z2 || !k3bVar.a(30);
        kr6 kr6Var = this.a;
        if (i2 < 2) {
            kr6Var.q0(i, m4bVar.q(k3bVar, z, true).t(i2), z3);
            return;
        }
        m4b m4bVarQ = m4bVar.q(k3bVar, z, z2);
        if (kr6Var instanceof ga8) {
            bundleT = new Bundle();
            bundleT.putBinder(m4b.l0, new l4b(m4bVarQ));
        } else {
            bundleT = m4bVarQ.t(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(k4b.d, z3);
        bundle.putBoolean(k4b.e, z4);
        kr6Var.H(i, bundleT, bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != oj8.class) {
            return false;
        }
        return oaf.a(this.a.asBinder(), ((oj8) obj).a.asBinder());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 != 4) goto L26;
     */
    @Override // defpackage.nh8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r8, defpackage.wf7 r9) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = defpackage.wf7.g
            int r2 = r9.a
            r0.putInt(r1, r2)
            java.lang.String r1 = defpackage.wf7.h
            long r2 = r9.b
            r0.putLong(r1, r2)
            oc8 r1 = r9.e
            if (r1 == 0) goto L3d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = defpackage.oc8.e
            android.os.Bundle r4 = r1.a
            r2.putBundle(r3, r4)
            java.lang.String r3 = defpackage.oc8.f
            boolean r4 = r1.b
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.oc8.g
            boolean r4 = r1.c
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.oc8.h
            boolean r1 = r1.d
            r2.putBoolean(r3, r1)
            java.lang.String r1 = defpackage.wf7.i
            r0.putBundle(r1, r2)
        L3d:
            iad r1 = r9.f
            if (r1 == 0) goto L4a
            android.os.Bundle r1 = r1.b()
            java.lang.String r2 = defpackage.wf7.l
            r0.putBundle(r2, r1)
        L4a:
            java.lang.String r1 = defpackage.wf7.k
            int r2 = r9.d
            r0.putInt(r1, r2)
            java.lang.Object r9 = r9.c
            if (r9 != 0) goto L56
            goto L99
        L56:
            r1 = 1
            if (r2 == r1) goto L9f
            java.lang.String r1 = defpackage.wf7.j
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L90
            r3 = 3
            if (r2 == r3) goto L66
            r9 = 4
            if (r2 == r9) goto L9f
            goto L99
        L66:
            pu0 r2 = new pu0
            zw6 r9 = (defpackage.zw6) r9
            ww6 r3 = defpackage.zw6.i()
            r5 = r4
        L6f:
            int r6 = r9.size()
            if (r5 >= r6) goto L85
            java.lang.Object r6 = r9.get(r5)
            tb8 r6 = (defpackage.tb8) r6
            android.os.Bundle r6 = r6.d(r4)
            r3.a(r6)
            int r5 = r5 + 1
            goto L6f
        L85:
            ffc r9 = r3.j()
            r2.<init>(r9)
            r0.putBinder(r1, r2)
            goto L99
        L90:
            tb8 r9 = (defpackage.tb8) r9
            android.os.Bundle r9 = r9.d(r4)
            r0.putBundle(r1, r9)
        L99:
            kr6 r7 = r7.a
            r7.M(r8, r0)
            return
        L9f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj8.f(int, wf7):void");
    }

    @Override // defpackage.nh8
    public final void h(int i, k3b k3bVar) {
        this.a.A(i, k3bVar.f());
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // defpackage.nh8
    public final void j(int i, sad sadVar) {
        this.a.F0(i, sadVar.b());
    }

    @Override // defpackage.nh8
    public final void k(int i, qad qadVar, boolean z, boolean z2, int i2) {
        this.a.D(i, qadVar.a(z, z2).c(i2));
    }

    @Override // defpackage.nh8
    public final void onDisconnected() {
        this.a.c(0);
    }
}
