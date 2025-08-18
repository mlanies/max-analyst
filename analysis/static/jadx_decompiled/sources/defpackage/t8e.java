package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class t8e {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final String b;
    public final long c;

    public t8e(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static t8e a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new t8e(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new t8e(jSONObject.getLong("timestamp"), jSONObject.getString(ApiProtocol.KEY_TOKEN), jSONObject.getString("appVersion"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
}
