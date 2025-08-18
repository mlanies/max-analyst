package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;

/* loaded from: classes.dex */
public final class w3f extends fqd {
    public final int A0;
    public final String B0;
    public final float C0;
    public final int D0;
    public final yaf x0 = new yaf(3, false);
    public final boolean y0;
    public final int z0;

    public w3f(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.z0 = 0;
            this.A0 = -1;
            this.B0 = "sans-serif";
            this.y0 = false;
            this.C0 = 0.85f;
            this.D0 = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.z0 = bArr[24];
        this.A0 = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.B0 = "Serif".equals(new String(bArr, 43, bArr.length - 43, b52.c)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.D0 = i;
        boolean z = (bArr[0] & 32) != 0;
        this.y0 = z;
        if (z) {
            this.C0 = maf.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.C0 = 0.85f;
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // defpackage.fqd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.abe a(int r25, byte[] r26, boolean r27) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3f.a(int, byte[], boolean):abe");
    }
}
