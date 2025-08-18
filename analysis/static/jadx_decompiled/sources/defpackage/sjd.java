package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class sjd extends bz {
    public final String X;
    public final String Y;
    public final String Z;
    public final long o;
    public final String s0;
    public final tva t0;
    public final bz u0;

    public sjd(long j, String str, String str2, String str3, String str4, tva tvaVar, bz bzVar, boolean z, boolean z2) {
        super(b10.SHARE, z, z2);
        this.o = j;
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.s0 = str4;
        this.t0 = tvaVar;
        this.u0 = bzVar;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("shareId", Long.valueOf(this.o));
        mapA.put("url", this.X);
        return mapA;
    }
}
