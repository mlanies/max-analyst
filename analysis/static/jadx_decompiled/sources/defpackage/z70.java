package defpackage;

/* loaded from: classes2.dex */
public final class z70 extends gle {
    public final String X;
    public final nab Y;
    public final String c;
    public final fu7 o;

    public z70(String str, fu7 fu7Var, String str2, nab nabVar) {
        this.c = str;
        this.o = fu7Var;
        this.X = str2;
        this.Y = nabVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj;
        return tpa.f(this.c, z70Var.c) && this.o == z70Var.o && tpa.f(this.X, z70Var.X) && tpa.f(this.Y, z70Var.Y);
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.X;
        return this.Y.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        String strX = oag.x(this.c);
        String strX2 = oag.x(this.X);
        StringBuilder sbM = au1.m("{token='", strX, ", tokenType=");
        sbM.append(this.o);
        sbM.append(", userToken='");
        sbM.append(strX2);
        sbM.append(", profile=");
        sbM.append(this.Y);
        sbM.append("}");
        return sbM.toString();
    }
}
