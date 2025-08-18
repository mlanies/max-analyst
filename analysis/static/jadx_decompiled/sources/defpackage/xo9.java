package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xo9 {
    public final String a;
    public final List b;

    public xo9(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo9)) {
            return false;
        }
        xo9 xo9Var = (xo9) obj;
        return tpa.f(this.a, xo9Var.a) && tpa.f(this.b, xo9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeuroAvatarsPresetInfo(name=" + this.a + ", avatars=" + this.b + ")";
    }
}
