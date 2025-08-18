package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class kt7 extends gle implements dt7 {
    public final long A0;
    public final List X;
    public final Map Y;
    public final String Z;
    public final nab c;
    public final List o;
    public final long s0;
    public final le3 t0;
    public final Map u0;
    public final long v0;
    public final List w0;
    public final boolean x0;
    public final long y0;
    public final vp4 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ kt7() {
        nz4 nz4Var = nz4.a;
        oz4 oz4Var = oz4.a;
        this(null, nz4Var, nz4Var, oz4Var, null, 0L, null, oz4Var, 0L, nz4Var, false, 0L, null, 0L);
    }

    @Override // defpackage.dt7
    public final String a(boolean z, boolean z2) {
        a8d a8dVar;
        Map map;
        le3 le3Var = this.t0;
        if (le3Var != null && (a8dVar = le3Var.b) != null && (map = a8dVar.b) != null) {
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            }
            if (map.containsKey("log-sensitive")) {
                Object obj2 = map.get("log-sensitive");
                z2 = Boolean.parseBoolean(obj2 != null ? obj2.toString() : null);
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN.Response(profile=");
        sb.append(String.valueOf(this.c));
        sb.append(",token=");
        String str = this.Z;
        sb.append(z2 ? str != null ? str.toString() : "NULL" : oag.x(str));
        sb.append(",time=");
        sb.append(this.s0);
        sb.append(",chatMarker=");
        sb.append(this.v0);
        sb.append(",videoChatHistory=");
        sb.append(this.x0);
        sb.append(",resetAt=");
        sb.append(this.y0);
        sb.append(",contactInfos=");
        sb.append(wmd.x(this.X, z, z2));
        sb.append(",config=");
        sb.append(le3Var);
        sb.append(",messages=");
        sb.append(wmd.y(this.u0, z, z2));
        sb.append(",chats=");
        sb.append(wmd.x(this.o, z, z2));
        sb.append(",presence=");
        sb.append(wmd.y(this.Y, z, z2));
        sb.append(",calls=");
        sb.append(wmd.x(this.w0, z, z2));
        sb.append(",draftsNews=");
        sb.append(this.z0);
        sb.append(')');
        return sb.toString();
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.X) {
            if (((wm3) obj) != um3.A0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt7)) {
            return false;
        }
        kt7 kt7Var = (kt7) obj;
        return tpa.f(this.c, kt7Var.c) && tpa.f(this.o, kt7Var.o) && tpa.f(this.X, kt7Var.X) && tpa.f(this.Y, kt7Var.Y) && tpa.f(this.Z, kt7Var.Z) && this.s0 == kt7Var.s0 && tpa.f(this.t0, kt7Var.t0) && tpa.f(this.u0, kt7Var.u0) && this.v0 == kt7Var.v0 && tpa.f(this.w0, kt7Var.w0) && this.x0 == kt7Var.x0 && this.y0 == kt7Var.y0 && tpa.f(this.z0, kt7Var.z0) && this.A0 == kt7Var.A0;
    }

    public final int hashCode() {
        nab nabVar = this.c;
        int iHashCode = (this.Y.hashCode() + k7d.g(this.X, k7d.g(this.o, (nabVar == null ? 0 : nabVar.hashCode()) * 31, 31), 31)) * 31;
        String str = this.Z;
        int iM = h4f.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.s0);
        le3 le3Var = this.t0;
        int iM2 = h4f.m(ms2.d(k7d.g(this.w0, h4f.m((this.u0.hashCode() + ((iM + (le3Var == null ? 0 : le3Var.hashCode())) * 31)) * 31, 31, this.v0), 31), 31, this.x0), 31, this.y0);
        vp4 vp4Var = this.z0;
        return Long.hashCode(this.A0) + ((iM2 + (vp4Var != null ? vp4Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        return a(false, false);
    }

    public kt7(nab nabVar, List list, List list2, Map map, String str, long j, le3 le3Var, Map map2, long j2, List list3, boolean z, long j3, vp4 vp4Var, long j4) {
        this.c = nabVar;
        this.o = list;
        this.X = list2;
        this.Y = map;
        this.Z = str;
        this.s0 = j;
        this.t0 = le3Var;
        this.u0 = map2;
        this.v0 = j2;
        this.w0 = list3;
        this.x0 = z;
        this.y0 = j3;
        this.z0 = vp4Var;
        this.A0 = j4;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j4));
    }
}
