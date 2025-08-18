package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a37 extends pk0 {
    public static final Pattern b = Pattern.compile("https?://www.instagram.com/p/([a-zA-Z_\\d-]+)", 2);
    public static final String[] c = {"PostPage", "EmbedPostlude", "EmbedRichEntrypoint", "EmbedSimpleEntrypoint"};
    public final String a;

    public a37(String str) {
        this.a = str;
    }

    public static String b(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        hm9.k("a37", "Instagram video id = " + matcher.group(1));
        return matcher.group(1);
    }

    @Override // defpackage.pk0
    public final iqd a() {
        return new q1a(1, new z16(9, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.df5 c(java.lang.String r23, defpackage.nqd r24) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a37.c(java.lang.String, nqd):df5");
    }
}
