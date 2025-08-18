package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.bg1;
import defpackage.m56;
import defpackage.p66;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$2 extends p66 implements m56 {
    public StereoRoomManagerImpl$handsQueue$2(Object obj) {
        super(1, 0, StereoRoomManagerImpl.class, obj, "getExternalId", "getExternalId(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Lru/ok/android/externcalls/sdk/id/ParticipantId;");
    }

    @Override // defpackage.m56
    public final ParticipantId invoke(bg1 bg1Var) {
        return ((StereoRoomManagerImpl) this.receiver).getExternalId(bg1Var);
    }
}
