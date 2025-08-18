package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class mic {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final Set d;
    public final jo7 e;
    public final yw1 f;
    public final HashMap g;

    public mic(ax1 ax1Var, HashSet hashSet) {
        Size sizeE = e1f.e(ax1Var.g().e());
        yw1 yw1VarP = ax1Var.p();
        jo7 jo7Var = new jo7(yw1VarP, sizeE);
        this.g = new HashMap();
        this.a = sizeE;
        Rational rational = ((double) sizeE.getWidth()) / ((double) sizeE.getHeight()) > h ? lt.c : lt.a;
        sizeE.toString();
        Objects.toString(rational);
        this.b = rational;
        Rational rational2 = lt.a;
        if (rational.equals(rational2)) {
            rational2 = lt.c;
        } else if (!rational.equals(lt.c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.c = rational2;
        this.f = yw1VarP;
        this.d = hashSet;
        this.e = jo7Var;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalG = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalG2 = g(size);
        if (rationalG.floatValue() == rationalG2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalG.floatValue() > rationalG2.floatValue()) {
                float f = width;
                float fFloatValue = f / rationalG.floatValue();
                float f2 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
            } else {
                float f3 = height;
                float fFloatValue2 = rationalG.floatValue() * f3;
                float f4 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(o9f o9fVar) {
        Rational rationalG;
        if (!this.d.contains(o9fVar)) {
            throw new IllegalArgumentException("Invalid child config: " + o9fVar);
        }
        HashMap map = this.g;
        if (map.containsKey(o9fVar)) {
            List list = (List) map.get(o9fVar);
            Objects.requireNonNull(list);
            return list;
        }
        ArrayList<Size> arrayListK = this.e.k(o9fVar);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : arrayListK) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalG = null;
                    break;
                }
                rationalG = (Rational) it.next();
                Rational rational = lt.a;
                if (lt.a(size, rationalG, msd.c)) {
                    break;
                }
            }
            if (rationalG != null) {
                Size size2 = (Size) map2.get(rationalG);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalG = g(size);
            }
            arrayList.add(size);
            map2.put(rationalG, size);
        }
        map.put(o9fVar, arrayList);
        return arrayList;
    }

    public final boolean d(Rational rational, Size size) {
        Rational rational2 = this.b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = lt.a;
        Size size2 = msd.c;
        if (lt.a(size, rational, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalG = lt.a;
        if (!lt.a(size, rationalG, size2)) {
            rationalG = lt.c;
            if (!lt.a(size, rationalG, size2)) {
                rationalG = g(size);
            }
        }
        float fFloatValue3 = rationalG.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        if (fFloatValue > fFloatValue2) {
            if (fFloatValue2 >= fFloatValue3) {
                return false;
            }
        } else if (fFloatValue2 <= fFloatValue3) {
            return false;
        }
        return true;
    }

    public final ArrayList e(List list, boolean z) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = lt.a;
        map.put(rational, new ArrayList());
        Rational rational2 = lt.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (lt.a(size, rational3, msd.c)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalG = g(size);
                    arrayList2.add(rationalG);
                    map.put(rationalG, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new l45(4, g(this.a)));
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(lt.c) && !rational4.equals(lt.a)) {
                List list2 = (List) map.get(rational4);
                Objects.requireNonNull(list2);
                arrayList4.addAll(f(rational4, list2, z));
            }
        }
        return arrayList4;
    }

    public final ArrayList f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = lt.a;
            if (lt.a(size, rational, msd.c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new x93(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            List<Size> listB = b((o9f) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listB) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listB = arrayList3;
            }
            if (listB.isEmpty()) {
                return new ArrayList();
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!c((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listB.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listB.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (c((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
