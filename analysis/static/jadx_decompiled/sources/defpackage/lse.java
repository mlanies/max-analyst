package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class lse extends pnf {
    public final s35 X;
    public final Context b;
    public final je7 c;
    public final q0e o;

    public lse() {
        fi4 fi4Var = fi4.a;
        Context context = (Context) fi4Var.getAccessor().c(Context.class);
        khe kheVarD = fi4Var.getAccessor().d(kke.class);
        this.b = context;
        this.c = kheVarD;
        this.o = r0e.a(q());
        this.X = new s35(0);
    }

    public final kl7 q() {
        kl7 kl7VarL = j1e.l();
        pq9 pq9Var = qp4.u0;
        Context context = this.b;
        List listE0 = x53.e0(((ConcurrentHashMap) ((je7) ((adb) pq9Var.b(context).X).c).getValue()).values());
        ArrayList arrayList = new ArrayList(z53.S(listE0, 10));
        Iterator it = ((ArrayList) listE0).iterator();
        while (it.hasNext()) {
            String str = ((sba) it.next()).a;
            arrayList.add(new vre(str, Boolean.valueOf(tpa.f(str, pq9Var.b(context).g().a))));
        }
        kl7VarL.addAll(arrayList);
        return j1e.d(kl7VarL);
    }
}
