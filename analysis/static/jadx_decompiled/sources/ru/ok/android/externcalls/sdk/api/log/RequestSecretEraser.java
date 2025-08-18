package ru.ok.android.externcalls.sdk.api.log;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/api/log/RequestSecretEraser;", "", "", "", "secretKeys", "erasedSubstitution", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", "jsonString", "Lorg/json/JSONArray;", "getJsonArrayOrNull", "(Ljava/lang/String;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "getJsonObjectOrNull", "(Ljava/lang/String;)Lorg/json/JSONObject;", "json", "Le5f;", "eraseSecrets", "(Lorg/json/JSONObject;)V", "jsonArray", "(Lorg/json/JSONArray;)V", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Set;", "Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class RequestSecretEraser {
    private final String erasedSubstitution;
    private final Set<String> secretKeys;

    public RequestSecretEraser(Set<String> set, String str) {
        this.secretKeys = set;
        this.erasedSubstitution = str;
    }

    private final JSONArray getJsonArrayOrNull(String jsonString) {
        try {
            return new JSONArray(jsonString);
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getJsonObjectOrNull(String jsonString) {
        try {
            return new JSONObject(jsonString);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String eraseSecrets(String jsonString) throws JSONException {
        JSONObject jsonObjectOrNull = getJsonObjectOrNull(jsonString);
        JSONArray jsonArrayOrNull = getJsonArrayOrNull(jsonString);
        if (jsonObjectOrNull != null) {
            eraseSecrets(jsonObjectOrNull);
            return jsonObjectOrNull.toString();
        }
        if (jsonArrayOrNull == null) {
            return this.erasedSubstitution;
        }
        eraseSecrets(jsonArrayOrNull);
        return jsonArrayOrNull.toString();
    }

    private final void eraseSecrets(JSONObject json) throws JSONException {
        Iterator<String> itKeys = json.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (this.secretKeys.contains(next)) {
                json.put(next, this.erasedSubstitution);
            }
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                eraseSecrets(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = json.optJSONArray(next);
            if (jSONArrayOptJSONArray != null) {
                eraseSecrets(jSONArrayOptJSONArray);
            }
        }
    }

    private final void eraseSecrets(JSONArray jsonArray) throws JSONException {
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                eraseSecrets(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jsonArray.optJSONArray(i);
            if (jSONArrayOptJSONArray != null) {
                eraseSecrets(jSONArrayOptJSONArray);
            }
        }
    }
}
