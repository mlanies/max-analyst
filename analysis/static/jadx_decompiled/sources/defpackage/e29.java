package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class e29 {
    public final int a;
    public final int b;
    public final boolean c;

    public e29(e52 e52Var, es8 es8Var, boolean z) {
        int iHashCode = es8Var.b(e52Var).hashCode();
        List list = es8Var.a.R0;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        this.a = iHashCode;
        this.b = iHashCode2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e29)) {
            return false;
        }
        e29 e29Var = (e29) obj;
        return this.a == e29Var.a && this.b == e29Var.b && this.c == e29Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(textHash=");
        sb.append(this.a);
        sb.append(", messageElementsHash=");
        sb.append(this.b);
        sb.append(", isChild=");
        return au1.j(sb, this.c, ")");
    }
}
