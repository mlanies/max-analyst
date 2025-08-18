package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

/* loaded from: classes.dex */
public final /* synthetic */ class s05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d15 b;
    public final /* synthetic */ long c;

    public /* synthetic */ s05(d15 d15Var, long j, int i) {
        this.a = i;
        this.b = d15Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d15 d15Var = this.b;
                switch (au1.s(d15Var.D)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        long j = this.c;
                        a14.H(j);
                        d15Var.o.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        d15Var.i(3);
                        return;
                    case 4:
                        d15Var.i(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15Var.D)));
                }
            default:
                d15 d15Var2 = this.b;
                long j2 = this.c;
                switch (au1.s(d15Var2.D)) {
                    case 0:
                        d15Var2.w = null;
                        a14.H(j2);
                        try {
                            if (d15Var2.z) {
                                d15Var2.h();
                            }
                            d15Var2.t = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            d15Var2.e.start();
                            k05 k05Var = d15Var2.f;
                            if (k05Var instanceof z05) {
                                ((z05) k05Var).a(true);
                            }
                            d15Var2.i(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            d15Var2.b(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        d15Var2.w = null;
                        Range range = (Range) d15Var2.o.removeLast();
                        c54.p("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long jLongValue = l.longValue();
                        d15Var2.o.addLast(Range.create(l, Long.valueOf(j2)));
                        a14.H(j2);
                        a14.H(j2 - jLongValue);
                        if ((d15Var2.c || xi4.a.e(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!d15Var2.c || xi4.a.e(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            d15Var2.e.setParameters(zr6.g(0, "drop-input-frames"));
                            k05 k05Var2 = d15Var2.f;
                            if (k05Var2 instanceof z05) {
                                ((z05) k05Var2).a(true);
                            }
                        }
                        if (d15Var2.c) {
                            d15Var2.g();
                        }
                        d15Var2.i(2);
                        return;
                    case 3:
                    case 5:
                        d15Var2.i(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15Var2.D)));
                }
        }
    }
}
