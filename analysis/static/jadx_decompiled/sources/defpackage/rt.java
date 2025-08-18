package defpackage;

/* loaded from: classes2.dex */
public final class rt {
    public final zad a;

    public rt(zad zadVar) {
        this.a = zadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt) && tpa.f(this.a, ((rt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StopAsrRecord(sessionRoomId=" + this.a + ")";
    }
}
