package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class g74 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ pc8 c;

    public /* synthetic */ g74(fd fdVar, pc8 pc8Var, int i) {
        this.a = i;
        this.b = fdVar;
        this.c = pc8Var;
    }

    @Override // defpackage.km7
    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.E0(this.b, this.c);
                break;
            default:
                gdVar.W(this.b, this.c);
                break;
        }
    }
}
