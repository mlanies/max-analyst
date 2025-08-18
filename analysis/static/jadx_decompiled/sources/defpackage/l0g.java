package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class l0g {
    public final String a;
    public final List b;

    public l0g(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0g)) {
            return false;
        }
        l0g l0gVar = (l0g) obj;
        return tpa.f(this.a, l0gVar.a) && tpa.f(this.b, l0gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppSettingsState(title=" + this.a + ", sections=" + this.b + ")";
    }
}
