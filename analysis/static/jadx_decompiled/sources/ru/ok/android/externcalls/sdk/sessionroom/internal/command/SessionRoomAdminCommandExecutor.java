package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.hgc;
import defpackage.k56;
import defpackage.m56;
import defpackage.n7;
import defpackage.o6f;
import defpackage.zge;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000f2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00152\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00182\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H'¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "", "Ln7;", "params", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(Ln7;Lk56;Lm56;)V", "Lo6f;", "updateRooms", "(Lo6f;Lk56;Lm56;)V", "Lzge;", "switchRoom", "(Lzge;Lk56;Lm56;)V", "Lhgc;", "removeRooms", "(Lhgc;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lk56;Lm56;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface SessionRoomAdminCommandExecutor {
    void activateRooms(n7 params, k56 onSuccess, m56 onError);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams params, k56 onSuccess, m56 onError);

    void moveParticipant(MoveParticipantParams params, k56 onSuccess, m56 onError);

    void removeRooms(hgc params, k56 onSuccess, m56 onError);

    void switchRoom(zge params, k56 onSuccess, m56 onError);

    void updateRooms(o6f params, k56 onSuccess, m56 onError);
}
