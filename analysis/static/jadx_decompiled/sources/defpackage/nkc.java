package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class nkc {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final Long i;
    public final Map j;
    public final List k;
    public final Set l;
    public final boolean m;

    public /* synthetic */ nkc(String str, String str2, String str3, int i, Set set, boolean z, boolean z2, List list, Long l, Map map, List list2, Set set2, int i2) {
        this(str, str2, str3, i, set, z, z2, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : l, (i2 & 512) != 0 ? null : map, (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : list2, (i2 & 2048) != 0 ? null : set2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    public final at5 a(List list, Set set, Set set2, hda hdaVar) {
        nz4 nz4Var = nz4.a;
        String str = this.b;
        ?? r2 = this.h;
        CharSequence charSequenceA = hdaVar.a(str, r2, 2, false, 0, true);
        Set setH0 = x53.H0(list);
        nz4 nz4Var2 = r2 == 0 ? nz4Var : r2;
        Map map = this.j;
        if (map == null) {
            map = oz4.a;
        }
        Map map2 = map;
        ?? r1 = this.k;
        nz4 nz4Var3 = r1 == 0 ? nz4Var : r1;
        Set set3 = this.l;
        if (set3 == null) {
            set3 = wz4.a;
        }
        return new at5(this.a, charSequenceA, this.c, this.d, nz4Var, this.e, true, this.f, list, this.g, setH0, set, set2, nz4Var2, this.i, map2, nz4Var3, set3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkc)) {
            return false;
        }
        nkc nkcVar = (nkc) obj;
        return tpa.f(this.a, nkcVar.a) && tpa.f(this.b, nkcVar.b) && tpa.f(this.c, nkcVar.c) && this.d == nkcVar.d && tpa.f(this.e, nkcVar.e) && this.f == nkcVar.f && this.g == nkcVar.g && tpa.f(this.h, nkcVar.h) && tpa.f(this.i, nkcVar.i) && tpa.f(this.j, nkcVar.j) && tpa.f(this.k, nkcVar.k) && tpa.f(this.l, nkcVar.l) && this.m == nkcVar.m;
    }

    public final int hashCode() {
        int iD = rh4.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = ms2.d(ms2.d((this.e.hashCode() + k7d.e(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f), 31, this.g);
        List list = this.h;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.i;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.j;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Set set = this.l;
        return Boolean.hashCode(this.m) + ((iHashCode4 + (set != null ? set.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoomChatFolder(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.d);
        sb.append(", filters=");
        sb.append(this.e);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.f);
        sb.append(", hideIfEmpty=");
        sb.append(this.g);
        sb.append(", elements=");
        sb.append(this.h);
        sb.append(", creatorId=");
        sb.append(this.i);
        sb.append(", filterSubjects=");
        sb.append(this.j);
        sb.append(", widgets=");
        sb.append(this.k);
        sb.append(", options=");
        sb.append(this.l);
        sb.append(", isRemoved=");
        return au1.j(sb, this.m, ")");
    }

    public nkc(String str, String str2, String str3, int i, Set set, boolean z, boolean z2, List list, Long l, Map map, List list2, Set set2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = l;
        this.j = map;
        this.k = list2;
        this.l = set2;
        this.m = z3;
    }

    public nkc(at5 at5Var) {
        this(at5Var.a, at5Var.b.toString(), at5Var.c, at5Var.o, at5Var.Y, at5Var.s0, at5Var.u0, at5Var.y0, at5Var.z0, at5Var.A0, at5Var.B0, at5Var.C0, 4096);
    }
}
