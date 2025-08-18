package defpackage;

/* loaded from: classes2.dex */
public final class o38 {
    public final int a;
    public final ssa b;
    public final boolean c;

    public o38(int i, ssa ssaVar, boolean z) {
        this.a = i;
        this.b = ssaVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o38)) {
            return false;
        }
        o38 o38Var = (o38) obj;
        return this.a == o38Var.a && tpa.f(this.b, o38Var.b) && this.c == o38Var.c;
    }

    public final int hashCode() {
        int iS = au1.s(this.a) * 31;
        ssa ssaVar = this.b;
        return Boolean.hashCode(this.c) + ((iS + (ssaVar == null ? 0 : ssaVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConditionChange(condition=");
        sb.append(zr6.s(this.a));
        sb.append(", suggestedVideoSettings=");
        sb.append(this.b);
        sb.append(", preferHardwarePVXEncoder=");
        return au1.j(sb, this.c, ")");
    }
}
