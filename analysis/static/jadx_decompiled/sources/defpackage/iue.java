package defpackage;

/* loaded from: classes.dex */
public final class iue extends mue {
    public final zw6 e;
    public final zw6 f;
    public final int[] g;
    public final int[] h;

    public iue(ffc ffcVar, ffc ffcVar2, int[] iArr) {
        fm9.f(ffcVar.o == iArr.length);
        this.e = ffcVar;
        this.f = ffcVar2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.mue
    public final int a(boolean z) {
        if (q()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mue
    public final int c(boolean z) {
        if (q()) {
            return -1;
        }
        zw6 zw6Var = this.e;
        if (!z) {
            return zw6Var.size() - 1;
        }
        return this.g[zw6Var.size() - 1];
    }

    @Override // defpackage.mue
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        hue hueVar2 = (hue) this.f.get(i);
        hueVar.j(hueVar2.a, hueVar2.b, hueVar2.c, hueVar2.d, hueVar2.e, hueVar2.g, hueVar2.f);
        return hueVar;
    }

    @Override // defpackage.mue
    public final int i() {
        return this.f.size();
    }

    @Override // defpackage.mue
    public final int l(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mue
    public final kue n(int i, kue kueVar, long j) {
        kue kueVar2 = (kue) this.e.get(i);
        kueVar.b(kueVar2.a, kueVar2.c, kueVar2.d, kueVar2.e, kueVar2.f, kueVar2.g, kueVar2.h, kueVar2.i, kueVar2.j, kueVar2.l, kueVar2.m, kueVar2.n, kueVar2.o, kueVar2.p);
        kueVar.k = kueVar2.k;
        return kueVar;
    }

    @Override // defpackage.mue
    public final int p() {
        return this.e.size();
    }
}
