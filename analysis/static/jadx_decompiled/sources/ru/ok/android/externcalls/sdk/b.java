package ru.ok.android.externcalls.sdk;

import defpackage.py0;
import defpackage.qj3;
import defpackage.rj3;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ rj3 c;

    public /* synthetic */ b(Object obj, rj3 rj3Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = rj3Var;
    }

    public void a(py0 py0Var) {
        ((ConversationImpl) this.b).lambda$performConnect$22(this.c, py0Var);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws Throwable {
        switch (this.a) {
            case 0:
                ((ConversationImpl) this.b).lambda$runStartConversation$18(this.c, (Throwable) obj);
                break;
            default:
                ConversationImpl.lambda$removeJoinLink$37((Runnable) this.b, this.c, (Boolean) obj);
                break;
        }
    }
}
