package defpackage;

/* loaded from: classes2.dex */
public final class d0g implements a0g {
    public final boolean a;

    public d0g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0g) && this.a == ((d0g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("ShowWebView(showBackButton="), this.a, ")");
    }
}
