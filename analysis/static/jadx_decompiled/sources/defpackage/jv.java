package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class jv implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi9 b;

    public /* synthetic */ jv(gi9 gi9Var, int i) {
        this.a = i;
        this.b = gi9Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.d(((vk6) obj).getA()));
            case 1:
                return Boolean.valueOf(this.b.d(((vk6) obj).getA()));
            default:
                return Boolean.valueOf(!this.b.a(((pxa) obj).a));
        }
    }
}
