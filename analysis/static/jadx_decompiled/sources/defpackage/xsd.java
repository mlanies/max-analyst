package defpackage;

/* loaded from: classes2.dex */
public final class xsd extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ysd o;

    /* JADX WARN: Illegal instructions before constructor call */
    public xsd(ysd ysdVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                Float fValueOf = Float.valueOf(1.0f);
                this.o = ysdVar;
                super(9, fValueOf);
                break;
            case 2:
                Float fValueOf2 = Float.valueOf(1.0f);
                this.o = ysdVar;
                super(9, fValueOf2);
                break;
            default:
                Float fValueOf3 = Float.valueOf(0.0f);
                this.o = ysdVar;
                super(9, fValueOf3);
                break;
        }
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    ysd ysdVar = this.o;
                    ysdVar.c(ysdVar.d);
                    ysdVar.e = ysdVar.a();
                    break;
                }
                break;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    ysd ysdVar2 = this.o;
                    ysdVar2.c(ysdVar2.d);
                    ysdVar2.e = ysdVar2.a();
                    break;
                }
                break;
            default:
                if (!tpa.f(obj, obj2)) {
                    ysd ysdVar3 = this.o;
                    ysdVar3.e = ysdVar3.a();
                    break;
                }
                break;
        }
    }
}
