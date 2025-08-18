package defpackage;

/* loaded from: classes2.dex */
public final class nzd implements pzd {
    public final String a;

    public nzd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzd) && tpa.f(this.a, ((nzd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ShowWarningBottomSheet(fileUrl="), this.a, ")");
    }
}
