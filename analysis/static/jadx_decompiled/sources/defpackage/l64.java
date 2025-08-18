package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class l64 {
    public final String a;
    public final e64 b;
    public final Bundle c;
    public final int d;
    public final j64 e;
    public final k64 f;

    public l64(String str, e64 e64Var, Bundle bundle, int i, j64 j64Var, k64 k64Var) {
        this.a = str;
        this.b = e64Var;
        this.c = bundle;
        this.d = i;
        this.e = j64Var;
        this.f = k64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l64)) {
            return false;
        }
        l64 l64Var = (l64) obj;
        return tpa.f(this.a, l64Var.a) && tpa.f(this.b, l64Var.b) && tpa.f(this.c, l64Var.c) && this.d == l64Var.d && tpa.f(this.e, l64Var.e) && tpa.f(this.f, l64Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ey8.g(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        String str = "DeepLinkBundle(bundle=" + this.c + ")";
        StringBuilder sb = new StringBuilder("DeepLinkScreen(name=");
        sb.append(this.a);
        sb.append(", route=");
        sb.append(this.b);
        sb.append(", deepLinkBundle=");
        sb.append(str);
        sb.append(", mode=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ACTIVITY" : "FRAGMENT" : "DEFAULT");
        sb.append(", animations=");
        sb.append(this.e);
        sb.append(", screenFactory=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ l64(String str, e64 e64Var, Bundle bundle, int i, j64 j64Var, k64 k64Var, int i2) {
        this(str, e64Var, bundle, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? new j64() : j64Var, k64Var);
    }
}
