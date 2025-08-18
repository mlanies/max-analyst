package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class w2f extends ee9 {
    public final long k;
    public final long l;

    public w2f(String str, int i, int i2, int i3, long j, long j2, boolean z) {
        super(0L, j2 - j, Collections.singletonList(new ce9(i, str, i2, i3)), z);
        this.k = j;
        this.l = j2;
    }

    @Override // defpackage.ee9, defpackage.ok0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w2f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        w2f w2fVar = (w2f) obj;
        return this.k == w2fVar.k && this.l == w2fVar.l;
    }

    @Override // defpackage.ee9, defpackage.ok0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        long j = this.k;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.l;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.ok0, defpackage.fef
    public final long k() {
        return this.l;
    }

    @Override // defpackage.ok0, defpackage.fef
    public final long m() {
        return this.k;
    }
}
