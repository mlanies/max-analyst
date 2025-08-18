package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* loaded from: classes.dex */
public final class no7 implements g2a {
    public final wmc a;
    public boolean b = false;

    public no7(rgg rggVar, wmc wmcVar) {
        this.a = wmcVar;
    }

    @Override // defpackage.g2a
    public final void a(Object obj) {
        wmc wmcVar = this.a;
        wmcVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) wmcVar.a;
        signInHubActivity.setResult(signInHubActivity.M0, signInHubActivity.N0);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
