package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class sl2 {
    public static final sl2 c = new sl2(0, oz4.a);
    public final Map a;
    public final int b;

    public sl2(int i, Map map) {
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        return tpa.f(this.a, sl2Var.a) && this.b == sl2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return sl2.class.getSimpleName().concat(".Empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getSimpleName());
        sb.append('(');
        sb.append("size=");
        Map map = this.a;
        sb.append(map.size());
        sb.append(",totalUnreadMessagesCount=");
        sb.append(this.b);
        sb.append(",notifications=" + map);
        sb.append(')');
        return sb.toString();
    }
}
