package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class gw7 {
    public Set a;

    public final void a() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ew7) it.next()).a();
        }
    }

    public final void b() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ew7) it.next()).c();
        }
    }
}
