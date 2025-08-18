package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class w44 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(w44.class, "installations$volatile");
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
        AtomicLongFieldUpdater.newUpdater(w44.class, "sequenceNumber$volatile");
    }
}
