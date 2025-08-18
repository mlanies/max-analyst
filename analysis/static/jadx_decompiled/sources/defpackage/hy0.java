package defpackage;

import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class hy0 implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ hy0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                cq1 cq1VarA = ((py0) this.b).N1.a(jSONObject);
                if (cq1VarA == null) {
                    ((Runnable) this.o).run();
                    break;
                } else {
                    ((rj3) this.c).accept(cq1VarA);
                    break;
                }
            case 1:
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rooms");
                ipd ipdVarE = jSONObjectOptJSONObject != null ? ((pl8) ((imc) this.b).b).E(jSONObjectOptJSONObject) : null;
                if (ipdVarE != null) {
                    ((m56) this.o).invoke(ipdVarE);
                    break;
                } else {
                    ((m56) this.c).invoke(new RuntimeException("Can't parse rooms from " + jSONObject));
                    break;
                }
            case 2:
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$19((qod) this.b, (ParticipantStatesManagerImpl) this.c, (Map) this.o, jSONObject);
                break;
            case 3:
                RecordManagerImpl.stopRecord$lambda$3((RecordManagerImpl) this.b, (RecordManager.StopParams) this.c, (m56) this.o, jSONObject);
                break;
            case 4:
                RecordManagerImpl.startRecord$lambda$1((RecordManagerImpl) this.b, (RecordManager.StartParams) this.c, (m56) this.o, jSONObject);
                break;
            default:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$8((StereoRoomCommandExecutorImpl) this.b, (m56) this.c, (c66) this.o, jSONObject);
                break;
        }
    }
}
