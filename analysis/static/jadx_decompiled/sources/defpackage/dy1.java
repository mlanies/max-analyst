package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class dy1 implements g2a, m66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ dy1(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // defpackage.g2a
    public final /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                break;
            default:
                this.b.invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof g2a) && (obj instanceof m66)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof g2a) && (obj instanceof m66)) {
                    break;
                }
                break;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
