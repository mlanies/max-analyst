package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zj5 implements gq1 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ vq6 Z;
    public final /* synthetic */ mhc a;
    public final /* synthetic */ jq6 b;
    public final /* synthetic */ pad c;
    public final /* synthetic */ File o;
    public final /* synthetic */ rl8 s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ bk5 u0;
    public final /* synthetic */ ek5 v0;

    public zj5(ek5 ek5Var, mhc mhcVar, tq6 tq6Var, pad padVar, File file, AtomicBoolean atomicBoolean, String str, vq6 vq6Var, rl8 rl8Var, int i, bk5 bk5Var) {
        this.v0 = ek5Var;
        this.a = mhcVar;
        this.b = tq6Var;
        this.c = padVar;
        this.o = file;
        this.X = atomicBoolean;
        this.Y = str;
        this.Z = vq6Var;
        this.s0 = rl8Var;
        this.t0 = i;
        this.u0 = bk5Var;
    }

    @Override // defpackage.gq1
    public final void m(b8c b8cVar, yic yicVar) {
        i8c i8cVar = yicVar.Z;
        try {
            String str = null;
            if (!yicVar.m() || i8cVar == null) {
                w0f w0fVar = this.v0.c;
                int i = yicVar.o;
                ad adVar = (ad) w0fVar.a.getValue();
                if (!adVar.a().c()) {
                    adVar.g("HTTP_ERROR", String.valueOf(i));
                }
                ek5.a(this.v0, this.c, true, String.valueOf(yicVar.o));
                int i2 = yicVar.o;
                this.v0.getClass();
                try {
                    String strA = yicVar.Y.a("X-Reason");
                    if (strA != null) {
                        str = strA;
                    }
                } catch (Exception unused) {
                }
                eq6 eq6VarJ = nu0.j(i2, str);
                hm9.n("ek5", "error uploading, e: " + eq6VarJ);
                this.v0.getClass();
                if (nu0.Z.equals(eq6VarJ) || nu0.X.equals(eq6VarJ)) {
                    ek5 ek5Var = this.v0;
                    tq6 tq6Var = (tq6) this.b;
                    ek5Var.getClass();
                    ek5.f(tq6Var);
                } else if (nu0.c.equals(eq6VarJ) && this.X.compareAndSet(false, true)) {
                    long jE = ek5.e(yicVar);
                    if (jE > 0) {
                        ek5 ek5Var2 = this.v0;
                        String str2 = this.c.a;
                        pad padVar = new pad();
                        padVar.f = ek5Var2.c.b();
                        padVar.a = str2;
                        b8c b8cVarB = ((u2a) this.v0.b.getValue()).b(this.v0.b(this.o, this.Y, this.Z, this.s0, jE, padVar, (tq6) this.b, this.t0));
                        bk5 bk5Var = this.u0;
                        synchronized (bk5Var) {
                            if (!bk5Var.b) {
                                bk5Var.a = b8cVarB;
                                b8cVarB.e(this);
                            }
                        }
                    } else {
                        ek5 ek5Var3 = this.v0;
                        tq6 tq6Var2 = (tq6) this.b;
                        ek5Var3.getClass();
                        tq6Var2.b("upload failed", eq6VarJ);
                    }
                } else {
                    ek5 ek5Var4 = this.v0;
                    tq6 tq6Var3 = (tq6) this.b;
                    ek5Var4.getClass();
                    tq6Var3.b("upload failed", eq6VarJ);
                }
            } else {
                ek5 ek5Var5 = this.v0;
                jq6 jq6Var = this.b;
                File file = this.o;
                ek5Var5.getClass();
                if (jq6Var != null) {
                    String strU = i8cVar.U();
                    long length = file.length();
                    tq6 tq6Var4 = (tq6) jq6Var;
                    if (!tq6Var4.s0.get()) {
                        tq6Var4.Y.b(new tb2(tq6Var4, strU, length, 2));
                    }
                }
                ek5.a(this.v0, this.c, false, null);
            }
            if (i8cVar != null) {
                i8cVar.close();
            }
        } catch (Throwable th) {
            if (i8cVar != null) {
                try {
                    i8cVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.gq1
    public final void q(b8c b8cVar, IOException iOException) {
        rl8 rl8Var = ek5.d;
        hm9.r("ek5", iOException, "onFailure %s", this.a);
        ek5 ek5Var = this.v0;
        ad adVar = (ad) ek5Var.c.a.getValue();
        if (!adVar.a().c()) {
            adVar.g("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        hm9.p("ek5", "onFailure", null);
        boolean z = iOException instanceof FileNotFoundException;
        jq6 jq6Var = this.b;
        if (z) {
            ((tq6) jq6Var).b("file not found", nu0.x0);
        } else if ("FILE_ZERO_LENGTH".equals(iOException.getMessage())) {
            ((tq6) jq6Var).b("file is zero length", nu0.y0);
        } else {
            String string = iOException.toString();
            tq6 tq6Var = (tq6) jq6Var;
            eq6 eq6Var = nu0.w0;
            if (string != null) {
                eq6Var = new eq6(-1, "UNKNOWN_ERROR", string);
            }
            tq6Var.b("upload failed", eq6Var);
        }
        ek5.a(ek5Var, this.c, true, iOException.getMessage());
    }
}
