package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class da6 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = maf.a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(e99 e99Var) {
        int i = 0;
        while (true) {
            c99[] c99VarArr = e99Var.a;
            if (i >= c99VarArr.length) {
                return;
            }
            c99 c99Var = c99VarArr[i];
            if (c99Var instanceof g73) {
                g73 g73Var = (g73) c99Var;
                if ("iTunSMPB".equals(g73Var.c) && a(g73Var.o)) {
                    return;
                }
            } else if (c99Var instanceof u37) {
                u37 u37Var = (u37) c99Var;
                if ("com.apple.iTunes".equals(u37Var.b) && "iTunSMPB".equals(u37Var.c) && a(u37Var.o)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
