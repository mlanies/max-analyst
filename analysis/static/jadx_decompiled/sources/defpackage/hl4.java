package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final /* synthetic */ class hl4 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((il4) this.b).getClass();
                return true;
            case 1:
                so4 so4Var = (so4) this.b;
                so4Var.getClass();
                int i = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = so4Var.e;
                if (i == 1) {
                    List list = (List) message.obj;
                    so4Var.h = true;
                    so4Var.l = Collections.unmodifiableList(list);
                    boolean zD = so4Var.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((qo4) it.next()).a(so4Var);
                    }
                    if (zD) {
                        so4Var.a();
                    }
                } else if (i == 2) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    int i4 = so4Var.f - i2;
                    so4Var.f = i4;
                    so4Var.g = i3;
                    if (i3 == 0 && i4 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((qo4) it2.next()).c();
                        }
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    oo4 oo4Var = (oo4) message.obj;
                    so4Var.l = Collections.unmodifiableList(oo4Var.c);
                    boolean zD2 = so4Var.d();
                    boolean z = oo4Var.b;
                    dn4 dn4Var = oo4Var.a;
                    if (z) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((qo4) it3.next()).f(so4Var, dn4Var);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((qo4) it4.next()).e(dn4Var, oo4Var.d);
                        }
                    }
                    if (zD2) {
                        so4Var.a();
                    }
                }
                return true;
            case 2:
                pm7 pm7Var = (pm7) this.b;
                Iterator it5 = pm7Var.d.iterator();
                while (it5.hasNext()) {
                    om7 om7Var = (om7) it5.next();
                    if (!om7Var.d && om7Var.c) {
                        tm5 tm5VarE = om7Var.b.e();
                        om7Var.b = new rm5(1);
                        om7Var.c = false;
                        pm7Var.c.d(om7Var.a, tm5VarE);
                    }
                    if (pm7Var.b.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                z23 z23Var = (z23) this.b;
                Iterator it6 = ((CopyOnWriteArraySet) z23Var.d).iterator();
                while (it6.hasNext()) {
                    nm7 nm7Var = (nm7) it6.next();
                    if (nm7Var.c) {
                        sm5 sm5VarD = nm7Var.b.d();
                        nm7Var.b = new rm5(0);
                        nm7Var.c = false;
                        ((lm7) z23Var.c).e(nm7Var.a, sm5VarD);
                    }
                    if (((aie) z23Var.a).a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            case 4:
                va8 va8Var = (va8) this.b;
                va8Var.getClass();
                if (message.what == 1) {
                    try {
                        w98 w98Var = (w98) va8Var.c;
                        w98Var.w.m0(w98Var.c);
                    } catch (RemoteException unused) {
                        z04.c0("Error in sending flushCommandQueue");
                    }
                }
                return true;
            case 5:
                ba8 ba8Var = (ba8) this.b;
                ba8Var.getClass();
                if (message.what == 1) {
                    da8 da8Var = ba8Var.e;
                    da8Var.G(false, da8Var.l);
                }
                return true;
            case 6:
                l1f l1fVar = (l1f) this.b;
                if (l1fVar.z && message.what != 4) {
                    return true;
                }
                try {
                    int i5 = message.what;
                    int i6 = 0;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            l1fVar.f((yqc) message.obj);
                            return true;
                        }
                        if (i5 == 3) {
                            l1fVar.c();
                            return true;
                        }
                        if (i5 != 4) {
                            return false;
                        }
                        l1fVar.d(message.arg1, (ExportException) message.obj);
                        return true;
                    }
                    while (true) {
                        ArrayList arrayList = l1fVar.k;
                        if (i6 >= arrayList.size()) {
                            return true;
                        }
                        ((e6d) arrayList.get(i6)).start();
                        i6++;
                    }
                } catch (ExportException e) {
                    l1fVar.d(2, e);
                    return true;
                } catch (RuntimeException e2) {
                    l1fVar.d(2, ExportException.e(e2));
                    return true;
                }
                break;
            default:
                hrf hrfVar = (hrf) this.b;
                hrfVar.getClass();
                int i7 = message.what;
                if (i7 == 1) {
                    hrfVar.q.o("recconect requested");
                    hrfVar.g.execute(new ule(17, hrfVar));
                } else {
                    if (i7 != 2) {
                        throw new RuntimeException("unhandled message " + message.what);
                    }
                    hrfVar.q.o("handleServerPingTimeout, timeout=" + hrfVar.r);
                    synchronized (hrfVar.b) {
                        try {
                            if (hrfVar.c != null) {
                                hrfVar.n.onFailedByPings();
                                ((m8c) hrfVar.c).b(4000, "dispose");
                                hrfVar.c = null;
                            }
                        } finally {
                        }
                    }
                    hrfVar.d();
                }
                return true;
        }
    }
}
