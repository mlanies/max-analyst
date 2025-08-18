package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class e74 implements km7, qj3, u98, pj8, rj8, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ e74(fd fdVar, int i, long j, long j2) {
        this.a = 0;
        this.o = fdVar;
        this.c = i;
        this.b = j;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        int i = this.c;
        long j = this.b;
        Object obj2 = this.o;
        switch (this.a) {
            case 1:
                sc5 sc5Var = (sc5) obj2;
                sc5Var.getClass();
                Locale locale = Locale.ENGLISH;
                hm9.p("sc5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                sc5Var.f();
                break;
            case 2:
                md5 md5Var = (md5) obj2;
                md5Var.getClass();
                Locale locale2 = Locale.ENGLISH;
                hm9.p("md5", "onNotifMoved: failed to move id=" + j + " to position=" + i, (Throwable) obj);
                md5Var.c();
                break;
            default:
                b04 b04Var = (b04) obj;
                qbe qbeVar = (qbe) obj2;
                fm9.l(qbeVar.i);
                zw6 zw6Var = b04Var.a;
                qbeVar.c.getClass();
                byte[] bArrD = kj6.d(b04Var.c, zw6Var);
                wpa wpaVar = qbeVar.d;
                wpaVar.getClass();
                wpaVar.E(bArrD.length, bArrD);
                qbeVar.a.b(wpaVar, bArrD.length, 0);
                long j2 = b04Var.b;
                if (j2 == -9223372036854775807L) {
                    fm9.k(qbeVar.i.s == Long.MAX_VALUE);
                } else {
                    long j3 = qbeVar.i.s;
                    j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
                }
                qbeVar.a.a(j, this.c, bArrD.length, 0, null);
                break;
        }
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        qr6Var.P(((w98) this.o).c, i, this.c, this.b);
    }

    @Override // defpackage.pj8
    public void f(x4b x4bVar, oh8 oh8Var) {
        x4bVar.r(((sj8) this.o).J0(oh8Var, x4bVar, this.c), this.b);
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((gd) obj).L((fd) this.o, this.c, this.b);
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        int i2 = this.c;
        return ii8Var.q(oh8Var, (ffc) ((List) this.o), i2 == -1 ? ii8Var.s.p0() : i2, i2 == -1 ? ii8Var.s.k() : this.b);
    }

    public /* synthetic */ e74(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.c = i;
        this.b = j;
    }

    public /* synthetic */ e74(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = j;
        this.c = i;
    }
}
