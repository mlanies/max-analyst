package ru.ok.android.externcalls.sdk.api.session;

import defpackage.ml;
import defpackage.nl;
import defpackage.z84;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/api/session/InMemorySessionStore;", "Lnl;", "Lml;", "sessionInfo", "<init>", "(Lml;)V", "Lml;", "getSessionInfo", "()Lml;", "setSessionInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class InMemorySessionStore implements nl {
    private ml sessionInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public InMemorySessionStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.nl
    public ml getSessionInfo() {
        return this.sessionInfo;
    }

    @Override // defpackage.nl
    public void setSessionInfo(ml mlVar) {
        this.sessionInfo = mlVar;
    }

    public InMemorySessionStore(ml mlVar) {
        this.sessionInfo = mlVar;
    }

    public /* synthetic */ InMemorySessionStore(ml mlVar, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : mlVar);
    }
}
