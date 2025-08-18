package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class y9b implements w45, cy5 {
    public static final String x0 = a14.O("Processor");
    public final WorkDatabase X;
    public final Context b;
    public final me3 c;
    public final wne o;
    public final List t0;
    public final HashMap Z = new HashMap();
    public final HashMap Y = new HashMap();
    public final HashSet u0 = new HashSet();
    public final ArrayList v0 = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object w0 = new Object();
    public final HashMap s0 = new HashMap();

    public y9b(Context context, me3 me3Var, bkb bkbVar, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = me3Var;
        this.o = bkbVar;
        this.X = workDatabase;
        this.t0 = list;
    }

    public static boolean c(String str, v8g v8gVar) {
        if (v8gVar == null) {
            a14.u().n(x0, "WorkerWrapper could not be found for " + str);
            return false;
        }
        v8gVar.C0 = true;
        v8gVar.h();
        v8gVar.B0.cancel(true);
        if (v8gVar.Y == null || !(v8gVar.B0.a instanceof r0)) {
            a14.u().n(v8g.D0, "WorkSpec " + v8gVar.X + " is already done. Not interrupting.");
        } else {
            v8gVar.Y.stop();
        }
        a14.u().n(x0, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(w45 w45Var) {
        synchronized (this.w0) {
            this.v0.add(w45Var);
        }
    }

    @Override // defpackage.w45
    public final void b(l7g l7gVar, boolean z) {
        synchronized (this.w0) {
            try {
                v8g v8gVar = (v8g) this.Z.get(l7gVar.a);
                if (v8gVar != null && l7gVar.equals(ju0.n(v8gVar.X))) {
                    this.Z.remove(l7gVar.a);
                }
                a14.u().n(x0, y9b.class.getSimpleName() + " " + l7gVar.a + " executed; reschedule = " + z);
                Iterator it = this.v0.iterator();
                while (it.hasNext()) {
                    ((w45) it.next()).b(l7gVar, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.w0) {
            try {
                z = this.Z.containsKey(str) || this.Y.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void e(w45 w45Var) {
        synchronized (this.w0) {
            this.v0.remove(w45Var);
        }
    }

    public final void f(l7g l7gVar) {
        ((k40) ((bkb) this.o).c).execute(new av2(this, l7gVar));
    }

    public final void g(String str, ay5 ay5Var) {
        synchronized (this.w0) {
            try {
                a14.u().x(x0, "Moving WorkSpec (" + str + ") to the foreground");
                v8g v8gVar = (v8g) this.Z.remove(str);
                if (v8gVar != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockA = qrf.a(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.Y.put(str, v8gVar);
                    nt3.b(this.b, uhe.d(this.b, ju0.n(v8gVar.X), ay5Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(yzd yzdVar, glc glcVar) {
        l7g l7gVar = yzdVar.a;
        String str = l7gVar.a;
        ArrayList arrayList = new ArrayList();
        h8g h8gVar = (h8g) this.X.p(new cu0(this, arrayList, str, 2));
        if (h8gVar == null) {
            a14.u().R(x0, "Didn't find WorkSpec for id " + l7gVar);
            f(l7gVar);
            return false;
        }
        synchronized (this.w0) {
            try {
                if (d(str)) {
                    Set set = (Set) this.s0.get(str);
                    if (((yzd) set.iterator().next()).a.b == l7gVar.b) {
                        set.add(yzdVar);
                        a14.u().n(x0, "Work " + l7gVar + " is already enqueued for processing");
                    } else {
                        f(l7gVar);
                    }
                    return false;
                }
                if (h8gVar.t != l7gVar.b) {
                    f(l7gVar);
                    return false;
                }
                Context context = this.b;
                me3 me3Var = this.c;
                wne wneVar = this.o;
                WorkDatabase workDatabase = this.X;
                qp4 qp4Var = new qp4();
                qp4Var.t0 = new glc(14);
                qp4Var.b = context.getApplicationContext();
                qp4Var.a = wneVar;
                qp4Var.c = this;
                qp4Var.o = me3Var;
                qp4Var.X = workDatabase;
                qp4Var.Y = h8gVar;
                qp4Var.s0 = arrayList;
                qp4Var.Z = this.t0;
                if (glcVar != null) {
                    qp4Var.t0 = glcVar;
                }
                v8g v8gVar = new v8g(qp4Var);
                dcd dcdVar = v8gVar.A0;
                dcdVar.d(new wi3(this, yzdVar.a, dcdVar, 4), (k40) ((bkb) this.o).c);
                this.Z.put(str, v8gVar);
                HashSet hashSet = new HashSet();
                hashSet.add(yzdVar);
                this.s0.put(str, hashSet);
                ((qm) ((bkb) this.o).a).execute(v8gVar);
                a14.u().n(x0, y9b.class.getSimpleName() + ": processing " + l7gVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.w0) {
            try {
                if (!(!this.Y.isEmpty())) {
                    Context context = this.b;
                    String str = uhe.u0;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable th) {
                        a14.u().r(x0, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
