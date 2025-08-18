package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zz1 extends gr8 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int M0 = zyb.abc_cascading_menu_item_layout;
    public View A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public boolean H0;
    public nr8 I0;
    public ViewTreeObserver J0;
    public PopupWindow.OnDismissListener K0;
    public boolean L0;
    public final int X;
    public final boolean Y;
    public final Handler Z;
    public final Context b;
    public final int c;
    public final int o;
    public View z0;
    public final ArrayList s0 = new ArrayList();
    public final ArrayList t0 = new ArrayList();
    public final sn u0 = new sn(2, this);
    public final ck v0 = new ck(1, this);
    public final gaa w0 = new gaa(this);
    public int x0 = 0;
    public int y0 = 0;
    public boolean G0 = false;

    public zz1(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.z0 = view;
        this.o = i;
        this.X = i2;
        this.Y = z;
        this.B0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(xtb.abc_config_prefDialogWidth));
        this.Z = new Handler();
    }

    @Override // defpackage.und
    public final boolean a() {
        ArrayList arrayList = this.t0;
        return arrayList.size() > 0 && ((yz1) arrayList.get(0)).a.K0.isShowing();
    }

    @Override // defpackage.or8
    public final boolean b(qae qaeVar) {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            yz1 yz1Var = (yz1) it.next();
            if (qaeVar == yz1Var.b) {
                yz1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!qaeVar.hasVisibleItems()) {
            return false;
        }
        l(qaeVar);
        nr8 nr8Var = this.I0;
        if (nr8Var != null) {
            nr8Var.o(qaeVar);
        }
        return true;
    }

    @Override // defpackage.or8
    public final void c(wq8 wq8Var, boolean z) {
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (wq8Var == ((yz1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((yz1) arrayList.get(i2)).b.c(false);
        }
        yz1 yz1Var = (yz1) arrayList.remove(i);
        yz1Var.b.r(this);
        boolean z2 = this.L0;
        mr8 mr8Var = yz1Var.a;
        if (z2) {
            jr8.b(mr8Var.K0, null);
            mr8Var.K0.setAnimationStyle(0);
        }
        mr8Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.B0 = ((yz1) arrayList.get(size2 - 1)).c;
        } else {
            this.B0 = this.z0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((yz1) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        nr8 nr8Var = this.I0;
        if (nr8Var != null) {
            nr8Var.c(wq8Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.J0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J0.removeGlobalOnLayoutListener(this.u0);
            }
            this.J0 = null;
        }
        this.A0.removeOnAttachStateChangeListener(this.v0);
        this.K0.onDismiss();
    }

    @Override // defpackage.or8
    public final boolean d() {
        return false;
    }

    @Override // defpackage.und
    public final void dismiss() {
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        if (size > 0) {
            yz1[] yz1VarArr = (yz1[]) arrayList.toArray(new yz1[size]);
            for (int i = size - 1; i >= 0; i--) {
                yz1 yz1Var = yz1VarArr[i];
                if (yz1Var.a.K0.isShowing()) {
                    yz1Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.und
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.s0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((wq8) it.next());
        }
        arrayList.clear();
        View view = this.z0;
        this.A0 = view;
        if (view != null) {
            boolean z = this.J0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.u0);
            }
            this.A0.addOnAttachStateChangeListener(this.v0);
        }
    }

    @Override // defpackage.or8
    public final void g(nr8 nr8Var) {
        this.I0 = nr8Var;
    }

    @Override // defpackage.or8
    public final void i() {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((yz1) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((tq8) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.und
    public final es4 j() {
        ArrayList arrayList = this.t0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((yz1) wg0.f(arrayList, 1)).a.c;
    }

    @Override // defpackage.gr8
    public final void l(wq8 wq8Var) {
        wq8Var.b(this, this.b);
        if (a()) {
            v(wq8Var);
        } else {
            this.s0.add(wq8Var);
        }
    }

    @Override // defpackage.gr8
    public final void n(View view) {
        if (this.z0 != view) {
            this.z0 = view;
            this.y0 = Gravity.getAbsoluteGravity(this.x0, view.getLayoutDirection());
        }
    }

    @Override // defpackage.gr8
    public final void o(boolean z) {
        this.G0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        yz1 yz1Var;
        ArrayList arrayList = this.t0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                yz1Var = null;
                break;
            }
            yz1Var = (yz1) arrayList.get(i);
            if (!yz1Var.a.K0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (yz1Var != null) {
            yz1Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.gr8
    public final void p(int i) {
        if (this.x0 != i) {
            this.x0 = i;
            this.y0 = Gravity.getAbsoluteGravity(i, this.z0.getLayoutDirection());
        }
    }

    @Override // defpackage.gr8
    public final void q(int i) {
        this.C0 = true;
        this.E0 = i;
    }

    @Override // defpackage.gr8
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.K0 = onDismissListener;
    }

    @Override // defpackage.gr8
    public final void s(boolean z) {
        this.H0 = z;
    }

    @Override // defpackage.gr8
    public final void t(int i) {
        this.D0 = true;
        this.F0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(defpackage.wq8 r17) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zz1.v(wq8):void");
    }
}
