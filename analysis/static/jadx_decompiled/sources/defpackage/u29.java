package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class u29 extends u2 {
    public static final u29 c = new u29(8);

    public static c64 Z1(List list, boolean z) {
        return new c64(":chats/forward?messages_ids=" + x53.n0(list, ",", null, null, null, 62) + "&show_ext_sharing=" + z);
    }

    public static c64 a2(long j, long j2, String str, en4 en4Var) {
        int iOrdinal = en4Var.ordinal();
        StringBuilder sbK = au1.k(j, ":dialogs/share-media?msg_id=", "&attach_id=");
        ms2.j(j2, "&local_attach_id=", str, sbK);
        sbK.append("&cause_ordinal=");
        sbK.append(iOrdinal);
        return new c64(sbK.toString());
    }

    public static c64 b2(long j, osf osfVar, Long l, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbK = au1.k(j, ":webapp:root?bot_id=", "&entry_point=");
        sbK.append(osfVar.a);
        sb.append(sbK.toString());
        sb.append("&chat_id=" + l);
        if (str != null) {
            sb.append("&start_param=".concat(str));
        }
        return new c64(sb.toString());
    }
}
