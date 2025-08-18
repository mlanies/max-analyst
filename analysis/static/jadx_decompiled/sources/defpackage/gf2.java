package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class gf2 extends pi0 {
    public final int X;
    public final Set Y;
    public final long b;
    public final int c;
    public final int o;

    public gf2(long j, long j2, int i, int i2, int i3, Set set) {
        super(j);
        this.b = j2;
        this.c = i;
        this.o = i2;
        this.X = i3;
        this.Y = set;
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "ChatMediaEvent{messageId=" + this.b + ", forwardCount=" + this.c + ", backwardCount=" + this.o + ", responseCount=" + this.X + ", types=" + this.Y + "} " + super.toString();
    }
}
