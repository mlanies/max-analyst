package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class tva extends bz {
    public String X;
    public final Integer Y;
    public final Integer Z;
    public final String o;
    public final boolean s0;
    public final byte[] t0;
    public final String u0;
    public final String v0;
    public final Long w0;
    public final String x0;

    public tva(String str, String str2, Integer num, Integer num2, boolean z, byte[] bArr, Long l, String str3, String str4, boolean z2, boolean z3, String str5) {
        super(b10.PHOTO, z2, z3);
        this.o = str;
        this.X = str2;
        this.Y = num;
        this.Z = num2;
        this.s0 = z;
        this.t0 = bArr;
        this.w0 = l;
        this.v0 = str3;
        this.u0 = str4;
        this.x0 = str5;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.u0;
        if (!oag.t(str)) {
            mapA.put("photoToken", str);
        }
        return mapA;
    }
}
