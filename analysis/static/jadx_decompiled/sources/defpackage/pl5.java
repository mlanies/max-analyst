package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* loaded from: classes2.dex */
public final class pl5 implements m1e {
    public final aab a;
    public final boolean b;
    public final k56 c;
    public final i50 d;
    public final i50 e;
    public final qh4 f;

    public pl5(m61 m61Var, aab aabVar, wte wteVar, boolean z, vx0 vx0Var, ky0 ky0Var, a4c a4cVar) {
        this.a = aabVar;
        this.b = z;
        this.c = vx0Var;
        this.d = new i50(wteVar, m61Var, a4cVar, "incomingP2PFirstDataStat", "direct_incoming");
        this.e = new i50(wteVar, m61Var, a4cVar, "outgoingP2PFirstDataStat", "direct_outgoing");
        qh4 qh4Var = new qh4();
        qh4Var.a = z;
        qh4Var.c = wteVar;
        qh4Var.d = ky0Var;
        qh4Var.e = m61Var;
        qh4Var.f = a4cVar;
        qh4Var.g = "";
        this.f = qh4Var;
    }

    public static boolean b(m5d m5dVar) {
        List list = (List) m5dVar.b;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BigInteger bigInteger = ((dxd) it.next()).j;
                if (bigInteger != null && bigInteger.compareTo(BigInteger.ZERO) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.m1e
    public final void a(c4c c4cVar) {
        qh4 qh4Var = this.f;
        if (qh4Var.b) {
            return;
        }
        i50 i50Var = this.d;
        if (i50Var.b) {
            return;
        }
        i50 i50Var2 = this.e;
        if (i50Var2.b) {
            return;
        }
        k56 k56Var = this.c;
        Object objInvoke = k56Var.invoke();
        xxe xxeVar = xxe.c;
        List list = c4cVar.c;
        boolean z = true;
        if (objInvoke == xxeVar) {
            cz1 cz1VarC = c4cVar.c();
            if (cz1VarC == null || !b(j1e.I(j1e.J(list, cz1VarC))) || qh4Var.b) {
                return;
            }
            if (((Number) ((k56) qh4Var.d).invoke()).intValue() == 0) {
                qh4Var.b = true;
                return;
            }
            Long l = (Long) qh4Var.h;
            if (l == null) {
                ((a4c) qh4Var.f).log("ServerTopologyFirstDataStat", "Data is received but accept event wasn't triggered");
                return;
            }
            ((wte) ((vte) qh4Var.c)).getClass();
            ((n61) ((m61) qh4Var.e)).c("first_media_received", EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - l.longValue()), new EventItemsMap(Collections.singletonMap("call_type", EventItemValueKt.toEventItemValue((String) qh4Var.g))));
            qh4Var.b = true;
            return;
        }
        cz1 cz1VarC2 = c4cVar.c();
        if (cz1VarC2 == null) {
            return;
        }
        m5d m5dVarI = j1e.I(j1e.J(list, cz1VarC2));
        boolean zB = b(m5dVarI);
        List list2 = (List) m5dVarI.c;
        if (list2.isEmpty()) {
            z = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                BigInteger bigInteger = ((hxd) it.next()).j;
                if (bigInteger != null && bigInteger.compareTo(BigInteger.ZERO) > 0) {
                    break;
                }
            }
            z = false;
        }
        if ((zB || z) && k56Var.invoke() != xxeVar) {
            if (this.b) {
                i50Var2.f();
            } else {
                i50Var.f();
            }
        }
    }

    public final void c() {
        this.e.d();
        qh4 qh4Var = this.f;
        if (!qh4Var.b && qh4Var.a) {
            ((wte) ((vte) qh4Var.c)).getClass();
            qh4Var.h = Long.valueOf(SystemClock.elapsedRealtime());
            qh4Var.g = "server_change_topology";
        }
    }

    public final void d() {
        qh4 qh4Var = this.f;
        if (qh4Var.b) {
            return;
        }
        ((wte) ((vte) qh4Var.c)).getClass();
        qh4Var.h = Long.valueOf(SystemClock.elapsedRealtime());
        qh4Var.g = "server_join_server";
    }
}
