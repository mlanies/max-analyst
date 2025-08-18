package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class qp0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((sp0) this.b).c();
                break;
            default:
                p85 p85Var = (p85) this.b;
                if (!p85Var.x0 && p85Var.getMeasuredWidth() > 0) {
                    p85Var.b(p85Var.getMeasuredWidth());
                    p85Var.x0 = true;
                    p85Var.requestLayout();
                }
                if (p85Var.x0) {
                    p85Var.getViewTreeObserver().removeOnPreDrawListener(p85Var.B0);
                    p85Var.B0 = null;
                    break;
                }
                break;
        }
        return true;
    }
}
