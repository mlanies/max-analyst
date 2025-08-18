package defpackage;

/* loaded from: classes.dex */
public final class hi2 extends u2 {
    public static final hi2 c = new hi2(8);

    public static c64 Z1(long j, Long l) {
        if (l == null) {
            return new c64(ey8.h(j, ":chats/forward?messages_ids="));
        }
        return new c64(":chats/forward?messages_ids=" + j + "&attach_id=" + l + "&is_forward_attach=true");
    }
}
