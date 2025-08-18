package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rxe {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public rxe(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(zr6.i("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = rh4.j(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rxe)) {
            return false;
        }
        rxe rxeVar = (rxe) obj;
        return this.a.equals(rxeVar.a) && this.b.equals(rxeVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
