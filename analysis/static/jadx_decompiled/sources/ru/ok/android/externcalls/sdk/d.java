package ru.ok.android.externcalls.sdk;

import defpackage.bg1;
import defpackage.rj3;
import defpackage.rod;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements rj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d(Object obj, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.rj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$removeParticipant$31(this.c, (bg1) obj);
                break;
            case 1:
                ((ConversationImpl) this.b).lambda$promoteParticipant$32(this.c, (bg1) obj);
                break;
            default:
                ConversationImpl.lambda$setMuteState$40((rod) this.b, this.c, (bg1) obj);
                break;
        }
    }
}
