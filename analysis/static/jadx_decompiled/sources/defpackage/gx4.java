package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gx4 {
    public final List a;
    public final int b;

    public gx4(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx4.class != obj.getClass()) {
            return false;
        }
        gx4 gx4Var = (gx4) obj;
        if (this.b != gx4Var.b) {
            return false;
        }
        return this.a.equals(gx4Var.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
