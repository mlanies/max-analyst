package defpackage;

/* loaded from: classes.dex */
public final class z71 extends u2 {
    public static final z71 c = new z71(8);

    public final void Z1(Long l, String str, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(":call-history-info?is_link_call=true");
        z71 z71Var = c;
        if (str != null) {
            z71Var.getClass();
            sb.append("&call_link=".concat(str));
        }
        if (charSequence != null) {
            z71Var.getClass();
            sb.append("&call_title=" + ((Object) charSequence));
        }
        if (l != null) {
            z71Var.getClass();
            sb.append("&call_chat_id=" + l);
        }
        P1().b(sb.toString(), null);
    }

    public final void a2(long j, long j2) {
        P1().b(zr6.k(au1.k(j, ":chats?id=", "&type=local&message_id="), j2, "&highlight_message=true"), null);
    }
}
