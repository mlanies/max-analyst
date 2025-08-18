package defpackage;

/* loaded from: classes2.dex */
public final class xbe {
    public static final ube Companion = new ube();
    public static final cc7[] c = {wbe.Companion.serializer(), null};
    public final wbe a;
    public final String b;

    public /* synthetic */ xbe(int i, wbe wbeVar, String str) {
        if (1 != (i & 1)) {
            ju0.I(i, 1, tbe.a.d());
            throw null;
        }
        this.a = wbeVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbe)) {
            return false;
        }
        xbe xbeVar = (xbe) obj;
        return this.a == xbeVar.a && tpa.f(this.b, xbeVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResponse(status=");
        sb.append(this.a);
        sb.append(", requestId=");
        return zr6.l(sb, this.b, ")");
    }

    public xbe(wbe wbeVar, String str) {
        this.a = wbeVar;
        this.b = str;
    }
}
