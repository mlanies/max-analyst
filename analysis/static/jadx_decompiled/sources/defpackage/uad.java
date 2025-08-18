package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class uad implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomAdminCommandExecutorImpl b;
    public final /* synthetic */ m56 c;

    public /* synthetic */ uad(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, m56 m56Var, int i) {
        this.a = i;
        this.b = sessionRoomAdminCommandExecutorImpl;
        this.c = m56Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.parseErrorResponse("switchRoom", jSONObject, this.c);
                break;
            default:
                this.b.parseErrorResponse("updateRooms", jSONObject, this.c);
                break;
        }
    }
}
