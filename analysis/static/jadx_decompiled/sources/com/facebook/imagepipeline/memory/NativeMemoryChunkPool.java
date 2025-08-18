package com.facebook.imagepipeline.memory;

import defpackage.n5b;
import defpackage.o5b;
import defpackage.pm4;
import defpackage.pq8;
import defpackage.sq8;

@pm4
/* loaded from: classes.dex */
public class NativeMemoryChunkPool extends pq8 {
    @pm4
    public NativeMemoryChunkPool(sq8 sq8Var, n5b n5bVar, o5b o5bVar) {
        super(sq8Var, n5bVar, o5bVar);
    }

    @Override // defpackage.mj0
    public final Object a(int i) {
        return new NativeMemoryChunk(i);
    }
}
