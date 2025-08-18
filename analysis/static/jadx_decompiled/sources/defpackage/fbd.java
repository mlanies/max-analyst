package defpackage;

/* loaded from: classes2.dex */
public final class fbd {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final bjd g;
    public final boolean h;

    public fbd(long j, String str, String str2, String str3, String str4, int i, bjd bjdVar, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = bjdVar;
        this.h = z;
    }

    public static fbd a(fbd fbdVar, int i, bjd bjdVar, boolean z, int i2) {
        long j = fbdVar.a;
        String str = fbdVar.b;
        String str2 = fbdVar.c;
        String str3 = fbdVar.d;
        String str4 = fbdVar.e;
        if ((i2 & 64) != 0) {
            bjdVar = fbdVar.g;
        }
        bjd bjdVar2 = bjdVar;
        if ((i2 & 128) != 0) {
            z = fbdVar.h;
        }
        fbdVar.getClass();
        return new fbd(j, str, str2, str3, str4, i, bjdVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd)) {
            return false;
        }
        fbd fbdVar = (fbd) obj;
        return this.a == fbdVar.a && tpa.f(this.b, fbdVar.b) && tpa.f(this.c, fbdVar.c) && tpa.f(this.d, fbdVar.d) && tpa.f(this.e, fbdVar.e) && this.f == fbdVar.f && tpa.f(this.g, fbdVar.g) && this.h == fbdVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iD = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iD2 = rh4.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iG = ey8.g(this.f, (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        bjd bjdVar = this.g;
        int iHashCode = (iG + (bjdVar != null ? bjdVar.a.hashCode() : 0)) * 31;
        boolean z = this.h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", sessionUuid=");
        sb.append(this.d);
        sb.append(", processName=");
        sb.append(this.e);
        sb.append(", status=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NATIVE" : "ANR" : "CRASH" : "BLANK");
        sb.append(", maxSeverity=");
        sb.append(this.g);
        sb.append(", isInBackground=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
