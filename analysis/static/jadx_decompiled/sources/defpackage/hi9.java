package defpackage;

import java.util.EnumMap;

/* loaded from: classes2.dex */
public final class hi9 {
    public rd8 a;
    public rd8 b;
    public rd8 c;
    public rd8 d;

    public hi9(rd8 rd8Var, rd8 rd8Var2, rd8 rd8Var3, rd8 rd8Var4) {
        this.a = rd8Var;
        this.b = rd8Var2;
        this.c = rd8Var3;
        this.d = rd8Var4;
    }

    public final EnumMap a() {
        EnumMap enumMap = new EnumMap(qd8.class);
        enumMap.put((EnumMap) qd8.a, (qd8) this.a);
        enumMap.put((EnumMap) qd8.b, (qd8) this.b);
        enumMap.put((EnumMap) qd8.c, (qd8) this.c);
        enumMap.put((EnumMap) qd8.o, (qd8) this.d);
        return enumMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi9)) {
            return false;
        }
        hi9 hi9Var = (hi9) obj;
        return this.a == hi9Var.a && this.b == hi9Var.b && this.c == hi9Var.c && this.d == hi9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MutableMediaOptions(audioState=" + this.a + ", videoState=" + this.b + ", screenshareState=" + this.c + ", movieSharingState=" + this.d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hi9() {
        rd8 rd8Var = rd8.a;
        this(rd8Var, rd8Var, rd8Var, rd8Var);
    }
}
