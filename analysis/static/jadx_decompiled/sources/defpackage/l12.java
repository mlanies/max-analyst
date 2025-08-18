package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l12 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l12(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((a23) obj).t0);
            case 6:
                return Float.valueOf(((a23) obj).u0);
            case 7:
                return Float.valueOf(((jq4) obj).b());
            case 8:
                return Float.valueOf(((oh7) obj).t0);
            case 9:
                return Float.valueOf(((qh7) obj).u0);
            case 10:
                return Float.valueOf(((SwitchCompat) obj).N0);
            case 11:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                o12 o12Var = (o12) obj;
                PointF pointF = (PointF) obj2;
                o12Var.getClass();
                o12Var.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                o12Var.b = iRound;
                int i = o12Var.f + 1;
                o12Var.f = i;
                if (i == o12Var.g) {
                    int i2 = o12Var.a;
                    int i3 = o12Var.c;
                    int i4 = o12Var.d;
                    l12 l12Var = ppf.a;
                    o12Var.e.setLeftTopRightBottom(i2, iRound, i3, i4);
                    o12Var.f = 0;
                    o12Var.g = 0;
                    break;
                }
                break;
            case 1:
                o12 o12Var2 = (o12) obj;
                PointF pointF2 = (PointF) obj2;
                o12Var2.getClass();
                o12Var2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                o12Var2.d = iRound2;
                int i5 = o12Var2.g + 1;
                o12Var2.g = i5;
                if (o12Var2.f == i5) {
                    int i6 = o12Var2.a;
                    int i7 = o12Var2.b;
                    int i8 = o12Var2.c;
                    l12 l12Var2 = ppf.a;
                    o12Var2.e.setLeftTopRightBottom(i6, i7, i8, iRound2);
                    o12Var2.f = 0;
                    o12Var2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view.getLeft();
                int top = view.getTop();
                int iRound3 = Math.round(pointF3.x);
                int iRound4 = Math.round(pointF3.y);
                l12 l12Var3 = ppf.a;
                view.setLeftTopRightBottom(left, top, iRound3, iRound4);
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int iRound5 = Math.round(pointF4.x);
                int iRound6 = Math.round(pointF4.y);
                int right = view2.getRight();
                int bottom = view2.getBottom();
                l12 l12Var4 = ppf.a;
                view2.setLeftTopRightBottom(iRound5, iRound6, right, bottom);
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound7 = Math.round(pointF5.x);
                int iRound8 = Math.round(pointF5.y);
                int width = view3.getWidth() + iRound7;
                int height = view3.getHeight() + iRound8;
                l12 l12Var5 = ppf.a;
                view3.setLeftTopRightBottom(iRound7, iRound8, width, height);
                break;
            case 5:
                a23 a23Var = (a23) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                a23Var.t0 = fFloatValue;
                int i9 = (int) (fFloatValue * 5400.0f);
                ArrayList arrayList = (ArrayList) a23Var.c;
                vq4 vq4Var = (vq4) arrayList.get(0);
                float f = a23Var.t0 * 1520.0f;
                vq4Var.a = (-20.0f) + f;
                vq4Var.b = f;
                int i10 = 0;
                while (true) {
                    wb5 wb5Var = a23Var.Y;
                    if (i10 >= 4) {
                        float f2 = vq4Var.a;
                        float f3 = vq4Var.b;
                        vq4Var.a = (((f3 - f2) * a23Var.u0) + f2) / 360.0f;
                        vq4Var.b = f3 / 360.0f;
                        int i11 = 0;
                        while (true) {
                            if (i11 < 4) {
                                float fJ = dle.J(i9, a23.y0[i11], 333);
                                if (fJ < 0.0f || fJ > 1.0f) {
                                    i11++;
                                } else {
                                    int i12 = i11 + a23Var.s0;
                                    int[] iArr = a23Var.Z.c;
                                    int length = i12 % iArr.length;
                                    int length2 = (1 + length) % iArr.length;
                                    int i13 = iArr[length];
                                    int i14 = iArr[length2];
                                    float interpolation = wb5Var.getInterpolation(fJ);
                                    vq4 vq4Var2 = (vq4) arrayList.get(0);
                                    Integer numValueOf = Integer.valueOf(i13);
                                    Integer numValueOf2 = Integer.valueOf(i14);
                                    int iIntValue = numValueOf.intValue();
                                    float f4 = ((iIntValue >> 24) & 255) / 255.0f;
                                    int iIntValue2 = numValueOf2.intValue();
                                    float f5 = ((iIntValue2 >> 24) & 255) / 255.0f;
                                    float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                                    float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                                    float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                                    float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                                    float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                                    float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                                    float f6 = z7b.f(f5, f4, interpolation, f4);
                                    float f7 = z7b.f(fPow4, fPow, interpolation, fPow);
                                    float f8 = z7b.f(fPow5, fPow2, interpolation, fPow2);
                                    float f9 = z7b.f(fPow6, fPow3, interpolation, fPow3);
                                    float fPow7 = ((float) Math.pow(f7, 0.45454545454545453d)) * 255.0f;
                                    float fPow8 = ((float) Math.pow(f8, 0.45454545454545453d)) * 255.0f;
                                    vq4Var2.c = Integer.valueOf(Math.round(((float) Math.pow(f9, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(f6 * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                                }
                            }
                        }
                        ((tz6) a23Var.b).invalidateSelf();
                        break;
                    } else {
                        vq4Var.b = (wb5Var.getInterpolation(dle.J(i9, a23.w0[i10], 667)) * 250.0f) + vq4Var.b;
                        vq4Var.a = (wb5Var.getInterpolation(dle.J(i9, a23.x0[i10], 667)) * 250.0f) + vq4Var.a;
                        i10++;
                    }
                }
                break;
            case 6:
                ((a23) obj).u0 = ((Float) obj2).floatValue();
                break;
            case 7:
                jq4 jq4Var = (jq4) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (jq4Var.s0 != fFloatValue2) {
                    jq4Var.s0 = fFloatValue2;
                    jq4Var.invalidateSelf();
                    break;
                }
                break;
            case 8:
                oh7 oh7Var = (oh7) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                oh7Var.t0 = fFloatValue3;
                ArrayList arrayList2 = (ArrayList) oh7Var.c;
                ((vq4) arrayList2.get(0)).a = 0.0f;
                float fJ2 = dle.J((int) (fFloatValue3 * 333.0f), 0, 667);
                vq4 vq4Var3 = (vq4) arrayList2.get(0);
                vq4 vq4Var4 = (vq4) arrayList2.get(1);
                wb5 wb5Var2 = oh7Var.X;
                float interpolation2 = wb5Var2.getInterpolation(fJ2);
                vq4Var4.a = interpolation2;
                vq4Var3.b = interpolation2;
                vq4 vq4Var5 = (vq4) arrayList2.get(1);
                vq4 vq4Var6 = (vq4) arrayList2.get(2);
                float interpolation3 = wb5Var2.getInterpolation(fJ2 + 0.49925038f);
                vq4Var6.a = interpolation3;
                vq4Var5.b = interpolation3;
                ((vq4) arrayList2.get(2)).b = 1.0f;
                if (oh7Var.s0 && ((vq4) arrayList2.get(1)).b < 1.0f) {
                    ((vq4) arrayList2.get(2)).c = ((vq4) arrayList2.get(1)).c;
                    ((vq4) arrayList2.get(1)).c = ((vq4) arrayList2.get(0)).c;
                    ((vq4) arrayList2.get(0)).c = oh7Var.Y.c[oh7Var.Z];
                    oh7Var.s0 = false;
                }
                ((tz6) oh7Var.b).invalidateSelf();
                break;
            case 9:
                qh7 qh7Var = (qh7) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                qh7Var.u0 = fFloatValue4;
                int i15 = (int) (fFloatValue4 * 1800.0f);
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = (ArrayList) qh7Var.c;
                    if (i16 >= arrayList3.size()) {
                        if (qh7Var.t0) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((vq4) it.next()).c = qh7Var.Z.c[qh7Var.s0];
                            }
                            qh7Var.t0 = false;
                        }
                        ((tz6) qh7Var.b).invalidateSelf();
                        break;
                    } else {
                        vq4 vq4Var7 = (vq4) arrayList3.get(i16);
                        int[] iArr2 = qh7.x0;
                        int i17 = i16 * 2;
                        int i18 = iArr2[i17];
                        int[] iArr3 = qh7.w0;
                        float fJ3 = dle.J(i15, i18, iArr3[i17]);
                        Interpolator[] interpolatorArr = qh7Var.Y;
                        vq4Var7.a = z04.o(interpolatorArr[i17].getInterpolation(fJ3), 0.0f, 1.0f);
                        int i19 = i17 + 1;
                        vq4Var7.b = z04.o(interpolatorArr[i19].getInterpolation(dle.J(i15, iArr2[i19], iArr3[i19])), 0.0f, 1.0f);
                        i16++;
                    }
                }
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 11:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
