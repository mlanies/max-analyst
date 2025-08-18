package androidx.recyclerview.widget;

import defpackage.dec;
import defpackage.hm9;
import defpackage.o79;
import defpackage.qy8;
import defpackage.udc;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0018J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0014¢\u0006\u0004\b \u0010\u001f¨\u0006#"}, d2 = {"Landroidx/recyclerview/widget/MessagesRecyclerViewPool;", "Landroidx/recyclerview/widget/b;", "<init>", "()V", "", "viewType", "Ludc;", "getScrapDataForType", "(I)Ludc;", "max", "Le5f;", "setMaxRecycledViews", "(II)V", "Ldec;", "getRecycledView", "(I)Ldec;", "getRecycledViewCount", "(I)I", "scrap", "putRecycledView", "(Ldec;)V", "", "createTimeNs", "factorInCreateTime", "(IJ)V", "bindTimeNs", "factorInBindTime", "approxCurrentNs", "deadlineNs", "", "willCreateInTime", "(IJJ)Z", "willBindInTime", "Companion", "o79", "message-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class MessagesRecyclerViewPool extends b {
    public static final o79 Companion = new o79();
    private static boolean ENABLED;

    public MessagesRecyclerViewPool() {
        ENABLED = true;
        setMaxRecycledViews(0, 10);
        setMaxRecycledViews(131072, 10);
        setMaxRecycledViews(536870913, 20);
        setMaxRecycledViews(536870920, 10);
        setMaxRecycledViews(536870928, 10);
        setMaxRecycledViews(536870944, 10);
        setMaxRecycledViews(536870914, 10);
        setMaxRecycledViews(536870916, 10);
        setMaxRecycledViews(536870976, 10);
        setMaxRecycledViews(536871040, 10);
        setMaxRecycledViews(536871168, 10);
        setMaxRecycledViews(536871424, 10);
        setMaxRecycledViews(536875008, 10);
        setMaxRecycledViews(536936448, 10);
    }

    private final udc getScrapDataForType(int viewType) {
        int i = viewType & (-2013265921);
        udc udcVar = this.mScrap.get(i);
        if (udcVar != null) {
            return udcVar;
        }
        udc udcVar2 = new udc();
        this.mScrap.put(i, udcVar2);
        return udcVar2;
    }

    @Override // androidx.recyclerview.widget.b
    public void factorInBindTime(int viewType, long bindTimeNs) {
        udc scrapDataForType = getScrapDataForType(viewType);
        scrapDataForType.d = runningAverage(scrapDataForType.d, bindTimeNs);
    }

    @Override // androidx.recyclerview.widget.b
    public void factorInCreateTime(int viewType, long createTimeNs) {
        udc scrapDataForType = getScrapDataForType(viewType);
        scrapDataForType.c = runningAverage(scrapDataForType.c, createTimeNs);
    }

    @Override // androidx.recyclerview.widget.b
    public dec getRecycledView(int viewType) {
        int size;
        udc udcVar = this.mScrap.get(viewType & (-2013265921));
        if (udcVar == null) {
            return null;
        }
        ArrayList arrayList = udcVar.a;
        if (!(!arrayList.isEmpty()) || arrayList.size() - 1 < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            if (!((dec) arrayList.get(size)).l()) {
                dec decVar = (dec) arrayList.remove(size);
                boolean z = decVar instanceof qy8;
                return decVar;
            }
            if (i < 0) {
                return null;
            }
            size = i;
        }
    }

    public int getRecycledViewCount(int viewType) {
        return getScrapDataForType(viewType).a.size();
    }

    @Override // androidx.recyclerview.widget.b
    public void putRecycledView(dec scrap) {
        ArrayList arrayList = getScrapDataForType(scrap.Y).a;
        if (this.mScrap.get(scrap.Y & (-2013265921)).b <= arrayList.size()) {
            hm9.m0("MessagesRecyclerViewPool", "could not add " + scrap, new Object[0]);
        } else {
            scrap.u();
            if (scrap instanceof qy8) {
            }
            arrayList.add(scrap);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public void setMaxRecycledViews(int viewType, int max) {
        udc scrapDataForType = getScrapDataForType(viewType);
        scrapDataForType.b = max;
        ArrayList arrayList = scrapDataForType.a;
        while (arrayList.size() > max) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    @Override // androidx.recyclerview.widget.b
    public boolean willBindInTime(int viewType, long approxCurrentNs, long deadlineNs) {
        long j = getScrapDataForType(viewType).d;
        return j == 0 || approxCurrentNs + j < deadlineNs;
    }

    @Override // androidx.recyclerview.widget.b
    public boolean willCreateInTime(int viewType, long approxCurrentNs, long deadlineNs) {
        long j = getScrapDataForType(viewType).c;
        return j == 0 || approxCurrentNs + j < deadlineNs;
    }
}
