package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class jmd extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ kmd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jmd(Object obj, kmd kmdVar, int i) {
        super(9, obj);
        this.c = i;
        this.o = kmdVar;
    }

    @Override // defpackage.u2
    public final void L1(Object obj, Object obj2) {
        kmd kmdVar = this.o;
        switch (this.c) {
            case 0:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                kmdVar.a(qp4.u0.b(kmdVar.a).i());
                kmdVar.invalidateSelf();
                return;
            case 1:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                float[] fArr = (float[]) obj2;
                kmdVar.Z.setFloatValues(Arrays.copyOf(fArr, fArr.length));
                return;
            case 2:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                int iOrdinal = ((imd) obj2).ordinal();
                if (iOrdinal == 0) {
                    kmdVar.Z.setValues(PropertyValuesHolder.ofFloat(kmdVar.X, 0.0f, 359.0f));
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kmdVar.Z.setValues(PropertyValuesHolder.ofFloat(kmdVar.X, 359.0f, 0.0f));
                    return;
                }
            case 3:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                long jLongValue = ((Number) obj2).longValue();
                ((Number) obj).longValue();
                kmdVar.Z.setDuration(jLongValue);
                return;
            case 4:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                float[] fArr2 = (float[]) obj2;
                kmdVar.Y.setFloatValues(Arrays.copyOf(fArr2, fArr2.length));
                return;
            case 5:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                long jLongValue2 = ((Number) obj2).longValue();
                ((Number) obj).longValue();
                kmdVar.Y.setDuration(jLongValue2);
                return;
            case 6:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                kmdVar.invalidateSelf();
                return;
            default:
                if (tpa.f(obj, obj2)) {
                    return;
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                if (zBooleanValue) {
                    kmdVar.d();
                } else {
                    ObjectAnimator objectAnimator = kmdVar.Y;
                    if (objectAnimator.isRunning()) {
                        objectAnimator.cancel();
                    }
                }
                kmdVar.invalidateSelf();
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jmd(kmd kmdVar, int i) {
        this.c = i;
        switch (i) {
            case 2:
                imd imdVar = imd.a;
                this.o = kmdVar;
                super(9, imdVar);
                break;
            case 3:
                this.o = kmdVar;
                super(9, (Object) 8000L);
                break;
            case 4:
            default:
                hmd hmdVar = hmd.a;
                this.o = kmdVar;
                super(9, hmdVar);
                break;
            case 5:
                this.o = kmdVar;
                super(9, (Object) 8000L);
                break;
            case 6:
                this.o = kmdVar;
                super(9, (Object) null);
                break;
            case 7:
                Boolean bool = Boolean.TRUE;
                this.o = kmdVar;
                super(9, bool);
                break;
        }
    }
}
