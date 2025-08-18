package defpackage;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class t6b {
    public final av0 a;
    public final je7 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public t6b(av0 av0Var, je7 je7Var) {
        this.a = av0Var;
        this.b = je7Var;
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            u6b u6bVar = (u6b) ((Map.Entry) it.next()).getValue();
            u6bVar.g = null;
            u6bVar.h = null;
            u6bVar.i = null;
            u6bVar.j = null;
            u6bVar.k = null;
            u6bVar.l = null;
            u6bVar.m = null;
            u6bVar.n = null;
            u6bVar.o = false;
            u6bVar.p = false;
            u6bVar.q = false;
        }
        concurrentHashMap.clear();
    }

    public final void b(e52 e52Var, cu8 cu8Var) {
        u6b u6bVarA = ((v6b) this.b.getValue()).a(null, cu8Var);
        this.c.put(Long.valueOf(cu8Var.b), u6bVarA);
        u6bVarA.h(e52Var);
    }

    public final u6b c(cu8 cu8Var) {
        return (u6b) this.c.computeIfAbsent(Long.valueOf(cu8Var.b), new di(15, new ga(this, 26, cu8Var)));
    }

    public final void d() {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            u6b u6bVar = (u6b) ((Map.Entry) it.next()).getValue();
            u6bVar.g = null;
            u6bVar.h = null;
            u6bVar.i = null;
            u6bVar.j = null;
            u6bVar.k = null;
            u6bVar.l = null;
            u6bVar.m = null;
            u6bVar.n = null;
            u6bVar.o = false;
            u6bVar.p = false;
            u6bVar.q = false;
            e52 e52Var = u6bVar.f;
            if (e52Var != null) {
                u6bVar.h(e52Var);
            }
        }
    }

    public final void e(cu8 cu8Var) {
        String str;
        u6b u6bVarC = c(cu8Var);
        u6bVarC.d();
        if (u6bVarC.m == null) {
            ida idaVar = u6bVarC.a;
            long j = u6bVarC.d.o;
            Locale localeV = idaVar.c.v();
            synchronized (ay7.o) {
                if (ay7.n == null) {
                    ay7.n = new SimpleDateFormat("LLLL yyyy", localeV);
                }
                str = ay7.n.format(Long.valueOf(j));
            }
            u6bVarC.m = str;
        }
    }
}
