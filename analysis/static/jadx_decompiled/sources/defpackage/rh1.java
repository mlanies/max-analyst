package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rh1 implements ml1 {
    public final aab a;
    public final id1 b;

    public rh1(aab aabVar, id1 id1Var) {
        this.a = aabVar;
        this.b = id1Var;
        id1Var.g.a.add(this);
    }

    @Override // defpackage.ml1
    public final void a(qz7 qz7Var) {
        id1 id1Var = this.b;
        yad yadVar = (yad) qz7Var.c;
        gpd gpdVar = (gpd) qz7Var.b;
        if (gpdVar == null) {
            id1Var.i.onRecordStopped(new ph1(null, yadVar));
        } else {
            id1Var.i.onRecordStarted(new oh1(yadVar, wmd.I(gpdVar)));
        }
    }

    public final void b(JSONObject jSONObject) {
        aab aabVar;
        aab aabVar2 = this.a;
        aabVar2.getClass();
        try {
            gpd gpdVarF = aab.f(jSONObject.getJSONObject("recordInfo"));
            ((yb9) aabVar2.b).getClass();
            aabVar = new aab(gpdVarF, yb9.e(jSONObject));
        } catch (JSONException e) {
            ((a4c) aabVar2.a).logException("RecordInfoParser", "Can't parse record start info", e);
            aabVar = null;
        }
        if (aabVar == null) {
            return;
        }
        this.b.i.onRecordStarted(new oh1((zad) aabVar.b, wmd.I((gpd) aabVar.a)));
    }

    public final void c(JSONObject jSONObject) {
        aab aabVar = this.a;
        aabVar.getClass();
        bdb bdbVar = null;
        try {
            String strT = f8.t(jSONObject, "participant");
            bg1 bg1VarA = strT != null ? bg1.a(strT) : null;
            if (jSONObject.has("recordMovieId")) {
                jSONObject.optLong("recordMovieId");
            }
            ((yb9) aabVar.b).getClass();
            bdbVar = new bdb(yb9.e(jSONObject), 5, bg1VarA);
        } catch (JSONException e) {
            ((a4c) aabVar.a).logException("RecordInfoParser", "Can't parse record stop info", e);
        }
        if (bdbVar == null) {
            return;
        }
        this.b.i.onRecordStopped(new ph1((bg1) bdbVar.c, (zad) bdbVar.b));
    }
}
