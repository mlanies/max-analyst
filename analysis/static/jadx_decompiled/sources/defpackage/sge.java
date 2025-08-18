package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class sge implements a66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uge b;

    public /* synthetic */ sge(uge ugeVar, int i) {
        this.a = i;
        this.b = ugeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float fFloatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                uge.a(this.b, fFloatValue);
                break;
            default:
                uge.b(this.b, fFloatValue, f.floatValue());
                break;
        }
        return e5f.a;
    }
}
