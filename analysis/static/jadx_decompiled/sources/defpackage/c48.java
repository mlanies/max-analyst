package defpackage;

/* loaded from: classes.dex */
public final class c48 implements j48 {
    public final q4d a;

    public c48(q4d q4dVar) {
        this.a = q4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c48) && tpa.f(this.a, ((c48) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
