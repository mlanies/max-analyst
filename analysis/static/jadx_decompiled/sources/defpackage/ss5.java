package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import com.my.tracker.obfuscated.t;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ss5 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ss5(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [rs5, rt1] */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        final long jA;
        switch (this.a) {
            case 0:
                final xs5 xs5Var = (xs5) this.c;
                lq1 lq1Var = (lq1) this.o;
                bw4 bw4Var = (bw4) this.X;
                long j = this.b;
                if (!xs5Var.d) {
                    lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                Rect rectE = ((cag) xs5Var.a.i.Y).e();
                if (xs5Var.e != null) {
                    rational = xs5Var.e;
                } else {
                    Rect rectE2 = ((cag) xs5Var.a.i.Y).e();
                    rational = new Rational(rectE2.width(), rectE2.height());
                }
                List list = (List) bw4Var.b;
                Integer num = (Integer) xs5Var.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List listC = xs5Var.c(list, num == null ? 0 : num.intValue(), rational, rectE, 1);
                List list2 = (List) bw4Var.c;
                Integer num2 = (Integer) xs5Var.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List listC2 = xs5Var.c(list2, num2 == null ? 0 : num2.intValue(), rational, rectE, 2);
                List list3 = (List) bw4Var.o;
                Integer num3 = (Integer) xs5Var.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                List listC3 = xs5Var.c(list3, num3 == null ? 0 : num3.intValue(), rational, rectE, 4);
                if (listC.isEmpty() && listC2.isEmpty() && listC3.isEmpty()) {
                    lq1Var.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    return;
                }
                ((HashSet) xs5Var.a.b.b).remove(xs5Var.o);
                lq1 lq1Var2 = xs5Var.t;
                if (lq1Var2 != null) {
                    lq1Var2.d(new CameraControl$OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                    xs5Var.t = null;
                }
                ((HashSet) xs5Var.a.b.b).remove(xs5Var.p);
                lq1 lq1Var3 = xs5Var.u;
                if (lq1Var3 != null) {
                    lq1Var3.d(new CameraControl$OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                    xs5Var.u = null;
                }
                ScheduledFuture scheduledFuture = xs5Var.i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    xs5Var.i = null;
                }
                xs5Var.t = lq1Var;
                MeteringRectangle[] meteringRectangleArr = xs5.x;
                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listC.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listC2.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listC3.toArray(meteringRectangleArr);
                rs5 rs5Var = xs5Var.o;
                st1 st1Var = xs5Var.a;
                ((HashSet) st1Var.b.b).remove(rs5Var);
                ScheduledFuture scheduledFuture2 = xs5Var.i;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    xs5Var.i = null;
                }
                ScheduledFuture scheduledFuture3 = xs5Var.j;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(true);
                    xs5Var.j = null;
                }
                xs5Var.q = meteringRectangleArr2;
                xs5Var.r = meteringRectangleArr3;
                xs5Var.s = meteringRectangleArr4;
                if (meteringRectangleArr2.length > 0) {
                    xs5Var.g = true;
                    xs5Var.l = false;
                    xs5Var.m = false;
                    jA = st1Var.A();
                    xs5Var.e(true);
                } else {
                    xs5Var.g = false;
                    xs5Var.l = true;
                    xs5Var.m = false;
                    jA = st1Var.A();
                }
                xs5Var.h = 0;
                final boolean z = st1Var.u(1) == 1;
                ?? r15 = new rt1() { // from class: rs5
                    @Override // defpackage.rt1
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        xs5 xs5Var2 = xs5Var;
                        xs5Var2.getClass();
                        Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (xs5Var2.q.length > 0) {
                            if (!z || num4 == null) {
                                xs5Var2.m = true;
                                xs5Var2.l = true;
                            } else if (xs5Var2.h.intValue() == 3) {
                                if (num4.intValue() == 4) {
                                    xs5Var2.m = true;
                                    xs5Var2.l = true;
                                } else if (num4.intValue() == 5) {
                                    xs5Var2.m = false;
                                    xs5Var2.l = true;
                                }
                            }
                        }
                        if (!xs5Var2.l || !st1.x(totalCaptureResult, jA)) {
                            if (xs5Var2.h.equals(num4) || num4 == null) {
                                return false;
                            }
                            xs5Var2.h = num4;
                            return false;
                        }
                        boolean z2 = xs5Var2.m;
                        ScheduledFuture scheduledFuture4 = xs5Var2.j;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            xs5Var2.j = null;
                        }
                        lq1 lq1Var4 = xs5Var2.t;
                        if (lq1Var4 != null) {
                            lq1Var4.b(new ys5(z2));
                            xs5Var2.t = null;
                        }
                        return true;
                    }
                };
                xs5Var.o = r15;
                st1Var.p(r15);
                long j2 = xs5Var.k + 1;
                xs5Var.k = j2;
                us5 us5Var = new us5(0, j2, xs5Var);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ScheduledExecutorService scheduledExecutorService = xs5Var.c;
                xs5Var.j = scheduledExecutorService.schedule(us5Var, j, timeUnit);
                long j3 = bw4Var.a;
                if (j3 > 0) {
                    xs5Var.i = scheduledExecutorService.schedule(new us5(1, j2, xs5Var), j3, timeUnit);
                    return;
                }
                return;
            case 1:
                die dieVar = (die) this.c;
                bg1 bg1Var = (bg1) this.o;
                Size size = (Size) this.X;
                long j4 = this.b;
                synchronized (dieVar) {
                    if (((LinkedHashSet) dieVar.o).contains(bg1Var)) {
                        return;
                    }
                    Long l = (Long) ((LinkedHashMap) dieVar.c).get(bg1Var);
                    if (l != null) {
                        ce.a().b(new tb2(dieVar, j4 - l.longValue(), mz7.a0(new kpa("width", EventItemValueKt.toEventItemValue(size.getWidth())), new kpa("height", EventItemValueKt.toEventItemValue(size.getHeight()))), 5));
                        ((LinkedHashMap) dieVar.c).remove(bg1Var);
                        ((LinkedHashSet) dieVar.o).add(bg1Var);
                    }
                    return;
                }
            default:
                ((t) this.c).a((String) this.o, (String) this.X, this.b);
                return;
        }
    }
}
