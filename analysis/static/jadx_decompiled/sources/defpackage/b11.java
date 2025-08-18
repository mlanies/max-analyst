package defpackage;

/* loaded from: classes2.dex */
public final class b11 {
    public final /* synthetic */ int a;
    public final int b;
    public final long c;

    public /* synthetic */ b11(long j, int i, int i2, boolean z) {
        this.a = i2;
        this.b = i;
        this.c = j;
    }

    public static b11 b(ra4 ra4Var, yaf yafVar) {
        ra4Var.q(yafVar.a, 0, 8, false);
        yafVar.H(0);
        return new b11(yafVar.m(), yafVar.h(), 7, false);
    }

    public static b11 c(sa4 sa4Var, wpa wpaVar) {
        sa4Var.q(wpaVar.a, 0, 8, false);
        wpaVar.G(0);
        return new b11(wpaVar.l(), wpaVar.g(), 8, false);
    }

    public boolean a() {
        switch (this.a) {
            case 4:
                int i = this.b;
                if (i == 0 || i == 1) {
                }
                break;
            default:
                int i2 = this.b;
                if (i2 == 0 || i2 == 1) {
                }
                break;
        }
        return true;
    }

    public b11(int i, long j, boolean z) {
        this.a = 0;
        this.c = j;
        this.b = i;
    }

    public b11(int i, int i2, long j) {
        this.a = i2;
        switch (i2) {
            case 3:
                fm9.f(j >= 0);
                this.b = i;
                this.c = j;
                break;
            default:
                np8.d(j >= 0);
                this.b = i;
                this.c = j;
                break;
        }
    }
}
