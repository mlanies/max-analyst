package defpackage;

/* loaded from: classes.dex */
public final class li5 {
    public final String a;

    public li5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof li5) {
            return tpa.f(this.a, ((li5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return au1.s(2) + ms2.d(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "FilePreferencesOptions(name=" + this.a + ", isDebugMode=false, commitStrategy=BIG_CHANGES)";
    }
}
