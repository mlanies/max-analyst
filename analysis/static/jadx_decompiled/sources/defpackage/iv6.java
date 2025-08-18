package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class iv6 {
    public static final CancellationException l = new CancellationException("Prefetching is not enabled");
    public final kab a;
    public final ide b;
    public final ide c;
    public final p06 d;
    public final o06 e;
    public final lq8 f;
    public final lq8 g;
    public final o84 h;
    public final ide i;
    public final AtomicLong j = new AtomicLong();
    public final kv6 k;

    static {
        new CancellationException("ImageRequest is null");
        new CancellationException("Modified URL is null");
    }

    public iv6(kab kabVar, Set set, Set set2, nde ndeVar, y7g y7gVar, y7g y7gVar2, ide ideVar, o84 o84Var, ide ideVar2, kv6 kv6Var) {
        this.a = kabVar;
        this.b = ndeVar;
        this.c = ideVar;
        this.d = new p06(set);
        this.e = new o06(set2);
        this.f = y7gVar;
        this.g = y7gVar2;
        this.h = o84Var;
        this.i = ideVar2;
        this.k = kv6Var;
    }

    public final g0 a(wv6 wv6Var, Object obj) {
        return b(wv6Var, obj, null, null, null);
    }

    public final g0 b(wv6 wv6Var, Object obj, vv6 vv6Var, uhc uhcVar, String str) {
        if (wv6Var == null) {
            return ju0.x(new NullPointerException());
        }
        try {
            kab kabVar = this.a;
            kabVar.getClass();
            f46.I();
            q6b q6bVar = wv6Var.q;
            dab dabVarA = kabVar.a(wv6Var);
            if (q6bVar != null) {
                dabVarA = kabVar.f(dabVarA);
            }
            dab dabVar = dabVarA;
            if (vv6Var == null) {
                vv6Var = vv6.FULL_FETCH;
            }
            return h(dabVar, wv6Var, vv6Var, obj, uhcVar, str);
        } catch (Exception e) {
            return ju0.x(e);
        }
    }

    public final g0 c(wv6 wv6Var) {
        if (wv6Var.b == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        try {
            dab dabVarD = this.a.d(wv6Var);
            if (wv6Var.i != null) {
                xv6 xv6VarB = xv6.b(wv6Var);
                xv6VarB.d = null;
                wv6Var = xv6VarB.a();
            }
            return h(dabVarD, wv6Var, vv6.FULL_FETCH, null, null, null);
        } catch (Exception e) {
            return ju0.x(e);
        }
    }

    public final do0 d(wv6 wv6Var, t68 t68Var) {
        f46.I();
        q6b q6bVar = wv6Var.q;
        o84 o84Var = this.h;
        return q6bVar != null ? o84Var.j(wv6Var, t68Var) : o84Var.b(wv6Var, t68Var);
    }

    public final p06 e(wv6 wv6Var, uhc uhcVar) {
        if (wv6Var == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        p06 p06Var = this.d;
        uhc uhcVar2 = wv6Var.r;
        return uhcVar == null ? uhcVar2 == null ? p06Var : new p06(p06Var, uhcVar2) : uhcVar2 == null ? new p06(p06Var, uhcVar) : new p06(p06Var, uhcVar, uhcVar2);
    }

    public final g0 f(wv6 wv6Var, t68 t68Var) {
        f46.I();
        a9b a9bVar = a9b.b;
        CancellationException cancellationException = l;
        ide ideVar = this.i;
        kv6 kv6Var = this.k;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return ju0.x(cancellationException);
        }
        try {
            kv6Var.v.getClass();
            if (wv6Var == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Boolean bool = wv6Var.p;
            boolean zBooleanValue = bool != null ? !bool.booleanValue() : ((Boolean) ideVar.get()).booleanValue();
            kab kabVar = this.a;
            return i(zBooleanValue ? kabVar.c(wv6Var) : kabVar.b(wv6Var), wv6Var, t68Var, a9bVar);
        } catch (Exception e) {
            return ju0.x(e);
        }
    }

    public final g0 g(wv6 wv6Var) {
        a9b a9bVar = a9b.c;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return ju0.x(l);
        }
        if (wv6Var == null) {
            return ju0.x(new NullPointerException("imageRequest is null"));
        }
        try {
            return i(this.a.c(wv6Var), wv6Var, null, a9bVar);
        } catch (Exception e) {
            return ju0.x(e);
        }
    }

    public final g0 h(dab dabVar, wv6 wv6Var, vv6 vv6Var, Object obj, uhc uhcVar, String str) {
        f46.I();
        b47 b47Var = new b47(e(wv6Var, uhcVar), this.e);
        try {
            vv6 vv6Var2 = wv6Var.l;
            fcd fcdVar = new fcd(wv6Var, String.valueOf(this.j.getAndIncrement()), str, b47Var, obj, vv6Var2.a > vv6Var.a ? vv6Var2 : vv6Var, false, wv6Var.e || !e9f.e(wv6Var.b), wv6Var.k, this.k);
            f46.I();
            m43 m43Var = new m43(dabVar, fcdVar, b47Var, 0);
            f46.I();
            return m43Var;
        } catch (Exception e) {
            return ju0.x(e);
        }
    }

    public final g0 i(dab dabVar, wv6 wv6Var, t68 t68Var, a9b a9bVar) throws NumberFormatException {
        wv6 wv6VarA = wv6Var;
        vv6 vv6Var = vv6.FULL_FETCH;
        b47 b47Var = new b47(e(wv6VarA, null), this.e);
        Uri uri = wv6VarA.b;
        if (!uri.equals(uri)) {
            xv6 xv6VarB = xv6.b(wv6Var);
            xv6VarB.a = uri;
            wv6VarA = xv6VarB.a();
        }
        wv6 wv6Var2 = wv6VarA;
        try {
            vv6 vv6Var2 = wv6Var2.l;
            vv6 vv6Var3 = vv6Var2.a > 1 ? vv6Var2 : vv6Var;
            String strValueOf = String.valueOf(this.j.getAndIncrement());
            kv6 kv6Var = this.k;
            ho9 ho9Var = kv6Var.v;
            return new m43(dabVar, new fcd(wv6Var2, strValueOf, null, b47Var, t68Var, vv6Var3, true, false, a9bVar, kv6Var), b47Var, 1);
        } catch (Exception e) {
            return ju0.x(e);
        }
    }
}
