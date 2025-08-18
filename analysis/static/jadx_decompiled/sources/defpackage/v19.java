package defpackage;

import java.util.Collections;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class v19 {
    public final av0 a;
    public final long b;
    public final kld c;
    public final ContextScope d;
    public final v7c e;

    public v19(long j, av0 av0Var, kke kkeVar) {
        this.a = av0Var;
        this.b = j;
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.c = kldVarB;
        this.d = j1e.a(((w9a) kkeVar).c().getImmediate());
        av0Var.d(this);
        this.e = new v7c(kldVarB);
    }

    @uae
    public final void onEvent(mna mnaVar) {
        if (mnaVar.b != this.b) {
            return;
        }
        j47.T(this.d, null, null, new u19(this, new su8(Collections.singleton(Long.valueOf(mnaVar.o)), true), null), 3);
    }

    @uae
    public final void onEvent(kz6 kz6Var) {
        if (kz6Var.b != this.b) {
            return;
        }
        j47.T(this.d, null, null, new u19(this, new su8(Collections.singleton(Long.valueOf(kz6Var.c)), false), null), 3);
    }

    @uae
    public final void onEvent(l6f l6fVar) {
        if (l6fVar.b != this.b) {
            return;
        }
        j47.T(this.d, null, null, new u19(this, new xu8(Collections.singleton(Long.valueOf(l6fVar.c))), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @defpackage.uae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(defpackage.re9 r7) {
        /*
            r6 = this;
            long r0 = r7.b
            long r2 = r6.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L9
            return
        L9:
            long r0 = r7.c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L1e
            long r4 = r7.o
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L1e
            wu8 r7 = new wu8
            r7.<init>(r0, r4)
            goto L30
        L1e:
            java.util.List r7 = r7.X
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2f
            vu8 r0 = new vu8
            r0.<init>(r7)
            r7 = r0
            goto L30
        L2f:
            r7 = r3
        L30:
            if (r7 == 0) goto L3d
            u19 r0 = new u19
            r0.<init>(r6, r7, r3)
            r7 = 3
            kotlinx.coroutines.internal.ContextScope r6 = r6.d
            defpackage.j47.T(r6, r3, r3, r0, r7)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v19.onEvent(re9):void");
    }

    @uae
    public final void onEvent(ut7 ut7Var) {
        if (ut7Var.X.d(this.b)) {
            j47.T(this.d, null, null, new u19(this, uu8.a, null), 3);
        }
    }

    @uae
    public final void onEvent(vz2 vz2Var) {
        if (vz2Var.b.contains(Long.valueOf(this.b))) {
            j47.T(this.d, null, null, new u19(this, new tu8(), null), 3);
        }
    }
}
