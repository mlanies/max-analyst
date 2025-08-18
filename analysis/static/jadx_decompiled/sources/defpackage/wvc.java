package defpackage;

/* loaded from: classes.dex */
public final class wvc {
    public static final wvc e = new wvc(xvc.o, null, false, null);
    public final xvc a;
    public final kvc b;
    public final boolean c;
    public final CharSequence d;

    public wvc(xvc xvcVar, kvc kvcVar, boolean z, CharSequence charSequence) {
        this.a = xvcVar;
        this.b = kvcVar;
        this.c = z;
        this.d = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.CharSequence] */
    public static wvc a(wvc wvcVar, xvc xvcVar, kvc kvcVar, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            xvcVar = wvcVar.a;
        }
        if ((i & 2) != 0) {
            kvcVar = wvcVar.b;
        }
        if ((i & 4) != 0) {
            z = wvcVar.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            str2 = wvcVar.d;
        }
        wvcVar.getClass();
        return new wvc(xvcVar, kvcVar, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvc)) {
            return false;
        }
        wvc wvcVar = (wvc) obj;
        return this.a == wvcVar.a && tpa.f(this.b, wvcVar.b) && this.c == wvcVar.c && tpa.f(this.d, wvcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kvc kvcVar = this.b;
        int iD = ms2.d((iHashCode + (kvcVar == null ? 0 : kvcVar.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return iD + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        return "ScreenRecordData(state=" + this.a + ", data=" + this.b + ", isApproved=" + this.c + ", recordUserName=" + ((Object) this.d) + ")";
    }
}
