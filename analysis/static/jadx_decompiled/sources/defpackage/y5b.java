package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class y5b implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6b b;

    public /* synthetic */ y5b(f6b f6bVar, int i) {
        this.a = i;
        this.b = f6bVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                f6b.b(this.b, fFloatValue);
                break;
            case 1:
                f6b.c(this.b, fFloatValue, f.floatValue());
                break;
            default:
                f.getClass();
                f6b.a(this.b, fFloatValue);
                break;
        }
        return e5f.a;
    }
}
