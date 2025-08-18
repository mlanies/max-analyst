package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface dt3 {
    static long a(dt3 dt3Var) {
        byte[] bArr = (byte[]) ((b94) dt3Var).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
