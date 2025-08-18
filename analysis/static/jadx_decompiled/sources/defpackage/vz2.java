package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class vz2 extends pi0 {
    public final mg4 X;
    public final oi0 Y;
    public final boolean Z;
    public final Collection b;
    public final boolean c;
    public final boolean o;
    public final Set s0;

    public vz2(List list, boolean z) {
        this(list, z, false, null, null, 124);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz2)) {
            return false;
        }
        vz2 vz2Var = (vz2) obj;
        return tpa.f(this.b, vz2Var.b) && this.c == vz2Var.c && this.o == vz2Var.o && this.X == vz2Var.X && tpa.f(this.Y, vz2Var.Y) && this.Z == vz2Var.Z && tpa.f(this.s0, vz2Var.s0);
    }

    public final int hashCode() {
        int iHashCode = (this.X.hashCode() + ms2.d(ms2.d(this.b.hashCode() * 31, 31, this.c), 31, this.o)) * 31;
        oi0 oi0Var = this.Y;
        return this.s0.hashCode() + ms2.d((iHashCode + (oi0Var == null ? 0 : oi0Var.hashCode())) * 31, 31, this.Z);
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "ChatsUpdateEvent(chatIds=" + this.b + ", orderChange=" + this.c + ", initialDataLoaded=" + this.o + ", itemType=" + this.X + ", error=" + this.Y + ", replaceDuplicate=" + this.Z + ", chatServerIds=" + this.s0 + ")";
    }

    public /* synthetic */ vz2(Collection collection, boolean z, boolean z2, mg4 mg4Var, h9b h9bVar, int i) {
        this(collection, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? mg4.REGULAR : mg4Var, (i & 16) != 0 ? null : h9bVar, false, wz4.a);
    }

    public vz2(Collection collection, boolean z, boolean z2, mg4 mg4Var, oi0 oi0Var, boolean z3, Set set) {
        this.b = collection;
        this.c = z;
        this.o = z2;
        this.X = mg4Var;
        this.Y = oi0Var;
        this.Z = z3;
        this.s0 = set;
    }

    public vz2(gi9 gi9Var) {
        this(oag.D(gi9Var), true, false, null, null, 124);
    }
}
