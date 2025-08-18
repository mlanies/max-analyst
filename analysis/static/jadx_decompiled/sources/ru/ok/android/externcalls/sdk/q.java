package ru.ok.android.externcalls.sdk;

import defpackage.m56;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationImpl b;

    public /* synthetic */ q(ConversationImpl conversationImpl, int i) {
        this.a = i;
        this.b = conversationImpl;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        int i = this.a;
        ConversationImpl conversationImpl = this.b;
        switch (i) {
            case 0:
                return conversationImpl.getCallParticipantId((ParticipantId) obj);
            default:
                return conversationImpl.lambda$new$3((List) obj);
        }
    }
}
