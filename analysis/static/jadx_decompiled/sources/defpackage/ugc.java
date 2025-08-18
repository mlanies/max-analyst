package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ugc implements Serializable {
    public final lna X;
    public final int a;
    public final int b;
    public final String c;
    public final tva o;

    public ugc(int i, int i2, String str, tva tvaVar, lna lnaVar) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = tvaVar;
        this.X = lnaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugc)) {
            return false;
        }
        ugc ugcVar = (ugc) obj;
        return this.a == ugcVar.a && this.b == ugcVar.b && tpa.f(this.c, ugcVar.c) && tpa.f(this.o, ugcVar.o) && tpa.f(this.X, ugcVar.X);
    }

    public final int hashCode() {
        int iD = rh4.d(ey8.g(this.b, au1.s(this.a) * 31, 31), 31, this.c);
        tva tvaVar = this.o;
        int iHashCode = (iD + (tvaVar == null ? 0 : tvaVar.hashCode())) * 31;
        lna lnaVar = this.X;
        return iHashCode + (lnaVar != null ? lnaVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.o);
        sb.append(", outgoingMessage=");
        sb.append(this.X);
        sb.append(")");
        return sb.toString();
    }
}
