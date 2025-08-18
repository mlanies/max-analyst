package ru.ok.android.externcalls.sdk;

import defpackage.rj3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements rj3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ rj3 b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ f(rj3 rj3Var, ArrayList arrayList) {
        this.b = rj3Var;
        this.c = arrayList;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ConversationImpl.lambda$withInternalIds$36(this.b, (ArrayList) this.c, (Map) obj);
                break;
            default:
                ConversationImpl.lambda$withInternalId$34((ParticipantId) this.c, this.b, (Map) obj);
                break;
        }
    }

    public /* synthetic */ f(ParticipantId participantId, rj3 rj3Var) {
        this.c = participantId;
        this.b = rj3Var;
    }
}
