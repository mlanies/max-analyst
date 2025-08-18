package defpackage;

import androidx.media3.common.ParserException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class v4g {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(wpa wpaVar) {
        wpaVar.getClass();
        String strH = wpaVar.h(b52.c);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = oaf.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static void d(wpa wpaVar) throws ParserException {
        int i = wpaVar.b;
        if (a(wpaVar)) {
            return;
        }
        wpaVar.G(i);
        throw ParserException.a(null, "Expected WEBVTT. Got " + wpaVar.h(b52.c));
    }
}
