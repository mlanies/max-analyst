package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fo1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ no1 b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ fo1(no1 no1Var, CharSequence charSequence, int i) {
        this.a = i;
        this.b = no1Var;
        this.c = charSequence;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = this.a;
        ((Boolean) obj).getClass();
        no1 no1Var = this.b;
        CharSequence charSequence = this.c;
        switch (i) {
            case 0:
                no1.G(no1Var, charSequence);
                break;
            case 1:
                no1.y(no1Var, charSequence);
                break;
            default:
                no1.F(no1Var, charSequence);
                break;
        }
        return e5f.a;
    }
}
