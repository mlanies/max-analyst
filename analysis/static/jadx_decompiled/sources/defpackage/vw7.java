package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class vw7 extends u2 {
    public static final vw7 c = new vw7(8);

    public static c64 Z1(long j, Long l, Long l2) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chats?id=" + j + "&type=local");
        if (l2 != null) {
            sb.append("&message_id=" + l2);
        }
        sb.append("&load_mark=" + l);
        return new c64(sb.toString());
    }

    public static c64 a2(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(":chat-list?message_push=" + z);
        if (str != null) {
            sb.append("&folder_id=".concat(str));
        }
        return new c64(sb.toString());
    }

    public static Uri b2(long j, String str) {
        b46 b46Var = osf.c;
        y7g y7gVar = new y7g(13);
        y7gVar.b = ":webapp:root";
        y7gVar.D(Long.valueOf(j), "bot_id");
        y7gVar.D("url", "entry_point");
        if (str != null) {
            y7gVar.D(str, "start_param");
        }
        return y7gVar.r();
    }

    public static c64 c2(long j, osf osfVar, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbK = au1.k(j, ":webapp:root?bot_id=", "&entry_point=");
        sbK.append(osfVar.a);
        sb.append(sbK.toString());
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new c64(sb.toString());
    }
}
