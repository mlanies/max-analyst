package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ze0 {
    public static final List b = y53.M("space_light", "gradient_light");
    public static final List c = y53.M("space_dark", "gradient_dark");
    public final String a;

    public ze0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ze0) && tpa.f(this.a, ((ze0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("BackgroundNameId(name="), this.a, ")");
    }
}
