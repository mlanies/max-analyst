package defpackage;

/* loaded from: classes2.dex */
public final class idb extends i64 {
    public static final idb b;
    public static final e64 c;
    public static final e64 d;
    public static final e64 e;
    public static final e64 f;
    public static final e64 g;
    public static final e64 h;
    public static final e64 i;
    public static final e64 j;

    static {
        idb idbVar = new idb();
        b = idbVar;
        c = i64.a(idbVar, ":profile/avatars", new String[]{"id", "type"}, null, 0, 14);
        d = i64.a(idbVar, ":profile", new String[]{"id", "type"}, null, 0, 14);
        e = i64.a(idbVar, ":profile/attaches", new String[]{"id"}, null, 0, 14);
        f = i64.a(idbVar, ":profile/members", new String[]{"id", "type"}, null, 0, 14);
        g = i64.a(idbVar, ":profile/invite", new String[]{"id"}, null, 0, 14);
        h = i64.a(idbVar, ":profile/add-admins", new String[]{"chat_id"}, null, 0, 14);
        i = i64.a(idbVar, ":profile/add-members", new String[]{"chat_id"}, null, 0, 14);
        j = i64.a(idbVar, ":profile/change-owner", new String[]{"chat_id"}, null, 0, 14);
    }
}
