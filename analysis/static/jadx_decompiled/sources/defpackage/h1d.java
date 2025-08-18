package defpackage;

/* loaded from: classes.dex */
public final class h1d implements n3f {
    public final f1d a;
    public final wpa b = new wpa(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public h1d(f1d f1dVar) {
        this.a = f1dVar;
    }

    @Override // defpackage.n3f
    public final void a() {
        this.f = true;
    }

    @Override // defpackage.n3f
    public final void b(tue tueVar, pa5 pa5Var, l3f l3fVar) {
        this.a.b(tueVar, pa5Var, l3fVar);
        this.f = true;
    }

    @Override // defpackage.n3f
    public final void c(int i, wpa wpaVar) {
        boolean z = (i & 1) != 0;
        int iU = z ? wpaVar.b + wpaVar.u() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            wpaVar.G(iU);
            this.d = 0;
        }
        while (wpaVar.a() > 0) {
            int i2 = this.d;
            wpa wpaVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iU2 = wpaVar.u();
                    wpaVar.G(wpaVar.b - 1);
                    if (iU2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(wpaVar.a(), 3 - this.d);
                wpaVar.e(this.d, wpaVar2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    wpaVar2.G(0);
                    wpaVar2.F(3);
                    wpaVar2.H(1);
                    int iU3 = wpaVar2.u();
                    int iU4 = wpaVar2.u();
                    this.e = (iU3 & 128) != 0;
                    int i4 = (((iU3 & 15) << 8) | iU4) + 3;
                    this.c = i4;
                    byte[] bArr = wpaVar2.a;
                    if (bArr.length < i4) {
                        wpaVar2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(wpaVar.a(), this.c - this.d);
                wpaVar.e(this.d, wpaVar2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        wpaVar2.F(i6);
                    } else {
                        if (oaf.n(0, i6, -1, wpaVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        wpaVar2.F(this.c - 4);
                    }
                    wpaVar2.G(0);
                    this.a.d(wpaVar2);
                    this.d = 0;
                }
            }
        }
    }
}
