package defpackage;

import java.util.Queue;

/* loaded from: classes2.dex */
public final class h9d extends g9d {
    public g9d A0;
    public final Queue z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public h9d(h8d h8dVar) {
        long j = h8dVar.a;
        Queue queue = (Queue) h8dVar.m;
        super(j, ((g9d) queue.peek()).o, ((g9d) queue.peek()).X, h8dVar.d, h8dVar.e, ((g9d) queue.peek()).t0, h8dVar.h, ((g9d) queue.peek()).v0, ((g9d) queue.peek()).w0, ((g9d) queue.peek()).x0, h8dVar.k);
        this.z0 = queue;
        this.A0 = (g9d) queue.poll();
    }

    @Override // defpackage.g9d, defpackage.d8d
    public final void x() {
        super.x();
        Queue queue = this.z0;
        if (queue.isEmpty()) {
            return;
        }
        h8d h8dVar = new h8d(this.c, queue, 2);
        h8dVar.d = this.u0;
        h8dVar.f = this.x0;
        h8dVar.e = this.Z;
        h8dVar.h = this.s0;
        h8dVar.k = this.y0;
        u().a(new h9d(h8dVar));
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        g9d g9dVar = this.A0;
        g9dVar.a = this.a;
        bu8 bu8VarY = g9dVar.y();
        bu8VarY.H = this.A0.y0;
        return bu8VarY;
    }

    @Override // defpackage.g9d
    public final long z(long j, e52 e52Var) {
        g9d g9dVar = this.A0;
        g9dVar.a = this.a;
        boolean z = g9dVar instanceof m9d;
        ng4 ng4Var = this.y0;
        String str = this.w0;
        long j2 = this.v0;
        long j3 = e52Var.a;
        if (z) {
            m9d m9dVar = (m9d) g9dVar;
            l9d l9dVar = new l9d(j3, (o2) m9dVar.B0.get(0));
            l9dVar.p = m9dVar.D0;
            l9dVar.m = m9dVar.z0;
            l9dVar.n = m9dVar.A0;
            l9dVar.b = m9dVar.o;
            l9dVar.c = m9dVar.X;
            l9dVar.e = m9dVar.Z;
            l9dVar.o = m9dVar.C0;
            l9dVar.h = m9dVar.s0;
            l9dVar.d = m9dVar.Y;
            l9dVar.i = j2;
            l9dVar.j = str;
            l9dVar.g = m9dVar.t0;
            l9dVar.f = m9dVar.x0;
            l9dVar.k = ng4Var;
            e9d e9dVarA = l9dVar.a();
            this.A0 = e9dVarA;
            e9dVarA.a = this.a;
            return e9dVarA.z(j, e52Var);
        }
        if (g9dVar instanceof e9d) {
            e9d e9dVar = (e9d) g9dVar;
            d9d d9dVar = new d9d(j3, e9dVar.B0);
            d9dVar.m = e9dVar.z0;
            d9dVar.n = e9dVar.A0;
            d9dVar.b = e9dVar.o;
            d9dVar.c = e9dVar.X;
            d9dVar.e = e9dVar.Z;
            d9dVar.o = e9dVar.C0;
            d9dVar.h = e9dVar.s0;
            d9dVar.d = e9dVar.Y;
            d9dVar.i = j2;
            d9dVar.j = str;
            d9dVar.g = e9dVar.t0;
            d9dVar.f = e9dVar.x0;
            d9dVar.k = ng4Var;
            e9d e9dVar2 = new e9d(d9dVar);
            this.A0 = e9dVar2;
            e9dVar2.a = this.a;
            return e9dVar2.z(j, e52Var);
        }
        if (!(g9dVar instanceof j9d)) {
            return super.z(j, e52Var);
        }
        j9d j9dVar = (j9d) g9dVar;
        i9d i9dVar = new i9d(j3, j9dVar.z0, j9dVar.A0);
        i9dVar.b = j9dVar.o;
        i9dVar.c = j9dVar.X;
        i9dVar.e = j9dVar.Z;
        i9dVar.h = j9dVar.s0;
        i9dVar.d = j9dVar.Y;
        i9dVar.i = j2;
        i9dVar.j = str;
        i9dVar.g = j9dVar.t0;
        i9dVar.n = j9dVar.B0;
        i9dVar.f = j9dVar.x0;
        i9dVar.k = ng4Var;
        j9d j9dVar2 = new j9d(i9dVar);
        this.A0 = j9dVar2;
        j9dVar2.a = this.a;
        return j9dVar2.z(j, e52Var);
    }
}
