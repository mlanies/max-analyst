package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class pt5 implements qt5 {
    public final List a;

    public pt5(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt5) && tpa.f(this.a, ((pt5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPicker(includes=" + this.a + ")";
    }
}
