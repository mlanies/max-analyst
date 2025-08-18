package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j74 {
    public long a;
    public final j60 b;
    public final f42 c;
    public final /* synthetic */ k74 d;

    public j74(k74 k74Var, j60 j60Var, f42 f42Var, long j) {
        this.d = k74Var;
        this.b = j60Var;
        this.a = j;
        this.c = f42Var;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        fm9.f(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
