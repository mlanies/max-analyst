package defpackage;

/* loaded from: classes.dex */
public final class zq0 {
    public final m38 a;
    public final m38 b;
    public final m38 c;
    public final m38 d;
    public final a51 e;

    public zq0(m38 m38Var, m38 m38Var2, m38 m38Var3, m38 m38Var4, a51 a51Var) {
        this.a = m38Var;
        this.b = m38Var2;
        this.c = m38Var3;
        this.d = m38Var4;
        this.e = a51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq0)) {
            return false;
        }
        zq0 zq0Var = (zq0) obj;
        return this.a == zq0Var.a && this.b == zq0Var.b && this.c == zq0Var.c && this.d == zq0Var.d && tpa.f(this.e, zq0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomPanelState(isMicrophoneEnabled=" + this.a + ", isVideoEnabled=" + this.b + ", isRaiseHandEnabled=" + this.c + ", isOpenChatEnabled=" + this.d + ", dynamicType=" + this.e + ")";
    }
}
