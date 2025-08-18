package defpackage;

/* loaded from: classes2.dex */
public final class f93 {
    public final int a;

    public f93(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f93) && this.a == ((f93) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("CommonStatesBackgroundActiveActionColors(themed="), this.a, ")");
    }
}
