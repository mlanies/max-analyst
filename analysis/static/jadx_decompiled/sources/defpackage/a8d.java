package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a8d {
    public final /* synthetic */ int a;
    public final Map b;

    public a8d() {
        this.a = 1;
        this.b = new LinkedHashMap();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "ServerSettings(" + new JSONObject((Map<?, ?>) this.b) + ")";
            default:
                return super.toString();
        }
    }

    public a8d(Map map) {
        this.a = 0;
        this.b = map;
        boolean z = map.get("chats-list-promo-link-enabled") instanceof Boolean;
    }
}
