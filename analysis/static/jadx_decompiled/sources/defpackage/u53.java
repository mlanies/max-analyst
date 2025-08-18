package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u53 implements em {
    public final /* synthetic */ w53 a;

    public u53(w53 w53Var) {
        this.a = w53Var;
    }

    @Override // defpackage.cm
    public final void V(fm fmVar, int i) {
        w53 w53Var = this.a;
        w53Var.M0 = i;
        x6g x6gVar = w53Var.O0;
        int iD = x6gVar != null ? x6gVar.d() : 0;
        int childCount = w53Var.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = w53Var.getChildAt(i2);
            t53 t53Var = (t53) childAt.getLayoutParams();
            cof cofVarB = w53.b(childAt);
            int i3 = t53Var.a;
            if (i3 == 1) {
                cofVarB.b(z04.p(-i, 0, ((w53Var.getHeight() - w53.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((t53) childAt.getLayoutParams())).bottomMargin));
            } else if (i3 == 2) {
                cofVarB.b(Math.round((-i) * t53Var.b));
            }
        }
        w53Var.d();
        if (w53Var.D0 != null && iD > 0) {
            WeakHashMap weakHashMap = zmf.a;
            w53Var.postInvalidateOnAnimation();
        }
        int height = w53Var.getHeight();
        WeakHashMap weakHashMap2 = zmf.a;
        int minimumHeight = (height - w53Var.getMinimumHeight()) - iD;
        float f = minimumHeight;
        float fMin = Math.min(1.0f, (height - w53Var.getScrimVisibleHeightTrigger()) / f);
        s53 s53Var = w53Var.y0;
        s53Var.d = fMin;
        s53Var.e = z7b.f(1.0f, fMin, 0.5f, fMin);
        s53Var.f = w53Var.M0 + minimumHeight;
        s53Var.p(Math.abs(i) / f);
    }
}
