package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class s64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ int c;

    public /* synthetic */ s64(fd fdVar, int i, int i2) {
        this.a = i2;
        this.b = fdVar;
        this.c = i;
    }

    @Override // defpackage.km7
    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.C0(this.b, this.c);
                break;
            case 1:
                gdVar.F(this.b, this.c);
                break;
            case 2:
                gdVar.E(this.b, this.c);
                break;
            case 3:
                gdVar.K(this.b, this.c);
                break;
            case 4:
                gdVar.getClass();
                gdVar.k0(this.b, this.c);
                break;
            case 5:
                gdVar.U(this.b, this.c);
                break;
            default:
                gdVar.Z(this.b, this.c);
                break;
        }
    }

    public /* synthetic */ s64(fd fdVar, int i, long j) {
        this.a = 1;
        this.b = fdVar;
        this.c = i;
    }

    public /* synthetic */ s64(fd fdVar, tb8 tb8Var, int i) {
        this.a = 6;
        this.b = fdVar;
        this.c = i;
    }
}
