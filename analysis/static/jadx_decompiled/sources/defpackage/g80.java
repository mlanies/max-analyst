package defpackage;

import android.accounts.Account;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g80 extends e3 {
    @Override // defpackage.e3
    public final void c() {
        LinkedHashMap linkedHashMapN = n();
        super.c();
        p(linkedHashMapN);
    }

    public final LinkedHashMap n() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strG = g("auth.token.external.cache", null);
        if (strG != null) {
            linkedHashMap = new LinkedHashMap();
            try {
                JSONObject jSONObject = new JSONObject(strG);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                hm9.p(this.e, "getStringMap: failed", e);
            }
        }
        return linkedHashMap;
    }

    public final void o(Account account, String str, boolean z) {
        if (account != null) {
            m("auth.account.name", account.name);
        }
        m("auth.token", str);
        j("auth.account.external", z);
        if (z) {
            String strG = g("auth.account.name", null);
            if (strG == null || strG.length() == 0 || str.length() == 0) {
                hm9.p(this.e, "cacheExternalToken: rejected", null);
                return;
            }
            LinkedHashMap linkedHashMapN = n();
            linkedHashMapN.put(strG, str);
            p(linkedHashMapN);
        }
    }

    public final void p(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            m("auth.token.external.cache", jSONObject.toString());
        } catch (JSONException e) {
            hm9.p(this.e, "putStringMap: failed", e);
        }
    }
}
