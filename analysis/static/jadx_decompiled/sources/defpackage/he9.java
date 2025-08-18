package defpackage;

/* loaded from: classes.dex */
public final class he9 implements dw4 {
    public final wpa a;
    public final ie9 b;
    public final String c;
    public final int d;
    public yze e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public he9(String str, int i) {
        wpa wpaVar = new wpa(4);
        this.a = wpaVar;
        wpaVar.a[0] = -1;
        this.b = new ie9(1);
        this.m = -9223372036854775807L;
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.dw4
    public final void a() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    @Override // defpackage.dw4
    public final void d(wpa wpaVar) {
        fm9.l(this.e);
        while (wpaVar.a() > 0) {
            int i = this.g;
            wpa wpaVar2 = this.a;
            if (i == 0) {
                byte[] bArr = wpaVar.a;
                int i2 = wpaVar.b;
                int i3 = wpaVar.c;
                while (true) {
                    if (i2 >= i3) {
                        wpaVar.G(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.j && (b & 224) == 224;
                    this.j = z;
                    if (z2) {
                        wpaVar.G(i2 + 1);
                        this.j = false;
                        wpaVar2.a[1] = bArr[i2];
                        this.h = 2;
                        this.g = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(wpaVar.a(), 4 - this.h);
                wpaVar.e(this.h, wpaVar2.a, iMin);
                int i4 = this.h + iMin;
                this.h = i4;
                if (i4 >= 4) {
                    wpaVar2.G(0);
                    int iG = wpaVar2.g();
                    ie9 ie9Var = this.b;
                    if (ie9Var.a(iG)) {
                        this.l = ie9Var.d;
                        if (!this.i) {
                            this.k = (ie9Var.h * 1000000) / ie9Var.e;
                            ny5 ny5Var = new ny5();
                            ny5Var.a = this.f;
                            ny5Var.m = ia9.l(ie9Var.c);
                            ny5Var.n = 4096;
                            ny5Var.A = ie9Var.f;
                            ny5Var.B = ie9Var.e;
                            ny5Var.d = this.c;
                            ny5Var.f = this.d;
                            this.e.e(new qy5(ny5Var));
                            this.i = true;
                        }
                        wpaVar2.G(0);
                        this.e.b(wpaVar2, 4, 0);
                        this.g = 2;
                    } else {
                        this.h = 0;
                        this.g = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(wpaVar.a(), this.l - this.h);
                this.e.b(wpaVar, iMin2, 0);
                int i5 = this.h + iMin2;
                this.h = i5;
                if (i5 >= this.l) {
                    fm9.k(this.m != -9223372036854775807L);
                    this.e.a(this.m, 1, this.l, 0, null);
                    this.m += this.k;
                    this.h = 0;
                    this.g = 0;
                }
            }
        }
    }

    @Override // defpackage.dw4
    public final void e(boolean z) {
    }

    @Override // defpackage.dw4
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.dw4
    public final void i(pa5 pa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.f = l3fVar.f;
        l3fVar.b();
        this.e = pa5Var.mo6B(l3fVar.e, 1);
    }
}
