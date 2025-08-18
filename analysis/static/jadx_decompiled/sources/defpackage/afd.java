package defpackage;

/* loaded from: classes2.dex */
public final class afd implements bfd {
    public final int a;
    public final boolean b;
    public final x9a c;

    public afd(int i) {
        x9a x9aVar = x9a.a;
        this.a = i;
        this.b = false;
        this.c = x9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afd)) {
            return false;
        }
        afd afdVar = (afd) obj;
        return this.a == afdVar.a && this.b == afdVar.b && this.c == afdVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", animated=" + this.b + ", appearance=" + this.c + ")";
    }
}
