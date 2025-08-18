package defpackage;

/* loaded from: classes2.dex */
public final class zlf extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ amf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlf(amf amfVar, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                ulf ulfVar = ulf.a;
                this.o = amfVar;
                super(9, ulfVar);
                break;
            default:
                this.o = amfVar;
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    this.o.requestLayout();
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    this.o.requestLayout();
                    break;
                }
                break;
        }
    }
}
