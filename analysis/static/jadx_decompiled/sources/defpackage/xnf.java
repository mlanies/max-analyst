package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class xnf {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((qnf) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
