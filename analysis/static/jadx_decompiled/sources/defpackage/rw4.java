package defpackage;

import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;

/* loaded from: classes.dex */
public final class rw4 {
    public final Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ rw4(Object obj) {
        this.a = obj;
    }

    public void a() {
        String strH0;
        e24 e24Var;
        kj kjVar = (kj) this.a;
        a4c a4cVar = (a4c) kjVar.a.b;
        Integer num = kjVar.c;
        if (((Integer) this.b) != null) {
            nd7.e(16);
            String string = Long.toString(r3.intValue() & 4294967295L, 16);
            strH0 = w9e.H0(string, string.length() > 6 ? 8 : 6, '0');
        } else {
            strH0 = null;
        }
        e24 e24Var2 = ((kj) this.a).d;
        Boolean boolValueOf = e24Var2 != null ? Boolean.valueOf(e24Var2.b()) : null;
        a4cVar.log("AniSend", kjVar + ": isReady: v=" + num + " bgColor=" + strH0 + "} connected=" + boolValueOf + " senderThread=" + ((kj) this.a).e);
        Integer num2 = ((kj) this.a).c;
        if (num2 == null) {
            return;
        }
        if (num2.intValue() != 1 && (((Integer) this.b) == null || ((kj) this.a).e == null || (e24Var = ((kj) this.a).d) == null || !e24Var.b())) {
            return;
        }
        ((kj) this.a).g = null;
        Integer num3 = (Integer) this.b;
        if (num3 != null) {
            ((kj) this.a).c(num3.intValue());
        }
        if (((Double[]) this.c) != null) {
            kj kjVar2 = (kj) this.a;
            rw4 rw4Var = kjVar2.g;
            Integer num4 = kjVar2.c;
            if (rw4Var != null) {
                rw4Var.c = null;
                return;
            }
            if (num4 != null) {
                throw null;
            }
            IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
            a4c a4cVar2 = (a4c) kjVar2.a.b;
            String message = illegalStateException.getMessage();
            if (message == null) {
                message = "animoji error";
            }
            a4cVar2.reportException("AniSend", message, illegalStateException);
            rw4 rw4Var2 = new rw4(kjVar2);
            rw4Var2.c = null;
            kjVar2.g = rw4Var2;
        }
    }

    public void b(im7 im7Var) {
        ((ck6) this.a).execute(new u8g(this, im7Var, false, 1));
    }

    public CharSequence c(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        q5f q5fVar;
        c4f[] c4fVarArr;
        te teVar = (te) this.b;
        teVar.getClass();
        boolean z2 = charSequence instanceof fvd;
        if (z2) {
            ((fvd) charSequence).a();
        }
        if (z2) {
            q5fVar = new q5f((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    q5fVar = new q5f((Spannable) charSequence);
                } else if (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, c4f.class) > i2) {
                    q5fVar = null;
                } else {
                    q5fVar = new q5f();
                    q5fVar.a = false;
                    q5fVar.b = new SpannableString(charSequence);
                }
            } finally {
                if (z2) {
                    ((fvd) charSequence).b();
                }
            }
        }
        if (q5fVar != null && (c4fVarArr = (c4f[]) q5fVar.b.getSpans(i, i2, c4f.class)) != null && c4fVarArr.length > 0) {
            for (c4f c4fVar : c4fVarArr) {
                int spanStart = q5fVar.b.getSpanStart(c4fVar);
                int spanEnd = q5fVar.b.getSpanEnd(c4fVar);
                if (spanStart != i2) {
                    q5fVar.removeSpan(c4fVar);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        if (i != i2 && i < charSequence.length()) {
            if (i3 != Integer.MAX_VALUE && q5fVar != null) {
                i3 -= ((c4f[]) q5fVar.b.getSpans(0, q5fVar.b.length(), c4f.class)).length;
            }
            q5f q5fVar2 = (q5f) teVar.c(charSequence, i, i2, i3, z, new va8(q5fVar, 16, (kj6) teVar.b));
            if (q5fVar2 != null) {
                Spannable spannable = q5fVar2.b;
                if (z2) {
                    ((fvd) charSequence).b();
                }
                return spannable;
            }
            if (!z2) {
                return charSequence;
            }
        } else if (!z2) {
            return charSequence;
        }
        return charSequence;
    }

    public rw4(Looper looper, le6 le6Var, String str) {
        this.a = new ck6(looper);
        this.b = le6Var;
        fp3.j(str);
        this.c = new hm7(le6Var, str);
    }
}
