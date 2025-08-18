package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class wf2 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public wf2(List list, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.e = i;
        this.f = i2;
        this.d = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMediaResult{messages=");
        List list = this.a;
        sb.append(list != null ? list.size() : 0);
        sb.append(", forward=");
        sb.append(this.b);
        sb.append(", isNetworkLoading=");
        sb.append(this.c);
        sb.append(", responseCount=");
        sb.append(this.d);
        sb.append(", forwardCount=");
        sb.append(this.e);
        sb.append(", backwardCount=");
        return au1.h(sb, this.f, '}');
    }
}
