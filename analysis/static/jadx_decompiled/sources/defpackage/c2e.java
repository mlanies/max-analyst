package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class c2e implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomCommandExecutorImpl b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ c2e(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, m56 m56Var, int i) {
        this.a = i;
        this.b = stereoRoomCommandExecutorImpl;
        this.c = m56Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("getHandQueue", jSONObject, this.c);
                break;
            case 1:
                this.b.parseErrorResponse("requestPromotion", jSONObject, this.c);
                break;
            case 2:
                this.b.parseErrorResponse("acceptPromotion", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("promoteParticipant", jSONObject, this.c);
                break;
        }
    }
}
