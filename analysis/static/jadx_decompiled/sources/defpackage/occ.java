package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class occ implements qod {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ occ(Object obj, k56 k56Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = k56Var;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                RecordManagerImpl.stopRecord$lambda$2((RecordManager.StopParams) this.c, this.b, jSONObject);
                break;
            default:
                RecordManagerImpl.startRecord$lambda$0((RecordManager.StartParams) this.c, this.b, jSONObject);
                break;
        }
    }
}
