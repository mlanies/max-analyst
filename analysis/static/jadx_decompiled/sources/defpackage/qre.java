package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class qre {
    public final pre a;
    public final nre b;
    public final List c;
    public final List d;
    public final Integer e;

    public qre(pre preVar, nre nreVar, List list, List list2, Integer num) {
        this.a = preVar;
        this.b = nreVar;
        this.c = list;
        this.d = list2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qre)) {
            return false;
        }
        qre qreVar = (qre) obj;
        return tpa.f(this.a, qreVar.a) && tpa.f(this.b, qreVar.b) && tpa.f(this.c, qreVar.c) && tpa.f(this.d, qreVar.d) && tpa.f(this.e, qreVar.e);
    }

    public final int hashCode() {
        pre preVar = this.a;
        int iHashCode = (preVar == null ? 0 : preVar.a.hashCode()) * 31;
        nre nreVar = this.b;
        int iHashCode2 = (iHashCode + (nreVar == null ? 0 : nreVar.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeBackgroundDrawModel(pattern=" + this.a + ", gradient=" + this.b + ", gradientEllipse=" + this.c + ", patternGradientEllipse=" + this.d + ", fillColor=" + this.e + ")";
    }
}
