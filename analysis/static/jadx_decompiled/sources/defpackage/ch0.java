package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ch0 implements ol7 {
    public final long a;
    public final List b;

    public ch0(long j, List list) {
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch0)) {
            return false;
        }
        ch0 ch0Var = (ch0) obj;
        return this.a == ch0Var.a && tpa.f(this.b, ch0Var.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 0;
    }

    public final String toString() {
        return "BannerViewPagerListItem(itemId=" + this.a + ", items=" + this.b + ")";
    }
}
