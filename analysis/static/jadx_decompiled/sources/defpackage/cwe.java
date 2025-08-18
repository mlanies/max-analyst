package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* loaded from: classes.dex */
public final class cwe extends vh0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // defpackage.m60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwe.b(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = j60Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new j60(j60Var.a, j60Var.b, 2) : j60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
    }
}
