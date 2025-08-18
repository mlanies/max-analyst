package defpackage;

/* loaded from: classes2.dex */
public final class pl1 {
    public final zad a;

    public pl1(zad zadVar) {
        this.a = zadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl1) && tpa.f(this.a, ((pl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemovedParams(roomId=" + this.a + ")";
    }
}
