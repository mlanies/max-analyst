package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e7 implements or8 {
    public int A0;
    public boolean B0;
    public final SparseBooleanArray C0;
    public b7 D0;
    public b7 E0;
    public i76 F0;
    public c7 G0;
    public final qqd H0;
    public nr8 X;
    public final int Y;
    public final int Z;
    public final Context a;
    public Context b;
    public wq8 c;
    public final LayoutInflater o;
    public qr8 s0;
    public d7 t0;
    public Drawable u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public int z0;

    public e7(Context context) {
        int i = zyb.abc_action_menu_layout;
        int i2 = zyb.abc_action_menu_item_layout;
        this.a = context;
        this.o = LayoutInflater.from(context);
        this.Y = i;
        this.Z = i2;
        this.C0 = new SparseBooleanArray();
        this.H0 = new qqd(1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [pr8] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(br8 br8Var, View view, ViewGroup viewGroup) {
        View actionView = br8Var.getActionView();
        if (actionView == null || br8Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof pr8 ? (pr8) view : (pr8) this.o.inflate(this.Z, viewGroup, false);
            actionMenuItemView.d(br8Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.s0);
            if (this.G0 == null) {
                this.G0 = new c7(this);
            }
            actionMenuItemView2.setPopupCallback(this.G0);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(br8Var.N0 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof g7)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.or8
    public final boolean b(qae qaeVar) {
        boolean z;
        if (!qaeVar.hasVisibleItems()) {
            return false;
        }
        qae qaeVar2 = qaeVar;
        while (true) {
            wq8 wq8Var = qaeVar2.K0;
            if (wq8Var == this.c) {
                break;
            }
            qaeVar2 = (qae) wq8Var;
        }
        ViewGroup viewGroup = (ViewGroup) this.s0;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof pr8) && ((pr8) childAt).getItemData() == qaeVar2.L0) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        qaeVar.L0.getClass();
        int size = qaeVar.Y.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = qaeVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        b7 b7Var = new b7(this, this.b, qaeVar, view);
        this.E0 = b7Var;
        b7Var.h = z;
        gr8 gr8Var = b7Var.j;
        if (gr8Var != null) {
            gr8Var.o(z);
        }
        b7 b7Var2 = this.E0;
        if (!b7Var2.b()) {
            if (b7Var2.f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            b7Var2.d(0, 0, false, false);
        }
        nr8 nr8Var = this.X;
        if (nr8Var != null) {
            nr8Var.o(qaeVar);
        }
        return true;
    }

    @Override // defpackage.or8
    public final void c(wq8 wq8Var, boolean z) {
        f();
        b7 b7Var = this.E0;
        if (b7Var != null && b7Var.b()) {
            b7Var.j.dismiss();
        }
        nr8 nr8Var = this.X;
        if (nr8Var != null) {
            nr8Var.c(wq8Var, z);
        }
    }

    @Override // defpackage.or8
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        wq8 wq8Var = this.c;
        if (wq8Var != null) {
            arrayListL = wq8Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = this.A0;
        int i3 = this.z0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.s0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            br8 br8Var = (br8) arrayListL.get(i4);
            int i7 = br8Var.J0;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.B0 && br8Var.N0) {
                i2 = 0;
            }
            i4++;
        }
        if (this.w0 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.C0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            br8 br8Var2 = (br8) arrayListL.get(i9);
            int i11 = br8Var2.J0;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = br8Var2.b;
            if (z3) {
                View viewA = a(br8Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                br8Var2.g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = a(br8Var2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        br8 br8Var3 = (br8) arrayListL.get(i13);
                        if (br8Var3.b == i12) {
                            if (br8Var3.f()) {
                                i8++;
                            }
                            br8Var3.g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                br8Var2.g(z5);
            } else {
                br8Var2.g(false);
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    @Override // defpackage.or8
    public final boolean e(br8 br8Var) {
        return false;
    }

    public final boolean f() {
        Object obj;
        i76 i76Var = this.F0;
        if (i76Var != null && (obj = this.s0) != null) {
            ((View) obj).removeCallbacks(i76Var);
            this.F0 = null;
            return true;
        }
        b7 b7Var = this.D0;
        if (b7Var == null) {
            return false;
        }
        if (b7Var.b()) {
            b7Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.or8
    public final void g(nr8 nr8Var) {
        this.X = nr8Var;
    }

    @Override // defpackage.or8
    public final boolean h(br8 br8Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.or8
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.s0;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            wq8 wq8Var = this.c;
            if (wq8Var != null) {
                wq8Var.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    br8 br8Var = (br8) arrayListL.get(i2);
                    if (br8Var.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        br8 itemData = childAt instanceof pr8 ? ((pr8) childAt).getItemData() : null;
                        View viewA = a(br8Var, childAt, viewGroup);
                        if (br8Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.s0).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.t0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.s0).requestLayout();
        wq8 wq8Var2 = this.c;
        if (wq8Var2 != null) {
            wq8Var2.i();
            ArrayList arrayList2 = wq8Var2.t0;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k7 k7Var = ((br8) arrayList2.get(i3)).L0;
            }
        }
        wq8 wq8Var3 = this.c;
        if (wq8Var3 != null) {
            wq8Var3.i();
            arrayList = wq8Var3.u0;
        }
        if (this.w0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((br8) arrayList.get(0)).N0;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.t0 == null) {
                this.t0 = new d7(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.t0.getParent();
            if (viewGroup3 != this.s0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.t0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.s0;
                d7 d7Var = this.t0;
                actionMenuView.getClass();
                g7 g7VarC = ActionMenuView.c();
                g7VarC.a = true;
                actionMenuView.addView(d7Var, g7VarC);
            }
        } else {
            d7 d7Var2 = this.t0;
            if (d7Var2 != null) {
                Object parent = d7Var2.getParent();
                Object obj = this.s0;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.t0);
                }
            }
        }
        ((ActionMenuView) this.s0).setOverflowReserved(this.w0);
    }

    public final boolean j() {
        b7 b7Var = this.D0;
        return b7Var != null && b7Var.b();
    }

    @Override // defpackage.or8
    public final void k(Context context, wq8 wq8Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = wq8Var;
        Resources resources = context.getResources();
        if (!this.x0) {
            this.w0 = true;
        }
        int i = 2;
        this.y0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.A0 = i;
        int measuredWidth = this.y0;
        if (this.w0) {
            if (this.t0 == null) {
                d7 d7Var = new d7(this, this.a);
                this.t0 = d7Var;
                if (this.v0) {
                    d7Var.setImageDrawable(this.u0);
                    this.u0 = null;
                    this.v0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.t0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.t0.getMeasuredWidth();
        } else {
            this.t0 = null;
        }
        this.z0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        wq8 wq8Var;
        if (!this.w0 || j() || (wq8Var = this.c) == null || this.s0 == null || this.F0 != null) {
            return false;
        }
        wq8Var.i();
        if (wq8Var.u0.isEmpty()) {
            return false;
        }
        i76 i76Var = new i76((Object) this, (Object) new b7(this, this.b, this.c, this.t0), false, 1);
        this.F0 = i76Var;
        ((View) this.s0).post(i76Var);
        return true;
    }
}
