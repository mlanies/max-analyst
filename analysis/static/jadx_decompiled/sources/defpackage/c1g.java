package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c1g {
    public final byte[] a;
    public final String b;
    public final String c;

    public c1g(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1gVar = (c1g) obj;
        return tpa.f(this.a, c1gVar.a) && tpa.f(this.b, c1gVar.b) && tpa.f(this.c, c1gVar.c);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int iHashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = au1.m("WebAppShareFileInfo(file=", Arrays.toString(this.a), ", fileName=");
        sbM.append(this.b);
        sbM.append(", fileMimeType=");
        return zr6.l(sbM, this.c, ")");
    }
}
