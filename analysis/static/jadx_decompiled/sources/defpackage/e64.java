package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class e64 {
    public final Uri a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final Set e;

    public e64(Uri uri, int i, LinkedHashSet linkedHashSet, boolean z, Set set) {
        this.a = uri;
        this.b = i;
        this.c = linkedHashSet;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e64)) {
            return false;
        }
        e64 e64Var = (e64) obj;
        return tpa.f(this.a, e64Var.a) && this.b == e64Var.b && tpa.f(this.c, e64Var.c) && this.d == e64Var.d && tpa.f(this.e, e64Var.e);
    }

    public final int hashCode() {
        int iD = ms2.d((this.c.hashCode() + ey8.g(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        Set set = this.e;
        return iD + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = au1.m("DeepLinkRoute(deepLinkUri=", this.a.toString(), ", constraint=");
        int i = this.b;
        sbM.append(i != 1 ? i != 2 ? "null" : "LOGGED_IN" : "NOT_LOGGED_IN");
        sbM.append(", requiredParams=");
        sbM.append(this.c);
        sbM.append(", supportRoot=");
        sbM.append(this.d);
        sbM.append(", bundleRequiredParams=");
        sbM.append(this.e);
        sbM.append(")");
        return sbM.toString();
    }
}
