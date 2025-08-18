package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class tc9 {
    public final long a;
    public final List b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tc9(long j, AbstractCollection abstractCollection) {
        this.a = j;
        this.b = (List) abstractCollection;
    }

    public CharSequence a() {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            s5g s5gVar = (s5g) next;
            if ((s5gVar instanceof v5g) && ((v5g) s5gVar).c) {
                break;
            }
        }
        v5g v5gVar = next instanceof v5g ? (v5g) next : null;
        if (v5gVar != null) {
            return v5gVar.a;
        }
        return null;
    }
}
