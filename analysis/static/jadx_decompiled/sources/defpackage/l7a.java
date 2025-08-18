package defpackage;

/* loaded from: classes2.dex */
public final class l7a {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    public /* synthetic */ l7a(int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        this(i, num, (i2 & 4) != 0 ? null : num2, num3, (i2 & 16) != 0 ? null : num4, true);
    }

    public static l7a a(l7a l7aVar, boolean z) {
        return new l7a(l7aVar.a, l7aVar.b, l7aVar.c, l7aVar.d, l7aVar.e, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7a)) {
            return false;
        }
        l7a l7aVar = (l7a) obj;
        return this.a == l7aVar.a && tpa.f(this.b, l7aVar.b) && tpa.f(this.c, l7aVar.c) && tpa.f(this.d, l7aVar.d) && tpa.f(this.e, l7aVar.e) && this.f == l7aVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonData(id=" + this.a + ", textRes=" + this.b + ", textColor=" + this.c + ", iconRes=" + this.d + ", iconColor=" + this.e + ", isEnabled=" + this.f + ")";
    }

    public l7a(int i, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = z;
    }
}
