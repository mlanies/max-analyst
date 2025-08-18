package defpackage;

/* loaded from: classes2.dex */
public final class au6 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bu6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au6(bu6 bu6Var, int i) {
        super(9, (Object) null);
        this.c = i;
        this.o = bu6Var;
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
                bu6 bu6Var = this.o;
                bu6Var.post(new re(28, bu6Var));
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    bu6 bu6Var2 = this.o;
                    ((la6) bu6Var2.getHierarchy()).k(bu6Var2.getOverlayDrawable());
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    this.o.setup((yt6) obj2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au6(Object obj, bu6 bu6Var) {
        super(9, obj);
        this.c = 2;
        this.o = bu6Var;
    }
}
