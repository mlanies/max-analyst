package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c2f {
    public static final j90 a = new j90();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, w1f w1fVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (w1fVar == null) {
            w1fVar = a;
        }
        w1f w1fVarClone = w1fVar.clone();
        ArrayList arrayList2 = (ArrayList) c().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((w1f) it.next()).B(viewGroup);
            }
        }
        if (w1fVarClone != null) {
            w1fVarClone.i(viewGroup, true);
        }
        au1.r(viewGroup.getTag(gvb.transition_current_scene));
        viewGroup.setTag(gvb.transition_current_scene, null);
        b2f b2fVar = new b2f();
        b2fVar.a = w1fVarClone;
        b2fVar.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(b2fVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(b2fVar);
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((w1f) arrayList2.get(size)).q(viewGroup);
        }
    }

    public static us c() {
        us usVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (usVar = (us) weakReference.get()) != null) {
            return usVar;
        }
        us usVar2 = new us();
        threadLocal.set(new WeakReference(usVar2));
        return usVar2;
    }
}
