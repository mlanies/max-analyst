package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ac0 {
    public final iee a;
    public final List b;

    public ac0(iee ieeVar, List list) {
        if (ieeVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.a = ieeVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        return this.a.equals(ac0Var.a) && this.b.equals(ac0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.a);
        sb.append(", outConfigs=");
        return au1.i(sb, this.b, "}");
    }
}
