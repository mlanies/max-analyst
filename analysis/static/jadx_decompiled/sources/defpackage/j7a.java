package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class j7a extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ k7a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7a(k7a k7aVar, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                h7a h7aVar = h7a.a;
                this.o = k7aVar;
                super(9, h7aVar);
                break;
            case 2:
                g7a g7aVar = g7a.a;
                this.o = k7aVar;
                super(9, g7aVar);
                break;
            default:
                this.o = k7aVar;
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                fka fkaVarJ = (fka) obj2;
                if (tpa.f((fka) obj, fkaVarJ)) {
                    return;
                }
                k7a k7aVar = this.o;
                if (fkaVarJ == null) {
                    fkaVarJ = qp4.u0.j(k7aVar);
                }
                k7aVar.onThemeChanged(fkaVarJ);
                return;
            case 1:
                h7a h7aVar = (h7a) obj2;
                if (((h7a) obj) != h7aVar) {
                    int i = i7a.$EnumSwitchMapping$0[h7aVar.ordinal()];
                    k7a k7aVar2 = this.o;
                    if (i == 1) {
                        if (k7aVar2.getTextView().getParent() != null) {
                            k7aVar2.removeView(k7aVar2.getTextView());
                            return;
                        }
                        return;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (k7aVar2.getTextView().getParent() == null) {
                            k7aVar2.addView(k7aVar2.getTextView());
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                g7a g7aVar = (g7a) obj2;
                if (((g7a) obj) != g7aVar) {
                    k7a k7aVar3 = this.o;
                    k7aVar3.c(k7aVar3, g7aVar);
                    return;
                }
                return;
        }
    }
}
