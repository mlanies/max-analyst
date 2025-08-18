package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ud8 {
    public static JSONObject a(Set set, bg1 bg1Var, zad zadVar) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", bg1Var != null ? bg1Var.c() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i = td8.$EnumSwitchMapping$0[((qd8) it.next()).ordinal()];
            if (i == 1) {
                str = "AUDIO";
            } else if (i == 2) {
                str = "VIDEO";
            } else if (i == 3) {
                str = "SCREEN_SHARING";
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "MOVIE_SHARING";
            }
            jSONArray.put(str);
        }
        jSONObject.put("requestedMedia", jSONArray);
        jSONObject.put("command", "mute-participant");
        if (zadVar instanceof yad) {
            jSONObject.put("roomId", ((yad) zadVar).a);
        }
        return jSONObject;
    }

    public static JSONObject b(Map map, bg1 bg1Var, zad zadVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", bg1Var != null ? bg1Var.c() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AUDIO", f46.M((rd8) map.get(qd8.a)));
        jSONObject2.put("VIDEO", f46.M((rd8) map.get(qd8.b)));
        jSONObject2.put("SCREEN_SHARING", f46.M((rd8) map.get(qd8.c)));
        jSONObject2.put("MOVIE_SHARING", f46.M((rd8) map.get(qd8.o)));
        jSONObject.put("muteStates", jSONObject2);
        jSONObject.put("command", "mute-participant");
        if (zadVar instanceof yad) {
            jSONObject.put("roomId", ((yad) zadVar).a);
        }
        return jSONObject;
    }
}
