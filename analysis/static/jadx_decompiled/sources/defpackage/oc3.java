package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class oc3 extends dj0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public y0f j;

    @Override // defpackage.dj0
    public final void c() {
        for (mc3 mc3Var : this.h.values()) {
            mc3Var.a.b(mc3Var.b);
        }
    }

    @Override // defpackage.dj0
    public final void e() {
        for (mc3 mc3Var : this.h.values()) {
            mc3Var.a.d(mc3Var.b);
        }
    }

    @Override // defpackage.dj0
    public void g() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((mc3) it.next()).a.g();
        }
    }

    @Override // defpackage.dj0
    public void m() {
        HashMap map = this.h;
        for (mc3 mc3Var : map.values()) {
            mc3Var.a.l(mc3Var.b);
            dj0 dj0Var = mc3Var.a;
            die dieVar = mc3Var.c;
            dj0Var.o(dieVar);
            dj0Var.n(dieVar);
        }
        map.clear();
    }

    public xj8 p(Object obj, xj8 xj8Var) {
        return xj8Var;
    }

    public abstract void q(Integer num, dj0 dj0Var, lue lueVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kc3, zj8] */
    public final void r(final Integer num, dj0 dj0Var) {
        HashMap map = this.h;
        np8.d(!map.containsKey(num));
        ?? r1 = new zj8() { // from class: kc3
            @Override // defpackage.zj8
            public final void a(dj0 dj0Var2, lue lueVar) {
                this.a.q((Integer) num, dj0Var2, lueVar);
            }
        };
        die dieVar = new die();
        dieVar.o = this;
        dieVar.b = new gk8((CopyOnWriteArrayList) this.c.d, 0, null, 0L);
        dieVar.c = new kr4(this.d.c, 0, null);
        dieVar.a = num;
        map.put(num, new mc3(dj0Var, r1, dieVar));
        Handler handler = this.i;
        handler.getClass();
        dj0Var.getClass();
        gk8 gk8Var = dj0Var.c;
        gk8Var.getClass();
        ek8 ek8Var = new ek8();
        ek8Var.a = handler;
        ek8Var.b = dieVar;
        ((CopyOnWriteArrayList) gk8Var.d).add(ek8Var);
        Handler handler2 = this.i;
        handler2.getClass();
        kr4 kr4Var = dj0Var.d;
        kr4Var.getClass();
        ir4 ir4Var = new ir4();
        ir4Var.a = handler2;
        ir4Var.b = dieVar;
        kr4Var.c.add(ir4Var);
        y0f y0fVar = this.j;
        i4b i4bVar = this.g;
        np8.g(i4bVar);
        dj0Var.h(r1, y0fVar, i4bVar);
        if (!this.b.isEmpty()) {
            return;
        }
        dj0Var.b(r1);
    }
}
