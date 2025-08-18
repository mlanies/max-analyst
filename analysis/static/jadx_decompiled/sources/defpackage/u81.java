package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class u81 extends pnf {
    public final je7 X;
    public final je7 Y = tu0.r(3, new x5(25, this));
    public final q0e Z;
    public final je7 b;
    public final m5d c;
    public final rg1 o;
    public final q0e s0;
    public final q0e t0;
    public final q0e u0;
    public final q0e v0;

    public u81(je7 je7Var, je7 je7Var2, m5d m5dVar, rg1 rg1Var) {
        this.b = je7Var2;
        this.c = m5dVar;
        this.o = rg1Var;
        this.X = je7Var;
        q0e q0eVarA = r0e.a(new s81());
        this.Z = q0eVarA;
        this.s0 = q0eVarA;
        q0e q0eVarA2 = r0e.a(new ls1(nz4.a, false, false));
        this.t0 = q0eVarA2;
        this.u0 = q0eVarA2;
        q0e q0eVarA3 = r0e.a(Boolean.FALSE);
        this.v0 = q0eVarA3;
        od2.L(new zn5(q0eVarA3, new r81(this, null), 5), this.a);
    }

    public final void q(long j, al6 al6Var) {
        q0e q0eVar;
        Object value;
        s81 s81Var;
        LinkedHashMap linkedHashMap;
        do {
            q0eVar = this.Z;
            value = q0eVar.getValue();
            s81Var = (s81) value;
            linkedHashMap = new LinkedHashMap(s81Var.b);
            if (linkedHashMap.containsKey(Long.valueOf(j))) {
            }
        } while (!q0eVar.c(value, new s81(linkedHashMap, s81Var.a)));
    }
}
