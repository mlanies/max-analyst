package defpackage;

import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* loaded from: classes2.dex */
public final /* synthetic */ class nrf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sqd b;

    public /* synthetic */ nrf(sqd sqdVar, int i) {
        this.a = i;
        this.b = sqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sqd sqdVar = this.b;
        switch (i) {
            case 0:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(sqdVar);
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1$lambda$0(sqdVar);
                break;
        }
    }
}
