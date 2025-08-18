package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class kf5 {
    public final String a;
    public final Map b;

    public kf5(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static kf5 a(String str) {
        return new kf5(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf5)) {
            return false;
        }
        kf5 kf5Var = (kf5) obj;
        return this.a.equals(kf5Var.a) && this.b.equals(kf5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
