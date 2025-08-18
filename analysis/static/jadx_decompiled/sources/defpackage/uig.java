package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uig extends pig {
    public final byte[] e;

    public uig(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.e = bArr;
    }

    @Override // defpackage.pig
    public final byte[] L0() {
        return this.e;
    }
}
