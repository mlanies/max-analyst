package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class ddg extends z04 {
    public final /* synthetic */ int e;

    public /* synthetic */ ddg(int i) {
        this.e = i;
    }

    @Override // defpackage.z04
    public ok e(Context context, Looper looper, kad kadVar, Object obj, ge6 ge6Var, he6 he6Var) {
        switch (this.e) {
            case 0:
                kadVar.getClass();
                Integer num = (Integer) kadVar.Z;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Account) kadVar.a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new iod(context, looper, kadVar, bundle, ge6Var, he6Var);
            case 1:
                au1.r(obj);
                throw null;
            case 2:
            case 4:
            default:
                return super.e(context, looper, kadVar, obj, ge6Var, he6Var);
            case 3:
                return new jig(context, looper, 126, kadVar, ge6Var, he6Var);
            case 5:
                return new xjg(context, looper, kadVar, (v70) obj, ge6Var, he6Var);
            case 6:
                return new big(context, looper, kadVar, (GoogleSignInOptions) obj, ge6Var, he6Var);
        }
    }

    @Override // defpackage.z04
    public ok f(Context context, Looper looper, kad kadVar, Object obj, ge6 ge6Var, he6 he6Var) {
        switch (this.e) {
            case 2:
                return new seg(context, looper, kadVar, (ooe) obj, ge6Var, he6Var);
            case 4:
                return new bhg(context, looper, kadVar, ge6Var, he6Var);
            case 7:
                return new vgg(context, looper, HttpStatus.SC_MULTIPLE_CHOICES, kadVar, ge6Var, he6Var);
            default:
                return super.f(context, looper, kadVar, obj, ge6Var, he6Var);
        }
    }
}
