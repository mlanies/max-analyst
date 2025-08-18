package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.k56;
import defpackage.m56;
import defpackage.yad;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u000e\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutor;", "", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Lk56;Lm56;)V", "Lyad;", "roomId", "joinRoom", "(Lyad;Lk56;Lm56;)V", "leaveRoom", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface SessionRoomCommandExecutor {
    void joinRoom(yad roomId, k56 onSuccess, m56 onError);

    void leaveRoom(k56 onSuccess, m56 onError);

    void requestAttention(k56 onSuccess, m56 onError);
}
