package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class kt implements Comparator {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public kt(sl2 sl2Var, sl2 sl2Var2) {
        this.b = sl2Var;
        this.c = sl2Var2;
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        return fFloatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long lValueOf;
        Long lValueOf2;
        switch (this.a) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                boolean z = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF rectFB = b(rational);
                RectF rectFB2 = b(rational2);
                RectF rectF = (RectF) this.b;
                boolean z2 = rectFB.width() >= rectF.width() && rectFB.height() >= rectF.height();
                if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
            default:
                long jLongValue = ((Number) obj2).longValue();
                sl2 sl2Var = (sl2) this.b;
                ql2 ql2Var = (ql2) sl2Var.a.get(Long.valueOf(jLongValue));
                sl2 sl2Var2 = (sl2) this.c;
                ql2 ql2Var2 = (ql2) sl2Var2.a.get(Long.valueOf(jLongValue));
                if ((ql2Var != null ? ql2Var.l : 0L) >= (ql2Var2 != null ? ql2Var2.l : 0L)) {
                    lValueOf = Long.valueOf(ql2Var != null ? ql2Var.l : 0L);
                } else {
                    lValueOf = Long.valueOf(ql2Var2 != null ? ql2Var2.l : 0L);
                }
                long jLongValue2 = ((Number) obj).longValue();
                ql2 ql2Var3 = (ql2) sl2Var.a.get(Long.valueOf(jLongValue2));
                ql2 ql2Var4 = (ql2) sl2Var2.a.get(Long.valueOf(jLongValue2));
                if ((ql2Var3 != null ? ql2Var3.l : 0L) >= (ql2Var4 != null ? ql2Var4.l : 0L)) {
                    lValueOf2 = Long.valueOf(ql2Var3 != null ? ql2Var3.l : 0L);
                } else {
                    lValueOf2 = Long.valueOf(ql2Var4 != null ? ql2Var4.l : 0L);
                }
                return xfg.f(lValueOf, lValueOf2);
        }
    }

    public kt(Rational rational, Rational rational2) {
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }
}
