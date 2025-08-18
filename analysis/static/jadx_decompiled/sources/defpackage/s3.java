package defpackage;

/* loaded from: classes.dex */
public final class s3 implements cw4 {
    public final /* synthetic */ int a;
    public final s02 b;
    public final yaf c;
    public final String d;
    public String e;
    public xze f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public oy5 k;
    public int l;
    public long m;

    public s3(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                byte[] bArr = new byte[16];
                this.b = new s02(bArr, 16, 1, (byte) 0);
                this.c = new yaf(bArr);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.b = new s02(bArr2, 128, 1, (byte) 0);
                this.c = new yaf(bArr2);
                this.g = 0;
                this.m = -9223372036854775807L;
                this.d = str;
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // defpackage.cw4
    public final void a() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bb  */
    @Override // defpackage.cw4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.yaf r21) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s3.f(yaf):void");
    }

    @Override // defpackage.cw4
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.m = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.m = j;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cw4
    public final void h() {
        int i = this.a;
    }

    @Override // defpackage.cw4
    public final void j(oa5 oa5Var, l3f l3fVar) {
        switch (this.a) {
            case 0:
                l3fVar.a();
                l3fVar.b();
                this.e = l3fVar.f;
                l3fVar.b();
                this.f = oa5Var.B(l3fVar.e, 1);
                break;
            default:
                l3fVar.a();
                l3fVar.b();
                this.e = l3fVar.f;
                l3fVar.b();
                this.f = oa5Var.B(l3fVar.e, 1);
                break;
        }
    }
}
