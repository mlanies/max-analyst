package defpackage;

/* loaded from: classes.dex */
public final class ge9 implements cw4 {
    public final yaf a;
    public final ie9 b;
    public final String c;
    public xze d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public ge9(String str) {
        yaf yafVar = new yaf(4);
        this.a = yafVar;
        yafVar.a[0] = -1;
        this.b = new ie9(0);
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.cw4
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.cw4
    public final void f(yaf yafVar) {
        np8.g(this.d);
        while (yafVar.c() > 0) {
            int i = this.f;
            yaf yafVar2 = this.a;
            if (i == 0) {
                byte[] bArr = yafVar.a;
                int i2 = yafVar.b;
                int i3 = yafVar.c;
                while (true) {
                    if (i2 >= i3) {
                        yafVar.H(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        yafVar.H(i2 + 1);
                        this.i = false;
                        yafVar2.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(yafVar.c(), 4 - this.g);
                yafVar.g(this.g, yafVar2.a, iMin);
                int i4 = this.g + iMin;
                this.g = i4;
                if (i4 >= 4) {
                    yafVar2.H(0);
                    int iH = yafVar2.h();
                    ie9 ie9Var = this.b;
                    if (ie9Var.a(iH)) {
                        this.k = ie9Var.d;
                        if (!this.h) {
                            int i5 = ie9Var.e;
                            this.j = (ie9Var.h * 1000000) / i5;
                            my5 my5Var = new my5();
                            my5Var.a = this.e;
                            my5Var.k = ie9Var.c;
                            my5Var.l = 4096;
                            my5Var.x = ie9Var.f;
                            my5Var.y = i5;
                            my5Var.c = this.c;
                            this.d.d(new oy5(my5Var));
                            this.h = true;
                        }
                        yafVar2.H(0);
                        this.d.c(4, yafVar2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(yafVar.c(), this.k - this.g);
                this.d.c(iMin2, yafVar);
                int i6 = this.g + iMin2;
                this.g = i6;
                int i7 = this.k;
                if (i6 >= i7) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.b(j, 1, i7, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.cw4
    public final void h() {
    }

    @Override // defpackage.cw4
    public final void j(oa5 oa5Var, l3f l3fVar) {
        l3fVar.a();
        l3fVar.b();
        this.e = l3fVar.f;
        l3fVar.b();
        this.d = oa5Var.B(l3fVar.e, 1);
    }
}
