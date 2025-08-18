package defpackage;

import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes2.dex */
public final class kr0 implements yu3 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public kr0(uu3 uu3Var, k56 k56Var) {
        this.b = uu3Var.getInstanceId();
        this.c = k56Var;
    }

    private final void c(uu3 uu3Var, uu3 uu3Var2, boolean z) {
    }

    @Override // defpackage.yu3
    public final void a(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        switch (this.a) {
            case 0:
                if (uu3Var2 != null) {
                    ((znc) this.b).K(this);
                    ((BottomSheetWidget) this.c).s0(true);
                    break;
                }
                break;
            default:
                if (tpa.f(uu3Var2 != null ? uu3Var2.getInstanceId() : null, (String) this.b) && !z) {
                    ((k56) this.c).invoke();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yu3
    public final void b(uu3 uu3Var, uu3 uu3Var2, boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (tpa.f(uu3Var2 != null ? uu3Var2.getInstanceId() : null, (String) this.b) && !z) {
                    uu3Var2.getRouter().K(this);
                    break;
                }
                break;
        }
    }

    public kr0(znc zncVar, BottomSheetWidget bottomSheetWidget) {
        this.b = zncVar;
        this.c = bottomSheetWidget;
    }
}
