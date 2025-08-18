package defpackage;

/* loaded from: classes.dex */
public abstract class om0 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public Object e;

    public om0(jm0 jm0Var, mm0 mm0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = mm0Var;
        this.b = i;
        this.c = new gm0(jm0Var, j, j2, j3, j4, j5);
    }

    public static int c(ra4 ra4Var, long j, lh4 lh4Var) {
        if (j == ra4Var.o) {
            return 0;
        }
        lh4Var.a = j;
        return 1;
    }

    public static int d(sa4 sa4Var, long j, lh4 lh4Var) {
        if (j == sa4Var.o) {
            return 0;
        }
        lh4Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(defpackage.ra4 r28, defpackage.lh4 r29) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.a(ra4, lh4):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        return d(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(defpackage.sa4 r28, defpackage.lh4 r29) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.b(sa4, lh4):int");
    }

    public final void e(long j) {
        switch (this.a) {
            case 0:
                im0 im0Var = (im0) this.e;
                if (im0Var == null || im0Var.a != j) {
                    gm0 gm0Var = (gm0) this.c;
                    this.e = new im0(j, gm0Var.a.b(j), gm0Var.d, gm0Var.e, gm0Var.f, gm0Var.g, 0);
                    break;
                }
                break;
            default:
                im0 im0Var2 = (im0) this.e;
                if (im0Var2 == null || im0Var2.a != j) {
                    hm0 hm0Var = (hm0) this.c;
                    this.e = new im0(j, hm0Var.a.b(j), hm0Var.o, hm0Var.X, hm0Var.Y, hm0Var.Z, 1);
                    break;
                }
                break;
        }
    }

    public om0(km0 km0Var, nm0 nm0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = nm0Var;
        this.b = i;
        this.c = new hm0(km0Var, j, j2, j3, j4, j5);
    }
}
