package defpackage;

/* loaded from: classes2.dex */
public final class sd8 {
    public final rd8 a;
    public final rd8 b;
    public final rd8 c;
    public final rd8 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ sd8() {
        rd8 rd8Var = rd8.a;
        this(rd8Var, rd8Var, rd8Var, rd8Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd8)) {
            return false;
        }
        sd8 sd8Var = (sd8) obj;
        return this.a == sd8Var.a && this.b == sd8Var.b && this.c == sd8Var.c && this.d == sd8Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    public sd8(rd8 rd8Var, rd8 rd8Var2, rd8 rd8Var3, rd8 rd8Var4) {
        this.a = rd8Var;
        this.b = rd8Var2;
        this.c = rd8Var3;
        this.d = rd8Var4;
    }
}
