package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zw4 implements tx4 {
    public final vw4 a;

    public zw4(vw4 vw4Var) {
        this.a = vw4Var;
    }

    @Override // defpackage.tx4
    public final boolean a(int i, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && i >= 0 && i < charSequence.length()) {
            try {
                CharSequence charSequenceG = this.a.g(0, charSequence.length(), charSequence, Integer.MAX_VALUE, 1);
                if (charSequenceG instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequenceG;
                    c4f[] c4fVarArr = (c4f[]) spanned.getSpans(0, spanned.length(), c4f.class);
                    if (c4fVarArr != null && c4fVarArr.length != 0) {
                        for (c4f c4fVar : c4fVarArr) {
                            int spanStart = spanned.getSpanStart(c4fVar);
                            int spanEnd = spanned.getSpanEnd(c4fVar);
                            if (i >= spanStart && i < spanEnd) {
                                return true;
                            }
                            if (i >= spanEnd) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                hm9.p("zw4", String.format(Locale.ENGLISH, "Can't know is emoji at position %s", charSequence), e);
            }
        }
        return false;
    }

    @Override // defpackage.tx4
    public final List c(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return Collections.emptyList();
        }
        try {
            CharSequence charSequenceG = this.a.g(0, charSequence.length(), charSequence, Integer.MAX_VALUE, 1);
            if (!(charSequenceG instanceof Spanned)) {
                return Collections.emptyList();
            }
            Spanned spanned = (Spanned) charSequenceG;
            c4f[] c4fVarArr = (c4f[]) spanned.getSpans(0, spanned.length(), c4f.class);
            if (c4fVarArr == null || c4fVarArr.length == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(c4fVarArr.length);
            for (c4f c4fVar : c4fVarArr) {
                int spanStart = spanned.getSpanStart(c4fVar);
                int spanEnd = spanned.getSpanEnd(c4fVar);
                try {
                    arrayList.add(spanned.subSequence(spanStart, spanEnd));
                } catch (Exception unused) {
                    hm9.o("zw4", String.format(Locale.ENGLISH, "Can't create emoji span: start = %d, end = %d, text = %s", Integer.valueOf(spanStart), Integer.valueOf(spanEnd), charSequence));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            hm9.r("zw4", th, "Can't get emoji tokens %s", charSequence);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.tx4
    public final CharSequence e(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        try {
            CharSequence charSequenceG = this.a.g(0, charSequence.length(), charSequence, Integer.MAX_VALUE, 1);
            return charSequenceG == null ? "" : charSequenceG;
        } catch (Exception e) {
            hm9.p("zw4", String.format(Locale.ENGLISH, "Can't process emoji %s", charSequence), e);
            return charSequence;
        }
    }

    @Override // defpackage.tx4
    public final boolean g(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        List listC = c(charSequence);
        if (listC.isEmpty()) {
            return false;
        }
        String strTrim = charSequence.toString().trim();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            String string = ((CharSequence) it.next()).toString();
            if (!strTrim.startsWith(string)) {
                return false;
            }
            strTrim = strTrim.replaceFirst(Pattern.quote(string), "").trim();
        }
        return strTrim.length() == 0;
    }
}
