package defpackage;

import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class w21 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ w21(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        long j = this.b;
        switch (this.a) {
            case 0:
                return new bi1(j);
            case 1:
                return new am1(j);
            case 2:
                return new t41(j);
            case 3:
                bc7[] bc7VarArr = ChatScreen.k1;
                vo2.c.Z1(j, true);
                return e5f.a;
            default:
                bc7[] bc7VarArr2 = MessagesListWidget.X0;
                return new n7c(j);
        }
    }
}
