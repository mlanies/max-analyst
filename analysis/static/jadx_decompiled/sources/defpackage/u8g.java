package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class u8g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u8g(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws wig {
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                v8g v8gVar = (v8g) this.c;
                try {
                    try {
                        fm7 fm7Var = (fm7) v8gVar.B0.get();
                        if (fm7Var == null) {
                            a14.u().q(v8g.D0, v8gVar.X.c + " returned a null result. Treating it as a failure.");
                        } else {
                            a14.u().n(v8g.D0, v8gVar.X.c + " returned a " + fm7Var + ".");
                            v8gVar.s0 = fm7Var;
                        }
                    } catch (Throwable th) {
                        v8gVar.b();
                        throw th;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    a14.u().r(v8g.D0, str + " failed because it threw an exception/error", e);
                } catch (CancellationException e2) {
                    a14 a14VarU = a14.u();
                    String str2 = v8g.D0;
                    a14VarU.y(str + " was cancelled", e2);
                }
                v8gVar.b();
                return;
            case 1:
                rw4 rw4Var = (rw4) this.b;
                im7 im7Var = (im7) this.c;
                Object obj = rw4Var.b;
                if (obj == null) {
                    im7Var.getClass();
                    return;
                }
                try {
                    im7Var.f(obj);
                    return;
                } catch (RuntimeException e3) {
                    im7Var.getClass();
                    throw e3;
                }
            case 2:
                if (((ukg) ((Task) this.b)).d) {
                    ((ogg) this.c).o.o();
                    return;
                }
                try {
                    ((ogg) this.c).o.n(((ogg) this.c).c.u((Task) this.b));
                    return;
                } catch (RuntimeExecutionException e4) {
                    if (e4.getCause() instanceof Exception) {
                        ((ogg) this.c).o.m((Exception) e4.getCause());
                        return;
                    } else {
                        ((ogg) this.c).o.m(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((ogg) this.c).o.m(e5);
                    return;
                }
            case 3:
                cjg cjgVar = (cjg) this.b;
                Context context = (Context) cjgVar.a;
                String string = cjg.i(context).getString("app_set_id", null);
                long j = cjg.i((Context) cjgVar.a).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? 33696000000L + j : -1L;
                qne qneVar = (qne) this.c;
                if (string == null || System.currentTimeMillis() > j2) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context.getPackageName());
                            if (strValueOf.length() != 0) {
                                "Failed to store app set ID generated for App ".concat(strValueOf);
                            }
                            throw new wig("Failed to store the app set ID.");
                        }
                        cjg.j(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            if (strValueOf2.length() != 0) {
                                "Failed to store app set ID creation time for App ".concat(strValueOf2);
                            }
                            throw new wig("Failed to store the app set ID creation time.");
                        }
                    } catch (wig e6) {
                        qneVar.a(e6);
                        return;
                    }
                } else {
                    try {
                        cjg.j(context);
                    } catch (wig e7) {
                        qneVar.a(e7);
                        return;
                    }
                }
                qneVar.b(new mp(string, 1));
                return;
            case 4:
                synchronized (((gig) this.c).c) {
                    try {
                        l3a l3aVar = (l3a) ((gig) this.c).o;
                        if (l3aVar != null) {
                            l3aVar.l((Task) this.b);
                        }
                    } finally {
                    }
                }
                return;
            case 5:
                synchronized (((gig) this.c).c) {
                    try {
                        x3a x3aVar = (x3a) ((gig) this.c).o;
                        if (x3aVar != null) {
                            x3aVar.a(((Task) this.b).f());
                        }
                    } finally {
                    }
                }
                return;
            default:
                gig gigVar = (gig) this.c;
                try {
                    ukg ukgVarK = ((sbe) gigVar.c).k(((Task) this.b).f());
                    ok4 ok4Var = xne.b;
                    ukgVarK.d(ok4Var, gigVar);
                    ukgVarK.c(ok4Var, gigVar);
                    ukgVarK.a(ok4Var, gigVar);
                    return;
                } catch (RuntimeExecutionException e8) {
                    if (e8.getCause() instanceof Exception) {
                        gigVar.onFailure((Exception) e8.getCause());
                        return;
                    } else {
                        gigVar.onFailure(e8);
                        return;
                    }
                } catch (CancellationException unused) {
                    gigVar.d();
                    return;
                } catch (Exception e9) {
                    gigVar.onFailure(e9);
                    return;
                }
        }
    }

    public /* synthetic */ u8g(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
