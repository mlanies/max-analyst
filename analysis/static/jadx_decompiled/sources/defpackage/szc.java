package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class szc {
    public static final szc c = new szc(1, nz4.a);
    public final int a;
    public final List b;

    public szc(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szc)) {
            return false;
        }
        szc szcVar = (szc) obj;
        return this.a == szcVar.a && tpa.f(this.b, szcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (au1.s(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchState(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "EMPTY" : "CONTENT" : "LOADING");
        sb.append(", content=");
        return au1.i(sb, this.b, ")");
    }
}
