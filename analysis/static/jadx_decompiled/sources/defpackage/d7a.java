package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class d7a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ OneMeButton o;

    /* JADX WARN: Illegal instructions before constructor call */
    public d7a(OneMeButton oneMeButton, int i) {
        this.c = i;
        switch (i) {
            case 1:
                b7a b7aVar = b7a.a;
                this.o = oneMeButton;
                super(9, b7aVar);
                break;
            case 2:
                z6a z6aVar = z6a.a;
                this.o = oneMeButton;
                super(9, z6aVar);
                break;
            case 3:
                this.o = oneMeButton;
                super(9, (Object) null);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                this.o = oneMeButton;
                super(9, bool);
                break;
            default:
                c7a c7aVar = c7a.b;
                this.o = oneMeButton;
                super(9, c7aVar);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        OneMeButton oneMeButton = this.o;
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    bc7[] bc7VarArr = OneMeButton.B0;
                    oneMeButton.j();
                    break;
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    bc7[] bc7VarArr2 = OneMeButton.B0;
                    oneMeButton.e();
                    break;
                }
                break;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    bc7[] bc7VarArr3 = OneMeButton.B0;
                    oneMeButton.e();
                    break;
                }
                break;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    fka fkaVarJ = (fka) obj2;
                    if (fkaVarJ == null) {
                        fkaVarJ = qp4.u0.j(oneMeButton);
                    }
                    oneMeButton.onThemeChanged(fkaVarJ);
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (zBooleanValue) {
                        ((View) oneMeButton.t0.getValue()).setVisibility(0);
                        OneMeButton.a(oneMeButton, xoc.h, false);
                    } else {
                        je7 je7Var = oneMeButton.t0;
                        if (je7Var.a()) {
                            ((nfa) je7Var.getValue()).setVisibility(8);
                            OneMeButton.a(oneMeButton, xoc.h, true);
                        }
                    }
                    bc7[] bc7VarArr4 = OneMeButton.B0;
                    oneMeButton.j();
                    break;
                }
                break;
        }
    }
}
