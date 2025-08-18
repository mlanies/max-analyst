package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class fca {
    public static final Pattern a = Pattern.compile("[^\\p{L}\\p{Nd} ]+");

    public static CharSequence a(CharSequence charSequence, ida idaVar) {
        if (charSequence.length() == 0) {
            return "";
        }
        tx4 tx4Var = idaVar.j;
        if (tx4Var.a(0, charSequence)) {
            List listC = tx4Var.c(charSequence);
            if (!listC.isEmpty()) {
                return (CharSequence) x53.g0(listC);
            }
        }
        String strReplaceAll = a.matcher(charSequence).replaceAll("");
        if (strReplaceAll.length() == 0 || w9e.C0(strReplaceAll)) {
            if (charSequence.length() <= 0) {
                return "";
            }
            if (charSequence.length() != 0) {
                return String.valueOf(charSequence.charAt(0));
            }
            throw new NoSuchElementException("Char sequence is empty.");
        }
        List listQ0 = w9e.Q0(strReplaceAll, new String[]{" "}, false, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ0) {
            if (!w9e.C0((String) obj)) {
                arrayList.add(obj);
            }
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(arrayList.size(), 2);
        for (int i = 0; i < iMin; i++) {
            String str = (String) arrayList.get(i);
            if (str.length() != 0 && !w9e.C0(str)) {
                sb.append(Character.toUpperCase(str.charAt(0)));
            }
        }
        return sb.toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        int i = charSequence2 == null ? 1 : 2;
        Pattern pattern = a;
        String strReplaceAll = pattern.matcher(charSequence).replaceAll("");
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        String strReplaceAll2 = pattern.matcher(charSequence2).replaceAll("");
        StringBuilder sb = new StringBuilder();
        List listM = y53.M(w9e.u0(strReplaceAll), w9e.u0(strReplaceAll2));
        for (int i2 = 0; i2 < i; i2++) {
            Character ch = (Character) x53.j0(i2, listM);
            if (ch != null) {
                sb.append(ch.charValue());
            }
        }
        return sb.toString();
    }
}
