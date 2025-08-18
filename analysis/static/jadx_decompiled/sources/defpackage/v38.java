package defpackage;

/* loaded from: classes2.dex */
public final class v38 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ w38 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v38(w38 w38Var, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = w38Var;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) throws NumberFormatException {
        switch (this.c) {
            case 0:
                ru6 ru6Var = (ru6) obj2;
                ru6 ru6Var2 = (ru6) obj;
                if (tpa.f(ru6Var2 != null ? Integer.valueOf(ru6Var2.getWidth()) : null, ru6Var != null ? Integer.valueOf(ru6Var.getWidth()) : null)) {
                    if (tpa.f(ru6Var2 != null ? Integer.valueOf(ru6Var2.getHeight()) : null, ru6Var != null ? Integer.valueOf(ru6Var.getHeight()) : null)) {
                    }
                }
                w38 w38Var = this.o;
                w38Var.post(new q57(7, w38Var));
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    this.o.setup((yt6) obj2);
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    w38 w38Var2 = this.o;
                    ((la6) w38Var2.getHierarchy()).k(w38Var2.getOverlayDrawable());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v38(Object obj, w38 w38Var) {
        super(9, obj);
        this.c = 1;
        this.o = w38Var;
    }
}
