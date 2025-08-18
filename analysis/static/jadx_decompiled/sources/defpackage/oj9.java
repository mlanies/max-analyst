package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import androidx.work.WorkRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class oj9 extends u2 {
    public final GestureDetector X;
    public final Handler Y;
    public final Rect Z;
    public final cn4 c;
    public final cn4 o;
    public rk9 s0;
    public final ad t0;
    public wk9 u0;

    public oj9(sk9 sk9Var, rk9 rk9Var, Context context, ad adVar) {
        super(0, sk9Var);
        this.s0 = rk9Var;
        this.t0 = adVar;
        cn4 cn4Var = new cn4(context);
        this.c = cn4Var;
        cn4 cn4Var2 = new cn4(context);
        this.o = cn4Var2;
        this.X = new GestureDetector(context, new q00(14, this));
        this.Y = new Handler(Looper.getMainLooper());
        this.Z = new Rect();
        cn4Var.a = new y8(this);
        cn4Var2.a = new bkg(19, this);
        sk9Var.A(this.s0);
        sk9Var.r(this);
    }

    public static void Z1(final oj9 oj9Var, final boolean z, final int i) {
        hkf hkfVar;
        hkf hkfVar2;
        if (oj9Var.u0 == null) {
            return;
        }
        Handler handler = oj9Var.Y;
        handler.removeCallbacksAndMessages(null);
        rk9 rk9Var = oj9Var.s0;
        qk9 qk9Var = new qk9();
        int i2 = rk9Var.a;
        qk9Var.a = i;
        qk9Var.b = z;
        qk9Var.c = true;
        rk9 rk9Var2 = new rk9(qk9Var);
        oj9Var.s0 = rk9Var2;
        ((sk9) ((kk9) oj9Var.b)).A(rk9Var2);
        wk9 wk9Var = oj9Var.u0;
        long j = 0;
        long j2 = (wk9Var == null || (hkfVar = wk9Var.E0) == null) ? 0L : hkfVar.k;
        long j3 = z ? j2 + WorkRequest.MIN_BACKOFF_MILLIS : j2 - WorkRequest.MIN_BACKOFF_MILLIS;
        long j4 = (wk9Var == null || (hkfVar2 = wk9Var.E0) == null) ? 0L : hkfVar2.j;
        if (j3 > j4) {
            oj9Var.b2(i, z);
            oj9Var.a2();
            j3 = j4;
        }
        if (j3 < 0) {
            oj9Var.b2(i, z);
            oj9Var.a2();
        } else {
            j = j3;
        }
        wk9 wk9Var2 = oj9Var.u0;
        if (wk9Var2 != null) {
            Iterator it = ((Set) wk9Var2.a).iterator();
            while (it.hasNext()) {
                ((ol9) it.next()).Y0(j);
            }
        }
        handler.postDelayed(new Runnable() { // from class: nj9
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b2(i, z);
            }
        }, 600L);
        handler.postDelayed(new nn6(20, oj9Var), 600L);
    }

    public final void a2() {
        rk9 rk9Var = this.s0;
        qk9 qk9Var = new qk9();
        qk9Var.a = rk9Var.a;
        qk9Var.b = rk9Var.b;
        qk9Var.c = rk9Var.c;
        qk9Var.a = 0;
        qk9Var.c = false;
        rk9 rk9Var2 = new rk9(qk9Var);
        this.s0 = rk9Var2;
        ((sk9) ((kk9) this.b)).A(rk9Var2);
        this.c.c = 0;
        this.o.c = 0;
    }

    public final void b2(int i, boolean z) {
        HashMap map = new HashMap();
        map.put("forward", Boolean.valueOf(z));
        map.put("seconds", Integer.valueOf(i));
        this.t0.h("SEEK_BY_DOUBLE_TAP", map);
    }
}
