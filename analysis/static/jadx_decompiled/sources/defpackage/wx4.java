package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class wx4 implements tx4 {
    public final je7 a;
    public final je7 b;

    public wx4(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    @Override // defpackage.tx4
    public final boolean a(int i, CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0 || i < 0 || i > w9e.v0(charSequence)) {
            return false;
        }
        int iCodePointAt = charSequence.toString().codePointAt(i);
        return nu0.y(iCodePointAt) || iCodePointAt == 8205 || iCodePointAt == 8419;
    }

    @Override // defpackage.tx4
    public final CharSequence b(int i, CharSequence charSequence) {
        Spannable spannableE = h().e(i, charSequence);
        return spannableE == null ? "" : spannableE;
    }

    @Override // defpackage.tx4
    public final List c(CharSequence charSequence) {
        List listD = h().d(charSequence);
        ArrayList arrayList = new ArrayList(z53.S(listD, 10));
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((CharSequence) ((kpa) it.next()).a);
        }
        return arrayList;
    }

    @Override // defpackage.tx4
    public final CharSequence d(long j, String str, String str2, CharSequence charSequence, int i) {
        Spanned spanned;
        CharSequence charSequenceB = b(i, charSequence);
        int length = charSequenceB.length();
        try {
            spanned = charSequenceB instanceof Spanned ? (Spanned) charSequenceB : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, ey4.class) : null;
        ey4[] ey4VarArr = (ey4[]) spans;
        ey4 ey4Var = ey4VarArr != null ? (ey4) ys.e0(ey4VarArr) : null;
        if (ey4Var == null || str == null) {
            return charSequenceB;
        }
        ji jiVar = (ji) this.b.getValue();
        jiVar.getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        zj zjVar = new zj(jiVar.b, i, r0e.a(new a3f(Long.valueOf(j), str, str2 != null ? str2 : "")), new ki(ey4Var.Y), jiVar.a);
        zjVar.setBounds(0, 0, i, i);
        ak akVar = new ak(j, zjVar);
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(akVar, 0, charSequence.length(), 33);
        return spannableString;
    }

    @Override // defpackage.tx4
    public final CharSequence e(CharSequence charSequence) {
        cz4 cz4VarH = h();
        cz4VarH.c.getClass();
        Spannable spannableE = cz4VarH.e(tu0.G(TypedValue.applyDimension(2, 20, fk4.d().getDisplayMetrics())), charSequence);
        return spannableE == null ? "" : spannableE;
    }

    @Override // defpackage.tx4
    public final List f(CharSequence charSequence) {
        return h().d(charSequence);
    }

    @Override // defpackage.tx4
    public final boolean g(CharSequence charSequence) {
        h().getClass();
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return charSequence.codePoints().allMatch(new pw4());
    }

    public final cz4 h() {
        return (cz4) this.a.getValue();
    }
}
