package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class f2e extends bz {
    public final boolean A0;
    public final int B0;
    public final String C0;
    public final int X;
    public final int Y;
    public final String Z;
    public final long o;
    public final long s0;
    public final String t0;
    public final String u0;
    public final List v0;
    public final String w0;
    public final int x0;
    public final long y0;
    public final String z0;

    public f2e(long j, int i, int i2, String str, long j2, String str2, String str3, List list, String str4, int i3, long j3, String str5, boolean z, int i4, boolean z2, boolean z3, String str6) {
        super(b10.STICKER, z2, z3);
        this.o = j;
        this.X = i;
        this.Y = i2;
        this.Z = str;
        this.s0 = j2;
        this.t0 = str2;
        this.u0 = str3;
        this.v0 = list;
        this.w0 = str4;
        this.x0 = i3;
        this.y0 = j3;
        this.z0 = str5;
        this.A0 = z;
        this.B0 = i4;
        this.C0 = str6;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        mapA.put("stickerId", Long.valueOf(this.o));
        return mapA;
    }
}
