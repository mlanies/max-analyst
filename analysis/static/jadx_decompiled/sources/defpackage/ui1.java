package defpackage;

import android.content.Context;
import android.content.Intent;
import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class ui1 implements km1 {
    public final /* synthetic */ CallScreen a;

    public ui1(CallScreen callScreen) {
        this.a = callScreen;
    }

    @Override // defpackage.ul1
    public final void d() {
        CallScreen callScreen = this.a;
        Context context = callScreen.getContext();
        String strD = c37.D(callScreen.D0().s().k);
        die dieVar = new die(context, 13);
        dieVar.R(context.getString(f0c.call_link_share_dialog_share_link_description, strD));
        dieVar.c = context.getString(f0c.call_link_share_dialog_share_link_dialog_intent_title);
        ((Intent) dieVar.b).setType(HTTP.PLAIN_TEXT_TYPE);
        dieVar.S();
    }

    @Override // defpackage.ul1
    public final void e() {
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = this.a;
        tpa.o(callScreen.getContext(), c37.D(callScreen.D0().s().k));
        if (tpa.s()) {
            String string = callScreen.getContext().getString(f0c.call_link_share_dialog_share_link_copy);
            wha whaVar = new wha(callScreen);
            whaVar.h(string);
            whaVar.d(new ho1(3, null));
            whaVar.c(new eia(0, 0, 0, 3));
            whaVar.i();
        }
    }

    @Override // defpackage.ul1
    public final void h() {
        yxc yxcVar = CallScreen.R0;
        this.a.D0().r();
    }

    @Override // defpackage.ul1
    public final void m() {
        yxc yxcVar = CallScreen.R0;
        el1 el1VarD0 = this.a.D0();
        el1VarD0.getClass();
        pnf.o(el1VarD0.M0, new qj1(c37.D(el1VarD0.s().k)));
    }
}
