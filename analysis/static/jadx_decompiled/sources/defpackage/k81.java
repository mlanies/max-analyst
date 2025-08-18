package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class k81 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k81(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                z71 z71Var = z71.c;
                long j = ((yk6) ((al6) this.c)).a;
                f64 f64VarP1 = z71Var.P1();
                StringBuilder sbK = au1.k(j, ":call-user?opponent_id=", "&video_enabled=");
                sbK.append(this.b);
                sbK.append("&microphone_enabled=true");
                f64VarP1.b(sbK.toString(), null);
                break;
            default:
                mn1.x((mn1) this.c, this.b);
                break;
        }
        return e5f.a;
    }
}
