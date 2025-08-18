package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class uh9 implements ch9, yp {
    public static final long I;
    public static final long J;
    public static final /* synthetic */ int K = 0;
    public boolean A;
    public tb8 B;
    public tb8 C;
    public gd8 D;
    public long E;
    public float F;
    public final q0e G;
    public final w7c H;
    public final Context a;
    public final kke b;
    public final kk5 c;
    public final au8 d;
    public final q33 e;
    public final av0 f;
    public final taa g;
    public final ContextScope h;
    public final je7 i;
    public final je7 j;
    public volatile vxd k;
    public int l;
    public a98 m;
    public gh9 n;
    public Handler q;
    public final q0e s;
    public final w7c t;
    public final q0e u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final float z;
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public final LinkedHashMap p = new LinkedHashMap();
    public final nn6 r = new nn6(18, this);

    static {
        int i = ft4.o;
        kt4 kt4Var = kt4.SECONDS;
        I = z7.R(1, kt4Var);
        J = z7.R(3, kt4Var);
    }

    public uh9(Context context, y7d y7dVar, kke kkeVar, kk5 kk5Var, au8 au8Var, q33 q33Var, av0 av0Var, zp zpVar, taa taaVar, ox3 ox3Var, je7 je7Var, je7 je7Var2) {
        this.a = context;
        this.b = kkeVar;
        this.c = kk5Var;
        this.d = au8Var;
        this.e = q33Var;
        this.f = av0Var;
        this.g = taaVar;
        this.i = je7Var;
        this.j = je7Var2;
        this.h = j1e.a(((w9a) kkeVar).c().getImmediate().plus(f46.a()).plus(ox3Var));
        q0e q0eVarA = r0e.a(-1L);
        this.s = q0eVarA;
        this.t = new w7c(q0eVarA);
        this.u = r0e.a(-1L);
        this.v = 1;
        this.z = 1.0f;
        this.A = true;
        this.E = -1L;
        this.F = 1.0f;
        lqf lqfVar = (lqf) zpVar;
        lqfVar.i.add(this);
        if (lqfVar.c()) {
            h();
        }
        q0e q0eVarA2 = r0e.a(Float.valueOf(0.0f));
        this.G = q0eVarA2;
        this.H = new w7c(q0eVarA2);
    }

    public static final tb8 d(uh9 uh9Var, int i) {
        if (i == -1) {
            uh9Var.getClass();
            return null;
        }
        a98 a98Var = uh9Var.m;
        if (a98Var != null) {
            return a98Var.x0().n(i, a98Var.a, 0L).c;
        }
        return null;
    }

    public static final void i(uh9 uh9Var) {
        uh9Var.l = 0;
        j47.T(uh9Var.h, null, null, new th9(uh9Var, null), 3);
        if (uh9Var.n == null) {
            gh9 gh9Var = new gh9(uh9Var);
            a98 a98Var = uh9Var.m;
            if (a98Var != null) {
                a98Var.z(gh9Var);
            }
            uh9Var.n = gh9Var;
        }
        hm9.n("uh9", "notifyListeners");
        synchronized (uh9Var.o) {
            Iterator it = uh9Var.o.iterator();
            while (it.hasNext()) {
                ((fh9) it.next()).a(uh9Var.l(), uh9Var.m());
            }
        }
    }

    public static tb8 j(String str, String str2, ub8 ub8Var, String str3, String str4, Bundle bundle) {
        ib8 ib8Var;
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        List listEmptyList = Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        Uri uri = str == null ? null : Uri.parse(str);
        str2.getClass();
        ed8 ed8Var = new ed8();
        ed8Var.b = str3;
        ed8Var.a = str4;
        ed8Var.H = bundle;
        ed8Var.G = Integer.valueOf(ub8Var.ordinal());
        gd8 gd8Var = new gd8(ed8Var);
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        if (uri != null) {
            ib8Var = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, ffcVar, null, -9223372036854775807L);
        } else {
            ib8Var = null;
        }
        return new tb8(str2, new db8(za8Var), ib8Var, new hb8(fb8Var), gd8Var, lb8Var);
    }

    @Override // defpackage.yp
    public final void a() {
        hm9.n("uh9", "disconnect: ");
        g();
        this.k = j47.T(this.h, null, null, new kh9(this, null), 3);
    }

    @Override // defpackage.yp
    public final void c() {
        h();
    }

    public final void e(ah9 ah9Var) {
        synchronized (this.o) {
            try {
                hh9 hh9Var = new hh9(ah9Var);
                fh9 fh9Var = (fh9) this.p.put(ah9Var, hh9Var);
                if (fh9Var != null) {
                    this.o.remove(fh9Var);
                }
                this.o.add(hh9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        hm9.n("uh9", "cancelPositionObserving");
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
    }

    public final void g() {
        hm9.n("uh9", "cancelScheduledConnectionAction");
        vxd vxdVar = this.k;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.k = null;
    }

    public final void h() {
        g();
        this.k = j47.T(this.h, null, null, new ih9(this, null), 3);
    }

    public final void k(boolean z) {
        hm9.n("uh9", "disconnectNow started");
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacks(this.r);
        }
        this.q = null;
        j47.T(this.h, null, null, new th9(this, null), 3);
        if (z) {
            g();
        }
    }

    public final long l() {
        String str;
        Long lF0;
        tb8 tb8Var = this.B;
        if (tb8Var == null || (str = tb8Var.a) == null || (lF0 = dae.f0(str)) == null) {
            return -1L;
        }
        return lF0.longValue();
    }

    public final ub8 m() {
        gd8 gd8Var;
        Integer num;
        kj6 kj6Var = ub8.a;
        tb8 tb8Var = this.B;
        int iIntValue = (tb8Var == null || (gd8Var = tb8Var.d) == null || (num = gd8Var.H) == null) ? -1 : num.intValue();
        kj6Var.getClass();
        return kj6.m(iIntValue);
    }

    public final bh9 n() {
        gd8 gd8Var = this.D;
        Map map = null;
        if (gd8Var == null) {
            return null;
        }
        CharSequence charSequence = gd8Var.a;
        if (charSequence == null) {
            charSequence = "";
        }
        Bundle bundle = gd8Var.I;
        if (bundle != null) {
            Set<String> setKeySet = bundle.keySet();
            int iZ = mz7.Z(z53.S(setKeySet, 10));
            if (iZ < 16) {
                iZ = 16;
            }
            Map linkedHashMap = new LinkedHashMap(iZ);
            for (String str : setKeySet) {
                linkedHashMap.put(str, bundle.get(str));
            }
            map = linkedHashMap;
        }
        if (map == null) {
            map = oz4.a;
        }
        return new bh9(gd8Var.b, charSequence, map);
    }

    public final long o() {
        return ((Number) this.s.getValue()).longValue();
    }

    public final boolean p(long j) {
        return l() == j;
    }

    public final void q() {
        j47.T(this.h, null, null, new mh9(this, null), 3);
    }

    public final void r() {
        j47.T(this.h, null, null, new nh9(this, null), 3);
    }

    public final void s(ah9 ah9Var) {
        synchronized (this.o) {
            fh9 fh9Var = (fh9) this.p.remove(ah9Var);
            if (fh9Var != null) {
                this.o.remove(fh9Var);
            }
        }
    }

    public final void t() {
        j47.T(this.h, null, null, new sh9(this, null), 3);
    }

    public final void u() {
        hm9.n("uh9", "tryToStartPositionObserving");
        f();
        if (this.q == null) {
            this.q = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.post(this.r);
        }
    }
}
