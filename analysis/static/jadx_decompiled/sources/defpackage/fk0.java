package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class fk0 implements n85 {
    public final rze a;
    public final int b;
    public final int[] c;
    public final qy5[] d;
    public final long[] e;
    public int f;

    public fk0(rze rzeVar, int[] iArr) {
        int i = 0;
        fm9.k(iArr.length > 0);
        rzeVar.getClass();
        this.a = rzeVar;
        int length = iArr.length;
        this.b = length;
        this.d = new qy5[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = rzeVar.d[iArr[i2]];
        }
        Arrays.sort(this.d, new v00(2));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = rzeVar.d(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.n85
    public final rze a() {
        return this.a;
    }

    @Override // defpackage.n85
    public final qy5 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.n85
    public void e() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fk0 fk0Var = (fk0) obj;
        return this.a.equals(fk0Var.a) && Arrays.equals(this.c, fk0Var.c);
    }

    @Override // defpackage.n85
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.n85
    public int g(long j, List list) {
        return list.size();
    }

    @Override // defpackage.n85
    public void h() {
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.n85
    public final int i() {
        return this.c[b()];
    }

    @Override // defpackage.n85
    public final qy5 j() {
        return this.d[b()];
    }

    @Override // defpackage.n85
    public void l(float f) {
    }

    @Override // defpackage.n85
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.n85
    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.n85
    public final boolean q(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.n85
    public final int s(qy5 qy5Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == qy5Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.n85
    public final boolean u(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zQ = q(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zQ) {
            zQ = (i2 == i || q(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zQ) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = oaf.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }
}
