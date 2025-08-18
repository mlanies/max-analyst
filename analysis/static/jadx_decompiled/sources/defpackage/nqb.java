package defpackage;

/* loaded from: classes2.dex */
public final class nqb {
    public static final ye4 g = new ye4(13);
    public final mqb a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;

    public nqb(mqb mqbVar, int i, int i2, int i3, long j, boolean z) {
        this.a = mqbVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqb)) {
            return false;
        }
        nqb nqbVar = (nqb) obj;
        return this.a == nqbVar.a && this.b == nqbVar.b && this.c == nqbVar.c && this.d == nqbVar.d && this.e == nqbVar.e && this.f == nqbVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + h4f.m(k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quality(quality=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", size=");
        sb.append(this.e);
        sb.append(", isOriginal=");
        return au1.j(sb, this.f, ")");
    }
}
