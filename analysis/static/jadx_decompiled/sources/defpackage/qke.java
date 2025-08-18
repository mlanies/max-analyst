package defpackage;

/* loaded from: classes2.dex */
public final class qke extends pke {
    public final String Y;
    public final String Z;

    public qke(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.Y = str4;
        this.Z = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qke) || !super.equals(obj)) {
            return false;
        }
        qke qkeVar = (qke) obj;
        return tpa.f(this.Y, qkeVar.Y) && tpa.f(this.Z, qkeVar.Z);
    }

    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.Y;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.Z;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.pke, defpackage.zje
    public final String toString() {
        StringBuilder sbO = rh4.o(qke.class.getSimpleName(), "{error='");
        sbO.append(this.b);
        sbO.append("', message='");
        sbO.append(this.c);
        sbO.append("', title='");
        sbO.append(this.Y);
        sbO.append("', description='");
        sbO.append(this.Z);
        sbO.append("', localizedMessage='");
        return zr6.l(sbO, this.o, "'}");
    }
}
