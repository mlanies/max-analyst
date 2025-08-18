package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.InflateException;

/* loaded from: classes2.dex */
public final class gh {
    public static final ey1 c = new ey1(26);
    public final Context a;
    public final Resources b;

    public gh(Context context) {
        this.a = context;
        this.b = context.getResources();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e7, code lost:
    
        if (r21 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e9, code lost:
    
        if (r6 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01eb, code lost:
    
        if (r22 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ed, code lost:
    
        r0 = (android.animation.Animator[]) r6.toArray(new android.animation.Animator[0]);
        r21.playTogether((android.animation.Animator[]) java.util.Arrays.copyOf(r0, r0.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0201, code lost:
    
        r0 = (android.animation.Animator[]) r6.toArray(new android.animation.Animator[0]);
        r21.playSequentially((android.animation.Animator[]) java.util.Arrays.copyOf(r0, r0.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0214, code lost:
    
        return r7;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[PHI: r7
      0x0068: PHI (r7v3 android.animation.ObjectAnimator) = 
      (r7v1 android.animation.ObjectAnimator)
      (r7v1 android.animation.ObjectAnimator)
      (r7v1 android.animation.ObjectAnimator)
      (r7v1 android.animation.ObjectAnimator)
      (r7v6 android.animation.ObjectAnimator)
      (r7v1 android.animation.ObjectAnimator)
     binds: [B:13:0x002c, B:15:0x0032, B:33:0x0084, B:29:0x0072, B:26:0x0067, B:18:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.content.res.XmlResourceParser r20, android.animation.AnimatorSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh.a(android.content.res.XmlResourceParser, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public final void b(ValueAnimator valueAnimator, XmlResourceParser xmlResourceParser) {
        mh hhVar;
        String str;
        String str2;
        xg xgVar = xg.o;
        Context context = this.a;
        valueAnimator.setInterpolator((TimeInterpolator) xgVar.C(context, xmlResourceParser));
        valueAnimator.setDuration(((Number) wg.X.C(context, xmlResourceParser)).longValue());
        valueAnimator.setStartDelay(((Number) wg.w0.C(context, xmlResourceParser)).longValue());
        valueAnimator.setRepeatCount(((Number) wg.u0.C(context, xmlResourceParser)).intValue());
        valueAnimator.setRepeatMode(((Number) wg.v0.C(context, xmlResourceParser)).intValue());
        String str3 = (String) wg.Z.C(context, xmlResourceParser);
        mh mhVar = (mh) zg.o.C(context, xmlResourceParser);
        mh mhVar2 = (mh) zg.X.C(context, xmlResourceParser);
        mh mhVar3 = (mh) wg.x0.C(context, xmlResourceParser);
        if ((mhVar instanceof hh) || (mhVar2 instanceof hh)) {
            hhVar = new hh(0);
        } else {
            boolean z = mhVar3 instanceof lh;
            hhVar = mhVar3;
            if (z) {
                hhVar = new ih(0.0f);
            }
        }
        boolean z2 = hhVar instanceof ih;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        propertyValuesHolderOfInt = null;
        propertyValuesHolderOfInt = null;
        if (hhVar instanceof kh) {
            boolean z3 = mhVar instanceof kh;
            kh khVar = z3 ? (kh) mhVar : null;
            sra[] sraVarArrH = (khVar == null || (str2 = khVar.a) == null) ? null : m6d.h(str2);
            boolean z4 = mhVar2 instanceof kh;
            kh khVar2 = z4 ? (kh) mhVar2 : null;
            sra[] sraVarArrH2 = (khVar2 == null || (str = khVar2.a) == null) ? null : m6d.h(str);
            if (sraVarArrH != null || sraVarArrH2 != null) {
                if (sraVarArrH != null) {
                    job jobVar = new job();
                    if (sraVarArrH2 == null) {
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str3, jobVar, sraVarArrH);
                    } else {
                        if (!m6d.a(sraVarArrH, sraVarArrH2)) {
                            kh khVar3 = z3 ? (kh) mhVar : null;
                            String str4 = khVar3 != null ? khVar3.a : null;
                            kh khVar4 = z4 ? (kh) mhVar2 : null;
                            throw new InflateException(rh4.k("Can't morph from ", str4, " to ", khVar4 != null ? khVar4.a : null));
                        }
                        propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str3, jobVar, sraVarArrH, sraVarArrH2);
                    }
                } else if (sraVarArrH2 != null) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofObject(str3, new job(), sraVarArrH2);
                }
            }
        } else {
            ArgbEvaluator argbEvaluator = hhVar instanceof hh ? new ArgbEvaluator() : null;
            if (z2) {
                if (mhVar != null) {
                    float f = ((ih) mhVar).a;
                    propertyValuesHolderOfInt = mhVar2 != null ? PropertyValuesHolder.ofFloat(str3, f, ((ih) mhVar2).a) : PropertyValuesHolder.ofFloat(str3, f);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str3, 0.0f, ((ih) mhVar2).a);
                }
            } else if (mhVar != null) {
                int i = mhVar instanceof hh ? ((hh) mhVar).a : ((jh) mhVar).a;
                if (mhVar2 != null) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str3, i, mhVar2 instanceof hh ? ((hh) mhVar2).a : ((jh) mhVar2).a);
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str3, i);
                }
            } else if (mhVar2 != null) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str3, mhVar2 instanceof hh ? ((hh) mhVar2).a : ((jh) mhVar2).a);
            }
            if (propertyValuesHolderOfInt != null && argbEvaluator != null) {
                propertyValuesHolderOfInt.setEvaluator(argbEvaluator);
            }
        }
        if (propertyValuesHolderOfInt != null) {
            valueAnimator.setValues(propertyValuesHolderOfInt);
        }
    }
}
