package one.me.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.coc;
import defpackage.hob;
import defpackage.hwb;
import defpackage.iu7;
import defpackage.m57;
import defpackage.nec;
import defpackage.nj4;
import defpackage.q7c;
import defpackage.w12;
import defpackage.znc;
import kotlin.Metadata;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/LoginScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class LoginScreen extends Widget {
    public static final /* synthetic */ bc7[] c;
    public final q7c a;
    public final String b;

    static {
        hob hobVar = new hob(LoginScreen.class, "loginRouter", "getLoginRouter()Lcom/bluelinelabs/conductor/Router;", 0);
        nec.a.getClass();
        c = new bc7[]{hobVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = Widget.childRouter$default(this, hwb.oneme_login_conductor, null, 2, null);
        this.b = "LoginScope";
        createViewModelLazy(iu7.class, new nj4(17, new m57(20)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w12 w12Var = new w12(getContext());
        w12Var.setId(hwb.oneme_login_conductor);
        w12Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return w12Var;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7VarArr = c;
        bc7 bc7Var = bc7VarArr[0];
        q7c q7cVar = this.a;
        if (((znc) q7cVar.T0(this, bc7Var)).n()) {
            return;
        }
        ((znc) q7cVar.T0(this, bc7VarArr[0])).e = 1;
        ((znc) q7cVar.T0(this, bc7VarArr[0])).R(new coc(new InputPhoneScreen(), null, null, null, false, -1));
    }
}
