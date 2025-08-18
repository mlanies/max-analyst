package defpackage;

/* loaded from: classes2.dex */
public final class qt {
    public final zad a;
    public final o01 b;

    public qt(zad zadVar, o01 o01Var) {
        this.a = zadVar;
        this.b = o01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return tpa.f(this.a, qtVar.a) && tpa.f(this.b, qtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartAsrRecord(sessionRoomId=" + this.a + ", callAsrInfo=" + this.b + ")";
    }
}
