package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class r0f implements su0 {
    public static final r0f b;
    public final zw6 a;

    static {
        ls5 ls5Var = zw6.b;
        b = new r0f(ffc.X);
    }

    public r0f(List list) {
        this.a = zw6.j(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((r0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
