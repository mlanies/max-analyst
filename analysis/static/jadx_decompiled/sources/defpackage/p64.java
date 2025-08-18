package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class p64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p64(fd fdVar, boolean z, int i) {
        this.a = i;
        this.b = fdVar;
        this.c = z;
    }

    @Override // defpackage.km7
    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.t(this.b, this.c);
                break;
            case 1:
                gdVar.z(this.b, this.c);
                break;
            case 2:
                gdVar.r(this.b, this.c);
                break;
            default:
                gdVar.getClass();
                gdVar.y0(this.b, this.c);
                break;
        }
    }
}
