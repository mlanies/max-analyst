package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qw3 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) obj).D0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                    break;
                }
                break;
            case 1:
                int i = FastScroller.B0;
                ((FastScroller) obj).b();
                break;
            default:
                zaa zaaVar = (zaa) obj;
                zaaVar.getClass();
                boolean z = view2 instanceof TextView;
                WeakHashMap weakHashMap = zaaVar.b;
                j0e j0eVar = zaaVar.a;
                if (!z) {
                    if (view2 instanceof kx5) {
                        weakHashMap.get(view2);
                        ((kx5) view2).a((du4) j0eVar.getValue());
                        break;
                    }
                } else {
                    weakHashMap.put(view2, e5f.a);
                    TextView textView = (TextView) view2;
                    du4 du4Var = (du4) j0eVar.getValue();
                    Object tag = textView.getTag(zfa.a);
                    kqe kqeVar = tag instanceof kqe ? (kqe) tag : null;
                    if (kqeVar != null) {
                        kqeVar.b(textView, du4Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                coordinatorLayout.o(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.D0;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    break;
                }
                break;
            case 1:
                int i = FastScroller.B0;
                ((FastScroller) obj).b();
                break;
            default:
                zaa zaaVar = (zaa) obj;
                zaaVar.getClass();
                if ((view2 instanceof TextView) || (view2 instanceof kx5)) {
                    zaaVar.b.remove(view2);
                    break;
                }
                break;
        }
    }
}
