package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class sk7 implements b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ fl7 b;

    public /* synthetic */ sk7(fl7 fl7Var, int i) {
        this.a = i;
        this.b = fl7Var;
    }

    @Override // defpackage.b7b
    public final boolean test(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                return this.b.j.equalsIgnoreCase(str);
            default:
                return this.b.m.equalsIgnoreCase(str);
        }
    }
}
