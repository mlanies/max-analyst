package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* loaded from: classes.dex */
public final class wo4 implements qo4 {
    public final Context a;
    public final so4 b;
    public final boolean c;
    public final Class d;
    public xo4 e;

    public wo4(Context context, so4 so4Var, boolean z, Class cls) {
        this.a = context;
        this.b = so4Var;
        this.c = z;
        this.d = cls;
        so4Var.e.add(this);
    }

    @Override // defpackage.qo4
    public final void a(so4 so4Var) {
        xo4 xo4Var = this.e;
        if (xo4Var != null) {
            xo4.a(xo4Var, so4Var.l);
        }
    }

    @Override // defpackage.qo4
    public final void b() {
        boolean z = this.b.k;
    }

    @Override // defpackage.qo4
    public final void c() {
        xo4 xo4Var = this.e;
        if (xo4Var != null) {
            xo4Var.c();
        }
    }

    @Override // defpackage.qo4
    public final void d(so4 so4Var, boolean z) {
        if (z || so4Var.i) {
            return;
        }
        xo4 xo4Var = this.e;
        if (xo4Var == null || xo4Var.s0) {
            List list = so4Var.l;
            for (int i = 0; i < list.size(); i++) {
                if (((dn4) list.get(i)).b == 0) {
                    g();
                    return;
                }
            }
        }
    }

    @Override // defpackage.qo4
    public final void e(dn4 dn4Var, Exception exc) {
        xo4 xo4Var = this.e;
        if (xo4Var != null) {
            xo4Var.getClass();
        }
        xo4 xo4Var2 = this.e;
        if ((xo4Var2 == null || xo4Var2.s0) && xo4.b(dn4Var.b)) {
            z04.c0("DownloadService wasn't running. Restarting.");
            g();
        }
    }

    @Override // defpackage.qo4
    public final void f(so4 so4Var, dn4 dn4Var) {
        xo4 xo4Var = this.e;
        if (xo4Var != null) {
            xo4Var.getClass();
        }
    }

    public final void g() {
        boolean z = this.c;
        Class cls = this.d;
        Context context = this.a;
        if (!z) {
            try {
                context.startService(new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused) {
                z04.c0("Failed to restart (process is idle)");
            }
        } else {
            try {
                Intent action = new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                if (oaf.a >= 26) {
                    context.startForegroundService(action);
                } else {
                    context.startService(action);
                }
            } catch (IllegalStateException unused2) {
                z04.c0("Failed to restart (foreground launch restriction)");
            }
        }
    }
}
