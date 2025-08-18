package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class l32 implements y66 {
    public final lx3 a;
    public final int b;
    public final int c;

    public l32(lx3 lx3Var, int i, int i2) {
        this.a = lx3Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.mn5
    public Object d(on5 on5Var, Continuation continuation) {
        Object objK = j1e.k(new j32(on5Var, this, null), continuation);
        return objK == tx3.a ? objK : e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // defpackage.y66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mn5 e(defpackage.lx3 r5, int r6, int r7) {
        /*
            r4 = this;
            lx3 r0 = r4.a
            lx3 r5 = r5.plus(r0)
            r1 = 1
            int r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Le
            goto L25
        Le:
            r7 = -3
            if (r3 != r7) goto L12
            goto L24
        L12:
            if (r6 != r7) goto L16
        L14:
            r6 = r3
            goto L24
        L16:
            r7 = -2
            if (r3 != r7) goto L1a
            goto L24
        L1a:
            if (r6 != r7) goto L1d
            goto L14
        L1d:
            int r6 = r6 + r3
            if (r6 < 0) goto L21
            goto L24
        L21:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L24:
            r7 = r2
        L25:
            boolean r0 = defpackage.tpa.f(r5, r0)
            if (r0 == 0) goto L30
            if (r6 != r3) goto L30
            if (r7 != r2) goto L30
            return r4
        L30:
            l32 r4 = r4.k(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l32.e(lx3, int, int):mn5");
    }

    public String h() {
        return null;
    }

    public abstract Object j(iab iabVar, Continuation continuation);

    public abstract l32 k(lx3 lx3Var, int i, int i2);

    public mn5 l() {
        return null;
    }

    public p8c m(sx3 sx3Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        vx3 vx3Var = vx3.c;
        k32 k32Var = new k32(this, null);
        fab fabVar = new fab(v3c.x(sx3Var, this.a), c37.a(i, this.c, 4));
        fabVar.start(vx3Var, fabVar, k32Var);
        return fabVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strH = h();
        if (strH != null) {
            arrayList.add(strH);
        }
        hz4 hz4Var = hz4.a;
        lx3 lx3Var = this.a;
        if (lx3Var != hz4Var) {
            arrayList.add("context=" + lx3Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(wg0.p(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return rh4.m(sb, x53.n0(arrayList, ", ", null, null, null, 62), ']');
    }
}
