package defpackage;

/* loaded from: classes2.dex */
public final class t3e implements v3e {
    public final boolean a;

    public t3e(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3e) && this.a == ((t3e) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("SetSelection(selected="), this.a, ")");
    }
}
