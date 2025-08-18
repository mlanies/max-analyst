package ru.ok.android.externcalls.sdk;

import defpackage.qj3;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ o(ConversationImpl conversationImpl, Runnable runnable, int i) {
        this.a = i;
        this.b = conversationImpl;
        this.c = runnable;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                this.b.lambda$refreshParams$13(this.c, (ConversationParams) obj);
                break;
            default:
                this.b.lambda$resolveExternalsByInternalsIds$39(this.c, (Throwable) obj);
                break;
        }
    }
}
