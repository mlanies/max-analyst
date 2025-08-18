package defpackage;

import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class abd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ abd(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        m56 m56Var = this.b;
        switch (i) {
            case 0:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$9(m56Var);
                break;
            case 1:
                StereoRoomManagerImpl.revokeRoles$lambda$7(m56Var);
                break;
            case 2:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$1(m56Var);
                break;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$4(m56Var);
                break;
        }
    }
}
