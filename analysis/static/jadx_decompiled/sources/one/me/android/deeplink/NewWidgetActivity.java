package one.me.android.deeplink;

import android.content.Intent;
import android.os.Bundle;
import defpackage.a14;
import defpackage.kvb;
import defpackage.mr0;
import defpackage.nmc;
import defpackage.q5;
import defpackage.qu4;
import defpackage.s36;
import defpackage.w12;
import defpackage.y8a;
import defpackage.zja;
import defpackage.znc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/deeplink/NewWidgetActivity;", "Lq5;", "Lnmc;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class NewWidgetActivity extends q5 implements nmc {
    public static final /* synthetic */ int V0 = 0;
    public znc U0;

    @Override // defpackage.q5
    public final String Z() {
        return null;
    }

    @Override // defpackage.q5
    public final void d0() {
    }

    @Override // defpackage.nmc
    public final znc g() {
        znc zncVar = this.U0;
        if (zncVar != null) {
            return zncVar;
        }
        return null;
    }

    @Override // defpackage.nmc
    /* renamed from: h */
    public final boolean getV0() {
        return false;
    }

    @Override // defpackage.q5
    public final boolean h0() {
        return true;
    }

    @Override // defpackage.q5, androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        w12 w12VarB = s36.b(this);
        w12VarB.setId(kvb.root);
        setContentView(w12VarB);
        qu4.a(this);
        super.onCreate(bundle);
        znc zncVarC = mr0.c(this, w12VarB, bundle);
        zncVarC.e = 1;
        zncVarC.Q(false);
        this.U0 = zncVarC;
        y8a.a.o().g(new zja(this, 14, a14.s(this)));
        a14.M(this, null);
    }

    @Override // defpackage.q5, defpackage.yb3, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a14.e(a14.s(this), intent);
        y8a.a.o().g(new zja(this, 13, intent));
        a14.M(this, intent);
    }
}
