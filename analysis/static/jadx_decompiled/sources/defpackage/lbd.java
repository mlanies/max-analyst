package defpackage;

import android.net.Uri;
import android.os.ConditionVariable;
import java.util.LinkedHashMap;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lbd {
    public volatile ConditionVariable a;

    public final void a(yie yieVar, List list, kbd kbdVar) throws JSONException {
        kye kyeVar = kye.a;
        String strA = kye.a();
        if (strA == null) {
            return;
        }
        List<ls4> listD = kye.b().d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buildUuid", yieVar.e);
        jSONObject.put("deviceId", yieVar.h);
        jSONObject.put("sessions", xfg.C(list));
        if (!listD.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (ls4 ls4Var : listD) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("event", ls4Var.a);
                jSONObject2.put("reason", ls4Var.b);
                jSONObject2.put(NewHtcHomeBadger.COUNT, ls4Var.c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("drops", jSONArray);
        }
        kye kyeVar2 = kye.a;
        Object obj = kye.c().get(ote.b);
        if ((obj instanceof gx3 ? (gx3) obj : null) == null) {
            mz7.d0(new LinkedHashMap());
        }
        bkb bkbVar = new bkb(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", strA).toString(), b46.o("application/json; charset=utf-8", jSONObject.toString()));
        ConditionVariable conditionVariable = new ConditionVariable();
        this.a = conditionVariable;
        hze.b(new yg3(bkbVar, this, listD, conditionVariable, kbdVar));
    }
}
