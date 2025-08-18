package kotlinx.coroutines.internal;

import defpackage.au1;
import defpackage.i37;
import defpackage.j37;
import defpackage.m56;
import defpackage.ote;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0082\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u000b\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004R\u0013\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8\u0002X\u0082\u0004¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "", "maxCapacity", "Lkotlin/Function1;", "create", "<init>", "(ILm56;)V", "tryForbidNewElements", "()I", "", "isClosed", "(I)Z", "allocate", "()Z", "", "close", "()Ljava/util/List;", "", "stateRepresentation$kotlinx_coroutines_core", "()Ljava/lang/String;", "stateRepresentation", "toString", "I", "Lm56;", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final m56 create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    public OnDemandAllocatingPool(int i, m56 m56Var) {
        this.maxCapacity = i;
        this.create = m56Var;
        this.elements = new AtomicReferenceArray(i);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i) {
        return (Integer.MIN_VALUE & i) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, m56 m56Var) {
        while (true) {
            m56Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i) {
        this.controlState$volatile = i;
    }

    private final int tryForbidNewElements() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, i + 1));
        getElements().set(i, this.create.invoke(Integer.valueOf(i)));
        return true;
    }

    public final List<T> close() {
        int i;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                i = 0;
                break;
            }
            if (controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                break;
            }
        }
        j37 j37VarY = ote.Y(0, i);
        ArrayList arrayList = new ArrayList(z53.S(j37VarY, 10));
        Iterator<T> it = j37VarY.iterator();
        while (it.hasNext()) {
            int iA = ((i37) it).a();
            do {
                andSet = getElements().getAndSet(iA, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i = controlState$volatile$FU.get(this);
        j37 j37VarY = ote.Y(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(z53.S(j37VarY, 10));
        Iterator<T> it = j37VarY.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((i37) it).a()));
        }
        return au1.g(arrayList.toString(), (i & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
