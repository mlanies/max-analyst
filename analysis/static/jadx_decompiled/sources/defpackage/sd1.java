package defpackage;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class sd1 extends vd1 {
    public final jqe b;
    public final ak1 c;

    public sd1(gqe gqeVar, ak1 ak1Var) {
        super(nnf.b);
        this.b = gqeVar;
        this.c = ak1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return false;
        }
        sd1 sd1Var = (sd1) obj;
        return tpa.f(this.b, sd1Var.b) && tpa.f(this.c, sd1Var.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 225L;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 225;
    }

    @Override // defpackage.ol7
    public final Object n(Object obj) {
        ol7 ol7Var = (ol7) obj;
        sd1 sd1Var = ol7Var instanceof sd1 ? (sd1) ol7Var : null;
        if (sd1Var == null) {
            return null;
        }
        rd1 rd1Var = new rd1(7);
        boolean z = !tpa.f(this.c, sd1Var.c);
        BitSet bitSet = (BitSet) rd1Var.b;
        bitSet.set(0, z);
        bitSet.set(1, !tpa.f(this.b, sd1Var.b));
        return rd1Var;
    }

    public final String toString() {
        return "Sharing(title=" + this.b + ", sharingState=" + this.c + ")";
    }
}
