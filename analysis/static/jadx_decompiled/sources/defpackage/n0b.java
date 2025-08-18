package defpackage;

/* loaded from: classes2.dex */
public final class n0b extends u2 {
    public static final n0b c = new n0b(8);

    public static c64 Z1(long j, long j2, boolean z) {
        StringBuilder sbJ = z7b.j(":chats?id=", j, "&type=", z ? "local" : "server");
        sbJ.append("&message_id=");
        sbJ.append(j2);
        return new c64(sbJ.toString());
    }
}
