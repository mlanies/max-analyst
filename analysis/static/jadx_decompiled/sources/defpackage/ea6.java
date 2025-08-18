package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ea6 {
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
            int i = oaf.a;
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

    public final void b(f99 f99Var) {
        int i = 0;
        while (true) {
            d99[] d99VarArr = f99Var.a;
            if (i >= d99VarArr.length) {
                return;
            }
            d99 d99Var = d99VarArr[i];
            if (d99Var instanceof h73) {
                h73 h73Var = (h73) d99Var;
                if ("iTunSMPB".equals(h73Var.c) && a(h73Var.o)) {
                    return;
                }
            } else if (d99Var instanceof v37) {
                v37 v37Var = (v37) d99Var;
                if ("com.apple.iTunes".equals(v37Var.b) && "iTunSMPB".equals(v37Var.c) && a(v37Var.o)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
