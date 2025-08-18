package defpackage;

/* loaded from: classes2.dex */
public final class y2e {
    public final boolean a;

    public y2e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2e) && this.a == ((y2e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
