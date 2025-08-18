package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ya0 extends ws7 {
    public final long a;
    public final long b;
    public final o33 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final hqb g;

    public ya0(long j, long j2, z90 z90Var, Integer num, String str, ArrayList arrayList) {
        hqb hqbVar = hqb.a;
        this.a = j;
        this.b = j2;
        this.c = z90Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = hqbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ws7)) {
            return false;
        }
        ws7 ws7Var = (ws7) obj;
        if (this.a == ((ya0) ws7Var).a) {
            ya0 ya0Var = (ya0) ws7Var;
            if (this.b == ya0Var.b) {
                o33 o33Var = ya0Var.c;
                o33 o33Var2 = this.c;
                if (o33Var2 != null ? o33Var2.equals(o33Var) : o33Var == null) {
                    Integer num = ya0Var.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = ya0Var.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = ya0Var.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                hqb hqbVar = ya0Var.g;
                                hqb hqbVar2 = this.g;
                                if (hqbVar2 == null) {
                                    if (hqbVar == null) {
                                        return true;
                                    }
                                } else if (hqbVar2.equals(hqbVar)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        o33 o33Var = this.c;
        int iHashCode = (i ^ (o33Var == null ? 0 : o33Var.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        hqb hqbVar = this.g;
        return iHashCode4 ^ (hqbVar != null ? hqbVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
