package defpackage;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class xwd {
    public final String a;
    public final int b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public xwd(String str, int i, Integer num, float f, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    public static int a(String str) throws NumberFormatException {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(str);
        if (strValueOf.length() == 0) {
            return -1;
        }
        "Ignoring unknown alignment: ".concat(strValueOf);
        return -1;
    }

    public static boolean b(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(rh4.e(33, str));
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            fm9.c(sb.toString(), e);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            np8.d(j <= 4294967295L);
            return Integer.valueOf(Color.argb(s5c.l(((j >> 24) & 255) ^ 255), s5c.l(j & 255), s5c.l((j >> 8) & 255), s5c.l((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(rh4.e(36, str));
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            fm9.c(sb.toString(), e);
            return null;
        }
    }
}
