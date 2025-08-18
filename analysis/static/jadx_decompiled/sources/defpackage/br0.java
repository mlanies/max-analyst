package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class br0 extends nd7 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ br0(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.nd7
    public void I(int i) {
        switch (this.k) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.L(1);
                        break;
                    }
                }
                break;
            case 1:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.y(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.nd7
    public final void J(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.k) {
            case 0:
                ((BottomSheetBehavior) this.l).A(i2);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.b0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.i(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    au1.r(it.next());
                    throw null;
                }
                return;
            default:
                uge ugeVar = (uge) this.l;
                if (i <= (-ugeVar.getWidth()) || i >= ugeVar.getWidth()) {
                    ugeVar.b = true;
                    tge callback = ugeVar.getCallback();
                    if (callback != null) {
                        callback.m();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    @Override // defpackage.nd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(android.view.View r5, float r6, float r7) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br0.K(android.view.View, float, float):void");
    }

    @Override // defpackage.nd7
    public final boolean W(View view, int i) {
        WeakReference weakReference;
        switch (this.k) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                int i2 = bottomSheetBehavior.L;
                if (i2 != 1 && !bottomSheetBehavior.b0) {
                    if (i2 == 3 && bottomSheetBehavior.Z == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                uge ugeVar = (uge) this.l;
                tge callback = ugeVar.getCallback();
                if (view != (callback != null ? callback.q() : null) || ugeVar.b) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.nd7
    public final int f(View view, int i) {
        switch (this.k) {
            case 0:
                return view.getLeft();
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return z04.p(i, sideSheetBehavior.a.E(), sideSheetBehavior.a.D());
            default:
                return ote.e(i, -2147483647, Integer.MAX_VALUE);
        }
    }

    @Override // defpackage.nd7
    public int g(View view, int i) {
        switch (this.k) {
            case 0:
                return z04.p(i, ((BottomSheetBehavior) this.l).E(), y(view));
            case 1:
                return view.getTop();
            default:
                return super.g(view, i);
        }
    }

    @Override // defpackage.nd7
    public int x(View view) {
        switch (this.k) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            case 2:
                return view.getWidth();
            default:
                return super.x(view);
        }
    }

    @Override // defpackage.nd7
    public int y(View view) {
        switch (this.k) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.y(view);
        }
    }
}
