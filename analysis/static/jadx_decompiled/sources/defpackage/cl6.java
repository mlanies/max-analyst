package defpackage;

/* loaded from: classes.dex */
public final class cl6 extends hl6 {
    public final int a;

    public cl6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl6) && this.a == ((cl6) obj).a;
    }

    public final int hashCode() {
        return au1.s(this.a);
    }

    public final String toString() {
        return "CallType(callMediaType=" + rh4.s(this.a) + ")";
    }
}
