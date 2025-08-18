package defpackage;

/* loaded from: classes2.dex */
public final class us8 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ vs8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ us8(Object obj, vs8 vs8Var, int i) {
        super(9, obj);
        this.c = i;
        this.o = vs8Var;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    vs8 vs8Var = this.o;
                    vs8Var.d((int[]) obj2, vs8Var.getBounds());
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    vs8 vs8Var2 = this.o;
                    vs8Var2.e((int[]) obj2, vs8Var2.getBounds());
                    break;
                }
                break;
        }
    }
}
