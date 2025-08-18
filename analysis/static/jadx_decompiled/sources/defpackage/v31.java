package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v31 {
    public final Bundle a;
    public final List b;
    public final Map c;
    public final Point d;

    public v31(Bundle bundle, kl7 kl7Var, LinkedHashMap linkedHashMap, Point point) {
        this.a = bundle;
        this.b = kl7Var;
        this.c = linkedHashMap;
        this.d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v31)) {
            return false;
        }
        v31 v31Var = (v31) obj;
        return tpa.f(this.a, v31Var.a) && tpa.f(this.b, v31Var.b) && tpa.f(this.c, v31Var.c) && tpa.f(this.d, v31Var.d);
    }

    public final int hashCode() {
        Bundle bundle = this.a;
        int iHashCode = (this.c.hashCode() + k7d.g(this.b, (bundle == null ? 0 : bundle.hashCode()) * 31, 31)) * 31;
        Point point = this.d;
        return iHashCode + (point != null ? point.hashCode() : 0);
    }

    public final String toString() {
        return "CallContextMenuInfo(bundle=" + this.a + ", actions=" + this.b + ", statParam=" + this.c + ", anchor=" + this.d + ")";
    }
}
