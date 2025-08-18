package defpackage;

/* loaded from: classes.dex */
public final class d04 {
    public static final d04 k = new d04(null, null, null, false, false, null, 1022);
    public final j1e a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final u8b i;
    public final i95 j;

    public d04(j1e j1eVar, long j, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, u8b u8bVar, i95 i95Var) {
        this.a = j1eVar;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = u8bVar;
        this.j = i95Var;
    }

    public static d04 a(d04 d04Var, j1e j1eVar, long j, String str, String str2, boolean z, boolean z2, boolean z3, u8b u8bVar, i95 i95Var, int i) {
        j1e j1eVar2 = (i & 1) != 0 ? d04Var.a : j1eVar;
        long j2 = (i & 2) != 0 ? d04Var.b : j;
        String str3 = (i & 4) != 0 ? d04Var.c : str;
        String str4 = (i & 8) != 0 ? d04Var.d : str2;
        boolean z4 = (i & 16) != 0 ? d04Var.e : z;
        boolean z5 = (i & 32) != 0 ? d04Var.f : z2;
        boolean z6 = d04Var.g;
        boolean z7 = (i & 128) != 0 ? d04Var.h : z3;
        u8b u8bVar2 = (i & 256) != 0 ? d04Var.i : u8bVar;
        i95 i95Var2 = (i & 512) != 0 ? d04Var.j : i95Var;
        d04Var.getClass();
        return new d04(j1eVar2, j2, str3, str4, z4, z5, z6, z7, u8bVar2, i95Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04)) {
            return false;
        }
        d04 d04Var = (d04) obj;
        return tpa.f(this.a, d04Var.a) && this.b == d04Var.b && tpa.f(this.c, d04Var.c) && tpa.f(this.d, d04Var.d) && this.e == d04Var.e && this.f == d04Var.f && this.g == d04Var.g && this.h == d04Var.h && tpa.f(this.i, d04Var.i) && tpa.f(this.j, d04Var.j);
    }

    public final int hashCode() {
        j1e j1eVar = this.a;
        int iM = h4f.m((j1eVar == null ? 0 : j1eVar.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iM + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iD = ms2.d(ms2.d(ms2.d(ms2.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        u8b u8bVar = this.i;
        return this.j.hashCode() + ((iD + (u8bVar != null ? u8bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CurrentCallInfo(target=" + this.a + ", startedAt=" + this.b + ", conversationId=" + this.c + ", joinLink=" + this.d + ", hasOpponentsOnce=" + this.e + ", isConnectedOnce=" + this.f + ", isIncoming=" + this.g + ", isGroupCall=" + this.h + ", previousCallState=" + this.i + ", state=" + this.j + ")";
    }

    public /* synthetic */ d04(j1e j1eVar, String str, String str2, boolean z, boolean z2, i95 i95Var, int i) {
        this(j1eVar, System.currentTimeMillis(), (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, false, false, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, null, (i & 512) != 0 ? d95.b : i95Var);
    }
}
