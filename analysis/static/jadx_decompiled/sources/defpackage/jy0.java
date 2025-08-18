package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class jy0 implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                a4c a4cVar = (a4c) ((i50) this.b).X;
                if (jSONObject != null && "command-discarded".equals(jSONObject.optString("error"))) {
                    a4cVar.log("MediaSettingsSender", "change-media-settings command was merged with ongoing one");
                    break;
                } else {
                    a4cVar.log("MediaSettingsSender", "change-media-settings error" + jSONObject);
                    break;
                }
                break;
            default:
                MediaDumpManagerImpl.requestMediaDump$lambda$0((MediaDumpManager.RemoteMediaDumpRequestListener) this.b, jSONObject);
                break;
        }
    }
}
