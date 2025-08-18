package defpackage;

/* loaded from: classes2.dex */
public final class wbb implements acb {
    public final jqe a;
    public final boolean b;

    public wbb(eqe eqeVar, boolean z) {
        this.a = eqeVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbb)) {
            return false;
        }
        wbb wbbVar = (wbb) obj;
        return tpa.f(this.a, wbbVar.a) && this.b == wbbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotifyUser(text=" + this.a + ", isError=" + this.b + ")";
    }
}
