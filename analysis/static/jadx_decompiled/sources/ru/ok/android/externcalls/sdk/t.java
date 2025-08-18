package ru.ok.android.externcalls.sdk;

import defpackage.qj3;
import defpackage.rj3;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.JoinByIdResponse;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements qj3 {
    public final /* synthetic */ rj3 X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ rj3 c;
    public final /* synthetic */ ConversationParams o;

    public /* synthetic */ t(ConversationImpl conversationImpl, rj3 rj3Var, ConversationParams conversationParams, rj3 rj3Var2) {
        this.b = conversationImpl;
        this.c = rj3Var;
        this.o = conversationParams;
        this.X = rj3Var2;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                this.b.lambda$performConfroomJoin$11(this.o, this.c, this.X, (JoinByIdResponse) obj);
                break;
            default:
                this.b.lambda$runStartConversation$17(this.c, this.o, this.X, (CallInfo) obj);
                break;
        }
    }

    public /* synthetic */ t(ConversationImpl conversationImpl, ConversationParams conversationParams, rj3 rj3Var, rj3 rj3Var2) {
        this.b = conversationImpl;
        this.o = conversationParams;
        this.c = rj3Var;
        this.X = rj3Var2;
    }
}
