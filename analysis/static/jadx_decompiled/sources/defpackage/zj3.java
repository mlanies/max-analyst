package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zj3 extends bz {
    public final long X;
    public final String Y;
    public final String Z;
    public final String o;
    public final String s0;
    public final String t0;
    public final String u0;

    public zj3(String str, long j, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        super(b10.CONTACT, z, z2);
        this.o = str;
        this.X = j;
        this.Y = str2;
        this.t0 = str5;
        this.u0 = str6;
        this.Z = str3;
        this.s0 = str4;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.o;
        if (!oag.t(str)) {
            mapA.put("vcfBody", str);
        }
        long j = this.X;
        if (j != 0) {
            mapA.put("contactId", Long.valueOf(j));
        }
        return mapA;
    }
}
