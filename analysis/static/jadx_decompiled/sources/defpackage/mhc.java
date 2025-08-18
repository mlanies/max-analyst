package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class mhc {
    public jw0 a;
    public final vq6 b;
    public final String c;
    public final cj6 d;
    public final tfg e;
    public final Map f;

    public mhc(vq6 vq6Var, String str, cj6 cj6Var, tfg tfgVar, Map map) {
        this.b = vq6Var;
        this.c = str;
        this.d = cj6Var;
        this.e = tfgVar;
        this.f = map;
    }

    public final l84 a() {
        l84 l84Var = new l84();
        l84Var.e = new LinkedHashMap();
        l84Var.a = this.b;
        l84Var.b = this.c;
        l84Var.d = this.e;
        Map map = this.f;
        l84Var.e = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        l84Var.c = this.d.c();
        return l84Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        cj6 cj6Var = this.d;
        if (cj6Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : cj6Var) {
                int i2 = i + 1;
                if (i < 0) {
                    y53.R();
                    throw null;
                }
                kpa kpaVar = (kpa) obj;
                String str = (String) kpaVar.a;
                String str2 = (String) kpaVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.f;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
