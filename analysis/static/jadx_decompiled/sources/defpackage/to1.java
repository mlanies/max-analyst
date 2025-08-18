package defpackage;

/* loaded from: classes.dex */
public final class to1 {
    public static final to1 i = new to1(true, nnf.a, 224);
    public final gg1 a;
    public final gg1 b;
    public final gg1 c;
    public final boolean d;
    public final nnf e;
    public final boolean f;
    public final u9f g;
    public final long h;

    public to1(gg1 gg1Var, gg1 gg1Var2, gg1 gg1Var3, boolean z, nnf nnfVar, boolean z2, u9f u9fVar, long j) {
        this.a = gg1Var;
        this.b = gg1Var2;
        this.c = gg1Var3;
        this.d = z;
        this.e = nnfVar;
        this.f = z2;
        this.g = u9fVar;
        this.h = j;
    }

    public static to1 a(to1 to1Var, gg1 gg1Var, gg1 gg1Var2, gg1 gg1Var3, nnf nnfVar, boolean z, u9f u9fVar, long j, int i2) {
        gg1 gg1Var4 = (i2 & 1) != 0 ? to1Var.a : gg1Var;
        gg1 gg1Var5 = (i2 & 2) != 0 ? to1Var.b : gg1Var2;
        gg1 gg1Var6 = (i2 & 4) != 0 ? to1Var.c : gg1Var3;
        boolean z2 = (i2 & 8) != 0 ? to1Var.d : false;
        nnf nnfVar2 = (i2 & 16) != 0 ? to1Var.e : nnfVar;
        boolean z3 = (i2 & 32) != 0 ? to1Var.f : z;
        u9f u9fVar2 = (i2 & 64) != 0 ? to1Var.g : u9fVar;
        long j2 = (i2 & 128) != 0 ? to1Var.h : j;
        to1Var.getClass();
        return new to1(gg1Var4, gg1Var5, gg1Var6, z2, nnfVar2, z3, u9fVar2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to1)) {
            return false;
        }
        to1 to1Var = (to1) obj;
        return tpa.f(this.a, to1Var.a) && tpa.f(this.b, to1Var.b) && tpa.f(this.c, to1Var.c) && this.d == to1Var.d && this.e == to1Var.e && this.f == to1Var.f && this.g == to1Var.g && this.h == to1Var.h;
    }

    public final int hashCode() {
        gg1 gg1Var = this.a;
        int iHashCode = (gg1Var == null ? 0 : gg1Var.hashCode()) * 31;
        gg1 gg1Var2 = this.b;
        int iHashCode2 = (iHashCode + (gg1Var2 == null ? 0 : gg1Var2.hashCode())) * 31;
        gg1 gg1Var3 = this.c;
        return Long.hashCode(this.h) + ((this.g.hashCode() + ms2.d((this.e.hashCode() + ms2.d((iHashCode2 + (gg1Var3 != null ? gg1Var3.hashCode() : 0)) * 31, 31, this.d)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallUserState(pinnedOpponentId=");
        sb.append(this.a);
        sb.append(", pipOpponentIdState=");
        sb.append(this.b);
        sb.append(", selectedOpponentId=");
        sb.append(this.c);
        sb.append(", canShowInviteBanner=");
        sb.append(this.d);
        sb.append(", modeView=");
        sb.append(this.e);
        sb.append(", raiseHandOnce=");
        sb.append(this.f);
        sb.append(", vpnNotification=");
        sb.append(this.g);
        sb.append(", lastShowWaitingRoomNotificationTs=");
        return zr6.k(sb, this.h, ")");
    }

    public /* synthetic */ to1(boolean z, nnf nnfVar, int i2) {
        this(null, null, null, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? nnf.a : nnfVar, false, u9f.o, 0L);
    }
}
