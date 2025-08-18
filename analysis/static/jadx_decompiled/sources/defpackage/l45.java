package defpackage;

import android.util.Rational;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l45 implements Comparator {
    public static final pz2 c = new pz2(17);
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iB;
        int iB2;
        switch (this.a) {
            case 0:
                ki9 ki9Var = (ki9) this.b;
                int i = Integer.MAX_VALUE;
                int i2 = (obj == null || (iB2 = ki9Var.b(obj)) < 0) ? Integer.MAX_VALUE : ki9Var.c[iB2];
                if (obj2 != null && (iB = ki9Var.b(obj2)) >= 0) {
                    i = ki9Var.c[iB];
                }
                return tpa.m(i2, i);
            case 1:
                Map map = (Map) this.b;
                return xfg.f((Long) map.get((gg1) obj), (Long) map.get((gg1) obj2));
            case 2:
                fz6 fz6Var = (fz6) this.b;
                zp7 zp7Var = (zp7) fz6Var.B0.get(((b86) obj2).a);
                Long lValueOf = zp7Var != null ? Long.valueOf(zp7Var.X) : null;
                zp7 zp7Var2 = (zp7) fz6Var.B0.get(((b86) obj).a);
                return xfg.f(lValueOf, zp7Var2 != null ? Long.valueOf(zp7Var2.X) : null);
            case 3:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.C0).compareTo(Boolean.valueOf(materialButton2.C0));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Rational rational = (Rational) obj2;
                float fFloatValue = ((Rational) obj).floatValue();
                Rational rational2 = (Rational) this.b;
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
        }
    }

    public l45(List list) {
        this.a = 0;
        f8.c(1, c);
        ki9 ki9Var = new ki9(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            ki9Var.d(i, it.next());
            i = i2;
        }
        this.b = ki9Var;
    }
}
