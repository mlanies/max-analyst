package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class wad implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomCommandExecutorImpl b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ wad(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, m56 m56Var, int i) {
        this.a = i;
        this.b = sessionRoomCommandExecutorImpl;
        this.c = m56Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("joinRoom", jSONObject, this.c);
                break;
            case 1:
                this.b.parseErrorResponse("leaveRoom", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("requestAttention", jSONObject, this.c);
                break;
        }
    }
}
