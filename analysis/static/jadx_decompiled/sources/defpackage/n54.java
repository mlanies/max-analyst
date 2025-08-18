package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class n54 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    public /* synthetic */ n54(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                int i5 = this.f;
                int i6 = this.g;
                int i7 = this.h;
                int i8 = this.i;
                int i9 = this.j;
                int i10 = this.k;
                long j = this.l;
                int i11 = this.m;
                int i12 = maf.a;
                Locale locale = Locale.US;
                StringBuilder sbJ = wg0.j("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
                ms2.k(sbJ, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
                ms2.k(sbJ, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
                ms2.k(sbJ, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
                ms2.k(sbJ, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
                sbJ.append(j);
                sbJ.append("\n videoFrameProcessingOffsetCount=");
                sbJ.append(i11);
                sbJ.append("\n}");
                return sbJ.toString();
            default:
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                int i16 = this.e;
                int i17 = this.f;
                int i18 = this.g;
                int i19 = this.h;
                int i20 = this.i;
                int i21 = this.j;
                int i22 = this.k;
                long j2 = this.l;
                int i23 = this.m;
                int i24 = oaf.a;
                Locale locale2 = Locale.US;
                StringBuilder sbJ2 = wg0.j("DecoderCounters {\n decoderInits=", i13, ",\n decoderReleases=", i14, "\n queuedInputBuffers=");
                ms2.k(sbJ2, i15, "\n skippedInputBuffers=", i16, "\n renderedOutputBuffers=");
                ms2.k(sbJ2, i17, "\n skippedOutputBuffers=", i18, "\n droppedBuffers=");
                ms2.k(sbJ2, i19, "\n droppedInputBuffers=", i20, "\n maxConsecutiveDroppedBuffers=");
                ms2.k(sbJ2, i21, "\n droppedToKeyframeEvents=", i22, "\n totalVideoFrameProcessingOffsetUs=");
                sbJ2.append(j2);
                sbJ2.append("\n videoFrameProcessingOffsetCount=");
                sbJ2.append(i23);
                sbJ2.append("\n}");
                return sbJ2.toString();
        }
    }
}
