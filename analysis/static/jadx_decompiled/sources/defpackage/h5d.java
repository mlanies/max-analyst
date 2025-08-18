package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* loaded from: classes.dex */
public final class h5d extends Segment {
    public final /* synthetic */ AtomicReferenceArray a;

    public h5d(long j, h5d h5dVar, int i) {
        super(j, h5dVar, i);
        this.a = new AtomicReferenceArray(g5d.f);
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final int getNumberOfSlots() {
        return g5d.f;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public final void onCancellation(int i, Throwable th, lx3 lx3Var) {
        this.a.set(i, g5d.e);
        onSlotCleaned();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
