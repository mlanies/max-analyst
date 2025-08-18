package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gde {
    public static final gde g = new gde(null, 0, 0, nz4.a);
    public final String a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final boolean f;

    public gde(String str, int i, int i2, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list.size();
        this.f = list.size() < i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gde)) {
            return false;
        }
        gde gdeVar = (gde) obj;
        return tpa.f(this.a, gdeVar.a) && this.b == gdeVar.b && this.c == gdeVar.c && tpa.f(this.d, gdeVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k7d.e(this.c, k7d.e(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestsResult(query=");
        sb.append(this.a);
        sb.append(", cursorPosition=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", result=");
        return au1.i(sb, this.d, ")");
    }
}
