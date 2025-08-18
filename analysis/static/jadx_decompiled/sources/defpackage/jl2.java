package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jl2 extends pi0 {
    public final int X;
    public final String b;
    public final List c;
    public final long o;

    public jl2(long j, String str, List list, long j2, int i) {
        super(j);
        this.b = str;
        this.c = list;
        this.o = j2;
        this.X = i;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageSearchResultEvent{query='");
        sb.append(this.b);
        sb.append("', results=");
        sb.append(this.c);
        sb.append(", marker=");
        sb.append(this.o);
        sb.append(", total=");
        return au1.h(sb, this.X, '}');
    }
}
