package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class xza extends pnf {
    public final xg6 X;
    public final i50 Y;
    public final w7c Z;
    public final wza b;
    public final y0b c;
    public final j5f o;
    public final j0e s0;
    public final v7c t0;
    public final w7c u0;
    public final v7c v0;
    public final o23 w0;
    public final w7c x0;
    public final w7c y0;
    public final s35 z0;

    public xza(kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, ch9 ch9Var, je7 je7Var11, wza wzaVar) {
        y0b y0bVar;
        v7c v7cVar;
        w7c w7cVar;
        j0e j0eVar;
        q0e q0eVar;
        this.b = wzaVar;
        j0e j0eVar2 = wzaVar.b;
        if (j0eVar2 == null) {
            y0bVar = null;
        } else {
            y0bVar = new y0b(j0eVar2, kkeVar, je7Var2, (ps2) je7Var3.getValue(), je7Var11, this.a);
        }
        this.c = y0bVar;
        j0e j0eVar3 = wzaVar.b;
        j5f j5fVar = j0eVar3 != null ? new j5f(j0eVar3, this.a, (ds3) je7Var4.getValue(), kkeVar, je7Var9, je7Var5, je7Var6, je7Var11) : null;
        this.o = j5fVar;
        xg6 xg6Var = (j0eVar3 == null || !((se5) ((qe5) je7Var10.getValue())).r()) ? null : new xg6(this.a, kkeVar, wzaVar.b, je7Var4, je7Var7, je7Var8);
        this.X = xg6Var;
        i50 i50Var = new i50(ch9Var, this.a, je7Var9);
        this.Y = i50Var;
        this.Z = new w7c((y0bVar == null || (q0eVar = y0bVar.h) == null) ? r0e.a(null) : q0eVar);
        this.s0 = (j5fVar == null || (j0eVar = j5fVar.i) == null) ? r0e.a(null) : j0eVar;
        this.t0 = (v7c) i50Var.X;
        this.u0 = (xg6Var == null || (w7cVar = xg6Var.f) == null) ? new w7c(r0e.a(zg6.a)) : w7cVar;
        this.v0 = (xg6Var == null || (v7cVar = xg6Var.h) == null) ? new v7c(lld.b(0, 0, 0, 7)) : v7cVar;
        ContextScope contextScope = this.a;
        vza vzaVar = vza.a;
        o23 o23Var = new o23(kkeVar, (t50) vzaVar.getAccessor().c(t50.class), ch9Var, contextScope, (nif) vzaVar.getAccessor().c(nif.class), vzaVar.getAccessor().d(r79.class), vzaVar.getAccessor().d(ds3.class), vzaVar.getAccessor().d(q33.class), j0eVar3 != null);
        this.w0 = o23Var;
        this.x0 = (w7c) o23Var.o;
        this.y0 = (w7c) o23Var.X;
        this.z0 = new s35(0);
    }
}
