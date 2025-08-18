package defpackage;

/* loaded from: classes2.dex */
public final class hy3 {
    public static final hy3 b = new hy3(0);
    public final int a;

    public hy3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy3) && this.a == ((hy3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("Counter(count="), this.a, ")");
    }
}
