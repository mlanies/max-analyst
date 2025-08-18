package defpackage;

/* loaded from: classes2.dex */
public final class k95 extends gle {
    public final Long c;
    public final String o;

    public k95(String str, Long l) {
        this.c = l;
        this.o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k95)) {
            return false;
        }
        k95 k95Var = (k95) obj;
        return tpa.f(this.c, k95Var.c) && tpa.f(this.o, k95Var.o);
    }

    public final int hashCode() {
        Long l = this.c;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.o;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(botId=" + this.c + ", startParams=" + this.o + ")";
    }
}
