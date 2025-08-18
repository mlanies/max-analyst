package defpackage;

import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class zyd implements bha {
    public final /* synthetic */ StartConversationScreen a;

    public zyd(StartConversationScreen startConversationScreen) {
        this.a = startConversationScreen;
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        bc7[] bc7VarArr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        bc7[] bc7VarArr2 = StartConversationScreen.I0;
        bc7 bc7Var = bc7VarArr2[0];
        startConversationScreen.c.b(startConversationScreen, Boolean.TRUE);
        bc7 bc7Var2 = bc7VarArr2[1];
        startConversationScreen.o.b(startConversationScreen, charSequence);
        jzd jzdVarN0 = startConversationScreen.n0();
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        ((ti9) jzdVarN0.v0.g.getValue()).setValue(string);
    }

    @Override // defpackage.bha
    public final void U() {
        bc7[] bc7VarArr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        bc7 bc7Var = StartConversationScreen.I0[2];
        startConversationScreen.X.b(startConversationScreen, Boolean.FALSE);
        startConversationScreen.H0.f(false);
    }

    @Override // defpackage.bha
    public final void n() {
        bc7[] bc7VarArr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.a;
        startConversationScreen.getClass();
        bc7 bc7Var = StartConversationScreen.I0[2];
        startConversationScreen.X.b(startConversationScreen, Boolean.TRUE);
        startConversationScreen.H0.f(true);
    }
}
