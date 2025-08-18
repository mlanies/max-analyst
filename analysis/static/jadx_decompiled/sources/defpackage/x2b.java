package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class x2b extends d3 {
    @Override // defpackage.n4c
    public final long i(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // defpackage.n4c
    public final long j(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // defpackage.d3
    public final Random k() {
        return ThreadLocalRandom.current();
    }
}
