package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ct3 {
    static long a(ct3 ct3Var) {
        byte[] bArr = (byte[]) ((a94) ct3Var).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
