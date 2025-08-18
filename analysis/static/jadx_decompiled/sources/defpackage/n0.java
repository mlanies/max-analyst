package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class n0 {
    public static final l0 m = new l0();
    public static final NullPointerException n = new NullPointerException("No image request was specified!");
    public static final AtomicLong o = new AtomicLong();
    public final Context a;
    public final Set b;
    public final Set c;
    public ide g;
    public boolean k;
    public Object d = null;
    public Object e = null;
    public Object f = null;
    public ev3 h = null;
    public boolean i = false;
    public boolean j = false;
    public mq4 l = null;

    public n0(Context context, Set set, Set set2) {
        this.a = context;
        this.b = set;
        this.c = set2;
    }

    public final d2b a() {
        d2b d2bVar;
        Object obj;
        if (!(this.g == null || (this.e == null && this.f == null))) {
            throw new IllegalStateException("Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        }
        if (this.e == null && (obj = this.f) != null) {
            this.e = obj;
            this.f = null;
        }
        f46.I();
        e2b e2bVar = (e2b) this;
        f46.I();
        try {
            mq4 mq4Var = e2bVar.l;
            String strValueOf = String.valueOf(o.getAndIncrement());
            if (mq4Var instanceof d2b) {
                d2bVar = (d2b) mq4Var;
            } else {
                ty2 ty2Var = e2bVar.q;
                d2b d2bVar2 = new d2b((Resources) ty2Var.a, (bg4) ty2Var.b, (j84) ((cq4) ty2Var.c), (ExecutorService) ((Executor) ty2Var.o), (y7g) ((lq8) ty2Var.X), (wz) ty2Var.Y);
                ide ideVar = (ide) ty2Var.Z;
                if (ideVar != null) {
                    d2bVar2.D = ((Boolean) ideVar.get()).booleanValue();
                }
                d2bVar = d2bVar2;
            }
            ide ideVarB = e2bVar.b(d2bVar, strValueOf);
            wv6 wv6Var = (wv6) e2bVar.e;
            o84 o84Var = e2bVar.p.h;
            do0 do0VarJ = (o84Var == null || wv6Var == null) ? null : wv6Var.q != null ? o84Var.j(wv6Var, e2bVar.d) : o84Var.b(wv6Var, e2bVar.d);
            Object obj2 = e2bVar.d;
            d2bVar.getClass();
            f46.I();
            d2bVar.g(obj2, strValueOf);
            d2bVar.s = false;
            d2bVar.t = false;
            d2bVar.C = ideVarB;
            d2bVar.v(null);
            d2bVar.B = do0VarJ;
            d2bVar.E = null;
            d2bVar.v(null);
            f46.I();
            d2bVar.t(e2bVar.r, e2bVar);
            f46.I();
            d2bVar.t = false;
            d2bVar.o = this.k;
            d2bVar.p = null;
            boolean z = this.i;
            if (z) {
                if (d2bVar.d == null) {
                    zs6 zs6Var = new zs6();
                    zs6Var.b = false;
                    zs6Var.a = 4;
                    zs6Var.c = 0;
                    d2bVar.d = zs6Var;
                }
                d2bVar.d.b = z;
                if (d2bVar.e == null) {
                    ta6 ta6Var = new ta6(this.a);
                    d2bVar.e = ta6Var;
                    ta6Var.a = d2bVar;
                }
            }
            Set set = this.b;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    d2bVar.a((ev3) it.next());
                }
            }
            Set set2 = this.c;
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    d2bVar.g.addListener((ControllerListener2) it2.next());
                }
            }
            ev3 ev3Var = this.h;
            if (ev3Var != null) {
                d2bVar.a(ev3Var);
            }
            if (this.j) {
                d2bVar.a(m);
            }
            f46.I();
            return d2bVar;
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final ide b(d2b d2bVar, String str) {
        ide ideVar = this.g;
        if (ideVar != null) {
            return ideVar;
        }
        Object obj = this.e;
        ide m0Var = obj != null ? new m0(this, d2bVar, str, obj, this.d, 1) : null;
        if (m0Var != null && this.f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(m0Var);
            arrayList.add(new m0(this, d2bVar, str, this.f, this.d, 1));
            m0Var = new rz6(arrayList, false);
        }
        return m0Var == null ? new x24() : m0Var;
    }
}
