package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dq1 {
    public final a4c a;

    public /* synthetic */ dq1(a4c a4cVar) {
        this.a = a4cVar;
    }

    public cq1 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("id");
                arrayList.add(new kp1(new lp1(bg1.a(jSONObject3.getString("id")), jSONObject3.getLong("addedTs")), f46.k(jSONObject2)));
            }
            return new cq1(arrayList, jSONObject.optInt("totalCount", 0), jSONObject.optBoolean("hasMore", false));
        } catch (JSONException e) {
            this.a.log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }

    public qkf b(gy8 gy8Var) {
        int iS0 = gy8Var.s0();
        int iV0 = 0;
        int iV02 = 0;
        int iD = 0;
        for (int i = 0; i < iS0; i++) {
            if (i != 0) {
                boolean z = true;
                if (i == 1) {
                    iV02 = gy8Var.v0();
                } else if (i != 2) {
                    try {
                        gy8Var.z();
                    } catch (Throwable th) {
                        this.a.log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                        return null;
                    }
                } else {
                    n1 n1VarA0 = gy8Var.A0();
                    if (n1VarA0.e() == 3) {
                        int iE = n1VarA0.e();
                        if (iE == 0) {
                            throw null;
                        }
                        if (iE != 1) {
                            z = false;
                        }
                        if (!z) {
                            iD = n1VarA0.f().d();
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                iV0 = gy8Var.v0();
            }
        }
        return new qkf(new pkf(iV0, iV02, iD));
    }
}
