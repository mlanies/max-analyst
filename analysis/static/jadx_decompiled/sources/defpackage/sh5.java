package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class sh5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ sh5(int i, k56 k56Var) {
        this.a = i;
        this.b = k56Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (String) this.b.invoke();
            case 1:
                return Integer.valueOf(((fka) this.b.invoke()).b().d);
            default:
                return Integer.valueOf(((fka) this.b.invoke()).getIcon().f);
        }
    }
}
