package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class n98 implements km7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3b b;

    public /* synthetic */ n98(c3b c3bVar, int i) {
        this.a = i;
        this.b = c3bVar;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        ((x4b) obj).f(this.b);
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 0:
                n3bVar.p0(this.b);
                break;
            default:
                n3bVar.p0(this.b);
                break;
        }
    }
}
