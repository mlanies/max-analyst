package defpackage;

/* loaded from: classes2.dex */
public final class yj6 extends o35 {
    public final int a;

    public yj6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yj6) && this.a == ((yj6) obj).a;
    }

    public final int hashCode() {
        return au1.s(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideErrorInputEvent(typeInput=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "TITLE" : "SURNAME" : "NAME");
        sb.append(")");
        return sb.toString();
    }
}
