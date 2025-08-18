package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class vmc implements ViewGroup.OnHierarchyChangeListener {
    public static final vmc a = new vmc();
    public static final dx3 b = new dx3();

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Iterator<E> it = b.iterator();
        while (it.hasNext()) {
            ((ViewGroup.OnHierarchyChangeListener) it.next()).onChildViewAdded(view, view2);
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            viewGroup.setOnHierarchyChangeListener(this);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.onChildViewAdded(view2, viewGroup.getChildAt(i));
            }
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.onChildViewRemoved(view2, viewGroup.getChildAt(i));
            }
            viewGroup.setOnHierarchyChangeListener(null);
        }
        Iterator<E> it = b.iterator();
        while (it.hasNext()) {
            ((ViewGroup.OnHierarchyChangeListener) it.next()).onChildViewRemoved(view, view2);
        }
    }
}
