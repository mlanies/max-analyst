package ru.ok.android.api.json;

import defpackage.z7;
import defpackage.z7b;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class JsonSyntaxException extends IOException {
    public static JsonSyntaxException a(long j, String str, int i) {
        if (i >= 0) {
            return i < 31 ? new JsonSyntaxException(String.format(Locale.US, "Unexpected char (U+%04x) at pos %d near `%s`", Integer.valueOf(i), Long.valueOf(j), str)) : new JsonSyntaxException(String.format(Locale.US, "Unexpected char '%s' (U+%04x) at pos %d near `%s`", Character.valueOf((char) i), Integer.valueOf(i), Long.valueOf(j), str));
        }
        Locale locale = Locale.US;
        StringBuilder sbJ = z7b.j("Unexpected EOF at pos ", j, " after `", str);
        sbJ.append("`");
        return new JsonSyntaxException(sbJ.toString());
    }

    public static JsonSyntaxException b(long j, String str, int i) {
        if (i == 0) {
            Locale locale = Locale.US;
            StringBuilder sbJ = z7b.j("Unexpected eof at pos ", j, " after `", str);
            sbJ.append("`");
            return new JsonSyntaxException(sbJ.toString());
        }
        String strU = z7.U(i);
        Locale locale2 = Locale.US;
        return new JsonSyntaxException("Unexpected " + strU + " at pos " + j + " near `" + str + "`");
    }
}
