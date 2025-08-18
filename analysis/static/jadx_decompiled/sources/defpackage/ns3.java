package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class ns3 implements bde {
    public final el3 a;
    public final kke b;
    public final ece c;
    public final khe d;
    public final q40 e;

    public ns3(j92 j92Var, el3 el3Var, kke kkeVar, b0d b0dVar, ida idaVar, m7b m7bVar, u7b u7bVar) {
        je7 je7Var = iyc.z;
        this.a = el3Var;
        this.b = kkeVar;
        this.c = new ece(j92Var);
        this.d = new khe(new yf3(this));
        this.e = new q40(b0dVar, new bdb(b0dVar, 7, idaVar), m7bVar, u7bVar, je7Var, new v02(25, this));
    }

    @Override // defpackage.bde
    public final q1a a(int i, String str) {
        return new q1a(1, new vpc(hz4.a, new ms3(this, str, i, null)));
    }

    @Override // defpackage.bde
    public final List b(LinkedHashSet linkedHashSet) {
        this.c.getClass();
        return this.e.l(linkedHashSet);
    }

    @Override // defpackage.bde
    public final void clear() {
    }
}
