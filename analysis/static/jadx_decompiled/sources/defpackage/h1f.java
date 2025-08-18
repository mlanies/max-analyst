package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Looper;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class h1f {
    public final Context a;
    public final f1f b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final pm7 f;
    public final vt g;
    public final yb9 h;
    public final zff i;
    public final v43 j;
    public final cj9 k;
    public final Looper l;
    public final xw0 m;
    public final she n;
    public final bie o;
    public final ece p;
    public final t85 q;
    public l1f r;
    public hj9 s;
    public dd3 t;
    public String u;
    public int v;
    public zd9 w;

    static {
        nc8.a("media3.transformer");
    }

    public h1f(Context context, f1f f1fVar, long j, pm7 pm7Var, yb9 yb9Var, qf4 qf4Var, na4 na4Var, rxd rxdVar, Looper looper) {
        xw0 xw0Var = xw0.o;
        she sheVar = she.a;
        this.a = context;
        this.b = f1fVar;
        this.c = false;
        this.d = false;
        this.e = j;
        this.f = pm7Var;
        this.g = null;
        this.h = yb9Var;
        this.i = qf4Var;
        this.j = na4Var;
        this.k = rxdVar;
        this.l = looper;
        this.m = xw0Var;
        this.n = sheVar;
        this.v = 0;
        this.o = sheVar.a(looper, null);
        this.p = new ece(this);
        t85 t85Var = new t85();
        t85Var.b();
        this.q = t85Var;
    }

    public static void a(h1f h1fVar) {
        h1fVar.v = 0;
        dd3 dd3Var = h1fVar.t;
        dd3Var.getClass();
        String str = h1fVar.u;
        str.getClass();
        h1fVar.f(dd3Var, new hj9(str, h1fVar.k, h1fVar.p, 0, false, null, h1fVar.e), h1fVar.p, 0L);
    }

    public static void b(h1f h1fVar) {
        h1fVar.getClass();
        gte gteVar = new gte(2, h1fVar);
        pm7 pm7Var = h1fVar.f;
        pm7Var.c(-1, gteVar);
        pm7Var.b();
        h1fVar.v = 0;
    }

    public final void c() {
        g();
        l1f l1fVar = this.r;
        if (l1fVar == null) {
            return;
        }
        try {
            if (!l1fVar.z) {
                l1fVar.g();
                l1fVar.j.b(null, 4, 1, 0).b();
                l1fVar.g.getClass();
                l1fVar.p.b();
                l1fVar.p.c();
                RuntimeException runtimeException = l1fVar.w;
                if (runtimeException != null) {
                    throw runtimeException;
                }
            }
        } finally {
            this.r = null;
        }
    }

    public final int d(fm5 fm5Var) {
        int iE;
        int iE2;
        g();
        int i = this.v;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return 3;
        }
        if (!(i == 5 || i == 6)) {
            l1f l1fVar = this.r;
            if (l1fVar == null) {
                return 0;
            }
            return l1fVar.e(fm5Var);
        }
        if (this.w != null) {
            dd3 dd3Var = this.t;
            fm9.h(dd3Var);
            long j = ((lv4) ((mv4) dd3Var.a.get(0)).a.get(0)).a.e.b;
            zd9 zd9Var = this.w;
            float f = (zd9Var.b - j) / zd9Var.a;
            if (this.v == 5) {
                l1f l1fVar2 = this.r;
                if (l1fVar2 != null && (iE2 = l1fVar2.e(fm5Var)) != 0 && iE2 != 1) {
                    if (iE2 != 2) {
                        if (iE2 == 3) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    fm5Var.b = Math.round(fm5Var.b * f);
                }
            } else {
                float f2 = 100.0f * f;
                l1f l1fVar3 = this.r;
                if (l1fVar3 == null || (iE = l1fVar3.e(fm5Var)) == 0 || iE == 1) {
                    fm5Var.b = Math.round(f2);
                } else {
                    if (iE != 2) {
                        if (iE == 3) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    fm5Var.b = Math.round(((1.0f - f) * fm5Var.b) + f2);
                }
            }
            return 2;
        }
        return 1;
    }

    public final void e(dd3 dd3Var, String str) {
        g();
        this.t = dd3Var;
        this.u = str;
        this.q.b();
        if (this.c) {
            dd3 dd3Var2 = this.t;
            fm9.h(dd3Var2);
            if (dd3Var2.a.size() <= 1 && ((mv4) this.t.a.get(0)).a.size() <= 1) {
                this.v = 5;
                dd3 dd3Var3 = this.t;
                fm9.h(dd3Var3);
                lv4 lv4Var = (lv4) ((mv4) dd3Var3.a.get(0)).a.get(0);
                tb8 tb8Var = lv4Var.a;
                db8 db8Var = tb8Var.e;
                long j = db8Var.b;
                ib8 ib8Var = tb8Var.b;
                fm9.h(ib8Var);
                ccd ccdVarT = tpa.t(this.a, j, ib8Var.a.toString());
                qy qyVar = new qy(this, db8Var.d, j, lv4Var);
                bie bieVar = this.o;
                Objects.requireNonNull(bieVar);
                fm9.b(ccdVarT, qyVar, new wc3(bieVar, 1));
                return;
            }
        }
        f(dd3Var, new hj9(str, this.k, this.p, 0, this.d, null, this.e), this.p, 0L);
    }

    public final void f(dd3 dd3Var, hj9 hj9Var, ece eceVar, long j) {
        BitmapFactory.Options options;
        qm7 pc9Var;
        fm9.j("There is already an export in progress.", this.r == null);
        f1f f1fVarA = this.b;
        if (dd3Var.g != 0) {
            ty tyVarA = f1fVarA.a();
            tyVarA.b = dd3Var.g;
            f1fVarA = tyVarA.a();
        }
        f1f f1fVar = f1fVarA;
        x99 x99Var = new x99(dd3Var, this.f, this.o, f1fVar);
        vt vtVar = this.g;
        vt vtVar2 = vtVar;
        if (vtVar == null) {
            Context context = this.a;
            Context applicationContext = context.getApplicationContext();
            av1 av1Var = new av1();
            xw0 xw0Var = xw0.Z;
            pkg pkgVar = new pkg();
            pkgVar.a = applicationContext;
            pkgVar.c = av1Var;
            pkgVar.b = -2000;
            pkgVar.o = xw0Var;
            she sheVar = this.n;
            xe5 xe5Var = new xe5();
            xe5Var.a = context.getApplicationContext();
            xe5Var.b = pkgVar;
            xe5Var.c = sheVar;
            if (oaf.a >= 26) {
                options = new BitmapFactory.Options();
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            } else {
                options = null;
            }
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            if (executorServiceNewSingleThreadExecutor instanceof qm7) {
                pc9Var = (qm7) executorServiceNewSingleThreadExecutor;
            } else {
                pc9Var = executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new pc9((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new mc9(executorServiceNewSingleThreadExecutor);
            }
            xe5Var.o = new v24(pc9Var, new h94(context), options);
            vtVar2 = xe5Var;
        }
        vt vtVar3 = vtVar2;
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
            d54.a.clear();
            SystemClock.elapsedRealtime();
        }
        l1f l1fVar = new l1f(this.a, dd3Var, f1fVar, vtVar3, this.h, this.i, this.j, hj9Var, eceVar, x99Var, this.o, this.m, this.n, j);
        this.r = l1fVar;
        l1fVar.g();
        l1fVar.j.f(1);
        synchronized (l1fVar.r) {
            l1fVar.x = 1;
            l1fVar.y = 0;
        }
    }

    public final void g() {
        if (Looper.myLooper() != this.l) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }
}
