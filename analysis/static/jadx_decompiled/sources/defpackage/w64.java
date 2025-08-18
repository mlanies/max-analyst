package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;

    public /* synthetic */ w64(fd fdVar, int i) {
        this.a = i;
        this.b = fdVar;
    }

    @Override // defpackage.km7
    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.l0(this.b);
                break;
            case 1:
                gdVar.Q(this.b);
                break;
            case 2:
                gdVar.j0(this.b);
                break;
            case 3:
                gdVar.v0(this.b);
                break;
            case 4:
                gdVar.w(this.b);
                break;
            case 5:
                gdVar.D0(this.b);
                break;
            default:
                gdVar.s(this.b);
                break;
        }
    }

    public /* synthetic */ w64(fd fdVar, n54 n54Var, int i) {
        this.a = i;
        this.b = fdVar;
    }
}
