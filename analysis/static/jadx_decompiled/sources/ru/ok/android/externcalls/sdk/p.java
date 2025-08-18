package ru.ok.android.externcalls.sdk;

import defpackage.bg1;
import defpackage.eg1;
import defpackage.qj3;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements qj3, StereoRoomManagerImpl.GrantRolesRequest {
    public final /* synthetic */ ConversationImpl a;

    public /* synthetic */ p(ConversationImpl conversationImpl) {
        this.a = conversationImpl;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) throws Throwable {
        this.a.lambda$addParticipant$29((Throwable) obj);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.GrantRolesRequest
    public void grantRoles(bg1 bg1Var, boolean z, eg1[] eg1VarArr, Runnable runnable, Runnable runnable2) {
        this.a.grantRoles(bg1Var, z, eg1VarArr, runnable, runnable2);
    }
}
