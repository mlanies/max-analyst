package defpackage;

/* loaded from: classes.dex */
public final class f1f {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public f1f(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final ty a() {
        ty tyVar = new ty();
        tyVar.a = this.a;
        tyVar.c = this.b;
        tyVar.o = this.c;
        tyVar.b = this.d;
        return tyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1f)) {
            return false;
        }
        f1f f1fVar = (f1f) obj;
        return this.a == f1fVar.a && oaf.a(this.b, f1fVar.b) && oaf.a(this.c, f1fVar.c) && this.d == f1fVar.d;
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationRequest{outputHeight=");
        sb.append(this.a);
        sb.append(", audioMimeType='");
        sb.append(this.b);
        sb.append("', videoMimeType='");
        sb.append(this.c);
        sb.append("', hdrMode=");
        return au1.h(sb, this.d, '}');
    }
}
