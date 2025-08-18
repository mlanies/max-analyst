package defpackage;

import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class yie {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Map m;
    public final Set n;

    public yie(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, Map map, Set set) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = z;
        this.l = z2;
        this.m = map;
        this.n = set;
    }

    public static yie a(yie yieVar, boolean z, Map map, int i) {
        String str = yieVar.a;
        long j = yieVar.b;
        String str2 = yieVar.c;
        String str3 = yieVar.d;
        String str4 = yieVar.e;
        String str5 = yieVar.f;
        String str6 = yieVar.g;
        String str7 = yieVar.h;
        String str8 = yieVar.i;
        String str9 = yieVar.j;
        boolean z2 = (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? yieVar.k : z;
        boolean z3 = yieVar.l;
        Map map2 = (i & 4096) != 0 ? yieVar.m : map;
        Set set = yieVar.n;
        yieVar.getClass();
        return new yie(str, j, str2, str3, str4, str5, str6, str7, str8, str9, z2, z3, map2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yie)) {
            return false;
        }
        yie yieVar = (yie) obj;
        return tpa.f(this.a, yieVar.a) && this.b == yieVar.b && tpa.f(this.c, yieVar.c) && tpa.f(this.d, yieVar.d) && tpa.f(this.e, yieVar.e) && tpa.f(this.f, yieVar.f) && tpa.f(this.g, yieVar.g) && tpa.f(this.h, yieVar.h) && tpa.f(this.i, yieVar.i) && tpa.f(this.j, yieVar.j) && this.k == yieVar.k && this.l == yieVar.l && tpa.f(this.m, yieVar.m) && tpa.f(this.n, yieVar.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iD = rh4.d(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iD2 = rh4.d(rh4.d(rh4.d(rh4.d(rh4.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        boolean z = this.k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iD2 + i) * 31;
        boolean z2 = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "SystemState(versionName=" + this.a + ", versionCode=" + this.b + ", packageName=" + this.c + ", environment=" + this.d + ", buildUuid=" + this.e + ", sessionUuid=" + this.f + ", device=" + this.g + ", deviceId=" + this.h + ", vendor=" + this.i + ", osVersion=" + this.j + ", isInBackground=" + this.k + ", isRooted=" + this.l + ", properties=" + this.m + ", hostedLibrariesInfo=" + this.n + ')';
    }
}
