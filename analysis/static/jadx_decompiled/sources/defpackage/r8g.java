package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class r8g implements Runnable {
    public final Object X;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ r8g(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        h8g h8gVarL;
        Object obj = this.X;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.o;
        switch (this.a) {
            case 0:
                d8d d8dVar = (d8d) obj3;
                hm9.m("s8g", "set beans for task = %s", d8dVar);
                d8dVar.a = (e8d) ((je7) obj4).getValue();
                try {
                    hm9.m("s8g", "start processing task = %s", d8dVar);
                    d8dVar.x();
                    hm9.m("s8g", "finished processing task = %s", d8dVar);
                    return;
                } catch (Exception e) {
                    hm9.p("s8g", "exception = " + e.getMessage() + ", task = " + d8dVar, e);
                    cba cbaVar = (cba) ((o45) obj);
                    cbaVar.c(e, true);
                    d8dVar.w();
                    if (d8dVar instanceof hua) {
                        hua huaVar = (hua) d8dVar;
                        je7 je7Var = (je7) obj2;
                        ((eoe) je7Var.getValue()).c(huaVar.getId());
                        une uneVarJ = ((eoe) je7Var.getValue()).j(huaVar.getId());
                        if (uneVarJ == null || uneVarJ.c < 10) {
                            return;
                        }
                        try {
                            huaVar.d();
                        } catch (Throwable th) {
                            cbaVar.c(new HandledException("TaskRunnable: failed to execute onMaxFailCount method for task " + huaVar.getId() + " type " + huaVar.getType(), th), true);
                        }
                        ((eoe) je7Var.getValue()).d(huaVar.getId());
                        hm9.n("s8g", "remove task because it cause too many exceptions: ".concat(r8g.class.getName()));
                        return;
                    }
                    return;
                }
            case 1:
                yz1 yz1Var = (yz1) obj3;
                if (yz1Var != null) {
                    gaa gaaVar = (gaa) obj;
                    ((zz1) gaaVar.a).L0 = true;
                    yz1Var.b.c(false);
                    ((zz1) gaaVar.a).L0 = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((wq8) obj4).q(menuItem, null, 4);
                    return;
                }
                return;
            case 2:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((hc3) obj2).d();
                    gb3 gb3Var = (gb3) obj;
                    pa3 pa3Var = gb3Var.X;
                    if (pa3Var != null) {
                        pa3Var.i(new gd1(5, this));
                        return;
                    } else {
                        ((ab3) obj4).onError(new TimeoutException(q45.e(gb3Var.b, gb3Var.c)));
                        return;
                    }
                }
                return;
            case 3:
                gaa gaaVar2 = (gaa) obj;
                s68 s68Var = (s68) ((cj8) gaaVar2.a).X.get(((c78) ((b78) obj3)).a.getBinder());
                if (s68Var == null) {
                    return;
                }
                cj8 cj8Var = (cj8) gaaVar2.a;
                cj8Var.getClass();
                HashMap map = s68Var.f;
                String str = (String) obj2;
                IBinder iBinder = (IBinder) obj4;
                try {
                    if (iBinder == null) {
                        map.remove(str);
                    } else {
                        List list = (List) map.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((mpa) it.next()).a) {
                                    it.remove();
                                }
                            }
                            if (list.size() == 0) {
                                map.remove(str);
                            }
                        }
                    }
                    return;
                } finally {
                    cj8Var.Y = null;
                }
            case 4:
                gaa gaaVar3 = (gaa) obj;
                s68 s68Var2 = (s68) ((cj8) gaaVar3.a).X.get(((c78) ((b78) obj3)).a.getBinder());
                Bundle bundle = (Bundle) obj2;
                if (s68Var2 == null) {
                    Objects.toString(bundle);
                    return;
                }
                ((cj8) gaaVar3.a).Y = s68Var2;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                ((ResultReceiver) obj4).send(-1, null);
                return;
            case 5:
                ry1 ry1Var = (ry1) obj2;
                try {
                    j47.f0(((lx3) obj3).minusKey(vu4.b), new klc((ilc) obj4, (sy1) ry1Var, (llc) ((a66) obj), null));
                    return;
                } catch (Throwable th2) {
                    ry1Var.cancel(th2);
                    return;
                }
            case 6:
                g6g.h((View) obj3, (k6g) obj2, (l7b) obj4);
                ((ValueAnimator) obj).start();
                return;
            default:
                dcd dcdVar = (dcd) obj4;
                UUID uuid = (UUID) obj3;
                String string = uuid.toString();
                a14 a14VarU = a14.u();
                String str2 = b8g.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                d24 d24Var = (d24) obj2;
                sb.append(d24Var);
                sb.append(")");
                a14VarU.n(str2, sb.toString());
                b8g b8gVar = (b8g) obj;
                WorkDatabase workDatabase = b8gVar.a;
                WorkDatabase workDatabase2 = b8gVar.a;
                workDatabase.c();
                try {
                    h8gVarL = workDatabase2.y().l(string);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (h8gVarL == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (h8gVarL.b == m7g.b) {
                    z7g z7gVar = new z7g(string, d24Var);
                    a8g a8gVarX = workDatabase2.x();
                    ilc ilcVar = (ilc) a8gVarX.a;
                    ilcVar.b();
                    ilcVar.c();
                    try {
                        ((x7g) a8gVarX.b).C(z7gVar);
                        ilcVar.r();
                        ilcVar.l();
                    } catch (Throwable th3) {
                        ilcVar.l();
                        throw th3;
                    }
                } else {
                    a14.u().R(str2, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                dcdVar.j(null);
                workDatabase2.r();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "WorkerService.TaskRunnable{" + ((d8d) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r8g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public r8g(d8d d8dVar, je7 je7Var, o45 o45Var, je7 je7Var2) {
        this.a = 0;
        this.b = d8dVar;
        this.c = je7Var;
        this.X = o45Var;
        this.o = je7Var2;
    }

    public r8g(gaa gaaVar, c78 c78Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 4;
        this.X = gaaVar;
        this.b = c78Var;
        this.c = bundle;
        this.o = resultReceiver;
    }
}
