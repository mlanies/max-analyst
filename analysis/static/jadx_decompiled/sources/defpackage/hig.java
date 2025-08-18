package defpackage;

/* loaded from: classes.dex */
public final class hig extends idg {
    public final qm4 d;
    public final qne e;
    public final /* synthetic */ mig f;

    public hig(mig migVar, qne qneVar) {
        qm4 qm4Var = new qm4("OnRequestInstallCallback", 1);
        this.f = migVar;
        super(3);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.d = qm4Var;
        this.e = qneVar;
    }
}
