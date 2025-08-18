package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c5c implements bnd {
    public final HashSet a = new HashSet();

    @Override // defpackage.bnd
    public final void onRateCall(JSONObject jSONObject) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bnd) it.next()).onRateCall(jSONObject);
        }
    }
}
