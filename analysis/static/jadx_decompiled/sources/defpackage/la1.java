package defpackage;

/* loaded from: classes.dex */
public final class la1 {
    public final String a;
    public final j1e b;
    public final j1e c;
    public final boolean d;
    public final i95 e;
    public final m31 f;
    public final boolean g;
    public final fqa h;
    public final ak1 i;
    public final yj1 j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final gg1 p;
    public final m38 q;
    public final m38 r;
    public final boolean s;
    public final boolean t;

    public la1(String str, j1e j1eVar, j1e j1eVar2, boolean z, i95 i95Var, m31 m31Var, boolean z2, fqa fqaVar, ak1 ak1Var, yj1 yj1Var, String str2, boolean z3, boolean z4, boolean z5, boolean z6, gg1 gg1Var, m38 m38Var, m38 m38Var2, boolean z7, boolean z8) {
        this.a = str;
        this.b = j1eVar;
        this.c = j1eVar2;
        this.d = z;
        this.e = i95Var;
        this.f = m31Var;
        this.g = z2;
        this.h = fqaVar;
        this.i = ak1Var;
        this.j = yj1Var;
        this.k = str2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = gg1Var;
        this.q = m38Var;
        this.r = m38Var2;
        this.s = z7;
        this.t = z8;
    }

    public static la1 a(la1 la1Var, j1e j1eVar, i95 i95Var, m31 m31Var, boolean z, m38 m38Var, m38 m38Var2, boolean z2, int i) {
        gg1 gg1Var;
        m38 m38Var3;
        boolean z3;
        boolean z4;
        String str = la1Var.a;
        j1e j1eVar2 = la1Var.b;
        j1e j1eVar3 = (i & 4) != 0 ? la1Var.c : j1eVar;
        boolean z5 = la1Var.d;
        i95 i95Var2 = (i & 16) != 0 ? la1Var.e : i95Var;
        m31 m31Var2 = (i & 32) != 0 ? la1Var.f : m31Var;
        boolean z6 = (i & 64) != 0 ? la1Var.g : z;
        fqa fqaVar = la1Var.h;
        ak1 ak1Var = la1Var.i;
        yj1 yj1Var = la1Var.j;
        String str2 = la1Var.k;
        boolean z7 = la1Var.l;
        boolean z8 = la1Var.m;
        boolean z9 = la1Var.n;
        boolean z10 = la1Var.o;
        gg1 gg1Var2 = la1Var.p;
        if ((i & 65536) != 0) {
            gg1Var = gg1Var2;
            m38Var3 = la1Var.q;
        } else {
            gg1Var = gg1Var2;
            m38Var3 = m38Var;
        }
        m38 m38Var4 = (i & 131072) != 0 ? la1Var.r : m38Var2;
        boolean z11 = la1Var.s;
        if ((i & 524288) != 0) {
            z3 = z11;
            z4 = la1Var.t;
        } else {
            z3 = z11;
            z4 = z2;
        }
        la1Var.getClass();
        return new la1(str, j1eVar2, j1eVar3, z5, i95Var2, m31Var2, z6, fqaVar, ak1Var, yj1Var, str2, z7, z8, z9, z10, gg1Var, m38Var3, m38Var4, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la1)) {
            return false;
        }
        la1 la1Var = (la1) obj;
        return tpa.f(this.a, la1Var.a) && tpa.f(this.b, la1Var.b) && tpa.f(this.c, la1Var.c) && this.d == la1Var.d && tpa.f(this.e, la1Var.e) && tpa.f(this.f, la1Var.f) && this.g == la1Var.g && tpa.f(this.h, la1Var.h) && tpa.f(this.i, la1Var.i) && tpa.f(this.j, la1Var.j) && tpa.f(this.k, la1Var.k) && this.l == la1Var.l && this.m == la1Var.m && this.n == la1Var.n && this.o == la1Var.o && tpa.f(this.p, la1Var.p) && this.q == la1Var.q && this.r == la1Var.r && this.s == la1Var.s && this.t == la1Var.t;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        j1e j1eVar = this.b;
        int iHashCode2 = (iHashCode + (j1eVar == null ? 0 : j1eVar.hashCode())) * 31;
        j1e j1eVar2 = this.c;
        int iHashCode3 = (this.e.hashCode() + ms2.d((iHashCode2 + (j1eVar2 == null ? 0 : j1eVar2.hashCode())) * 31, 31, this.d)) * 31;
        m31 m31Var = this.f;
        int iD = ms2.d((iHashCode3 + (m31Var == null ? 0 : m31Var.hashCode())) * 31, 31, this.g);
        fqa fqaVar = this.h;
        int iHashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((iD + (fqaVar == null ? 0 : fqaVar.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.k;
        int iD2 = ms2.d(ms2.d(ms2.d(ms2.d((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        gg1 gg1Var = this.p;
        return Boolean.hashCode(this.t) + ms2.d((this.r.hashCode() + ((this.q.hashCode() + ((iD2 + (gg1Var != null ? gg1Var.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.s);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallInfoState(conversationId=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", recallTarget=");
        sb.append(this.c);
        sb.append(", isIncoming=");
        sb.append(this.d);
        sb.append(", callState=");
        sb.append(this.e);
        sb.append(", chatInfo=");
        sb.append(this.f);
        sb.append(", isGroupCall=");
        sb.append(this.g);
        sb.append(", me=");
        sb.append(this.h);
        sb.append(", screenSharingState=");
        sb.append(this.i);
        sb.append(", recordSharingState=");
        sb.append(this.j);
        sb.append(", joinLink=");
        sb.append(this.k);
        sb.append(", hasOpponentsOnce=");
        sb.append(this.l);
        sb.append(", isConnectedOnce=");
        sb.append(this.m);
        sb.append(", isMeCallAdmin=");
        sb.append(this.n);
        sb.append(", isInCallMeOnly=");
        sb.append(this.o);
        sb.append(", primarySpeaker=");
        sb.append(this.p);
        sb.append(", isVideoEnabled=");
        sb.append(this.q);
        sb.append(", isMicrophoneEnabled=");
        sb.append(this.r);
        sb.append(", isCallUnavailable=");
        sb.append(this.s);
        sb.append(", hasAnyCameraEnabled=");
        return au1.j(sb, this.t, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ la1() {
        d95 d95Var = d95.b;
        ak1 ak1Var = ak1.g;
        yj1 yj1Var = yj1.g;
        m38 m38Var = m38.X;
        this(null, null, null, false, d95Var, null, false, null, ak1Var, yj1Var, null, false, false, false, true, null, m38Var, m38Var, false, false);
    }
}
