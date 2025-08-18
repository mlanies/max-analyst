package defpackage;

/* loaded from: classes.dex */
public final class v4c {
    public final int a;
    public final s4c b;
    public final CharSequence c;
    public final boolean d;

    public v4c(int i, s4c s4cVar, CharSequence charSequence, boolean z) {
        this.a = i;
        this.b = s4cVar;
        this.c = charSequence;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4c)) {
            return false;
        }
        v4c v4cVar = (v4c) obj;
        return this.a == v4cVar.a && this.b == v4cVar.b && tpa.f(this.c, v4cVar.c) && this.d == v4cVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        CharSequence charSequence = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return "RateCallButtonData(id=" + this.a + ", size=" + this.b + ", text=" + ((Object) this.c) + ", isEnabled=" + this.d + ")";
    }
}
