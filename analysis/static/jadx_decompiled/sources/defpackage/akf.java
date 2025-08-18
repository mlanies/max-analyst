package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class akf extends pi0 {
    public final String X;
    public final Map b;
    public final long c;
    public final long o;

    public akf(long j, long j2, long j3, String str, Map map) {
        super(j);
        this.b = map;
        this.c = j2;
        this.o = j3;
        this.X = str;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayEvent{urls=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.o);
        sb.append(", attachLocalId='");
        return zr6.l(sb, this.X, "'}");
    }
}
