package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class ye8 implements fh9 {
    public final o45 X;
    public final p7b Y;
    public final f40 Z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final Context o;
    public final gh3 s0;
    public final ef7 t0;
    public final o1b u0;
    public final m65 v0;

    public ye8(Context context, o45 o45Var, p7b p7bVar, uh9 uh9Var, f40 f40Var, gh3 gh3Var, ef7 ef7Var, ti4 ti4Var, tg tgVar, au8 au8Var, dlf dlfVar, hle hleVar, o20 o20Var, ep epVar, av0 av0Var, p82 p82Var, m65 m65Var) {
        this.o = context;
        this.X = o45Var;
        this.Y = p7bVar;
        this.Z = f40Var;
        this.s0 = gh3Var;
        this.t0 = ef7Var;
        this.v0 = m65Var;
        this.u0 = new o1b(context, ef7Var, ti4Var, p7bVar, tgVar, au8Var, dlfVar, hleVar, new qz7(23, new z16(23, this)), o20Var, (y1b) epVar.n.getValue(), av0Var, p82Var, o45Var);
        synchronized (uh9Var.o) {
            uh9Var.o.add(this);
        }
    }

    @Override // defpackage.fh9
    public final void a(long j, ub8 ub8Var) {
    }

    @Override // defpackage.fh9
    public final void b(long j, ub8 ub8Var) {
    }

    @Override // defpackage.fh9
    public final void c(long j, ub8 ub8Var, long j2, ub8 ub8Var2) {
    }

    @Override // defpackage.fh9
    public final void d(long j, ub8 ub8Var) {
    }

    @Override // defpackage.fh9
    public final void e(long j, ub8 ub8Var, long j2) {
    }

    @Override // defpackage.fh9
    public final void f(long j, ub8 ub8Var) {
    }

    @Override // defpackage.fh9
    public final void g(long j, ub8 ub8Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // defpackage.fh9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r1, defpackage.ub8 r3) {
        /*
            r0 = this;
            java.util.HashMap r1 = r0.b
            ze8 r2 = defpackage.ze8.c
            java.lang.Object r2 = r1.get(r2)
            we8 r2 = (defpackage.we8) r2
            if (r2 == 0) goto L22
            boolean r0 = r0.q()
            if (r0 == 0) goto L1d
            r0 = r2
            bq7 r0 = (defpackage.bq7) r0
            boolean r3 = r0.i
            if (r3 == 0) goto L1d
            r0.v()
            goto L22
        L1d:
            bq7 r2 = (defpackage.bq7) r2
            r2.n()
        L22:
            ze8 r0 = defpackage.ze8.o
            java.lang.Object r0 = r1.get(r0)
            we8 r0 = (defpackage.we8) r0
            if (r0 == 0) goto L31
            bq7 r0 = (defpackage.bq7) r0
            r0.n()
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye8.h(long, ub8):void");
    }

    @Override // defpackage.fh9
    public final void i(long j, ub8 ub8Var) {
    }

    @Override // defpackage.fh9
    public final void k(long j, ub8 ub8Var) {
    }

    public final void l(we8 we8Var) {
        if (this.c.contains(we8Var)) {
            throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
        }
        m((bq7) we8Var);
    }

    public final void m(bq7 bq7Var) {
        ve8 ve8Var;
        hm9.m("ye8", "attachInternal %s", bq7Var.a);
        HashMap map = this.b;
        ze8 ze8Var = bq7Var.a;
        bq7 bq7Var2 = (bq7) map.get(ze8Var);
        if (bq7Var2 != null && bq7Var2 != bq7Var && (ve8Var = bq7Var2.e) != null) {
            ve8Var.W0();
        }
        map.put(ze8Var, bq7Var);
    }

    public final bq7 n(ze8 ze8Var, x50 x50Var) {
        HashMap map = this.b;
        bq7 bq7Var = (bq7) map.get(ze8Var);
        if (bq7Var != null) {
            ve8 ve8Var = bq7Var.e;
            if (ve8Var != null) {
                ve8Var.W0();
            }
            bq7Var.g = null;
        }
        HashMap map2 = this.a;
        u65 u65Var = (u65) map2.get(ze8Var);
        if (u65Var == null) {
            u65Var = new u65(this.o, this.X, this.v0, this.t0, this.Y.a);
            map2.put(ze8Var, u65Var);
        }
        bq7 bq7Var2 = new bq7(ze8Var, u65Var, this, this.o, x50Var.a ? 1.0f : 0.0f, x50Var.b, x50Var.c);
        map.put(ze8Var, bq7Var2);
        return bq7Var2;
    }

    public final void o(we8 we8Var) {
        if (this.c.contains(we8Var)) {
            throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
        }
        bq7 bq7Var = (bq7) we8Var;
        hm9.m("ye8", "detachInternal %s", bq7Var.a);
        ve8 ve8Var = bq7Var.e;
        if (ve8Var != null) {
            ve8Var.W0();
        }
    }

    public final void p(we8 we8Var) {
        we8 we8Var2;
        lj9 lj9Var;
        bq7 bq7Var = (bq7) we8Var;
        ze8 ze8Var = bq7Var.a;
        ze8 ze8Var2 = ze8.c;
        if (ze8Var == ze8Var2) {
            boolean zL = bq7Var.l();
            o1b o1bVar = this.u0;
            if (zL) {
                lj9 lj9Var2 = o1bVar.B0;
                if (lj9Var2 != null) {
                    lj9Var2.pause();
                }
            } else {
                fef fefVar = o1bVar.B0 == null ? null : ((bq7) ((we8) o1bVar.u0.get())).f;
                fef fefVar2 = bq7Var.f;
                if (fefVar != null && fefVar2 != null && oag.d(fefVar.l().toString(), fefVar2.l().toString()) && (lj9Var = o1bVar.B0) != null) {
                    lj9Var.pause();
                }
            }
        } else if (ze8Var == ze8.o && (we8Var2 = (we8) this.b.get(ze8Var2)) != null) {
            fef fefVar3 = bq7Var.f;
            bq7 bq7Var2 = (bq7) we8Var2;
            fef fefVar4 = bq7Var2.f;
            if ((fefVar3 == null || fefVar4 == null || !oag.d(fefVar3.l().toString(), fefVar4.l().toString())) && q() && bq7Var2.i) {
                bq7Var2.v();
            } else {
                bq7Var2.n();
            }
        }
        if (bq7Var.l()) {
            f40 f40Var = this.Z;
            f40Var.getClass();
            hm9.n("f40", "pause");
            uh9 uh9Var = f40Var.c;
            if (uh9Var.x) {
                uh9Var.q();
            }
            khe kheVar = f40Var.u0;
            if (kheVar.a()) {
                f40.p((PowerManager.WakeLock) kheVar.getValue(), 0);
            }
        }
    }

    public final boolean q() {
        gh3 gh3Var = this.s0;
        boolean zG = gh3Var.g();
        zh3 zh3VarB = gh3Var.b();
        p7b p7bVar = this.Y;
        int i = p7bVar.c.g.getInt("app.video.auto.play", 1);
        if (i != -1) {
            return i != 0 ? zh3VarB == zh3.c : zh3VarB == zh3.c || p7bVar.c.n() || !zG;
        }
        return false;
    }

    public final void r(we8 we8Var) {
        if (this.c.contains(we8Var)) {
            throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
        }
        s((bq7) we8Var);
    }

    public final void s(bq7 bq7Var) {
        hm9.m("ye8", "releaseInternal %s", bq7Var.a);
        this.c.remove(bq7Var);
        fef fefVar = bq7Var.f;
        ze8 ze8Var = bq7Var.a;
        if (fefVar != null && bq7Var.g != null) {
            hm9.m("bq7", "Release %s", ze8Var);
            bq7Var.g = null;
            ve8 ve8Var = bq7Var.e;
            if (ve8Var != null) {
                ve8Var.W0();
            }
            u65 u65Var = bq7Var.b;
            u65Var.E();
            u65.u();
            hm9.n("u65", "Clear");
            zpd zpdVar = u65Var.a;
            zpdVar.Z1();
            t75 t75Var = zpdVar.c;
            t75Var.s2();
            t75Var.m2(null);
            t75Var.i2(0, 0);
            u65Var.Y = null;
            u65Var.Z = null;
            u65Var.s0 = 0.0f;
            u65Var.t0 = null;
            u65Var.u0 = 0;
            u65Var.v0 = 0;
            u65Var.w0 = 0;
            u65Var.x0 = false;
            bq7Var.p();
        }
        HashMap map = this.b;
        we8 we8Var = (we8) map.get(ze8Var);
        if (we8Var == bq7Var) {
            map.remove(((bq7) we8Var).a);
        }
    }
}
