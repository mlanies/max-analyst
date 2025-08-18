package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class nu1 implements tu1 {
    public final st1 a;
    public final oq0 b;
    public final int c;
    public boolean d = false;

    public nu1(st1 st1Var, int i, oq0 oq0Var) {
        this.a = st1Var;
        this.c = i;
        this.b = oq0Var;
    }

    @Override // defpackage.tu1
    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        if (!u40.g(this.c, totalCaptureResult)) {
            return kq0.r(Boolean.FALSE);
        }
        this.d = true;
        b76 b76VarA = b76.a(f8.g(new ync(24, this)));
        mu1 mu1Var = new mu1(0);
        ok4 ok4VarK = ju0.k();
        b76VarA.getClass();
        return kq0.K(b76VarA, new re6(15, mu1Var), ok4VarK);
    }

    @Override // defpackage.tu1
    public final boolean b() {
        return this.c == 0;
    }

    @Override // defpackage.tu1
    public final void c() {
        if (this.d) {
            this.a.h.a(false, true);
            this.b.b = false;
        }
    }
}
