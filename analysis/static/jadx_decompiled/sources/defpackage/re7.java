package defpackage;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class re7 {
    public final TreeSet a = new TreeSet(new ye4(6));
    public long b;

    public final void a(hw0 hw0Var, long j) {
        while (this.b + j > 104857600 && !this.a.isEmpty()) {
            dx0 dx0Var = (dx0) this.a.first();
            rpd rpdVar = (rpd) hw0Var;
            synchronized (rpdVar) {
                rpdVar.j(dx0Var);
            }
        }
    }

    public final void b(hw0 hw0Var, dx0 dx0Var) {
        this.a.add(dx0Var);
        this.b += dx0Var.c;
        a(hw0Var, 0L);
    }
}
