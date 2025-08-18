package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class jnc extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ knc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnc(gnc gncVar, knc kncVar) {
        super(9, gncVar);
        this.c = 2;
        this.o = kncVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((fnc) obj) != ((fnc) obj2)) {
                    this.o.C();
                    return;
                }
                return;
            case 1:
                if (((enc) obj) != ((enc) obj2)) {
                    this.o.C();
                    return;
                }
                return;
            default:
                gnc gncVar = (gnc) obj2;
                if (tpa.f((gnc) obj, gncVar)) {
                    return;
                }
                ImageView iconView = this.o.getIconView();
                ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ti3 ti3Var = (ti3) layoutParams;
                ((ViewGroup.MarginLayoutParams) ti3Var).height = gncVar.b;
                ((ViewGroup.MarginLayoutParams) ti3Var).width = gncVar.a;
                iconView.setLayoutParams(ti3Var);
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jnc(knc kncVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                enc encVar = enc.a;
                this.o = kncVar;
                super(9, encVar);
                break;
            default:
                fnc fncVar = fnc.s0;
                this.o = kncVar;
                super(9, fncVar);
                break;
        }
    }
}
