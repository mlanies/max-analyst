package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class onb implements fo7 {
    public final oa5 X;
    public final ae3 Y;
    public final Uri b;
    public final t1e c;
    public final glc o;
    public volatile boolean s0;
    public long u0;
    public drc x0;
    public boolean y0;
    public final /* synthetic */ unb z0;
    public final lh4 Z = new lh4();
    public boolean t0 = true;
    public long w0 = -1;
    public final long a = xn7.h.getAndIncrement();
    public z24 v0 = b(0);

    public onb(unb unbVar, Uri uri, r24 r24Var, glc glcVar, oa5 oa5Var, ae3 ae3Var) {
        this.z0 = unbVar;
        this.b = uri;
        this.c = new t1e(r24Var);
        this.o = glcVar;
        this.X = oa5Var;
        this.Y = ae3Var;
    }

    @Override // defpackage.fo7
    public final void a() {
        this.s0 = true;
    }

    public final z24 b(long j) {
        Collections.emptyMap();
        String str = this.z0.t0;
        Map map = unb.X0;
        Uri uri = this.b;
        if (uri != null) {
            return new z24(uri, 0L, 1, null, map, j, -1L, str, 6, null);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    @Override // defpackage.fo7
    public final void load() {
        r24 ps6Var;
        int i;
        int i2 = 0;
        while (i2 == 0 && !this.s0) {
            try {
                long j = this.Z.a;
                z24 z24VarB = b(j);
                this.v0 = z24VarB;
                long jL = this.c.L(z24VarB);
                this.w0 = jL;
                if (jL != -1) {
                    this.w0 = jL + j;
                }
                this.z0.C0 = ts6.a(this.c.a.a());
                t1e t1eVar = this.c;
                ts6 ts6Var = this.z0.C0;
                if (ts6Var == null || (i = ts6Var.Y) == -1) {
                    ps6Var = t1eVar;
                } else {
                    ps6Var = new ps6(t1eVar, i, this);
                    unb unbVar = this.z0;
                    unbVar.getClass();
                    drc drcVarP = unbVar.p(new snb(0, true));
                    this.x0 = drcVarP;
                    drcVarP.d(unb.Y0);
                }
                long jI = j;
                this.o.j(ps6Var, this.b, this.c.a.a(), j, this.w0, this.X);
                if (this.z0.C0 != null) {
                    ka5 ka5Var = (ka5) this.o.c;
                    if (ka5Var instanceof rd9) {
                        ((rd9) ka5Var).r = true;
                    }
                }
                if (this.t0) {
                    glc glcVar = this.o;
                    long j2 = this.u0;
                    ka5 ka5Var2 = (ka5) glcVar.c;
                    ka5Var2.getClass();
                    ka5Var2.d(jI, j2);
                    this.t0 = false;
                }
                while (true) {
                    long j3 = jI;
                    while (i2 == 0 && !this.s0) {
                        try {
                            this.Y.a();
                            glc glcVar2 = this.o;
                            lh4 lh4Var = this.Z;
                            ka5 ka5Var3 = (ka5) glcVar2.c;
                            ka5Var3.getClass();
                            ra4 ra4Var = (ra4) glcVar2.o;
                            ra4Var.getClass();
                            i2 = ka5Var3.i(ra4Var, lh4Var);
                            jI = this.o.i();
                            if (jI > this.z0.u0 + j3) {
                                ae3 ae3Var = this.Y;
                                synchronized (ae3Var) {
                                    ae3Var.b = false;
                                }
                                unb unbVar2 = this.z0;
                                unbVar2.A0.post(unbVar2.z0);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    break;
                }
                if (i2 == 1) {
                    i2 = 0;
                } else if (this.o.i() != -1) {
                    this.Z.a = this.o.i();
                }
                kq0.f(this.c);
            } catch (Throwable th) {
                if (i2 != 1 && this.o.i() != -1) {
                    this.Z.a = this.o.i();
                }
                kq0.f(this.c);
                throw th;
            }
        }
    }
}
