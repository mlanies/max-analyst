package defpackage;

import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class p7 {
    public final bkb a;
    public final String b;

    public p7(bkb bkbVar) {
        String lowerCase;
        List list = q7.d;
        lowerCase = "null";
        if (bkbVar != null) {
            String str = (String) bkbVar.b;
            lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "null";
            if (q7.d.contains(lowerCase)) {
                lowerCase = ((String) bkbVar.a) + ":" + lowerCase;
            }
        }
        this.a = bkbVar;
        this.b = lowerCase;
    }
}
