package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class pke extends zje implements Serializable {
    public final yje X;
    public final String b;
    public final String c;
    public final String o;

    public pke(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = new yje(rh4.j(str, " ", str2), str3);
    }

    @Override // defpackage.zje
    public String toString() {
        StringBuilder sbO = rh4.o(getClass().getSimpleName(), "{error='");
        sbO.append(this.b);
        sbO.append("', message='");
        sbO.append(this.c);
        sbO.append("', localizedMessage='");
        return zr6.l(sbO, this.o, "'}");
    }
}
