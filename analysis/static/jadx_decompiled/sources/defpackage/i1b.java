package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class i1b {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(ViewGroup viewGroup, h1b h1bVar) {
        LinkedHashMap linkedHashMap = this.b;
        Object arrayList = linkedHashMap.get(h1bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(h1bVar, arrayList);
        }
        List list = (List) arrayList;
        if (list.contains(viewGroup)) {
            return;
        }
        list.add(viewGroup);
        if (viewGroup.getMeasuredWidth() == 0 || viewGroup.getMeasuredHeight() == 0) {
            return;
        }
        c();
    }

    public final List b(h1b h1bVar) {
        ArrayList arrayList;
        List list = (List) this.b.get(h1bVar);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                View view = (View) obj;
                if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? nz4.a : arrayList;
    }

    public final void c() {
        Iterator it = b(h1b.a).iterator();
        int height = 0;
        int height2 = 0;
        while (it.hasNext()) {
            height2 += ((View) it.next()).getHeight();
        }
        Iterator it2 = b(h1b.b).iterator();
        while (it2.hasNext()) {
            height += ((View) it2.next()).getHeight();
        }
        j1b j1bVar = new j1b(height2, height);
        Iterator it3 = this.a.iterator();
        while (it3.hasNext()) {
            ((mm1) ((g1b) it3.next())).E(j1bVar);
        }
    }
}
