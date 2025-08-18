package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class lge implements dff {
    public final dff a;

    public lge(dff dffVar) {
        c54.k(dffVar.h1());
        this.a = dffVar;
    }

    @Override // defpackage.dff
    public final boolean A1(int i, int i2) {
        return this.a.A1(i2, i);
    }

    @Override // defpackage.dff
    public final Range E1() {
        return this.a.x1();
    }

    @Override // defpackage.dff
    public final int a1() {
        return this.a.w1();
    }

    @Override // defpackage.dff
    public final Range b1() {
        return this.a.b1();
    }

    @Override // defpackage.dff
    public final boolean h1() {
        return this.a.h1();
    }

    @Override // defpackage.dff
    public final Range r1(int i) {
        return this.a.v1(i);
    }

    @Override // defpackage.dff
    public final Range v1(int i) {
        return this.a.r1(i);
    }

    @Override // defpackage.dff
    public final int w1() {
        return this.a.a1();
    }

    @Override // defpackage.dff
    public final Range x1() {
        return this.a.E1();
    }
}
