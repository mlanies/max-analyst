package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class qd7 {
    public static final qd7 f = new qd7(null, null, false, false, iaf.o);
    public final gg1 a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final iaf e;

    public qd7(gg1 gg1Var, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, iaf iafVar) {
        this.a = gg1Var;
        this.b = spannableStringBuilder;
        this.c = z;
        this.d = z2;
        this.e = iafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd7)) {
            return false;
        }
        qd7 qd7Var = (qd7) obj;
        return tpa.f(this.a, qd7Var.a) && tpa.f(this.b, qd7Var.b) && this.c == qd7Var.c && this.d == qd7Var.d && this.e == qd7Var.e;
    }

    public final int hashCode() {
        gg1 gg1Var = this.a;
        int iHashCode = (gg1Var == null ? 0 : gg1Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return this.e.hashCode() + ms2.d(ms2.d((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "LabelSpeakerState(participantId=" + this.a + ", title=" + ((Object) this.b) + ", isPinned=" + this.c + ", isTalking=" + this.d + ", action=" + this.e + ")";
    }
}
