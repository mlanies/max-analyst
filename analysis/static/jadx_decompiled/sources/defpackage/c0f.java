package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c0f {
    public static final String c;
    public static final String d;
    public final rze a;
    public final zw6 b;

    static {
        int i = oaf.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public c0f(rze rzeVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= rzeVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = rzeVar;
        this.b = zw6.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0f.class != obj.getClass()) {
            return false;
        }
        c0f c0fVar = (c0f) obj;
        return this.a.equals(c0fVar.a) && this.b.equals(c0fVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
