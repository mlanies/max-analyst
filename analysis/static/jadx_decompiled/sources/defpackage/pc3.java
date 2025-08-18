package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class pc3 extends ej0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public z0f j;

    @Override // defpackage.ej0
    public final void e() {
        for (nc3 nc3Var : this.h.values()) {
            nc3Var.a.d(nc3Var.b);
        }
    }

    @Override // defpackage.ej0
    public final void g() {
        for (nc3 nc3Var : this.h.values()) {
            nc3Var.a.f(nc3Var.b);
        }
    }

    @Override // defpackage.ej0
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((nc3) it.next()).a.k();
        }
    }

    @Override // defpackage.ej0
    public void q() {
        HashMap map = this.h;
        for (nc3 nc3Var : map.values()) {
            nc3Var.a.p(nc3Var.b);
            ej0 ej0Var = nc3Var.a;
            a8g a8gVar = nc3Var.c;
            ej0Var.s(a8gVar);
            ej0Var.r(a8gVar);
        }
        map.clear();
    }

    public abstract yj8 u(Object obj, yj8 yj8Var);

    public long v(long j, Object obj) {
        return j;
    }

    public int w(int i, Object obj) {
        return i;
    }

    public abstract void x(Object obj, ej0 ej0Var, mue mueVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ak8, lc3] */
    public final void y(final Object obj, ej0 ej0Var) {
        HashMap map = this.h;
        fm9.f(!map.containsKey(obj));
        ?? r1 = new ak8() { // from class: lc3
            @Override // defpackage.ak8
            public final void a(ej0 ej0Var2, mue mueVar) {
                this.a.x(obj, ej0Var2, mueVar);
            }
        };
        a8g a8gVar = new a8g();
        a8gVar.o = this;
        a8gVar.b = b(null);
        a8gVar.c = new lr4(this.d.c, 0, null);
        a8gVar.a = obj;
        map.put(obj, new nc3(ej0Var, r1, a8gVar));
        Handler handler = this.i;
        handler.getClass();
        ej0Var.getClass();
        jn jnVar = ej0Var.c;
        jnVar.getClass();
        fk8 fk8Var = new fk8();
        fk8Var.a = handler;
        fk8Var.b = a8gVar;
        ((CopyOnWriteArrayList) jnVar.o).add(fk8Var);
        Handler handler2 = this.i;
        handler2.getClass();
        lr4 lr4Var = ej0Var.d;
        lr4Var.getClass();
        jr4 jr4Var = new jr4();
        jr4Var.a = handler2;
        jr4Var.b = a8gVar;
        lr4Var.c.add(jr4Var);
        z0f z0fVar = this.j;
        j4b j4bVar = this.g;
        fm9.l(j4bVar);
        ej0Var.l(r1, z0fVar, j4bVar);
        if (!this.b.isEmpty()) {
            return;
        }
        ej0Var.d(r1);
    }
}
