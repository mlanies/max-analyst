package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final /* synthetic */ class dy0 implements qod {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ dy0(py0 py0Var, bg1 bg1Var, qod qodVar) {
        this.a = 0;
        this.b = py0Var;
        this.c = bg1Var;
        this.o = null;
        this.X = qodVar;
    }

    @Override // defpackage.qod
    public final void j(JSONObject jSONObject) {
        qod qodVar;
        switch (this.a) {
            case 0:
                bg1 bg1Var = (bg1) this.c;
                py0 py0Var = (py0) this.b;
                a4c a4cVar = py0Var.V0;
                a4cVar.log("OKRTCCall", "handle response from signaling on add-participant command");
                try {
                    int i = obg.b[au1.s(py0Var.y(bg1Var, jSONObject.optJSONObject("participant")))];
                    if (i == 1) {
                        qod qodVar2 = (qod) this.o;
                        if (qodVar2 != null) {
                            qodVar2.j(jSONObject);
                        }
                    } else if (i == 2 && (qodVar = (qod) this.X) != null) {
                        qodVar.j(new JSONObject().put("error", "state.accepted"));
                    }
                    break;
                } catch (JSONException e) {
                    a4cVar.reportException("OKRTCCall", "add.participant.success", e);
                    return;
                }
                break;
            default:
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(MultiFileUploader.CHUNK_FILE_NAME_PREFIX);
                fpd fpdVarS = jSONObjectOptJSONObject != null ? ((qz7) ((h7b) this.b).b).S(jSONObjectOptJSONObject, (zad) ((w4d) this.c).b) : null;
                if (fpdVarS != null) {
                    ((m56) this.X).invoke(fpdVarS);
                    break;
                } else {
                    ((m56) this.o).invoke(new RuntimeException("Can't parse chunk " + jSONObject));
                    break;
                }
        }
    }

    public /* synthetic */ dy0(h7b h7bVar, w4d w4dVar, om8 om8Var, ey3 ey3Var) {
        this.a = 1;
        this.b = h7bVar;
        this.c = w4dVar;
        this.o = om8Var;
        this.X = ey3Var;
    }
}
