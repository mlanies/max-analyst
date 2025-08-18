package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ejc implements hw1 {
    public final hw1 b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ejc(hw1 hw1Var) {
        this(hw1Var, (byte) 0);
        this.c = 0;
        this.d = hw1Var;
    }

    @Override // defpackage.hw1
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.hw1
    public bm7 b(float f) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).b(f);
            default:
                return q(f);
        }
    }

    @Override // defpackage.hw1
    public final void c(ce3 ce3Var) {
        this.b.c(ce3Var);
    }

    @Override // defpackage.hw1
    public bm7 d(float f) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).d(f);
            default:
                return r(f);
        }
    }

    @Override // defpackage.hw1
    public final Rect e() {
        return this.b.e();
    }

    @Override // defpackage.hw1
    public final void f(int i) {
        this.b.f(i);
    }

    @Override // defpackage.hw1
    public final void g(eu6 eu6Var) {
        this.b.g(eu6Var);
    }

    @Override // defpackage.hw1
    public bm7 h(bw4 bw4Var) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).h(bw4Var);
            default:
                return s(bw4Var);
        }
    }

    @Override // defpackage.hw1
    public bm7 i(ArrayList arrayList, int i, int i2) {
        switch (this.c) {
            case 1:
                c54.j("Only support one capture config.", arrayList.size() == 1);
                bm7 bm7VarL = this.b.l(i, i2);
                b76 b76VarA = b76.a(bm7VarL);
                f76 f76Var = new f76(bm7VarL, 2);
                ok4 ok4VarK = ju0.k();
                b76VarA.getClass();
                return kq0.b(Collections.singletonList(kq0.K(kq0.K(kq0.K(b76VarA, f76Var, ok4VarK), new ypc(this, 27, arrayList), ju0.k()), new f76(bm7VarL, 3), ju0.k())));
            default:
                return t(arrayList, i, i2);
        }
    }

    @Override // defpackage.hw1
    public final void j(bad badVar) {
        this.b.j(badVar);
    }

    @Override // defpackage.hw1
    public bm7 k(boolean z) {
        switch (this.c) {
            case 0:
                return ((hw1) this.d).k(z);
            default:
                return p(z);
        }
    }

    @Override // defpackage.hw1
    public final bm7 l(int i, int i2) {
        return this.b.l(i, i2);
    }

    @Override // defpackage.hw1
    public final ce3 m() {
        return this.b.m();
    }

    @Override // defpackage.hw1
    public final void n() {
        this.b.n();
    }

    @Override // defpackage.hw1
    public final void o() {
        this.b.o();
    }

    public final bm7 p(boolean z) {
        return this.b.k(z);
    }

    public final bm7 q(float f) {
        return this.b.b(f);
    }

    public final bm7 r(float f) {
        return this.b.d(f);
    }

    public final bm7 s(bw4 bw4Var) {
        return this.b.h(bw4Var);
    }

    public final bm7 t(ArrayList arrayList, int i, int i2) {
        return this.b.i(arrayList, i, i2);
    }

    public ejc(hw1 hw1Var, byte b) {
        this.b = hw1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ejc(hw1 hw1Var, bqc bqcVar) {
        this(hw1Var, (byte) 0);
        this.c = 1;
        this.d = bqcVar;
    }
}
