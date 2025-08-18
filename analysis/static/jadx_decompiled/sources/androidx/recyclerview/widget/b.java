package androidx.recyclerview.widget;

import android.util.SparseArray;
import defpackage.dec;
import defpackage.hdc;
import defpackage.r5b;
import defpackage.udc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class b {
    private static final int DEFAULT_MAX_SCRAP = 5;
    SparseArray<udc> mScrap = new SparseArray<>();
    int mAttachCountForClearing = 0;
    Set<hdc> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

    public void attach() {
        this.mAttachCountForClearing++;
    }

    public void attachForPoolingContainer(hdc hdcVar) {
        this.mAttachedAdaptersForPoolingContainer.add(hdcVar);
    }

    public void clear() {
        for (int i = 0; i < this.mScrap.size(); i++) {
            udc udcVarValueAt = this.mScrap.valueAt(i);
            Iterator it = udcVarValueAt.a.iterator();
            while (it.hasNext()) {
                r5b.a(((dec) it.next()).a);
            }
            udcVarValueAt.a.clear();
        }
    }

    public void detach() {
        this.mAttachCountForClearing--;
    }

    public void detachForPoolingContainer(hdc hdcVar, boolean z) {
        this.mAttachedAdaptersForPoolingContainer.remove(hdcVar);
        if (this.mAttachedAdaptersForPoolingContainer.size() != 0 || z) {
            return;
        }
        for (int i = 0; i < this.mScrap.size(); i++) {
            SparseArray<udc> sparseArray = this.mScrap;
            ArrayList arrayList = sparseArray.get(sparseArray.keyAt(i)).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                r5b.a(((dec) arrayList.get(i2)).a);
            }
        }
    }

    public void factorInBindTime(int i, long j) {
        udc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.d = runningAverage(scrapDataForType.d, j);
    }

    public void factorInCreateTime(int i, long j) {
        udc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.c = runningAverage(scrapDataForType.c, j);
    }

    public dec getRecycledView(int i) {
        udc udcVar = this.mScrap.get(i);
        if (udcVar == null) {
            return null;
        }
        ArrayList arrayList = udcVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((dec) arrayList.get(size)).l()) {
                return (dec) arrayList.remove(size);
            }
        }
        return null;
    }

    public final udc getScrapDataForType(int i) {
        udc udcVar = this.mScrap.get(i);
        if (udcVar != null) {
            return udcVar;
        }
        udc udcVar2 = new udc();
        this.mScrap.put(i, udcVar2);
        return udcVar2;
    }

    public void onAdapterChanged(hdc hdcVar, hdc hdcVar2, boolean z) {
        if (hdcVar != null) {
            detach();
        }
        if (!z && this.mAttachCountForClearing == 0) {
            clear();
        }
        if (hdcVar2 != null) {
            attach();
        }
    }

    public void putRecycledView(dec decVar) {
        int i = decVar.Y;
        ArrayList arrayList = getScrapDataForType(i).a;
        if (this.mScrap.get(i).b <= arrayList.size()) {
            r5b.a(decVar.a);
        } else {
            if (RecyclerView.L1 && arrayList.contains(decVar)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            decVar.u();
            arrayList.add(decVar);
        }
    }

    public long runningAverage(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }

    public void setMaxRecycledViews(int i, int i2) {
        udc scrapDataForType = getScrapDataForType(i);
        scrapDataForType.b = i2;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < this.mScrap.size(); i++) {
            ArrayList arrayList = this.mScrap.valueAt(i).a;
            if (arrayList != null) {
                size = arrayList.size() + size;
            }
        }
        return size;
    }

    public boolean willBindInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).d;
        return j3 == 0 || j + j3 < j2;
    }

    public boolean willCreateInTime(int i, long j, long j2) {
        long j3 = getScrapDataForType(i).c;
        return j3 == 0 || j + j3 < j2;
    }
}
