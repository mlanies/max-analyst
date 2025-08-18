package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class cr7 extends bz {
    public final long X;
    public final long Y;
    public final long Z;
    public final er7 o;
    public final List s0;
    public final String t0;
    public final float u0;
    public final boolean v0;

    public cr7(er7 er7Var, long j, long j2, long j3, List list, String str, float f, boolean z, boolean z2, boolean z3) {
        super(b10.LOCATION, z2, z3);
        this.o = er7Var;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.s0 = list;
        this.t0 = str;
        this.v0 = z;
        this.u0 = f;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        er7 er7Var = this.o;
        mapA.put("latitude", Double.valueOf(er7Var.a));
        mapA.put("longitude", Double.valueOf(er7Var.b));
        long j = this.X;
        if (j > 0) {
            mapA.put("livePeriod", Long.valueOf(j));
        }
        float f = this.u0;
        if (f > 0.0f) {
            mapA.put("zoom", Float.valueOf(f));
        }
        double d = er7Var.c;
        if (d != 0.0d) {
            mapA.put("alt", Double.valueOf(d));
        }
        float f2 = er7Var.o;
        if (f2 != 0.0f) {
            mapA.put("epu", Float.valueOf(f2));
        }
        float f3 = er7Var.X;
        if (f3 != 0.0f) {
            mapA.put("hdn", Float.valueOf(f3));
        }
        float f4 = er7Var.Y;
        if (f4 != 0.0f) {
            mapA.put("spd", Float.valueOf(f4));
        }
        return mapA;
    }
}
