package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class kce {
    public final jce a;
    public final List b;

    public kce(jce jceVar, ArrayList arrayList) {
        this.a = jceVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kce)) {
            return false;
        }
        kce kceVar = (kce) obj;
        return this.a == kceVar.a && tpa.f(this.b, kceVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestionSearchResult(state=");
        sb.append(this.a);
        sb.append(", mentions=");
        return au1.i(sb, this.b, ")");
    }
}
