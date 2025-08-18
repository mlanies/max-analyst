package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t01 implements ll1 {
    public final ph4 a;
    public final id1 b;

    public t01(ph4 ph4Var, id1 id1Var) {
        this.a = ph4Var;
        this.b = id1Var;
        id1Var.h.a.add(this);
    }

    @Override // defpackage.ll1
    public final void a(ph4 ph4Var) {
        id1 id1Var = this.b;
        yad yadVar = (yad) ph4Var.b;
        o01 o01Var = (o01) ph4Var.a;
        if (o01Var == null) {
            id1Var.m.onAsrRecordStopped(new q01(yadVar));
        } else {
            id1Var.m.onAsrRecordStarted(new p01(yadVar, o01Var));
        }
    }

    public final void b(JSONObject jSONObject) {
        ph4 ph4Var = this.a;
        ph4Var.getClass();
        qt qtVar = null;
        try {
            o01 o01VarS = ph4.s(jSONObject.getJSONObject("asrInfo"));
            if (o01VarS != null) {
                ((yb9) ph4Var.b).getClass();
                qtVar = new qt(yb9.e(jSONObject), o01VarS);
            }
        } catch (JSONException e) {
            ((a4c) ph4Var.a).logException("AsrParser", "Can't parse record start info", e);
        }
        if (qtVar == null) {
            return;
        }
        this.b.m.onAsrRecordStarted(new p01(qtVar.a, qtVar.b));
    }

    public final void c(JSONObject jSONObject) {
        rt rtVar;
        ph4 ph4Var = this.a;
        ph4Var.getClass();
        try {
            ((yb9) ph4Var.b).getClass();
            rtVar = new rt(yb9.e(jSONObject));
        } catch (JSONException e) {
            ((a4c) ph4Var.a).logException("AsrParser", "Can't parse record stop info", e);
            rtVar = null;
        }
        if (rtVar == null) {
            return;
        }
        this.b.m.onAsrRecordStopped(new q01(rtVar.a));
    }
}
