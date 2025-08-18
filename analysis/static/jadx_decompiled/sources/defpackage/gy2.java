package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class gy2 extends u2 {
    public static final gy2 c = new gy2(8);

    public static Uri Z1(gy2 gy2Var, long j, String str, Long l, Long l2, List list, String str2, Boolean bool, boolean z, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) != 0 ? null : str2;
        Boolean bool2 = (i & 128) == 0 ? bool : null;
        boolean z2 = (i & 256) != 0 ? false : z;
        gy2Var.getClass();
        y7g y7gVar = new y7g(13);
        y7gVar.b = ":chats";
        y7gVar.D(Long.valueOf(j), "id");
        y7gVar.D(str, "type");
        if (z2) {
            y7gVar.D(Boolean.TRUE, "no_anim");
        }
        if (l3 != null) {
            y7gVar.D(Long.valueOf(l3.longValue()), "message_id");
        }
        if (l4 != null) {
            y7gVar.D(Long.valueOf(l4.longValue()), "load_mark");
        }
        if (list2 != null) {
            ((ArrayList) y7gVar.c).add("highlights=".concat(x53.n0(list2, ",", null, null, null, 62)));
        }
        if (str3 != null) {
            y7gVar.D(str3, ApiProtocol.PARAM_PAYLOAD);
        }
        if (bool2 != null) {
            y7gVar.D(bool2, "open_search_field");
        }
        return y7gVar.r();
    }

    public static c64 a2(gy2 gy2Var, long j) {
        gy2Var.getClass();
        y7g y7gVar = new y7g(13);
        y7gVar.b = ":chats";
        y7gVar.D(Long.valueOf(j), "id");
        y7gVar.D("local", "type");
        return new c64(y7gVar.s());
    }

    public static void b2(gy2 gy2Var, long j, String str, Long l, Long l2, List list, String str2, int i) {
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        List list2 = (i & 16) != 0 ? null : list;
        String str3 = (i & 32) != 0 ? null : str2;
        gy2Var.getClass();
        gy2Var.P1().c(Z1(gy2Var, j, str, l3, l4, list2, str3, null, false, 320), null);
    }

    public static c64 c2(gy2 gy2Var, long j, osf osfVar, String str, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        gy2Var.getClass();
        StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
        sb.append(j);
        sb.append("&entry_point=");
        sb.append(osfVar.a);
        if (i != 0) {
            sb.append("&request_code=");
            sb.append(i);
        }
        if (str != null && str.length() != 0) {
            sb.append("&start_param=");
            sb.append(str);
        }
        return new c64(sb.toString());
    }
}
