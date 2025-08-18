package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oe5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final m56 m;

    public oe5() {
        pz2 pz2Var = new pz2(20);
        this.a = "mc";
        this.b = "msgid";
        this.c = "type";
        this.d = "ConversationReadOnOtherDevice";
        this.e = "trid";
        this.f = "ctime";
        this.g = "ttime";
        this.h = "eKey";
        this.i = "suid";
        this.j = "largeImageUrl";
        this.k = "fireM";
        this.l = "err";
        this.m = pz2Var;
    }

    public final vd5 a(us usVar, long j, long j2) throws NumberFormatException {
        String str = (String) usVar.get(this.e);
        long j3 = str != null ? Long.parseLong(str) : 0L;
        long j4 = Long.parseLong((String) mz7.X(usVar, this.a));
        long j5 = Long.parseLong((String) mz7.X(usVar, this.b));
        String str2 = (String) usVar.get(this.i);
        Long l = str2 != null ? (Long) this.m.invoke(Long.valueOf(Long.parseLong(str2))) : null;
        Iterator it = ((ps) usVar.entrySet()).iterator();
        long length = 0;
        while (it.hasNext()) {
            String str3 = (String) ((Map.Entry) it.next()).getKey();
            Charset charset = a52.a;
            length = str3.getBytes(charset).length + ((String) r6.getValue()).getBytes(charset).length + length;
        }
        String str4 = (String) usVar.get(this.g);
        Long lValueOf = str4 != null ? Long.valueOf(Long.parseLong(str4)) : null;
        String str5 = (String) usVar.get(this.h);
        String str6 = (String) usVar.get(this.c);
        if (str6 == null) {
            str6 = "";
        }
        String str7 = str6;
        long jC = c(usVar, Long.MAX_VALUE);
        String str8 = (String) usVar.get(this.f);
        return new vd5(j3, j4, j5, 2, l, length, lValueOf, str5, j, j2, str7, jC, str8 != null ? Long.parseLong(str8) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.je5 b(defpackage.us r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe5.b(us):je5");
    }

    public final long c(us usVar, long j) {
        if (usVar.containsKey("ectime")) {
            String str = (String) usVar.get("ectime");
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        }
        String str2 = this.f;
        if (!usVar.containsKey(str2)) {
            return j;
        }
        String str3 = (String) usVar.get(str2);
        return (str3 != null ? Long.parseLong(str3) : 500L) - 500;
    }
}
