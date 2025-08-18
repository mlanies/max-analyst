package defpackage;

import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public final class qd1 extends vd1 {
    public final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(lg6 lg6Var) {
        super(nnf.c);
        List list = lg6Var != null ? lg6Var.a : null;
        list = list == null ? nz4.a : list;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd1) && tpa.f(this.b, ((qd1) obj).b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 222L;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 222;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if ((ol7Var instanceof qd1 ? (qd1) ol7Var : null) == null) {
            return null;
        }
        pd1 pd1Var = new pd1(7);
        ((BitSet) pd1Var.b).set(0, !tpa.f(this.b, r3.b));
        return pd1Var;
    }

    public final String toString() {
        return "Grid(opponentsPages=" + this.b + ")";
    }
}
