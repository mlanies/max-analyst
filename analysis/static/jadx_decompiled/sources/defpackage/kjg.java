package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class kjg extends fgg {
    public final /* synthetic */ int d;
    public final /* synthetic */ qjg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjg(qjg qjgVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 6);
        this.d = i;
        this.e = qjgVar;
    }

    @Override // defpackage.fgg, defpackage.ikg
    public void g(Status status) {
        switch (this.d) {
            case 0:
                ((tig) this.e).S(status);
                break;
            default:
                super.g(status);
                break;
        }
    }

    @Override // defpackage.fgg, defpackage.ikg
    public void n(Status status) {
        switch (this.d) {
            case 1:
                ((tig) this.e).S(status);
                break;
            default:
                super.n(status);
                break;
        }
    }
}
