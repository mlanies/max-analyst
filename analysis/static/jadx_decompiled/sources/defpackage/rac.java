package defpackage;

/* loaded from: classes2.dex */
public final class rac implements uac {
    public final boolean a;

    public rac(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rac) && this.a == ((rac) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Pause(isForced="), this.a, ")");
    }
}
