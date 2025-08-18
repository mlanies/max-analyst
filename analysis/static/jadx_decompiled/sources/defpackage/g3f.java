package defpackage;

/* loaded from: classes.dex */
public final class g3f {
    public final int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public final Object h;
    public final Object i;

    public g3f(int i) {
        switch (i) {
            case 1:
                this.a = 112800;
                this.h = new tue(0L);
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.i = new wpa();
                break;
            default:
                this.a = 112800;
                this.h = new sue(0L);
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.g = -9223372036854775807L;
                this.i = new yaf(3, false);
                break;
        }
    }

    public void a(ra4 ra4Var) {
        byte[] bArr = maf.f;
        yaf yafVar = (yaf) this.i;
        yafVar.getClass();
        yafVar.F(bArr.length, bArr);
        this.b = true;
        ra4Var.Y = 0;
    }

    public void b(sa4 sa4Var) {
        byte[] bArr = oaf.f;
        wpa wpaVar = (wpa) this.i;
        wpaVar.getClass();
        wpaVar.E(bArr.length, bArr);
        this.b = true;
        sa4Var.Y = 0;
    }
}
