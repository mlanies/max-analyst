package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class g39 extends pnf {
    public final w7c X;
    public final q0e Y;
    public final w7c Z;
    public final q0e b;
    public final w7c c;
    public final q0e o;
    public final s35 s0;
    public final s35 t0;

    public g39() {
        q0e q0eVarA = r0e.a(Boolean.FALSE);
        this.b = q0eVarA;
        this.c = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.o = q0eVarA2;
        this.X = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(null);
        this.Y = q0eVarA3;
        this.Z = new w7c(q0eVarA3);
        this.s0 = new s35(0);
        this.t0 = new s35(0);
    }

    public final void q(kpa kpaVar) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.o;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, kpaVar == null ? null : new jk6(((Number) kpaVar.a).longValue(), (List) kpaVar.b)));
    }
}
