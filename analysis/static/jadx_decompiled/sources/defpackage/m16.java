package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class m16 implements k16 {
    public final /* synthetic */ c a;

    public m16(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.k16
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.a;
        he0 he0Var = (he0) wg0.f(cVar.d, 1);
        cVar.h = he0Var;
        Iterator it = he0Var.a.iterator();
        while (it.hasNext()) {
            a aVar = ((v16) it.next()).b;
            if (aVar != null) {
                aVar.y0 = true;
            }
        }
        boolean zV = cVar.V(arrayList, arrayList2, -1, 0);
        if (!cVar.n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c.G((he0) it2.next()));
            }
            Iterator it3 = cVar.n.iterator();
            while (it3.hasNext()) {
                au1.r(it3.next());
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zV;
    }
}
