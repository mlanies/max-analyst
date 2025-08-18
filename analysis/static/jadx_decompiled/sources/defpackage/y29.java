package defpackage;

/* loaded from: classes2.dex */
public final class y29 implements a39 {
    public final int a;

    public y29(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y29) && this.a == ((y29) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("ProcessClickMultiSelect(actionId="), this.a, ")");
    }
}
