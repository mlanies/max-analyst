package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class iwe implements or8 {
    public wq8 a;
    public br8 b;
    public final /* synthetic */ Toolbar c;

    public iwe(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.or8
    public final boolean b(qae qaeVar) {
        return false;
    }

    @Override // defpackage.or8
    public final void c(wq8 wq8Var, boolean z) {
    }

    @Override // defpackage.or8
    public final boolean d() {
        return false;
    }

    @Override // defpackage.or8
    public final boolean e(br8 br8Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.w0;
        if (callback instanceof r53) {
            ((r53) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.w0);
        toolbar.removeView(toolbar.v0);
        toolbar.w0 = null;
        ArrayList arrayList = toolbar.S0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        br8Var.N0 = false;
        br8Var.y0.p(false);
        toolbar.x();
        return true;
    }

    @Override // defpackage.or8
    public final boolean h(br8 br8Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.v0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.v0);
            }
            toolbar.addView(toolbar.v0);
        }
        View actionView = br8Var.getActionView();
        toolbar.w0 = actionView;
        this.b = br8Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.w0);
            }
            jwe jweVarH = Toolbar.h();
            jweVarH.a = (toolbar.B0 & 112) | 8388611;
            jweVarH.b = 2;
            toolbar.w0.setLayoutParams(jweVarH);
            toolbar.addView(toolbar.w0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((jwe) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.S0.add(childAt);
            }
        }
        toolbar.requestLayout();
        br8Var.N0 = true;
        br8Var.y0.p(false);
        KeyEvent.Callback callback = toolbar.w0;
        if (callback instanceof r53) {
            ((r53) callback).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    @Override // defpackage.or8
    public final void i() {
        if (this.b != null) {
            wq8 wq8Var = this.a;
            if (wq8Var != null) {
                int size = wq8Var.Y.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    @Override // defpackage.or8
    public final void k(Context context, wq8 wq8Var) {
        br8 br8Var;
        wq8 wq8Var2 = this.a;
        if (wq8Var2 != null && (br8Var = this.b) != null) {
            wq8Var2.d(br8Var);
        }
        this.a = wq8Var;
    }
}
