package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ida {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final d6a b;
    public final t33 c;
    public final je7 d;
    public final are e;
    public String g;
    public Pattern h;
    public final m7b i;
    public final tx4 j;
    public final d6a k;
    public final xs2 l;
    public final o45 m;
    public final hda n;
    public final je7 o;
    public int f = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;

    public ida(Context context, m7b m7bVar, tx4 tx4Var, xs2 xs2Var, d6a d6aVar, o45 o45Var, je7 je7Var, are areVar, hda hdaVar, je7 je7Var2) {
        this.a = context.getApplicationContext();
        this.c = ((p7b) m7bVar).a;
        this.b = d6aVar;
        this.d = je7Var;
        this.e = areVar;
        this.i = m7bVar;
        this.j = tx4Var;
        this.l = xs2Var;
        this.k = d6aVar;
        this.m = o45Var;
        this.n = hdaVar;
        this.o = je7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence a(java.lang.CharSequence r17, boolean r18, boolean r19, boolean r20, boolean r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ida.a(java.lang.CharSequence, boolean, boolean, boolean, boolean, java.util.List, boolean):java.lang.CharSequence");
    }

    public final CharSequence b(CharSequence charSequence, nu8 nu8Var, boolean z, boolean z2) {
        if (nu8.g.contains(nu8Var.c)) {
            return charSequence;
        }
        int i = nu8Var.d;
        int i2 = nu8Var.e;
        int i3 = i + i2;
        if (i3 > charSequence.length() || i < 0) {
            hm9.k0("ida", null, "addMessageElement: can't add message element, text length: %s, from: %s, length: %s", Arrays.copyOf(new Object[]{Integer.valueOf(charSequence.length()), Integer.valueOf(i), Integer.valueOf(i2)}, 3));
            return charSequence;
        }
        if (z && charSequence.charAt(i) == '@') {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new qu8(nu8Var, this.b.a(z2)), i, i3, 33);
        return spannableStringBuilder;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, int i) {
        if (z) {
            spannableStringBuilder.insert(i, "\u2060 ");
            spannableStringBuilder.setSpan(new fcf(this.a, 1, false, new bt8(z2, 2)), i + 1, i + 2, 33);
        }
    }

    public final String d(long j) {
        t33 t33Var = this.c;
        b11 b11VarO = ay7.o(j, t33Var.n());
        Locale localeV = t33Var.v();
        String[] strArr = are.b;
        int iS = au1.s(b11VarO.b);
        Context context = this.a;
        long j2 = b11VarO.c;
        switch (iS) {
            case 0:
                return context.getString(c2c.tt_dates_right_now);
            case 1:
                return are.s(fzb.tt_dates_minutes_past, (int) j2, context);
            case 2:
                return are.s(fzb.tt_dates_hours_past, (int) j2, context);
            case 3:
                return String.format(context.getString(c2c.tt_dates_yesterday_at), ay7.k(context, j2, localeV));
            case 4:
                return are.s(fzb.tt_dates_days_past, (int) j2, context);
            case 5:
                return are.s(fzb.tt_dates_weeks_past, (int) j2, context);
            case 6:
                return are.s(fzb.tt_dates_months_past, (int) j2, context);
            case 7:
                return ay7.q(localeV, j2, true);
            default:
                return "";
        }
    }

    public final int e() {
        if (this.q == -1) {
            this.q = (int) this.a.getResources().getDimension(fpc.b);
        }
        return this.q;
    }

    public final int f() throws Resources.NotFoundException {
        if (this.p == -1) {
            this.p = (int) (fk4.e(((p7b) this.i).c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(fpc.a));
        }
        return this.p;
    }

    public final int g() throws Resources.NotFoundException {
        if (this.r == -1) {
            this.r = (int) (fk4.e(((p7b) this.i).c.g.getFloat("app.extra.text.size.sp", 0.0f)) + this.a.getResources().getDimension(fpc.c));
        }
        return this.r;
    }

    public final w6b h(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) ? w6b.a() : new w6b(this.j.e(charSequence), bre.d(charSequence.toString(), this));
    }

    public final w6b i(String str, ArrayList arrayList) {
        return TextUtils.isEmpty(str) ? w6b.a() : arrayList.isEmpty() ? h(str) : new w6b(j(str, arrayList, fk4.b(18)), bre.d(str.toString(), this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    public final CharSequence j(CharSequence charSequence, List list, int i) {
        ArrayList arrayListEmptyList;
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        boolean zA = ((rj) this.o.getValue()).a();
        tx4 tx4Var = this.j;
        if (!zA) {
            return tx4Var.b(i, charSequence);
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            arrayListEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                try {
                    if (((nu8) obj).c == mu8.v0) {
                        arrayList.add(obj);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            arrayListEmptyList = arrayList;
        }
        return arrayListEmptyList.isEmpty() ? tx4Var.b(i, charSequence) : this.n.a(charSequence, arrayListEmptyList, 1, false, i, true);
    }

    public final CharSequence k(CharSequence charSequence, List list, boolean z, int i, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        return this.n.a(charSequence, list, 1, z, i, z2 && ((rj) this.o.getValue()).a());
    }

    public final CharSequence l(CharSequence charSequence, List list) {
        CharSequence charSequenceK = k(charSequence, list, true, 0, false);
        if (TextUtils.isEmpty(charSequenceK) || nd7.D(list)) {
            return charSequenceK;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequenceK);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nu8 nu8Var = (nu8) it.next();
            if (nu8Var.c == mu8.a) {
                spannableStringBuilder = b(spannableStringBuilder, nu8Var, false, true);
            }
        }
        return spannableStringBuilder;
    }
}
