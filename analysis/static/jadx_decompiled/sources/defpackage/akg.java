package defpackage;

/* loaded from: classes.dex */
public final class akg extends idg {
    public final o97 d;
    public final qne e;
    public final /* synthetic */ fkg f;
    public final /* synthetic */ fkg g;

    public akg(fkg fkgVar, qne qneVar, String str) {
        this.g = fkgVar;
        o97 o97Var = new o97("OnRequestInstallCallback", 2);
        this.f = fkgVar;
        super(2);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.d = o97Var;
        this.e = qneVar;
    }
}
