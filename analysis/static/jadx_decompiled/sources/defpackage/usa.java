package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class usa {
    public final Map a;

    public usa(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public static final usa a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArrayNames.getString(i);
            JSONArray jSONArray = jSONObject.getJSONArray(string);
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has("dimension") && jSONObject2.has("bitrate")) {
                    arrayList.add(new tsa(jSONObject2.getInt("dimension"), jSONObject2.getInt("bitrate")));
                }
            }
            linkedHashMap.put(string.toLowerCase(Locale.ROOT), x53.x0(arrayList, new ky6(7)));
        }
        return new usa(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usa) && tpa.f(this.a, ((usa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PeerVideoSettingsBitrateTable(bitrateTables=" + this.a + ")";
    }
}
