package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j5g {
    public final List a;

    public j5g(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5g) && tpa.f(this.a, ((j5g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Widget(contents=" + this.a + ")";
    }
}
