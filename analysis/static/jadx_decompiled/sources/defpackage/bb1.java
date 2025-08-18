package defpackage;

/* loaded from: classes.dex */
public final class bb1 extends gb1 {
    public final boolean a;

    public bb1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb1) && this.a == ((bb1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("LoadingState(isEnabled="), this.a, ")");
    }
}
