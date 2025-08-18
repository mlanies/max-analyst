package defpackage;

/* loaded from: classes2.dex */
public final class lkd {
    public final jqe a;
    public final String b;

    public lkd(jqe jqeVar, String str) {
        this.a = jqeVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkd)) {
            return false;
        }
        lkd lkdVar = (lkd) obj;
        return tpa.f(this.a, lkdVar.a) && tpa.f(this.b, lkdVar.b);
    }

    public final int hashCode() {
        jqe jqeVar = this.a;
        int iHashCode = (jqeVar == null ? 0 : jqeVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=" + this.b + ")";
    }
}
