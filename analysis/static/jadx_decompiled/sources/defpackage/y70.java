package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y70 extends gle {
    public final Map c;
    public final List o;

    public y70(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.c = linkedHashMap;
        this.o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y70)) {
            return false;
        }
        y70 y70Var = (y70) obj;
        return tpa.f(this.c, y70Var.c) && tpa.f(this.o, y70Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.zje
    public final String toString() {
        String string;
        Map map = this.c;
        if (map == null) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder("{");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append(oag.x((CharSequence) entry.getValue()));
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            string = sb.toString();
        }
        return zr6.i("{tokenTypes=", string, "}");
    }
}
