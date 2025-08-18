package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class be8 {
    public final zd8 a;
    public final Object b;
    public final grc[] c;
    public boolean d;
    public boolean e;
    public ee8 f;
    public boolean g;
    public final boolean[] h;
    public final vj0[] i;
    public final hz7 j;
    public final vk8 k;
    public be8 l;
    public tze m;
    public l0f n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [a43] */
    public be8(vj0[] vj0VarArr, long j, hz7 hz7Var, n64 n64Var, vk8 vk8Var, ee8 ee8Var, l0f l0fVar) {
        this.i = vj0VarArr;
        this.o = j;
        this.j = hz7Var;
        this.k = vk8Var;
        yj8 yj8Var = ee8Var.a;
        this.b = yj8Var.a;
        this.f = ee8Var;
        this.m = tze.d;
        this.n = l0fVar;
        this.c = new grc[vj0VarArr.length];
        this.h = new boolean[vj0VarArr.length];
        vk8Var.getClass();
        int i = b5b.n;
        Pair pair = (Pair) yj8Var.a;
        Object obj = pair.first;
        yj8 yj8VarA = yj8Var.a(pair.second);
        tk8 tk8Var = (tk8) ((HashMap) vk8Var.d).get(obj);
        tk8Var.getClass();
        ((HashSet) vk8Var.f).add(tk8Var);
        rk8 rk8Var = (rk8) ((HashMap) vk8Var.e).get(tk8Var);
        if (rk8Var != null) {
            rk8Var.a.f(rk8Var.b);
        }
        tk8Var.c.add(yj8VarA);
        k08 k08VarC = tk8Var.a.c(yj8VarA, n64Var, ee8Var.b);
        ((IdentityHashMap) vk8Var.c).put(k08VarC, tk8Var);
        vk8Var.g();
        long j2 = ee8Var.d;
        this.a = j2 != -9223372036854775807L ? new a43(k08VarC, true, 0L, j2) : k08VarC;
    }

    public final long a(l0f l0fVar, long j, boolean z, boolean[] zArr) {
        vj0[] vj0VarArr;
        grc[] grcVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= l0fVar.b) {
                break;
            }
            if (z || !l0fVar.G(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            vj0VarArr = this.i;
            int length = vj0VarArr.length;
            grcVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (vj0VarArr[i2].b == -2) {
                grcVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = l0fVar;
        c();
        long jG = this.a.g((n85[]) l0fVar.X, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < vj0VarArr.length; i3++) {
            if (vj0VarArr[i3].b == -2 && this.n.I(i3)) {
                grcVarArr[i3] = new sz4();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < grcVarArr.length; i4++) {
            if (grcVarArr[i4] != null) {
                fm9.k(l0fVar.I(i4));
                if (vj0VarArr[i4].b != -2) {
                    this.e = true;
                }
            } else {
                fm9.k(((n85[]) l0fVar.X)[i4] == null);
            }
        }
        return jG;
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
            n85 n85Var = ((n85[]) this.n.X)[i];
            if (zI && n85Var != null) {
                n85Var.h();
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
            n85 n85Var = ((n85[]) this.n.X)[i];
            if (zI && n85Var != null) {
                n85Var.e();
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

    public final boolean f() {
        return this.d && (!this.e || this.a.r() == Long.MIN_VALUE);
    }

    public final void g() {
        b();
        zd8 zd8Var = this.a;
        try {
            boolean z = zd8Var instanceof a43;
            vk8 vk8Var = this.k;
            if (z) {
                vk8Var.o(((a43) zd8Var).a);
            } else {
                vk8Var.o(zd8Var);
            }
        } catch (RuntimeException e) {
            z04.v("Period release failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.l0f h(float r30, defpackage.mue r31) {
        /*
            Method dump skipped, instructions count: 1661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be8.h(float, mue):l0f");
    }

    public final void i() {
        zd8 zd8Var = this.a;
        if (zd8Var instanceof a43) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            a43 a43Var = (a43) zd8Var;
            a43Var.X = 0L;
            a43Var.Y = j;
        }
    }
}
