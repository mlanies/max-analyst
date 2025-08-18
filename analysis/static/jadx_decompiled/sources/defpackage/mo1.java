package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class mo1 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ no1 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public mo1(no1 no1Var, int i) {
        this.c = i;
        switch (i) {
            case 1:
                ko1 ko1Var = ko1.o;
                this.o = no1Var;
                super(9, ko1Var);
                break;
            default:
                jo1 jo1Var = jo1.b;
                this.o = no1Var;
                super(9, jo1Var);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        lmd background;
        lmd background2;
        lmd background3;
        lmd background4;
        switch (this.c) {
            case 0:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                int iOrdinal = ((jo1) obj2).ordinal();
                fnc fncVar = fnc.b;
                no1 no1Var = this.o;
                if (iOrdinal == 0) {
                    no1Var.getNegativeButtonView().setMode(fnc.c);
                    no1Var.getPositiveButtonView().setMode(fncVar);
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    no1Var.getNegativeButtonView().setMode(fnc.a);
                    no1Var.getPositiveButtonView().setMode(fncVar);
                    return;
                }
            default:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                ko1 ko1Var = (ko1) obj2;
                ko1 ko1Var2 = (ko1) obj;
                int iOrdinal2 = ko1Var.ordinal();
                pq9 pq9Var = qp4.u0;
                no1 no1Var2 = this.o;
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    if (no1Var2.getBackground() == null) {
                        no1Var2.setBackground(no1Var2.getAnimatedBackground());
                    }
                    ko1 ko1Var3 = ko1.b;
                    ko1 ko1Var4 = ko1.a;
                    if (ko1Var2 == ko1Var3 && ko1Var == ko1Var4 && (background2 = no1Var2.getBackground()) != null) {
                        background2.setAlpha(128);
                    }
                    lmd background5 = no1Var2.getBackground();
                    if (background5 != null) {
                        background5.b.b(ko1Var == ko1Var4 ? hmd.c : hmd.b);
                    }
                    if (!no1Var2.isAttachedToWindow() || (background = no1Var2.getBackground()) == null || background.isRunning()) {
                        return;
                    }
                    lmd background6 = no1Var2.getBackground();
                    if (background6 != null) {
                        background6.onThemeChanged(pq9Var.p(no1Var2).c);
                    }
                    lmd background7 = no1Var2.getBackground();
                    if (background7 != null) {
                        background7.start();
                        return;
                    }
                    return;
                }
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (no1Var2.isAttachedToWindow() && (background4 = no1Var2.getBackground()) != null) {
                        background4.stop();
                    }
                    no1Var2.setBackground(null);
                    return;
                }
                if (no1Var2.getBackground() == null) {
                    no1Var2.setBackground(no1Var2.getAnimatedBackground());
                }
                lmd background8 = no1Var2.getBackground();
                if (background8 != null) {
                    background8.b.b(hmd.o);
                }
                if (!no1Var2.isAttachedToWindow() || (background3 = no1Var2.getBackground()) == null || background3.isRunning()) {
                    return;
                }
                lmd background9 = no1Var2.getBackground();
                if (background9 != null) {
                    background9.onThemeChanged(pq9Var.p(no1Var2).c);
                }
                lmd background10 = no1Var2.getBackground();
                if (background10 != null) {
                    background10.start();
                    return;
                }
                return;
        }
    }
}
