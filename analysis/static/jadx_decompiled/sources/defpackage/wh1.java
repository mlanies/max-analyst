package defpackage;

/* loaded from: classes.dex */
public final class wh1 {
    public final fd7 a;
    public final fd7 b;
    public final fd7 c;
    public final fd7 d;
    public final fd7 e;
    public final fd7 f;

    public wh1(int i, int i2, int i3, int i4, int i5, int i6) {
        fd7 fd7Var = new fd7(Integer.valueOf(i));
        fd7 fd7Var2 = new fd7(Integer.valueOf(i2));
        fd7 fd7Var3 = new fd7(Integer.valueOf(i3));
        fd7 fd7Var4 = new fd7(Integer.valueOf(i4));
        fd7 fd7Var5 = new fd7(Integer.valueOf(i5));
        fd7 fd7Var6 = new fd7(Integer.valueOf(i6));
        this.a = fd7Var;
        this.b = fd7Var2;
        this.c = fd7Var3;
        this.d = fd7Var4;
        this.e = fd7Var5;
        this.f = fd7Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh1)) {
            return false;
        }
        wh1 wh1Var = (wh1) obj;
        return tpa.f(this.a, wh1Var.a) && tpa.f(this.b, wh1Var.b) && tpa.f(this.c, wh1Var.c) && tpa.f(this.d, wh1Var.d) && tpa.f(this.e, wh1Var.e) && tpa.f(this.f, wh1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SoundConfig(end=" + this.a + ", ringtone=" + this.b + ", beep=" + this.c + ", connecting=" + this.d + ", connected=" + this.e + ", busy=" + this.f + ")";
    }
}
