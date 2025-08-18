package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f52 implements Serializable {
    public final List A0;
    public final int B0;
    public final km2 C0;
    public final String D0;
    public final w4d E0;
    public final int F0;
    public final dh6 G0;
    public final fs8 H0;
    public final boolean I0;
    public final boolean J0;
    public final boolean K0;
    public final long L0;
    public final Map M0;
    public final jef N0;
    public final pq0 O0;
    public final long P0;
    public final Map Q0;
    public final long R0;
    public final boolean S0;
    public final long T0;
    public final String U0;
    public final long V0;
    public final long W0;
    public final long X;
    public final int X0;
    public final String Y;
    public final int Y0;
    public final String Z;
    public final long a;
    public final String b;
    public final long c;
    public final Map o;
    public final String s0;
    public final fs8 t0;
    public final long u0;
    public final long v0;
    public final int w0;
    public final long x0;
    public final int y0;
    public final String z0;

    public f52(d52 d52Var) {
        this.a = d52Var.a;
        this.X0 = d52Var.N;
        this.b = d52Var.b;
        this.c = d52Var.c;
        this.o = d52Var.d;
        this.X = d52Var.e;
        this.Y = d52Var.f;
        this.Z = d52Var.g;
        this.s0 = d52Var.h;
        this.t0 = d52Var.i;
        this.u0 = d52Var.j;
        this.v0 = d52Var.k;
        this.w0 = d52Var.l;
        this.x0 = d52Var.m;
        this.y0 = d52Var.r;
        this.z0 = d52Var.s;
        this.A0 = d52Var.t;
        this.B0 = d52Var.u;
        this.C0 = d52Var.v;
        this.Y0 = d52Var.O;
        this.D0 = d52Var.n;
        this.E0 = d52Var.o;
        this.F0 = d52Var.p;
        this.G0 = d52Var.q;
        this.H0 = d52Var.w;
        this.I0 = d52Var.x;
        this.J0 = d52Var.y;
        this.K0 = d52Var.z;
        this.L0 = d52Var.A;
        this.M0 = d52Var.B;
        this.N0 = d52Var.C;
        this.O0 = new pq0(d52Var.D, d52Var.E);
        this.P0 = d52Var.F;
        this.Q0 = d52Var.G;
        this.R0 = d52Var.H;
        this.S0 = d52Var.I;
        this.T0 = d52Var.J;
        this.U0 = d52Var.K;
        this.V0 = d52Var.L;
        this.W0 = d52Var.M;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x06b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.f52 a(defpackage.gy8 r28) {
        /*
            Method dump skipped, instructions count: 2742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f52.a(gy8):f52");
    }

    public final String toString() {
        int iS = s5c.S(this.o);
        int iO = s5c.o(this.A0);
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(ms2.p(this.X0));
        sb.append(", status='");
        sb.append(this.b);
        sb.append("', owner=");
        sb.append(this.c);
        sb.append(", participants=");
        sb.append(iS);
        sb.append(", created=");
        sb.append(this.X);
        sb.append(", lastMessage=");
        sb.append(this.t0);
        sb.append(", cid=");
        sb.append(this.u0);
        sb.append(", lastEventTime=");
        sb.append(this.v0);
        sb.append(", newMessages=");
        sb.append(this.w0);
        sb.append(", participantsCount=");
        ms2.k(sb, this.y0, ", admins=", iO, ", chatOptions=");
        sb.append(this.C0);
        sb.append(", botsInfo=");
        sb.append(this.O0);
        sb.append(", getLastMentionMessageId=");
        sb.append(this.R0);
        sb.append(", lastReactedMessageId=");
        sb.append(this.T0);
        sb.append(", lastReaction=");
        sb.append(this.U0);
        sb.append(", markedAsUnread=");
        sb.append(this.S0);
        sb.append(", lastFireDelayedErrorTime=");
        sb.append(this.W0);
        sb.append(", lastDelayedUpdateTime=");
        return zr6.k(sb, this.V0, "}");
    }
}
