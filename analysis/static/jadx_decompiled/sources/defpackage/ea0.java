package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ea0 {
    public final iee a;
    public final iee b;
    public final List c;

    public ea0(iee ieeVar, iee ieeVar2, ArrayList arrayList) {
        if (ieeVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.a = ieeVar;
        if (ieeVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.b = ieeVar2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ea0)) {
            return false;
        }
        ea0 ea0Var = (ea0) obj;
        return this.a.equals(ea0Var.a) && this.b.equals(ea0Var.b) && this.c.equals(ea0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{primarySurfaceEdge=");
        sb.append(this.a);
        sb.append(", secondarySurfaceEdge=");
        sb.append(this.b);
        sb.append(", outConfigs=");
        return au1.i(sb, this.c, "}");
    }
}
