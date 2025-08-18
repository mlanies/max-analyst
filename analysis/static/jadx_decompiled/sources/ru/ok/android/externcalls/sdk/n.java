package ru.ok.android.externcalls.sdk;

import ru.ok.android.externcalls.sdk.ConversationImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ConversationImpl) obj).lambda$performConnect$20();
                break;
            case 1:
                ((ConversationImpl) obj).reportIfApplicable();
                break;
            case 2:
                ((ConversationImpl) obj).lambda$performConnect$21();
                break;
            case 3:
                ((ConversationImpl) obj).onSignalingRefresh();
                break;
            case 4:
                ((ConversationImpl) obj).resolveUnknownExternals();
                break;
            default:
                ((ConversationImpl.AnonymousClass1) obj).lambda$onSample$0();
                break;
        }
    }
}
