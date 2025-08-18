package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class pnb implements go7 {
    public final pa5 X;
    public final ae3 Y;
    public final Uri b;
    public final u1e c;
    public final k8g o;
    public volatile boolean s0;
    public long u0;
    public yze w0;
    public boolean x0;
    public final /* synthetic */ vnb y0;
    public final lh4 Z = new lh4();
    public boolean t0 = true;
    public final long a = yn7.b.getAndIncrement();
    public a34 v0 = b(0);

    public pnb(vnb vnbVar, Uri uri, t24 t24Var, k8g k8gVar, pa5 pa5Var, ae3 ae3Var) {
        this.y0 = vnbVar;
        this.b = uri;
        this.c = new u1e(t24Var);
        this.o = k8gVar;
        this.X = pa5Var;
        this.Y = ae3Var;
    }

    @Override // defpackage.go7
    public final void a() {
        this.s0 = true;
    }

    public final a34 b(long j) {
        Collections.emptyMap();
        String str = this.y0.t0;
        Map map = vnb.Z0;
        Uri uri = this.b;
        fm9.m(uri, "The uri must be set.");
        return new a34(uri, 0L, 1, null, map, j, -1L, str, 6, null);
    }

    @Override // defpackage.go7
    public final void load() {
        t24 qs6Var;
        la5 la5Var;
        int i;
        int iG = 0;
        while (iG == 0 && !this.s0) {
            try {
                long j = this.Z.a;
                a34 a34VarB = b(j);
                this.v0 = a34VarB;
                long jG = this.c.G(a34VarB);
                if (this.s0) {
                    if (iG != 1 && this.o.m() != -1) {
                        this.Z.a = this.o.m();
                    }
                    mr0.i(this.c);
                    return;
                }
                if (jG != -1) {
                    jG += j;
                    vnb vnbVar = this.y0;
                    vnbVar.B0.post(new mnb(vnbVar, 0));
                }
                long j2 = jG;
                this.y0.D0 = us6.a(this.c.a.a());
                u1e u1eVar = this.c;
                us6 us6Var = this.y0.D0;
                if (us6Var == null || (i = us6Var.Y) == -1) {
                    qs6Var = u1eVar;
                } else {
                    qs6Var = new qs6(u1eVar, i, this);
                    vnb vnbVar2 = this.y0;
                    vnbVar2.getClass();
                    yze yzeVarZ = vnbVar2.z(new tnb(0, true));
                    this.w0 = yzeVarZ;
                    yzeVarZ.e(vnb.a1);
                }
                long jM = j;
                this.o.u(qs6Var, this.b, this.c.a.a(), j, j2, this.X);
                if (this.y0.D0 != null && (la5Var = (la5) this.o.b) != null) {
                    la5 la5VarM = la5Var.m();
                    if (la5VarM instanceof sd9) {
                        ((sd9) la5VarM).C0 = true;
                    }
                }
                if (this.t0) {
                    k8g k8gVar = this.o;
                    long j3 = this.u0;
                    la5 la5Var2 = (la5) k8gVar.b;
                    la5Var2.getClass();
                    la5Var2.d(jM, j3);
                    this.t0 = false;
                }
                while (true) {
                    long j4 = jM;
                    while (iG == 0 && !this.s0) {
                        try {
                            this.Y.a();
                            k8g k8gVar2 = this.o;
                            lh4 lh4Var = this.Z;
                            la5 la5Var3 = (la5) k8gVar2.b;
                            la5Var3.getClass();
                            sa4 sa4Var = (sa4) k8gVar2.c;
                            sa4Var.getClass();
                            iG = la5Var3.g(sa4Var, lh4Var);
                            jM = this.o.m();
                            if (jM > this.y0.u0 + j4) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.Y.c();
                    vnb vnbVar3 = this.y0;
                    vnbVar3.B0.post(vnbVar3.A0);
                }
                if (iG == 1) {
                    iG = 0;
                } else if (this.o.m() != -1) {
                    this.Z.a = this.o.m();
                }
                mr0.i(this.c);
            } catch (Throwable th) {
                if (iG != 1 && this.o.m() != -1) {
                    this.Z.a = this.o.m();
                }
                mr0.i(this.c);
                throw th;
            }
        }
    }
}
