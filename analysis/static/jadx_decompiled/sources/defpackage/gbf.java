package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gbf {
    public final fbf a;
    public final dbf b;
    public final List c;
    public final List d;
    public final Integer e;

    public gbf(fbf fbfVar, dbf dbfVar, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.a = fbfVar;
        this.b = dbfVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbf)) {
            return false;
        }
        gbf gbfVar = (gbf) obj;
        return tpa.f(this.a, gbfVar.a) && tpa.f(this.b, gbfVar.b) && tpa.f(this.c, gbfVar.c) && tpa.f(this.d, gbfVar.d) && tpa.f(this.e, gbfVar.e);
    }

    public final int hashCode() {
        fbf fbfVar = this.a;
        int iHashCode = (fbfVar == null ? 0 : fbfVar.hashCode()) * 31;
        dbf dbfVar = this.b;
        int iHashCode2 = (iHashCode + (dbfVar == null ? 0 : dbfVar.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "VectorBackgroundModel(pattern=" + this.a + ", gradient=" + this.b + ", gradientEllipse=" + this.c + ", patternGradientEllipse=" + this.d + ", fillColor=" + this.e + ")";
    }
}
