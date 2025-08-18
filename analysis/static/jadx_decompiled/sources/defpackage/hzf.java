package defpackage;

/* loaded from: classes2.dex */
public final class hzf implements kzf {
    public final String a;

    public hzf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzf) && tpa.f(this.a, ((hzf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ShowPhoneConfirmationDialog(appName="), this.a, ")");
    }
}
