package defpackage;

import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public final class ud1 extends vd1 {
    public final List b;
    public final zx7 c;
    public final qma o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud1(mvd mvdVar) {
        super(nnf.a);
        List list = mvdVar != null ? mvdVar.a : null;
        list = list == null ? nz4.a : list;
        zx7 zx7Var = mvdVar != null ? mvdVar.b : null;
        qma qmaVar = mvdVar != null ? mvdVar.c : null;
        this.b = list;
        this.c = zx7Var;
        this.o = qmaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud1)) {
            return false;
        }
        ud1 ud1Var = (ud1) obj;
        return tpa.f(this.b, ud1Var.b) && tpa.f(this.c, ud1Var.c) && tpa.f(this.o, ud1Var.o);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 111L;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        zx7 zx7Var = this.c;
        int iHashCode2 = (iHashCode + (zx7Var == null ? 0 : zx7Var.hashCode())) * 31;
        qma qmaVar = this.o;
        return iHashCode2 + (qmaVar != null ? qmaVar.hashCode() : 0);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 111;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        td1 td1Var = null;
        ud1 ud1Var = ol7Var instanceof ud1 ? (ud1) ol7Var : null;
        if (ud1Var != null) {
            td1Var = new td1(7);
            boolean z = !tpa.f(this.b, ud1Var.b);
            BitSet bitSet = (BitSet) td1Var.b;
            bitSet.set(0, z);
            bitSet.set(1, (tpa.f(this.c, ud1Var.c) && tpa.f(this.o, ud1Var.o)) ? false : true);
        }
        return td1Var;
    }

    public final String toString() {
        return "Speaker(opponentsPages=" + this.b + ", mainOpponentState=" + this.c + ", opponentPipState=" + this.o + ")";
    }
}
