package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class tme implements ase {
    public static final /* synthetic */ int x0 = 0;
    public final el3 X;
    public final p82 Y;
    public final float Z = 100.0f;
    public final Context a;
    public final p7b b;
    public final t7 c;
    public final t6b o;
    public zl4 s0;
    public sd7 t0;
    public sme u0;
    public sme v0;
    public sme w0;

    public tme(Context context, p7b p7bVar, t7 t7Var, t6b t6bVar, p82 p82Var, el3 el3Var) throws Exception {
        this.a = context;
        this.b = p7bVar;
        this.c = t7Var;
        this.o = t6bVar;
        this.Y = p82Var;
        this.X = el3Var;
        sme.b0 = this;
        c();
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.v0 = null;
            this.b.c.m("app.theme", str);
            qp4.u0.b(this.a).l(str, true);
        }
        this.u0 = null;
        q0e q0eVar = sme.c0;
        q0eVar.setValue(null);
        this.o.a();
        this.X.e();
        this.Y.s();
        sme smeVarC = c();
        this.u0 = smeVarC;
        q0eVar.setValue(smeVarC);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity instanceof q5) {
                hm9.n("tme", "changeTamTheme: call recreate for ".concat(activity.getClass().getName()));
                q5 q5Var = (q5) activity;
                sme smeVar = this.u0;
                if (q5Var.h0()) {
                    q5Var.N0 = smeVar;
                    try {
                        q5Var.a0();
                        q5.X(smeVar, q5Var.S().c.f());
                    } catch (Exception unused) {
                        q5Var.recreate();
                    }
                } else {
                    q5Var.recreate();
                }
            }
        }
    }

    public final void b(boolean z) {
        sd7 sd7Var;
        if (this.b.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            return;
        }
        if (z || (sd7Var = this.t0) == null || sd7Var.h()) {
            sme smeVarD = d();
            if (smeVarD.e.equals(c().e)) {
                return;
            }
            if (z) {
                sd7 sd7Var2 = this.t0;
                if (sd7Var2 != null) {
                    if (!sd7Var2.h()) {
                        sd7 sd7Var3 = this.t0;
                        sd7Var3.getClass();
                        dm4.a(sd7Var3);
                    }
                    this.t0 = null;
                }
                StringBuilder sb = new StringBuilder("checkNightModeState: change theme to ");
                String str = smeVarD.e;
                sb.append(str);
                hm9.n("tme", sb.toString());
                a(str, false);
            } else {
                hm9.n("tme", "changeThemeAfterNightModeCheck: schedule theme change after delay");
                r0a r0aVarN = qy9.u(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, muc.a()).n(ce.a());
                sd7 sd7Var4 = new sd7(new hme(3), new hme(4), new e5(18, this));
                r0aVarN.a(sd7Var4);
                this.t0 = sd7Var4;
            }
            if (z) {
                f();
            }
        }
    }

    public final sme c() throws Exception {
        if (this.u0 == null) {
            sme smeVarD = d();
            this.u0 = smeVarD;
            sme.c0.setValue(smeVarD);
        }
        return this.u0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[EDGE_INSN: B:80:0x00a7->B:42:0x00a7 BREAK  A[LOOP:1: B:21:0x0059->B:81:?]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sme d() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tme.d():sme");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tme.e():boolean");
    }

    public final void f() {
        long jC;
        int i = 1;
        zl4 zl4Var = this.s0;
        if (zl4Var != null) {
            if (!zl4Var.h()) {
                this.s0.g();
            }
            this.s0 = null;
        }
        p7b p7bVar = this.b;
        if (!p7bVar.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            jp jpVar = p7bVar.c;
            if (jpVar.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode.schedule")) {
                n34 n34VarG = n34.g(System.currentTimeMillis(), TimeZone.getDefault());
                ne7 ne7Var = jpVar.g;
                Integer numValueOf = Integer.valueOf(ne7Var.getInt("app.night.mode.start.h", 23));
                Integer numValueOf2 = Integer.valueOf(ne7Var.getInt("app.night.mode.start.m", 0));
                ne7 ne7Var2 = jpVar.g;
                Integer numValueOf3 = Integer.valueOf(ne7Var2.getInt("app.night.mode.end.h", 8));
                Integer numValueOf4 = Integer.valueOf(ne7Var2.getInt("app.night.mode.end.m", 0));
                n34 n34Var = new n34(n34VarG.a, n34VarG.b, n34VarG.c, numValueOf, numValueOf2, 0, 0);
                n34 n34Var2 = new n34(n34VarG.a, n34VarG.b, n34VarG.c, numValueOf3, numValueOf4, 0, 0);
                if (n34Var.compareTo(n34VarG) < 0) {
                    n34Var = n34Var.l(1);
                }
                if (n34Var2.compareTo(n34VarG) < 0) {
                    n34Var2 = n34Var2.l(1);
                }
                if (n34Var.compareTo(n34Var2) >= 0) {
                    n34Var = n34Var2;
                }
                if (n34VarG.n(1, 2, 3) && n34Var.n(1, 2, 3)) {
                    n34Var.f();
                    int iC = n34Var.c() - 2400001;
                    n34VarG.f();
                    jC = (iC - (n34VarG.c() - 2400001)) * 86400;
                } else {
                    jC = 0;
                }
                long jK = (jC - n34VarG.k()) + n34Var.k();
                hm9.n("tme", "createScheduledJobsIfNeed: next time to check: " + n34Var.toString() + " delay: " + jK);
                this.s0 = ce.a().c(new ule(i, this), jK, TimeUnit.SECONDS);
            }
        }
    }

    @Override // defpackage.ase
    public final sme u() {
        return c();
    }
}
