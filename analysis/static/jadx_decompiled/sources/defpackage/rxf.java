package defpackage;

/* loaded from: classes2.dex */
public final class rxf extends gle {
    public final String c;
    public final String o;

    public rxf(String str, String str2) {
        this.c = str;
        this.o = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxf)) {
            return false;
        }
        rxf rxfVar = (rxf) obj;
        return tpa.f(this.c, rxfVar.c) && tpa.f(this.o, rxfVar.o);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(url=");
        sb.append(this.c);
        sb.append(", queryId=");
        return zr6.l(sb, this.o, ")");
    }
}
