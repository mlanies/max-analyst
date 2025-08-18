package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class qs9 extends gle {
    public final boolean X;
    public final f52 c;
    public final Set o;

    public qs9(f52 f52Var, Set set, boolean z) {
        this.c = f52Var;
        this.o = set;
        this.X = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs9)) {
            return false;
        }
        qs9 qs9Var = (qs9) obj;
        return tpa.f(this.c, qs9Var.c) && tpa.f(this.o, qs9Var.o) && this.X == qs9Var.X;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X) + ((this.o.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chat=");
        sb.append(this.c);
        sb.append(", messageIds=");
        sb.append(this.o);
        sb.append(", isTtl=");
        return au1.j(sb, this.X, ")");
    }
}
