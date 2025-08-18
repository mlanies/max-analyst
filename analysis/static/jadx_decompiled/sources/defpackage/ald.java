package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ald implements Runnable {
    public final /* synthetic */ List X;
    public final /* synthetic */ fld Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ List c;
    public final /* synthetic */ View o;

    public ald(fld fldVar, View view, View view2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.Y = fldVar;
        this.b = view;
        this.o = view2;
        this.c = arrayList;
        this.X = arrayList2;
        this.Z = arrayList3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        us usVar;
        Rect rect;
        Object obj = this.Z;
        List list = this.X;
        View view = this.o;
        List list2 = this.c;
        View view2 = this.b;
        fld fldVar = this.Y;
        switch (this.a) {
            case 0:
                w1f w1fVar = fldVar.v0;
                if (w1fVar != null) {
                    w1fVar.E(view2);
                    w1f w1fVar2 = fldVar.v0;
                    ArrayList arrayList = (ArrayList) list2;
                    ArrayList arrayList2 = new ArrayList();
                    if (view != null) {
                        fld.n(arrayList2, view);
                    }
                    arrayList2.removeAll(arrayList);
                    if (!arrayList2.isEmpty()) {
                        arrayList2.add(view2);
                        hm9.b(w1fVar2, arrayList2);
                    }
                    list.addAll(arrayList2);
                }
                List list3 = (List) obj;
                if (list3 != null) {
                    if (fldVar.u0 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(view2);
                        hm9.a0(fldVar.u0, list3, arrayList3);
                    }
                    list3.clear();
                    list3.add(view2);
                    break;
                }
                break;
            default:
                us usVar2 = fldVar.Z;
                View view3 = null;
                if (usVar2.isEmpty() || fldVar.w0 == null || view2 == null) {
                    usVar2.clear();
                    usVar = null;
                } else {
                    usVar = new us(0);
                    hm9.y(usVar, view2);
                    Iterator it = fldVar.t0.iterator();
                    while (it.hasNext()) {
                        eld eldVar = (eld) it.next();
                        View view4 = eldVar.a;
                        WeakHashMap weakHashMap = zmf.a;
                        usVar.put(omf.k(view4), eldVar.a);
                    }
                    usVar.l(new ArrayList(usVar2.values()));
                    for (int i = usVar2.c - 1; i >= 0; i--) {
                        if (!usVar.containsKey((String) usVar2.i(i))) {
                            usVar2.g(i);
                        }
                    }
                }
                if (usVar != null) {
                    list2.addAll(usVar.values());
                    list2.add(view);
                }
                w1f w1fVar3 = fldVar.w0;
                if (w1fVar3 != null) {
                    w1fVar3.Y.clear();
                    fldVar.w0.Y.addAll(list2);
                    hm9.a0(fldVar.w0, list, (ArrayList) list2);
                    if (fldVar.v0 != null) {
                        us usVar3 = fldVar.Z;
                        if (usVar3.c > 0 && usVar != null) {
                            view3 = (View) usVar.get(usVar3.i(0));
                        }
                    }
                    if (view3 != null && (rect = (Rect) obj) != null) {
                        int[] iArr = new int[2];
                        view3.getLocationOnScreen(iArr);
                        int i2 = iArr[0];
                        rect.set(i2, iArr[1], view3.getWidth() + i2, view3.getHeight() + iArr[1]);
                        break;
                    }
                }
                break;
        }
    }

    public ald(fld fldVar, View view, boolean z, ArrayList arrayList, View view2, ArrayList arrayList2, Rect rect) {
        this.Y = fldVar;
        this.b = view;
        this.c = arrayList;
        this.o = view2;
        this.X = arrayList2;
        this.Z = rect;
    }
}
