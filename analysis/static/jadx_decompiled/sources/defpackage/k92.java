package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k92 {
    public final long A;
    public final List B;
    public final c92 C;
    public final int D;
    public final String E;
    public final List F;
    public final int G;
    public final z82 H;
    public final String I;
    public final fm5 J;
    public final f92 K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final Map R;
    public final int S;
    public final k10 T;
    public final long U;
    public final int V;
    public final long W;
    public final int X;
    public final long Y;
    public final long Z;
    public final long a;
    public final List a0;
    public final j92 b;
    public final long b0;
    public final i92 c;
    public final long c0;
    public final long d;
    public final long d0;
    public final Map e;
    public final oq0 e0;
    public final long f;
    public final uaa f0;
    public final String g;
    public final long g0;
    public final String h;
    public final long h0;
    public final String i;
    public boolean i0;
    public final long j;
    public final long j0;
    public final long k;
    public final boolean k0;
    public final long l;
    public final long l0;
    public final int m;
    public final String m0;
    public final e92 n;
    public final Map n0;
    public final String o;
    public final g92 o0;
    public final b92 p;
    public final long p0;
    public final x82 q;
    public final long q0;
    public final x82 r;
    public final int r0;
    public final x82 s;
    public final x82 t;
    public final x82 u;
    public final x82 v;
    public final x82 w;
    public final long x;
    public final List y;
    public final List z;

    public k92(u82 u82Var) {
        this.a = u82Var.a;
        j92 j92Var = u82Var.b;
        if (j92Var == null) {
            this.b = j92.a;
        } else {
            this.b = j92Var;
        }
        i92 i92Var = u82Var.c;
        if (i92Var == null) {
            this.c = i92.a;
        } else {
            this.c = i92Var;
        }
        this.d = u82Var.d;
        Map map = u82Var.e;
        this.e = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f = u82Var.f;
        this.g = u82Var.g;
        this.h = u82Var.h;
        this.i = u82Var.i;
        this.j = u82Var.j;
        this.k = u82Var.k;
        this.l = u82Var.l;
        this.m = u82Var.m;
        e92 e92Var = u82Var.n;
        this.n = e92Var != null ? e92Var.b(true) : new e92();
        this.o = u82Var.o;
        this.p = u82Var.p;
        this.q = u82Var.q;
        this.r = u82Var.r;
        this.s = u82Var.s;
        this.t = u82Var.t;
        this.u = u82Var.u;
        this.v = u82Var.v;
        this.w = u82Var.w;
        this.x = u82Var.x;
        List list = u82Var.y;
        this.y = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        List list2 = u82Var.z;
        this.z = list2 != null ? Collections.unmodifiableList(list2) : Collections.emptyList();
        this.A = u82Var.A;
        List list3 = u82Var.B;
        this.B = list3 != null ? Collections.unmodifiableList(list3) : Collections.emptyList();
        this.C = u82Var.D;
        this.D = u82Var.G;
        this.E = u82Var.H;
        List list4 = u82Var.I;
        if (list4 == null) {
            this.F = Collections.emptyList();
        } else {
            this.F = list4;
        }
        this.G = u82Var.J;
        z82 z82Var = u82Var.K;
        if (z82Var == null) {
            this.H = z82.j;
        } else {
            this.H = z82Var;
        }
        this.r0 = u82Var.r0;
        this.I = u82Var.E;
        fm5 fm5Var = u82Var.F;
        this.J = fm5Var == null ? fm5.d : fm5Var;
        this.K = u82Var.C;
        this.L = u82Var.L;
        this.M = u82Var.M;
        this.N = u82Var.N;
        this.O = u82Var.O;
        this.P = u82Var.P;
        this.Q = u82Var.Q;
        this.R = u82Var.R;
        this.S = u82Var.S;
        this.T = u82Var.T;
        this.U = u82Var.U;
        this.V = u82Var.V;
        this.W = u82Var.W;
        this.X = u82Var.X;
        this.Y = u82Var.Y;
        this.Z = u82Var.Z;
        this.a0 = u82Var.a0;
        this.b0 = u82Var.b0;
        this.c0 = u82Var.c0;
        this.e0 = u82Var.d0;
        this.d0 = u82Var.e0;
        this.f0 = u82Var.f0;
        this.g0 = u82Var.g0;
        this.h0 = u82Var.h0;
        this.i0 = u82Var.i0;
        this.n0 = u82Var.j0;
        this.j0 = u82Var.k0;
        this.k0 = u82Var.l0;
        this.o0 = u82Var.m0;
        this.l0 = u82Var.n0;
        this.m0 = u82Var.o0;
        this.p0 = u82Var.p0;
        this.q0 = u82Var.q0;
    }

    public final b92 a() {
        b92 b92Var = this.p;
        return b92Var != null ? b92Var : b92.h;
    }

    public final String b(kk0 kk0Var, jk0 jk0Var) {
        String str = this.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (oag.t(str)) {
            return null;
        }
        return ju0.t(str, kk0Var, jk0Var);
    }

    public final int c() {
        if (this.b == j92.a) {
            return 2;
        }
        return this.D;
    }

    public final boolean d() {
        return this.c == i92.a;
    }

    public final boolean e() {
        return this.b == j92.a;
    }

    public final boolean f(long j) {
        if (this.a == 0) {
            if (this.b == j92.a && this.d == j) {
                Map map = this.e;
                if (map.size() == 1 && map.containsKey(Long.valueOf(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g() {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            if (this.c == i92.Z) {
                return false;
            }
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new IllegalStateException("invalid chat type");
            }
            if (this.a == 0) {
                return false;
            }
        }
        return true;
    }

    public final u82 h() {
        u82 u82Var = new u82();
        u82Var.a = this.a;
        u82Var.b = this.b;
        u82Var.c = this.c;
        u82Var.d = this.d;
        Map map = this.e;
        us usVar = new us(map.size());
        usVar.putAll(map);
        u82Var.e = usVar;
        u82Var.f = this.f;
        u82Var.g = this.g;
        u82Var.h = this.h;
        u82Var.i = this.i;
        u82Var.j = this.j;
        u82Var.k = this.k;
        u82Var.l = this.l;
        u82Var.m = this.m;
        u82Var.n = this.n.b(false);
        u82Var.o = this.o;
        u82Var.p = this.p;
        u82Var.q = this.q;
        u82Var.r = this.r;
        u82Var.s = this.s;
        u82Var.t = this.t;
        u82Var.u = this.u;
        u82Var.v = this.v;
        u82Var.w = this.w;
        u82Var.x = this.x;
        u82Var.y = new ArrayList(this.y);
        u82Var.z = new ArrayList(this.z);
        u82Var.A = this.A;
        u82Var.B = new ArrayList(this.B);
        u82Var.C = this.K;
        u82Var.D = this.C;
        u82Var.r0 = this.r0;
        u82Var.E = this.I;
        u82Var.F = this.J;
        u82Var.G = this.D;
        u82Var.H = this.E;
        u82Var.I = new ArrayList(this.F);
        u82Var.J = this.G;
        u82Var.K = this.H;
        u82Var.L = this.L;
        u82Var.M = this.M;
        u82Var.N = this.N;
        u82Var.O = this.O;
        u82Var.P = this.P;
        u82Var.Q = this.Q;
        u82Var.e(this.R);
        u82Var.S = this.S;
        u82Var.T = this.T;
        u82Var.U = this.U;
        u82Var.V = this.V;
        u82Var.W = this.W;
        u82Var.X = this.X;
        u82Var.Y = this.Y;
        u82Var.Z = this.Z;
        u82Var.a0 = this.a0;
        u82Var.d0 = this.e0;
        u82Var.b0 = this.b0;
        u82Var.c0 = this.c0;
        u82Var.e0 = this.d0;
        u82Var.f0 = this.f0;
        u82Var.g0 = this.g0;
        u82Var.h0 = this.h0;
        u82Var.i0 = this.i0;
        u82Var.j0 = this.n0;
        u82Var.l0 = this.k0;
        u82Var.m0 = this.o0;
        u82Var.k0 = this.j0;
        u82Var.n0 = this.l0;
        u82Var.o0 = this.m0;
        u82Var.p0 = this.p0;
        u82Var.q0 = this.q0;
        return u82Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatData{serverId=");
        sb.append(this.a);
        sb.append(", type=");
        j92 j92Var = this.b;
        sb.append(j92Var);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", participants={");
        j92 j92Var2 = j92.a;
        Map map = this.e;
        sb.append(j92Var == j92Var2 ? oag.v(map.keySet()) : Integer.valueOf(map.size()));
        sb.append("}, title='");
        sb.append(this.g);
        sb.append("', lastMessageId=");
        sb.append(this.j);
        sb.append(", lastEventTime=");
        sb.append(this.k);
        sb.append(", newMessages=");
        sb.append(this.m);
        sb.append(", lastPushMessage=");
        sb.append(this.o0);
        sb.append(", markedAsUnread=");
        sb.append(this.k0);
        sb.append(", chatSettings=");
        sb.append(this.p);
        sb.append(", lastReactionMessageId= ");
        sb.append(this.l0);
        sb.append(", lastReaction");
        return rh4.m(sb, this.m0, '}');
    }
}
