package defpackage;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes2.dex */
public final class kaf {
    public final CodingErrorAction a = CodingErrorAction.REPLACE;
    public final byte b = 63;
    public char c = 0;

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(char[] r8, int r9, int r10, byte[] r11, int r12) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaf.a(char[], int, int, byte[], int):long");
    }

    public final int b(int i, byte[] bArr) throws CharacterCodingException {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CodingErrorAction codingErrorAction2 = this.a;
        if (codingErrorAction2 == codingErrorAction) {
            int i2 = i + 1;
            bArr[i] = this.b;
            return i2;
        }
        if (codingErrorAction2 != CodingErrorAction.REPORT) {
            return i;
        }
        throw new CharacterCodingException();
    }
}
