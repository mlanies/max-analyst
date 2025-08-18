package defpackage;

/* loaded from: classes2.dex */
public final class k2g implements z97 {
    public final boolean a;

    public k2g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2g) && this.a == ((k2g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("NeedCloseConfirmation(needConfirmation="), this.a, ")");
    }
}
