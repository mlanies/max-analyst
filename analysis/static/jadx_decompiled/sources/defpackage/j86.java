package defpackage;

/* loaded from: classes2.dex */
public final class j86 implements k86 {
    public final q4d a;

    public j86(q4d q4dVar) {
        this.a = q4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j86) && tpa.f(this.a, ((j86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
