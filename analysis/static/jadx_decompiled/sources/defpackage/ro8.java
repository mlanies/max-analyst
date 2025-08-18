package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ro8 extends pnf {
    public final s35 X;
    public final s35 Y;
    public final q0e Z;
    public final m56 b;
    public final pc4 c;
    public final k56 o;
    public final w7c s0;
    public final q0e t0;
    public final w7c u0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [pc4] */
    public ro8(m56 m56Var, d9 d9Var, int i) {
        this(m56Var, (i & 2) != 0 ? (pc4) ko8.a.getAccessor().c(pc4.class) : d9Var, new j78(6));
    }

    public final void q() {
        this.Z.setValue(null);
    }

    public final boolean r() {
        return this.s0.a.getValue() != null;
    }

    public final void s(List list) {
        pnf.o(this.Y, new ho8(list));
    }

    public final void t(long j, boolean z) {
        q0e q0eVar;
        Object value;
        Set setG0;
        if (!r()) {
            pnf.o(this.X, new mo8(j));
            return;
        }
        if (z) {
            do {
                q0eVar = this.Z;
                value = q0eVar.getValue();
                Set set = (Set) value;
                setG0 = set != null ? x53.G0(set) : new LinkedHashSet();
                if (setG0.contains(Long.valueOf(j))) {
                    setG0.remove(Long.valueOf(j));
                } else {
                    setG0.add(Long.valueOf(j));
                }
            } while (!q0eVar.c(value, setG0));
        }
    }

    public final void u(String str) {
        this.t0.setValue(str);
    }

    public ro8(m56 m56Var, pc4 pc4Var, k56 k56Var) {
        this.b = m56Var;
        this.c = pc4Var;
        this.o = k56Var;
        this.X = new s35(0);
        this.Y = new s35(0);
        q0e q0eVarA = r0e.a(null);
        this.Z = q0eVarA;
        this.s0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.t0 = q0eVarA2;
        this.u0 = new w7c(q0eVarA2);
    }
}
