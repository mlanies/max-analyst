package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a64 {
    public final LinkedHashMap a = new LinkedHashMap();

    public a64(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b64 b64Var = (b64) it.next();
            Iterator it2 = b64Var.a().a.iterator();
            while (it2.hasNext()) {
                this.a.put((e64) it2.next(), b64Var);
            }
        }
    }

    public final kpa a(Uri uri) {
        String strA = m64.a(uri);
        for (Map.Entry entry : this.a.entrySet()) {
            e64 e64Var = (e64) entry.getKey();
            b64 b64Var = (b64) entry.getValue();
            if (m64.a(e64Var.a).equals(strA)) {
                return new kpa(e64Var, b64Var);
            }
        }
        return null;
    }
}
