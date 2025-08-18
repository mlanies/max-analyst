package defpackage;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class qbe implements yze {
    public final yze a;
    public final mbe b;
    public obe h;
    public qy5 i;
    public final kj6 c = new kj6(9);
    public int e = 0;
    public int f = 0;
    public byte[] g = oaf.f;
    public final wpa d = new wpa();

    public qbe(yze yzeVar, mbe mbeVar) {
        this.a = yzeVar;
        this.b = mbeVar;
    }

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
        if (this.h == null) {
            this.a.a(j, i, i2, i3, wzeVar);
            return;
        }
        fm9.e("DRM on subtitles is not supported", wzeVar == null);
        int i4 = (this.f - i3) - i2;
        this.h.G(this.g, i4, i2, nbe.c, new e74(this, j, i, 6));
        int i5 = i4 + i2;
        this.e = i5;
        if (i5 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        if (this.h == null) {
            this.a.b(wpaVar, i, i2);
            return;
        }
        f(i);
        wpaVar.e(this.f, this.g, i);
        this.f += i;
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) throws EOFException {
        if (this.h == null) {
            return this.a.c(m24Var, i, z);
        }
        f(i);
        int i2 = m24Var.read(this.g, this.f, i);
        if (i2 != -1) {
            this.f += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
        qy5Var.n.getClass();
        String str = qy5Var.n;
        fm9.f(ia9.g(str) == 3);
        boolean zEquals = qy5Var.equals(this.i);
        mbe mbeVar = this.b;
        if (!zEquals) {
            this.i = qy5Var;
            this.h = mbeVar.a(qy5Var) ? mbeVar.e(qy5Var) : null;
        }
        obe obeVar = this.h;
        yze yzeVar = this.a;
        if (obeVar == null) {
            yzeVar.e(qy5Var);
            return;
        }
        ny5 ny5VarA = qy5Var.a();
        ny5VarA.m = ia9.l("application/x-media3-cues");
        ny5VarA.i = str;
        ny5VarA.r = Long.MAX_VALUE;
        ny5VarA.G = mbeVar.l(qy5Var);
        yzeVar.e(new qy5(ny5VarA));
    }

    public final void f(int i) {
        int length = this.g.length;
        int i2 = this.f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.e;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.e, bArr2, 0, i3);
        this.e = 0;
        this.f = i3;
        this.g = bArr2;
    }
}
