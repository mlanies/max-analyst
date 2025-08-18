package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class u51 implements ol7 {
    public final long a;
    public final CharSequence b;
    public final long c;
    public final int o = rvb.call_event_view_item;

    public u51(long j, SpannableStringBuilder spannableStringBuilder) {
        this.a = j;
        this.b = spannableStringBuilder;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u51)) {
            return false;
        }
        u51 u51Var = (u51) obj;
        return this.a == u51Var.a && tpa.f(this.b, u51Var.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    public final String toString() {
        return "CallEventItemView(id=" + this.a + ", text=" + ((Object) this.b) + ")";
    }
}
