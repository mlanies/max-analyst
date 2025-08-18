package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class ae8 {
    public final yd8 a;
    public final Object b;
    public final frc[] c;
    public boolean d;
    public boolean e;
    public de8 f;
    public boolean g;
    public final boolean[] h;
    public final uj0[] i;
    public final gz7 j;
    public final vk8 k;
    public ae8 l;
    public sze m;
    public l0f n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [z33] */
    public ae8(uj0[] uj0VarArr, long j, gz7 gz7Var, n64 n64Var, vk8 vk8Var, de8 de8Var, l0f l0fVar) {
        this.i = uj0VarArr;
        this.o = j;
        this.j = gz7Var;
        this.k = vk8Var;
        xj8 xj8Var = de8Var.a;
        this.b = xj8Var.a;
        this.f = de8Var;
        this.m = sze.o;
        this.n = l0fVar;
        this.c = new frc[uj0VarArr.length];
        this.h = new boolean[uj0VarArr.length];
        vk8Var.getClass();
        Pair pair = (Pair) xj8Var.a;
        Object obj = pair.first;
        xj8 xj8VarB = xj8Var.b(pair.second);
        sk8 sk8Var = (sk8) ((HashMap) vk8Var.d).get(obj);
        sk8Var.getClass();
        ((HashSet) vk8Var.f).add(sk8Var);
        qk8 qk8Var = (qk8) ((HashMap) vk8Var.e).get(sk8Var);
        if (qk8Var != null) {
            qk8Var.a.d(qk8Var.b);
        }
        sk8Var.c.add(xj8VarB);
        j08 j08VarA = sk8Var.a.a(xj8VarB, n64Var, de8Var.b);
        ((IdentityHashMap) vk8Var.c).put(j08VarA, sk8Var);
        vk8Var.g();
        long j2 = de8Var.d;
        this.a = j2 != -9223372036854775807L ? new z33(j08VarA, true, 0L, j2) : j08VarA;
    }

    public final long a(l0f l0fVar, long j, boolean z, boolean[] zArr) {
        uj0[] uj0VarArr;
        frc[] frcVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= l0fVar.b) {
                break;
            }
            if (z || !l0fVar.F(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            uj0VarArr = this.i;
            int length = uj0VarArr.length;
            frcVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (uj0VarArr[i2].a == -2) {
                frcVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = l0fVar;
        c();
        long jL = this.a.L((m85[]) l0fVar.X, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < uj0VarArr.length; i3++) {
            if (uj0VarArr[i3].a == -2 && this.n.I(i3)) {
                frcVarArr[i3] = new rz4();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < frcVarArr.length; i4++) {
            if (frcVarArr[i4] != null) {
                np8.f(l0fVar.I(i4));
                if (uj0VarArr[i4].a != -2) {
                    this.e = true;
                }
            } else {
                np8.f(((m85[]) l0fVar.X)[i4] == null);
            }
        }
        return jL;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            l0f l0fVar = this.n;
            if (i >= l0fVar.b) {
                return;
            }
            boolean zI = l0fVar.I(i);
            m85 m85Var = ((m85[]) this.n.X)[i];
            if (zI && m85Var != null) {
                m85Var.h();
            }
            i++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            l0f l0fVar = this.n;
            if (i >= l0fVar.b) {
                return;
            }
            boolean zI = l0fVar.I(i);
            m85 m85Var = ((m85[]) this.n.X)[i];
            if (zI && m85Var != null) {
                m85Var.e();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long jR = this.e ? this.a.r() : Long.MIN_VALUE;
        return jR == Long.MIN_VALUE ? this.f.e : jR;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        yd8 yd8Var = this.a;
        try {
            boolean z = yd8Var instanceof z33;
            vk8 vk8Var = this.k;
            if (z) {
                vk8Var.n(((z33) yd8Var).a);
            } else {
                vk8Var.n(yd8Var);
            }
        } catch (RuntimeException e) {
            fm9.c("Period release failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0404  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l0f g(float r25, defpackage.lue r26) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae8.g(float, lue):l0f");
    }

    public final void h() {
        yd8 yd8Var = this.a;
        if (yd8Var instanceof z33) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            z33 z33Var = (z33) yd8Var;
            z33Var.X = 0L;
            z33Var.Y = j;
        }
    }
}
