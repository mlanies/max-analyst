package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class lh2 {
    public static final lh2 d = new lh2(nz4.a, false, false);
    public final List a;
    public final boolean b;
    public final boolean c;

    public lh2(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh2)) {
            return false;
        }
        lh2 lh2Var = (lh2) obj;
        return tpa.f(this.a, lh2Var.a) && this.b == lh2Var.b && this.c == lh2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesViewState(messages=");
        sb.append(this.a);
        sb.append(", hasMoreNext=");
        sb.append(this.b);
        sb.append(", hasMorePrev=");
        return au1.j(sb, this.c, ")");
    }
}
