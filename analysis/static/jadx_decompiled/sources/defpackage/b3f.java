package defpackage;

/* loaded from: classes.dex */
public final class b3f {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public b3f(int i) {
        switch (i) {
            case 1:
                this.a = new byte[10];
                break;
            default:
                this.a = new byte[10];
                break;
        }
    }

    public void a(xze xzeVar, vze vzeVar) {
        if (this.c > 0) {
            xzeVar.b(this.d, this.e, this.f, this.g, vzeVar);
            this.c = 0;
        }
    }

    public void b(yze yzeVar, wze wzeVar) {
        if (this.c > 0) {
            yzeVar.a(this.d, this.e, this.f, this.g, wzeVar);
            this.c = 0;
        }
    }

    public void c(xze xzeVar, long j, int i, int i2, int i3, vze vzeVar) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(xzeVar, vzeVar);
            }
        }
    }

    public void d(yze yzeVar, long j, int i, int i2, int i3, wze wzeVar) {
        fm9.j("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                b(yzeVar, wzeVar);
            }
        }
    }

    public void e(ma5 ma5Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        ma5Var.l(0, bArr, 10);
        ma5Var.y();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }

    public void f(na5 na5Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        na5Var.l(0, bArr, 10);
        na5Var.y();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
