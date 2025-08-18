package defpackage;

/* loaded from: classes2.dex */
public final class v6f {
    public final d7f a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final long f;
    public final q8f g;
    public final p8f h;
    public final long i;

    public v6f(u6f u6fVar) {
        this.a = u6fVar.a;
        this.b = u6fVar.b;
        this.c = u6fVar.c;
        this.d = u6fVar.d;
        this.e = u6fVar.e;
        this.f = u6fVar.f;
        this.g = u6fVar.g;
        this.h = u6fVar.h;
        this.i = u6fVar.i;
    }

    public final boolean a() {
        return this.g == q8f.UPLOADED && this.h != null;
    }

    public final u6f b() {
        u6f u6fVar = new u6f();
        q8f q8fVar = q8f.UNKNOWN;
        u6fVar.a = this.a;
        u6fVar.b = this.b;
        u6fVar.c = this.c;
        u6fVar.d = this.d;
        u6fVar.h = this.h;
        u6fVar.g = this.g;
        u6fVar.f = this.f;
        u6fVar.e = this.e;
        u6fVar.i = this.i;
        return u6fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v6f.class != obj.getClass()) {
            return false;
        }
        v6f v6fVar = (v6f) obj;
        if (Float.compare(v6fVar.e, this.e) != 0 || this.f != v6fVar.f || this.i != v6fVar.i) {
            return false;
        }
        d7f d7fVar = v6fVar.a;
        d7f d7fVar2 = this.a;
        if (d7fVar2 == null ? d7fVar != null : !d7fVar2.equals(d7fVar)) {
            return false;
        }
        String str = v6fVar.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = v6fVar.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = v6fVar.d;
        String str6 = this.d;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        if (this.g != v6fVar.g) {
            return false;
        }
        p8f p8fVar = v6fVar.h;
        p8f p8fVar2 = this.h;
        return p8fVar2 != null ? p8fVar2.equals(p8fVar) : p8fVar == null;
    }

    public final int hashCode() {
        d7f d7fVar = this.a;
        int iHashCode = (d7fVar != null ? d7fVar.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode4 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        long j = this.f;
        int i = (iFloatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        q8f q8fVar = this.g;
        int iHashCode5 = (i + (q8fVar != null ? q8fVar.hashCode() : 0)) * 31;
        p8f p8fVar = this.h;
        int iHashCode6 = p8fVar != null ? p8fVar.hashCode() : 0;
        long j2 = this.i;
        return ((iHashCode5 + iHashCode6) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Upload{uploadData=");
        sb.append(this.a);
        sb.append(", preparedPath='");
        sb.append(this.b);
        sb.append("', fileName='");
        sb.append(this.c);
        sb.append("', uploadUrl='");
        sb.append(this.d);
        sb.append("', uploadProgress=");
        sb.append(this.e);
        sb.append(", totalBytes=");
        sb.append(this.f);
        sb.append(", uploadStatus=");
        sb.append(this.g);
        sb.append(", uploadResult=");
        sb.append(this.h);
        sb.append(", createdTime=");
        return z7b.i(sb, this.i, '}');
    }
}
