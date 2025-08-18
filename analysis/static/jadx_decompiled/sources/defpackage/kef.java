package defpackage;

/* loaded from: classes2.dex */
public final class kef {
    public final lef a;
    public final boolean b;
    public final String c;
    public final String d;

    public kef(w36 w36Var) {
        this.a = (lef) w36Var.b;
        this.b = w36Var.a;
        this.c = (String) w36Var.c;
        this.d = (String) w36Var.o;
    }

    public final w36 a() {
        w36 w36Var = new w36();
        w36Var.b = this.a;
        w36Var.a = this.b;
        w36Var.c = this.c;
        w36Var.o = this.d;
        return w36Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kef.class != obj.getClass()) {
            return false;
        }
        kef kefVar = (kef) obj;
        if (this.b != kefVar.b) {
            return false;
        }
        lef lefVar = kefVar.a;
        lef lefVar2 = this.a;
        if (lefVar2 == null ? lefVar != null : !lefVar2.equals(lefVar)) {
            return false;
        }
        String str = kefVar.c;
        String str2 = this.c;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = kefVar.d;
        String str4 = this.d;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        lef lefVar = this.a;
        int iHashCode = (((lefVar != null ? lefVar.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConversion{videoConversionData=");
        sb.append(this.a);
        sb.append(", finished=");
        sb.append(this.b);
        sb.append(", preparedPath='");
        sb.append(this.c);
        sb.append("', resultPath='");
        return zr6.l(sb, this.d, "'}");
    }
}
