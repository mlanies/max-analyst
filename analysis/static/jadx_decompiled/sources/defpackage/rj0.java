package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public final class rj0 extends le {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ rj0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // defpackage.le
    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                sj0 sj0Var = (sj0) this.c;
                sj0Var.setIndeterminate(false);
                sj0Var.b(sj0Var.b);
                break;
            case 1:
                sj0 sj0Var2 = (sj0) this.c;
                if (!sj0Var2.t0) {
                    sj0Var2.setVisibility(sj0Var2.u0);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((l18) this.c).C0;
                if (colorStateList != null) {
                    aq4.h(drawable, colorStateList);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.le
    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                l18 l18Var = (l18) this.c;
                ColorStateList colorStateList = l18Var.C0;
                if (colorStateList != null) {
                    aq4.g(drawable, colorStateList.getColorForState(l18Var.G0, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }
}
